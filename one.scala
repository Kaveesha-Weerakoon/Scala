package Lab4

object one {
  
def main(args: Array[String]){
    
      printf("Enter Amount of Deposit ");
      val sallary = scala.io.StdIn.readInt();
      val interest = func_interest(sallary);
      printf("Interest is "+interest);
   }
   def func_interest(amount:Int):Double={
   
      if(amount<=20000){
         return amount*0.02;
      }
      else if(amount<=20000){
         return amount*0.04;
      }
      else if(amount<=200000){
         return amount*0.035;
      }
     
      return amount*0.065;
   }
}