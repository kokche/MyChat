package com.example.mychat.data.account

import com.example.mychat.domain.type.Either
import com.example.mychat.domain.type.None
import com.example.mychat.domain.type.exception.Failure

interface AccountCache {
    fun getToken(): Either<Failure, String>
    fun saveToken(token: String): Either<Failure, None>
}