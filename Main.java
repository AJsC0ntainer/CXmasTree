public class Main {
    public static void main(String[] args) {
      // Outer loop.
      for (int i = 1; i <= 5; i++) {
        //System.out.print("*"); // Executes 2 times
        
        // Inner loop
        for (int j = 1; j <= i; j++) {
          System.out.print("*"); // Executes 6 times (2 * 3)
        }
        System.out.println();
      } 
    }
  }
  