package com.thpandrade.sns_sqs.sender

interface NotificationSender {

    fun <T> send(topicName: String, message: T)
}
