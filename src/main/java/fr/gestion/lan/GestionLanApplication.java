package fr.gestion.lan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Florian NICOLAS on 03/04/2017.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableDiscoveryClient
public class GestionLanApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(GestionLanApplication.class, args);
    }
}
