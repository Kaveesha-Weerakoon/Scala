package Lab4

object three {
  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def formatNames(name: String)(formatter: String => String)(index:Int): String = {
    if(index == -1){
      return formatter(name);
    }
    val charToCapitalize = formatter(name.charAt(index-1).toString)
    return (name.substring(0, index-1) + charToCapitalize + name.substring(index));
    
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val one = formatNames(names(0))(toUpper)(-1);
    val two = formatNames(names(1))(toUpper)(2);
    val three = formatNames(names(2))(toLower)(-1);
    val four = formatNames(names(3))(toUpper)(names(3).length);
    
    println(one);
    println(two);
    println(three);
    println(four);
  }
}
