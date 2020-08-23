package top.quhailong.pan.file.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 文件网关
 *
 * @author: quhailong
 * @date: 2020/8/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FileGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileGatewayApplication.class, args);
    }

}
