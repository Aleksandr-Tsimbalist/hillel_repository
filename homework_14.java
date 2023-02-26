package Homework_4;

public class LoopsUsage {

    public static void main(String[] args) {

        for (int a = 1; a < 10; a++)
        {
            int numCount = a + 1;
            for (int b = 1; b < numCount; b++)
                System.out.print(b + " ");
            System.out.println();
        }
    }
}
