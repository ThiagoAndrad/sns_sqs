package com.thpandrade.sns_sqs.configuration

import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration
import com.amazonaws.services.sns.AmazonSNS
import com.amazonaws.services.sns.AmazonSNSClientBuilder
import com.amazonaws.services.sqs.AmazonSQS
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder
import com.amazonaws.services.sqs.AmazonSQSClientBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("default")
class LocalAWSMessageConfiguration {

    private val endpointConfiguration = EndpointConfiguration(
        "http://localhost:4566",
        "us-east-1"
    )

    @Bean
    fun amazonSNS(): AmazonSNS {
        return AmazonSNSClientBuilder.standard()
            .withEndpointConfiguration(endpointConfiguration)
            .build()
    }

    @Bean
    fun amazonSQS(): AmazonSQS {
        return AmazonSQSAsyncClientBuilder.standard()
            .withEndpointConfiguration(endpointConfiguration)
            .build()
    }
}
