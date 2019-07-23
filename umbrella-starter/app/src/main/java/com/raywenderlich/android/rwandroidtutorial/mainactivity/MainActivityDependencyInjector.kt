package com.raywenderlich.android.rwandroidtutorial.mainactivity

import com.raywenderlich.android.rwandroidtutorial.WeatherRepository
import com.raywenderlich.android.rwandroidtutorial.WeatherRepositoryImpl

interface MainActivityDependencyInjector {
    fun weatherRepository() : WeatherRepository
}

class MainActivityDependencyInjectorImpl() : MainActivityDependencyInjector {
    override fun weatherRepository(): WeatherRepository {
        return WeatherRepositoryImpl()
    }

}