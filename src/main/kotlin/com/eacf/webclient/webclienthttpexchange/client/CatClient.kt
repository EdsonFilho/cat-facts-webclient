package com.eacf.webclient.webclienthttpexchange.client

import com.eacf.webclient.webclienthttpexchange.data.CatFact
import org.springframework.web.service.annotation.GetExchange
import org.springframework.web.service.annotation.HttpExchange

@HttpExchange
interface CatClient {

    @GetExchange("/fact")
    fun getFact(): CatFact;
}