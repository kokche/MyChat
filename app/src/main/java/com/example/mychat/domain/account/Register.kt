package com.example.mychat.domain.account

import com.example.mychat.data.account.AccountRepository
import com.example.mychat.domain.interactor.UseCase
import com.example.mychat.domain.type.Either
import com.example.mychat.domain.type.None
import com.example.mychat.domain.type.exception.Failure
import javax.inject.Inject

class Register @Inject constructor(
    private val repository: AccountRepository
) : UseCase<None, Register.Params>() {

    override suspend fun run(params: Params): Either<Failure, None> {
        return repository.register(params.email, params.name, params.password)
    }

    data class Params(val email: String, val name: String, val password: String)
}