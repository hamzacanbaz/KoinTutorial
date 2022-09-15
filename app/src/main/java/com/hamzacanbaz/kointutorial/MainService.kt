package com.hamzacanbaz.kointutorial

import retrofit2.http.GET

interface MainService {
    @GET("test/test2")
    fun callTestFunction(): String
}