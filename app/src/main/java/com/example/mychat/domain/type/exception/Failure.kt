package com.example.mychat.domain.type.exception

sealed class Failure {
    object NetworkConnectionError : Failure()
    object ServerError : Failure()
}