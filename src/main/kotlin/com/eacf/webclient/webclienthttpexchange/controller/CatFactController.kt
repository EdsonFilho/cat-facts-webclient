package com.eacf.webclient.webclienthttpexchange.controller

import com.eacf.webclient.webclienthttpexchange.client.CatClient
import com.eacf.webclient.webclienthttpexchange.data.CatFact
import com.eacf.webclient.webclienthttpexchange.service.CatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cat-fact")
class CatFactController{

    @Autowired
    private val catService: CatService? = null

    @GetMapping
    fun getCatFact(): ResponseEntity<CatFact> {
        val catFact = catService?.getCatFact()
        println(catFact)
        return ResponseEntity.ok(catFact)
    }
}


