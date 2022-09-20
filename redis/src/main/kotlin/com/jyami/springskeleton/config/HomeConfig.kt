package com.jyami.springskeleton.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "home")
data class HomeConfig(
    val name: String
)
