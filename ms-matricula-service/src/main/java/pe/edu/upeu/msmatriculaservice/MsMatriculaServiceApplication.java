package pe.edu.upeu.msmatriculaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsMatriculaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsMatriculaServiceApplication.class, args);
    }

}
