package io.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableAutoConfiguration
@ImportResource(locations = "classpath*:META-INF/spring/*.bean.xml")
public class ServerMain {

  public static void main(String[] args) {
    SpringApplication.run(ServerMain.class, args);
  }
}
