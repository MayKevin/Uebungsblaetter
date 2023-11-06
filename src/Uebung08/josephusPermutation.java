package Uebung08;

public class josephusPermutation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
    }

    private static int[] permutation (int length, int step) {
        int[] circle = new int[length];
        recusive(circle, -1, step);

        return circle;
    }

    private static void recusive(int[] circle, int last, int step) {
        int index = (step - 1) % circle.length;
        if (last == -1) { //-1 bedeutet, dies ist der erste Aufruf der Methode
            circle[(step - 1) % circle.length] = 1;

            recusive(circle, index, step);
        }
        int numberAddedLastRound = circle[last];

        if (numberAddedLastRound == circle.length) {
            return;
        }

    }

}
