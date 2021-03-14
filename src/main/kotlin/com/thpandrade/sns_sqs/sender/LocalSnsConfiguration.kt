package com.thpandrade.sns_sqs.sender

import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration
import com.amazonaws.services.sns.AmazonSNS
import com.amazonaws.services.sns.AmazonSNSClientBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("default")
class LocalSnsConfiguration {

    @Bean
    fun amazonSNS(): AmazonSNS {
        return AmazonSNSClientBuilder.standard()
            .withEndpointConfiguration(EndpointConfiguration("http://localhost:4566", "us-east-1"))
            .build()
    }


}
