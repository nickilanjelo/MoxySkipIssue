package com.nickilanjelo.moxyskipissue.fragment


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nickilanjelo.moxyskipissue.presenter.TestPresenter
import com.nickilanjelo.moxyskipissue.R
import com.nickilanjelo.moxyskipissue.adapter.TestAdapter
import com.nickilanjelo.moxyskipissue.model.DataProvider
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        testPresenter.getStrings()
    }

    override fun showList(list: ArrayList<String>) {
        Log.d("myTag", "Here we go with list")
        recycler_view.adapter = TestAdapter(list)
        recycler_view.layoutManager = LinearLayoutManager(context)
    }

}
