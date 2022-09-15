package com.hamzacanbaz.kointutorial

import androidx.lifecycle.ViewModel

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    var users = listOf<String>()

    fun getUsers(){
        users = mainRepository.getUsers()
    }

}