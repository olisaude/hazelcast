package com.hazelcast.poc.hazelcast

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HazelcastApplication

fun main(args: Array<String>) {
	runApplication<HazelcastApplication>(*args)
}
