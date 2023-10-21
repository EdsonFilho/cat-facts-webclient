package com.eacf.webclient.webclienthttpexchange.service

import com.eacf.webclient.webclienthttpexchange.client.CatClient
import com.eacf.webclient.webclienthttpexchange.data.CatFact
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CatService {

    @Autowired
    private val catClient: CatClient? = null

    fun getCatFact(): CatFact {
        return catClient!!.getFact();
    }
}
