
import scala.io.StdIn.readInt

object four {
    def main(args: Array[String]) : Unit={

      printf("Enter a number => ")
      var num = readInt()
      println(check(num))

    }


    def check(x:Int):String=
      x match{
        case x if x==0 => "Zero"
        case x if x<0 => "Negative"
        case x if x>0 && x%2==0 => "Even"
        case x if x>0 && x%2!=0 => "Odd"

      }




}
