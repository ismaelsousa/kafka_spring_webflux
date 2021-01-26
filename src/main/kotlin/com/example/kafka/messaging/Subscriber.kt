package com.example.kafka.messaging

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import java.util.*

@Component
class Subscriber() {

    val log = LoggerFactory.getLogger(Subscriber::class.java)

    @KafkaListener(topics = ["kafka-sd"], groupId = "kafka-exemplo-group")
    fun subscribeMessage(message:String){
        log.info("message received: ${message} at ${Date().time}")

    }
}