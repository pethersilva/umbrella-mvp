package com.raywenderlich.android.rwandroidtutorial.mainactivity

import com.raywenderlich.android.rwandroidtutorial.WeatherState
import com.raywenderlich.android.rwandroidtutorial.base.BasePresenter
import com.raywenderlich.android.rwandroidtutorial.base.BaseView

interface MainActivityContract {

    interface Presenter : BasePresenter {
        fun onViewCreated()
        fun onLoadWeatherTapped()
    }

    interface View : BaseView<Presenter> {
        fun displayWeatherState(weatherState: WeatherState)
    }
}