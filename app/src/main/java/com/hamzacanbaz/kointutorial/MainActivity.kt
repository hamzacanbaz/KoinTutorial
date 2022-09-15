package com.hamzacanbaz.kointutorial

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

        private val viewModel: MainViewModel by inject()
//    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getUsers()
        printUsers()

    }

    private fun printUsers() {
        viewModel.users.forEach { user ->
            println(user)
        }
    }

}