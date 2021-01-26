package com.example.kafka.controller

import com.example.kafka.handler.MessageHandler
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("message")
class MessageController(
    val messageHandler: MessageHandler
) {
    @PostMapping
    fun publish(@RequestBody message:String): Mono<String> {
        return Mono.just(messageHandler.publish(message))
    }

}