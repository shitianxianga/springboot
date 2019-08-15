package cn.stx.springboot.config;

import cn.stx.springboot.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类是配置类。
 */
@Configuration
public class MyConfig {

    @Bean
    public User user(){
        return new User();
    }
}
