package com.thpandrade.sns_sqs.sender

import com.amazonaws.services.sns.AmazonSNS
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate
import org.springframework.stereotype.Component

@Component
class SnsNotificationSender(amazonSns: AmazonSNS): NotificationSender {
    private val notificationMessagingTemplate = NotificationMessagingTemplate(amazonSns)

    override fun <T> send(topicName: String, message: T) = notificationMessagingTemplate
        .sendNotification(topicName, message, null)

}
