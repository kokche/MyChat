package com.example.mychat.Cache

import com.example.mychat.data.account.AccountCache
import com.example.mychat.domain.type.Either
import com.example.mychat.domain.type.None
import com.example.mychat.domain.type.exception.Failure
import javax.inject.Inject

class AccountCacheImpl @Inject constructor(private val prefsManager: SharedPrefsManager) :
    AccountCache {

    override fun saveToken(token: String): Either<Failure, None> {
        return prefsManager.saveToken(token)
    }

    override fun getToken(): Either.Right<String?> {
        return prefsManager.getToken()
    }
}