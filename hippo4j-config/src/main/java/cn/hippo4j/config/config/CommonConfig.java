package cn.hippo4j.config.config;

import cn.hippo4j.common.config.ApplicationContextHolder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Common config.
 *
 * @author chen.ma
 * @date 2021/7/19 21:03
 */
@Configuration
public class CommonConfig {

    @Bean
    public ApplicationContextHolder simpleApplicationContextHolder() {
        return new ApplicationContextHolder();
    }

}