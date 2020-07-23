package com.example.mychat.domain.account

import com.example.mychat.data.account.AccountRepository
import com.example.mychat.domain.interactor.UseCase
import com.example.mychat.domain.type.None
import javax.inject.Inject

class UpdateToken @Inject constructor(
    private val accountRepository: AccountRepository
) : UseCase<None, UpdateToken.Params>() {

    override suspend fun run(params: Params) = accountRepository.updateAccountToken(params.token)

    data class Params(val token: String)
}