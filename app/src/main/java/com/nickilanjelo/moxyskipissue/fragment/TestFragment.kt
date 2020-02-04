package com.nickilanjelo.moxyskipissue.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.nickilanjelo.moxyskipissue.presenter.TestPresenter
import com.nickilanjelo.moxyskipissue.R
import com.nickilanjelo.moxyskipissue.adapter.TestAdapter
import kotlinx.android.synthetic.main.fragment_test.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter

class TestFragment : MvpAppCompatFragment(),
    com.nickilanjelo.moxyskipissue.view.TestView {

    @InjectPresenter
    internal lateinit var testPresenter: TestPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onStart() {
        super.onStart()
        testPresenter.getStrings()
    }

    override fun showList(list: ArrayList<String>) {
        recycler_view.adapter = TestAdapter(list)
        recycler_view.layoutManager = LinearLayoutManager(context)
    }


}
