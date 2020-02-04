package com.nickilanjelo.moxyskipissue.view

import moxy.MvpView
import moxy.viewstate.strategy.SkipStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(SkipStrategy::class)
interface TestView: MvpView {
    fun showList(list: ArrayList<String>)
}