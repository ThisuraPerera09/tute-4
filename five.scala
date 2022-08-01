

object five {

  def main(args:Array[String]): Unit ={

    println(formatNames("Benny")()(toUpper(_)))
    println(formatNames("Niroshan")(0,1)(toUpper(_)))
    println(formatNames("Saman")()(toLower(_)))
    println(formatNames("Kumara")(5)(toUpper(_)))
  }

  def toUpper(s: String): String = {
    s.toUpperCase()
  }

  def toLower(s: String): String = {
    s.toLowerCase()
  }

  def formatNames(name: String)(idxList: Int*)(func: String => String): String = {
    if(idxList.isEmpty){
      return func(name)
    }
    var temp=""
    var i=0
    while(i<name.length()){
      if(idxList.contains(i)) temp=temp+func(name.charAt(i).toString)
      else temp=temp+name.charAt(i).toString
      i=i+1;
    }
    temp
  }

}
