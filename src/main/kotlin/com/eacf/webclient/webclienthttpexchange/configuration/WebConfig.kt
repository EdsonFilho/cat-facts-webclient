package com.eacf.webclient.webclienthttpexchange.configuration

import com.eacf.webclient.webclienthttpexchange.client.CatClient
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.support.WebClientAdapter

import org.springframework.web.service.invoker.HttpServiceProxyFactory




@Configuration
class WebConfig {
    @Bean
    fun webClient(objectMapper: ObjectMapper?): WebClient {
        return WebClient.builder()
            .baseUrl("https://catfact.ninja/")
            .build()
    }

    @Bean
    fun catClient(webClient: WebClient?): CatClient? {
        val httpServiceProxyFactory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(webClient!!))
            .build()
        return httpServiceProxyFactory.createClient(CatClient::class.java);
    }
}