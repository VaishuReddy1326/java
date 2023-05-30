public class StackOverflow {
   
         int calFactorial(int a) {
            return a * calFactorial(a-1);
          
        }
        public static void main(String[] args) {
            StackOverflow s = new StackOverflow();
            System.out.println(s.calFactorial(10));
        }
    
    
}
