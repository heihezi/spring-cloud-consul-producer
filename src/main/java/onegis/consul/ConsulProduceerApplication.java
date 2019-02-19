package onegis.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: tunan
 * @version: v.1.0.1
 * @date: created on 16:35 2019-02-15
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableScheduling
public class ConsulProduceerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProduceerApplication.class, args);
    }
}
