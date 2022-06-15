package com.adapter

import com.fasterxml.jackson.databind.ObjectMapper

class AnalyticsSenderUseCase(
    private val analyticTools: Set<AnalyticsToolContract>
) {

    fun send(data: Any) {
        val dataAsJsonString = ObjectMapper().writeValueAsString(data)
        val jsonData = JsonData(dataAsJsonString)
        analyticTools.forEach { it.send(jsonData) }
    }
}
