package com.godkoo.healthyrecipe.common.types

import com.fasterxml.jackson.annotation.JsonValue

interface CommonCode {
    @get:JsonValue
    val code: String
    val desc: String
}
