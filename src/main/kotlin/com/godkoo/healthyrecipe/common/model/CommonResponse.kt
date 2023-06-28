package com.godkoo.healthyrecipe.common.model

import org.springframework.http.HttpStatus

data class CommonResponse<T>(
    override val code: String,
    override val message: String,
    val data: T?
) : ExceptionResponse(code, message) {
    companion object {
        fun <T> ok(data: T? = null): CommonResponse<T> {
            return CommonResponse(HttpStatus.OK.value().toString(), HttpStatus.OK.reasonPhrase, data)
        }

        fun <T> created(data: T?): CommonResponse<T> {
            return CommonResponse(HttpStatus.CREATED.value().toString(), HttpStatus.CREATED.reasonPhrase, data)
        }

        fun <T> accepted(data: T? = null): CommonResponse<T> {
            return CommonResponse(HttpStatus.ACCEPTED.value().toString(), HttpStatus.ACCEPTED.reasonPhrase, data)
        }
    }
}
