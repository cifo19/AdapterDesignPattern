package com.adapter

import data.Product

fun main() {
    val analyticsTool = getAnalyticTools()
    val analyticsSenderUseCase = AnalyticsSenderUseCase(analyticsTool)
    val product = Product(id = "1", name = "Table", price = 199)
    analyticsSenderUseCase.send(product)
}

fun getAnalyticTools(): Set<AnalyticsToolContract> {
    return setOf(
        JsonBasedAnalyticsTool(),
        JsonBasedAnotherAnalyticsTool(),
        XmlBasedAnalyticsToolAdapter(XmlBasedAnalyticsTool())
    )
}
