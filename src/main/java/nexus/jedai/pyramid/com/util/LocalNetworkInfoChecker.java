package nexus.jedai.pyramid.com.util;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

@Component
public class LocalNetworkInfoChecker {

    private final Logger logger = LoggerFactory.getLogger(LocalNetworkInfoChecker.class);

    private String localIp = "";
    private boolean localPcForest = false;
    private boolean localPcNora = false;

    @PostConstruct
    public void checkLocalIpMac() {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                byte[] mac = ni.getHardwareAddress();

                Enumeration<InetAddress> addresses = ni.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();
                    if (addr instanceof Inet4Address) {
                        String ip = addr.getHostAddress();
                        this.localIp = ip;

                        String macAddress = mac != null ? bytesToHex(mac) : "";
                        logger.info("Network Interface: {}, IP: {}, MAC: {}", ni.getName(), ip, macAddress);

                        // 예시 플래그 설정 (기존 IP/MAC 대조)
                        if ("10.10.10.101".equals(ip) && "B4A9FC6C4234".equalsIgnoreCase(macAddress)) {
                            localPcForest = true;
                        }
                        if ("10.10.10.116".equals(ip) || "10.10.10.118".equals(ip)) {
                            localPcNora = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.error("Failed to get local IP/MAC info", e);
        }
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    public String getLocalIp() {
        return localIp;
    }

    public boolean isLocalPcForest() {
        return localPcForest;
    }

    public boolean isLocalPcNora() {
        return localPcNora;
    }
}