class FehlerOderKeiner {
 public static void main(String[] args) {
        int[] a = {2,3,5,7,11}; int[] b = { a[2], a[2]};
        b = a;
        b[1] = b[0];
        System.out.println(a[0] != a[1]);
         }
 }
