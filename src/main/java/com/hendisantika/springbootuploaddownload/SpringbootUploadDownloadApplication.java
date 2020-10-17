package com.hendisantika.springbootuploaddownload;

import com.hendisantika.springbootuploaddownload.properties.FileUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileUploadProperties.class
})
public class SpringbootUploadDownloadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUploadDownloadApplication.class, args);
    }

}
