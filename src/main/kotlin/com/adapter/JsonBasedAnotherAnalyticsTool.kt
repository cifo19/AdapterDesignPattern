package com.adapter

class JsonBasedAnotherAnalyticsTool : AnalyticsToolContract {

    override fun send(jsonData: JsonData) {
        println("JsonBasedAnotherAnalyticsTool is sending --->\n${jsonData.data}")
        println()
    }
}