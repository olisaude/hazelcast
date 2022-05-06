package com.hazelcast.poc.hazelcast.repository

import com.hazelcast.poc.hazelcast.domain.Beneficiary

class MemoryDatabase {
    companion object {
        val beneficiaryList: MutableList<Beneficiary> = mutableListOf()
    }
}