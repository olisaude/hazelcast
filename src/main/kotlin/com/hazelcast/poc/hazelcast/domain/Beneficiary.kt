package com.hazelcast.poc.hazelcast.domain

import java.io.Serializable

data class Beneficiary(
    var id: Long,
    var name: String,
    var cpf: String
) : Serializable