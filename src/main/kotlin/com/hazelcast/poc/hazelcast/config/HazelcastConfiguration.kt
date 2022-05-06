package com.hazelcast.poc.hazelcast.config

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class HazelcastConfiguration {

    @Bean
    fun hazelCastConfig(): Config? {
        return Config()
            .setInstanceName("hazelcast-instance")
            .addMapConfig(
                MapConfig()
                    .setName("employees")
                    .setTimeToLiveSeconds(20)
            )
    }
}