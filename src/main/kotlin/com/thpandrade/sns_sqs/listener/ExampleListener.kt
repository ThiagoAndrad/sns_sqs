package com.thpandrade.sns_sqs.listener

import org.slf4j.LoggerFactory
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener
import org.springframework.stereotype.Component

@Component
class ExampleListener {

    companion object {
        private val LOGGER = LoggerFactory.getLogger(ExampleListener::class.java.name)
    }

    @SqsListener("\${message.queue.example-queue}")
    fun example(message: String) {
        LOGGER.info("received the message: $message")
    }
}
