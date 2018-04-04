object Main extends App {
  val HokuRegion = Map(("福井県" -> "福井市"), ("石川県" -> "金沢市"), ("富山県" -> "富山市" ))

  for ((prefecture, capital) <- HokuRegion)
    printf("県名:%s, 県庁所在地:%s\n", prefecture, capital)

  HokuRegion.foreach{
    case(((prefecture, capital))) =>
      printf("県名:%s, 県庁所在地:%s\n", prefecture, capital)
  }
}
