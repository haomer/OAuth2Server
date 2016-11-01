package com.fahai.config;

import org.springframework.security.access.SecurityConfig;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by zhanghao on 16/8/3.
 */
public class RedisSessionInitializer extends AbstractHttpSessionApplicationInitializer {

    public RedisSessionInitializer() {
        super(SecurityConfig.class, Config.class);
    }

}
