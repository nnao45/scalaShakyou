package countryOfJapan {
  package kyusyuDistrict {
    object KagoshimaPref {
      def cappital(name: String): Unit = {
        println("鹿児島の県庁所在地は " + name + " です。")
      }

      def touristSpot(name: String): Unit = {
        println("鹿児島の観光地は " + name + " です。")
      }
    }

    object MiyazakiPref {
      def cappital(name: String): Unit = {
        println("宮崎県の県庁所在地は " + name + " です。")
      }

      def touristSpot(name: String): Unit = {
        println("宮崎県の観光地は " + name + " です。")
      }
    }
  }
}
