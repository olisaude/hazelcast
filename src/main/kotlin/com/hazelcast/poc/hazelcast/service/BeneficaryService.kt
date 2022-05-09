package com.hazelcast.poc.hazelcast.service

import com.hazelcast.cache.ICache
import com.hazelcast.poc.hazelcast.domain.Beneficiary
import com.hazelcast.poc.hazelcast.repository.BeneficiaryRepository
import org.springframework.cache.annotation.CachePut
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class BeneficaryService(
    private val repository: BeneficiaryRepository
) {
    @Cacheable("beneficiary")
    fun getAll(): MutableList<Beneficiary> {
        sleep(4000)
        return repository.getAll()
    }

    @Cacheable(value = ["beneficiary"], key = "#id")
    fun get(id: Long): Beneficiary? {
        sleep(4000)
        return repository.getById(id)
    }

    @CachePut(value = ["beneficiary"])
    fun create(ben: Beneficiary): Beneficiary {
        return repository.create(ben)
    }

    @CachePut(value = ["beneficiary"], key = "#id")
    fun update(id: Long, ben: Beneficiary): Beneficiary? {
        //ben.id = id
        return repository.update(ben)
    }

    private fun sleep(millis: Long) {
        try {
            Thread.sleep(millis)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}