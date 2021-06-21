package com.github.hegdekar.log4j.failover;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
  private static final Logger LOGGER = LogManager.getLogger(App.class);

  public static void main(String[] args) {
    LOGGER.fatal("fatal log");
    LOGGER.error("error log");
    LOGGER.warn("warn log");
    LOGGER.info("info log");
    LOGGER.debug("debug log");
    LOGGER.trace("trace log");
  }
}
