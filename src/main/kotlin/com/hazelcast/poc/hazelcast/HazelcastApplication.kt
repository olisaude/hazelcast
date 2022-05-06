package com.hazelcast.poc.hazelcast

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class HazelcastApplication

fun main(args: Array<String>) {
	runApplication<HazelcastApplication>(*args)
}
