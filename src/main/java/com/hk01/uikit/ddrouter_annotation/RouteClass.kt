package com.hk01.uikit.ddrouter_annotation

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Retention(RetentionPolicy.CLASS)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class RouteClass(val name: String)
