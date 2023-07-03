package Lab4

object two {
  def main(args: Array[String]){
    
      printf("Enter a number ");
      val number = scala.io.StdIn.readInt();
      pattern_match(number);
  }
  
  def pattern_match(num:Int){
    if(num<=0){
      printf("Negative/Zero")
    }
    else if(num%2==0){
      printf("Even");
    }
    else{
      printf("Odd");
    }
  }
}