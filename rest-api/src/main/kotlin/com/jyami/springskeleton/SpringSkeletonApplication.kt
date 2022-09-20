package com.jyami.springskeleton

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class SpringSkeletonApplication

fun main(args: Array<String>) {
    runApplication<SpringSkeletonApplication>(*args)
}
