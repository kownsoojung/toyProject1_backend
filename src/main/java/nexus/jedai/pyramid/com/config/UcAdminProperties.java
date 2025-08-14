package nexus.jedai.pyramid.com.config;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
@ConfigurationProperties(prefix = "uc-admin")
public class UcAdminProperties {

    private boolean browserCacheSave = true;
    private int browserSessionTimeout = 30; // 분 단위
    private String accessControlAllowOrigin; // 콤마 구분 문자열

    private Set<String> allowedOrigins = new HashSet<>();

    @PostConstruct
    public void init() {
        if (accessControlAllowOrigin != null && !accessControlAllowOrigin.isEmpty()) {
            allowedOrigins = Arrays.stream(accessControlAllowOrigin.split(","))
                    .map(String::trim)
                    .filter(s -> s.startsWith("https://") || s.startsWith("http://"))
                    .collect(Collectors.toSet());
        }
    }

    // getters & setters
    public boolean isBrowserCacheSave() {
        return browserCacheSave;
    }

    public void setBrowserCacheSave(boolean browserCacheSave) {
        this.browserCacheSave = browserCacheSave;
    }

    public int getBrowserSessionTimeout() {
        return browserSessionTimeout;
    }

    public void setBrowserSessionTimeout(int browserSessionTimeout) {
        this.browserSessionTimeout = browserSessionTimeout;
    }

    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    public Set<String> getAllowedOrigins() {
        return allowedOrigins;
    }
}