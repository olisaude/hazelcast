package com.hazelcast.poc.hazelcast.repository
import com.hazelcast.poc.hazelcast.domain.Beneficiary
import org.springframework.stereotype.Repository

@Repository
class BeneficiaryRepository{

    fun getAll(): MutableList<Beneficiary> {
        return mutableListOf<Beneficiary>()
            .apply {
                this.addAll(MemoryDatabase.beneficiaryList)
            }
    }

    fun getById(id: Long): Beneficiary {
        return MemoryDatabase.beneficiaryList.first {
            it.id == id
        }
    }

    fun update(ben: Beneficiary): Beneficiary? {
        return MemoryDatabase.beneficiaryList.find { it.id == ben.id }
            ?.apply {
                this.name = ben.name
                this.cpf = ben.cpf
            }
    }

    fun create(ben: Beneficiary): Beneficiary {
        MemoryDatabase.beneficiaryList.add(ben)
        return ben
    }
}