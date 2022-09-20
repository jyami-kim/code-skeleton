package com.jyami.springskeleton.domain

import lombok.Getter
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Getter
data class Post(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Long,
    val title: String,
    val author: String,
    val image: String
)
