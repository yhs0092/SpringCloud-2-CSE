package io.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {
  private static final Logger LOGGER = LoggerFactory.getLogger(Ping.class);
  @RequestMapping(value = "/")
  public String ping() {
    LOGGER.info("get pinged");
    return "hi";
  }
}
