package com.jyami.springskeleton.config

import com.jyami.springskeleton.repository.PostRepository
import com.jyami.springskeleton.repository.PostRepositoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {

    @Bean
    fun postRepository(): PostRepository = PostRepositoryImpl()
}
