package com.example.mychat.remote.account

import com.example.mychat.data.account.AccountRemote
import com.example.mychat.domain.type.Either
import com.example.mychat.domain.type.None
import com.example.mychat.domain.type.exception.Failure
import com.example.mychat.remote.core.Request
import com.example.mychat.remote.service.ApiService
import javax.inject.Inject

class AccountRemoteImpl @Inject constructor(
    private val request: Request,
    private val service: ApiService
) : AccountRemote {

    override fun register(
        email: String,
        name: String,
        password: String,
        token: String,
        userDate: Long
    ): Either<Failure, None> {
        return request.make(
            service.register(
                createRegisterMap(
                    email,
                    name,
                    password,
                    token,
                    userDate
                )
            )
        ) { None() }
    }

    private fun createRegisterMap(
        email: String,
        name: String,
        password: String,
        token: String,
        userDate: Long
    ): Map<String, String> {
        val map = HashMap<String, String>()
        map.put(ApiService.PARAM_EMAIL, email)
        map.put(ApiService.PARAM_NAME, name)
        map.put(ApiService.PARAM_PASSWORD, password)
        map.put(ApiService.PARAM_TOKEN, token)
        map.put(ApiService.PARAM_USER_DATE, userDate.toString())
        return map
    }
}