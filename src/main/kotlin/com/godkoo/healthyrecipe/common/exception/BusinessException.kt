package com.godkoo.healthyrecipe.common.exception

class BusinessException(
    val exceptionType: ExceptionType,
    override var message: String = exceptionType.getMessage()
) : RuntimeException() {

    fun setMessage(message: String): BusinessException {
        this.message = message
        return this
    }
}

fun <X : Throwable, T> T?.orThrow(throwable: X): T {
    return this ?: throw throwable
}

fun <T> T?.orThrow(exceptionType: ExceptionType): T {
    return this ?: throw BusinessException(exceptionType)
}
