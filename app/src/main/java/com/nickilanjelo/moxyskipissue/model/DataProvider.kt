package com.nickilanjelo.moxyskipissue.model

class DataProvider {

    companion object {
        fun getData(): ArrayList<String> {
            var data = ArrayList<String>()
            for (i in 0..20) {
                data.add(i.toString())
            }
            return data
        }
    }
}