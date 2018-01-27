/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.consumer;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/hello", produces = MediaType.TEXT_PLAIN)
public class HelloService {
    @Autowired
  Hello client;
//  @Autowired
//  private RestTemplate restTemplate;

//  @Autowired
//  private DiscoveryClient discoveryClient;

  @RequestMapping(method = RequestMethod.GET)
  public String hello(String name) {
//    List<ServiceInstance> instanceList = discoveryClient.getInstances("spring-cloud-demo-server");
    System.out.println("========================================");
//    instanceList.forEach(System.out::println);
//    return client.sayHi(name);
//    ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://spring-cloud-demo-server/hello/sayhi?name=" + name, String.class);
    System.out.println(client.sayHi(name));
    return client.sayHi(name);
//    return responseEntity.getBody();
  }
}
