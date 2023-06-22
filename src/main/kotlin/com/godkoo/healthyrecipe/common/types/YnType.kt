package com.godkoo.healthyrecipe.common.types

enum class YnType(
    override val code: String,
    override val desc: String
) : CommonCode {
    Y("Y", "Yes"),
    N("N", "No");
}