package com.hamzacanbaz.kointutorial

class MainRepositoryImpl(private val mainService: MainService) : MainRepository {

    override fun getUsers(): List<String> {

//        mainService.callTestFunction()

        return listOf("Jane", "Eric", "Rose")
    }
}