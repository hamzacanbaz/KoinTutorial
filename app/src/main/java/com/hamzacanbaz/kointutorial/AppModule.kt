package com.hamzacanbaz.kointutorial

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val appModule = module {
    single {
        Retrofit.Builder().baseUrl("https://www.youtube.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MainService::class.java)
    }
    single<MainRepository> {
        MainRepositoryImpl(get())
    }
    viewModel {
        MainViewModel(get())
    }
}