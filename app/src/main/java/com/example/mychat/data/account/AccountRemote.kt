package com.example.mychat.data.account

import com.example.mychat.domain.type.Either
import com.example.mychat.domain.type.None
import com.example.mychat.domain.type.exception.Failure

interface AccountRemote {
    fun register(
        email: String,
        name: String,
        password: String,
        token: String,
        userDate: Long
    ): Either<Failure, None>
}