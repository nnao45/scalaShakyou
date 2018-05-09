trait TaxIncludePrice {
    val commodityPrices: Int
    val consumptionTax: Float
    val price = commodityPrices + (commodityPrices * consumptionTax)
}

class Price extends {
    val commodityPrices = 78000
    val consumptionTax = 0.1F 
} with TaxIncludePrice {
    printf(
    "notaxPrice: %d, tax: %f intaxPrice: %d\n", commodityPrices, consumptionTax, price.asInstanceOf[Int] 
    )
}

object Main extends App {
    (new Price()).price
}