package com.yul.kotlinserver.global.auth.entity

import javax.persistence.*


@Entity
@Table(name = "user_info")
class User(
    @Id
    @GeneratedValue
    var id: Long? = null,

    var name: String? = null,

    var email: String? = null,

    var password: String? = null
)