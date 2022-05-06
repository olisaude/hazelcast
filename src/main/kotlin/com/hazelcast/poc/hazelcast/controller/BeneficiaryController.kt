package com.hazelcast.poc.hazelcast.controller

import com.hazelcast.poc.hazelcast.domain.Beneficiary
import com.hazelcast.poc.hazelcast.service.BeneficaryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/beneficiary")
class BeneficiaryController {

    @Autowired
    private val benService: BeneficaryService? = null

    @GetMapping
    fun getAll(): MutableList<Beneficiary>? {
        return benService?.getAll()
    }

    @GetMapping("/{id}")
    fun get(
        @PathVariable("id") id: Long
        ): Beneficiary? {
            return benService?.get(id)
    }

    @PostMapping
    fun save(
        @RequestBody ben: Beneficiary
        ): Beneficiary? {
            return benService?.create(ben)
    }

    @PutMapping("/{id}")
    fun put(
        @PathVariable("id") id: Long,
        @RequestBody ben: Beneficiary
        ) : Beneficiary? {
            return benService?.update(id, ben)
    }
}