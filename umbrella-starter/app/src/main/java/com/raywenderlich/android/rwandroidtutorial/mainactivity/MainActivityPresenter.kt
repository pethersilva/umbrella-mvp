package com.raywenderlich.android.rwandroidtutorial.mainactivity

import com.raywenderlich.android.rwandroidtutorial.Weather
import com.raywenderlich.android.rwandroidtutorial.WeatherRepository
import com.raywenderlich.android.rwandroidtutorial.WeatherState

class MainActivityPresenter(view: MainActivityContract.View,
                            dependencyInjector: MainActivityDependencyInjector) : MainActivityContract.Presenter {

    private var view : MainActivityContract.View? = view
    private val repository : WeatherRepository = dependencyInjector.weatherRepository()

    override fun onViewCreated() {
        loadWeather()
    }

    override fun onLoadWeatherTapped() {
        loadWeather()
    }

    override fun onDestroy() {
        this.view = null
    }

    private fun loadWeather() {
        val weather = repository.loadWeather()
        val weatherState = weatherStateForWeather(weather)
        view?.displayWeatherState(weatherState)
    }

    private fun weatherStateForWeather(weather: Weather) : WeatherState {
        if (weather.rain!!.amount!! > 0) {
            return WeatherState.RAIN
        }
        return WeatherState.SUN
    }
}