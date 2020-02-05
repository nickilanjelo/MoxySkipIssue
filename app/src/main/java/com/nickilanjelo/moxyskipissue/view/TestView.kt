package com.nickilanjelo.moxyskipissue.view

import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.SkipStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(OneExecutionStateStrategy::class)
interface TestView: MvpView {
    fun showList(list: ArrayList<String>)
}