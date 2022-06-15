package com.adapter

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.xml.XmlMapper

class XmlBasedAnalyticsToolAdapter constructor(
    private val xmlBasedAnalyticsTool: XmlBasedAnalyticsTool
) : AnalyticsToolContract {

    override fun send(jsonData: JsonData) {
        val xmlText = convertToXml(jsonData.data)
        val xmlData = XmlData(xmlText)
        println("XmlBasedAnalyticsTool is sending --->")
        xmlBasedAnalyticsTool.report(xmlData)
    }

    private fun convertToXml(jsonText: String): String {
        val jsonNode = ObjectMapper().readTree(jsonText)
        return XmlMapper().writeValueAsString(jsonNode)
    }
}
