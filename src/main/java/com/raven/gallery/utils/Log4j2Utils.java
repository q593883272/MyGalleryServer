package com.raven.gallery.utils;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.yaml.YamlConfiguration;

/**
 * Created By Raven on 2020/2/5 14:35
 */
public class Log4j2Utils {

    public static Logger getLogger() {
        return getLogger("log/log4j2.yml", "com.raven");
    }

    public static Logger getLogger(String logName) {
        return getLogger("log/log4j2.yml", logName);
    }

    public static Logger getLogger(String configFile, String logName) {
        return Configurator.initialize(new YamlConfiguration(LoggerContext.getContext(), ConfigurationSource.fromResource(configFile, null))).getLogger(logName);
    }

    public static Logger getRootLogger() {
        return getRootLogger("log/log4j2.yml");
    }

    public static Logger getRootLogger(String configFile) {
        return Configurator.initialize(new YamlConfiguration(LoggerContext.getContext(), ConfigurationSource.fromResource(configFile, null))).getRootLogger();
    }

}
