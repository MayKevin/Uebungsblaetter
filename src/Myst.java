class Myst { static void ery(int n) {
         if (n == 0)
        return;
         ery( n-1);
         A();
         yre( n-1);
         }
  static void yre(int n) {
         if (n == 0)
             return;
         ery( n-1);
         B();
         yre( n-1);
         }
 static void A() {
         System.out.print("A");
         }
 static void B() {
         System.out.print("B");
         }
 public static void main(String[] args) {
         int n = 4;
         ery(n);
         System.out.println();
         }
 }
