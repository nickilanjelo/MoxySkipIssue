package com.nickilanjelo.moxyskipissue.presenter

import com.nickilanjelo.moxyskipissue.model.DataProvider
import com.nickilanjelo.moxyskipissue.view.TestView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class TestPresenter: MvpPresenter<TestView>() {

    private lateinit var list: ArrayList<String>

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        getStrings()
    }

    private fun getStrings() {
        list = DataProvider.getData()
        viewState.showList(list)
    }
}