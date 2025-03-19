public class Main {
    public static void main(String[] args) {
      // Outer loop.
      for (int i = 1; i <= 5; i++) { //loop for 5 lines
        //i: change rom 1,2,3...
        // Inner loop
        for (int j = 1; j <= i; j++) { //prin start per line
          System.out.print("*"); //prin the start
        }
        System.out.println();//line space
      } 
    }
  }
  