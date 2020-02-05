package com.nickilanjelo.moxyskipissue.presenter

import com.nickilanjelo.moxyskipissue.model.DataProvider
import com.nickilanjelo.moxyskipissue.view.TestView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class TestPresenter: MvpPresenter<TestView>() {

    fun getStrings() {
        viewState.showList(DataProvider.getData())
    }
}