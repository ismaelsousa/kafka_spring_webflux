package com.example.kafka.handler

import com.example.kafka.messaging.Publisher
import org.springframework.stereotype.Component

@Component
class MessageHandler(
        val publisher: Publisher
) {
    fun publish(message:String):String {
        publisher.publishMessage(message)
        return message
    }
}