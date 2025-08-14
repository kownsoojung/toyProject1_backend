package nexus.jedai.pyramid.com.config;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import nexus.jedai.pyramid.com.constants.CommonConstIF;
import nexus.jedai.pyramid.com.constants.EmsVer;

@Component
public class NxApplicationListener {

    private static final Logger logger = LoggerFactory.getLogger(NxApplicationListener.class);

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        if (!CommonConstIF.IS_WEB_START) {
            logger.info("Context refreshed: {}", event.getApplicationContext().getDisplayName());
            CommonConstIF.IS_WEB_START = true;
        }
    }

    @PostConstruct
    public void initialize() {
        try {
            EmsVer emsVer = new EmsVer();
            CommonConstIF.EMS_NAME = emsVer.getEMS_NM();
            CommonConstIF.EMS_VER = emsVer.getVerInfoDayTime();
            CommonConstIF.CB = "?cb=" + emsVer.getEMS_VER();

            logger.info("--------------------------------------------------------------------------------------------------------------");
            logger.info("EMS[{}] version : {} [ {} {} ]", CommonConstIF.EMS_NAME, emsVer.getEMS_VER(), emsVer.getBUILD_DAY(), emsVer.getBUILD_TIME());
            logger.info("--------------------------------------------------------------------------------------------------------------");

            if (CommonConstIF.IS_OS_WINDOWS) {
                if (!CommonConstIF.JDBC_URL.contains("127.0.0.1")) {
                    logger.info("##############################################################################################################");
                    logger.info("##### JDBC_URL : {}", CommonConstIF.JDBC_URL);
                    logger.info("##############################################################################################################");
                    logger.info("--------------------------------------------------------------------------------------------------------------");
                }
            }

            logSystemTimeZone();

            logger.info("SESSION_TIME_OUT [{}] minutes", CommonConstIF.SESSION_TIME_OUT / 60);
            logger.info("--------------------------------------------------------------------------------------------------------------");

        } catch (Exception e) {
            logger.error("Error during initialization", e);
        }
    }

    private void logSystemTimeZone() {
        ZoneId zone = ZoneId.systemDefault();
        ZonedDateTime now = ZonedDateTime.now(zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        logger.info("System TimeZone: {}, DateTime: {}", zone, now.format(formatter));
    }
}