package com.godkoo.healthyrecipe.common.annotation

import org.springframework.stereotype.Component
import java.lang.annotation.*

@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Component
annotation class UseCase