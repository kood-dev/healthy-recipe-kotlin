package com.godkoo.healthyrecipe.common.model

import com.godkoo.healthyrecipe.common.exception.BusinessException


open class ExceptionResponse(
    open val code: String,
    open val message: String
) {
    companion object {
        fun of(businessException: BusinessException) = ExceptionResponse(businessException.exceptionType.errorCode, businessException.message)
    }
}
