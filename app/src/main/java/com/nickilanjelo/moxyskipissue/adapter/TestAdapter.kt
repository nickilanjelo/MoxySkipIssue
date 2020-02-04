package com.nickilanjelo.moxyskipissue.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nickilanjelo.moxyskipissue.R
import kotlinx.android.synthetic.main.list_item.view.*

class TestAdapter(
    private var list: ArrayList<String>
): RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    class TestViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(text: String) {
            itemView.test_text.text = text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        return TestViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.list_item,
                    parent,
                    false
                )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holderTest: TestViewHolder, position: Int) {
        holderTest.bind(list[position])
    }
}