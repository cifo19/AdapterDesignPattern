package com.adapter

class JsonBasedAnalyticsTool : AnalyticsToolContract {

    override fun send(jsonData: JsonData) {
        println("JsonBasedAnalyticsTool is sending --->\n${jsonData.data}")
        println()
    }
}