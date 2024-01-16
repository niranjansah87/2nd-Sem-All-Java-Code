package ani;


public class Animation {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 80; i++) {
            if (i % 10 == 0)
                System.out.print(" O          \r");
            else if (i % 10 == 1)
                System.out.print(" OO         \r");
            else if (i % 10 == 2)
                System.out.print(" OOO        \r");
            else if (i % 10 == 3)
                System.out.print(" OOOO       \r");
            else if (i % 10 == 4)
                System.out.print(" OOOOO      \r");
            else if (i % 10 == 5)
                System.out.print(" OOOOOO     \r");
            else if (i % 10 == 6)
                System.out.print(" OOOOOOO    \r");
            else if (i % 10 == 7)
                System.out.print(" OOOOOOOO   \r");
            else if (i % 10 == 8)
                System.out.print(" OOOOOOOOO  \r");
            else if (i % 10 == 9)
                System.out.print(" OOOOOOOOOO \r");

            Thread.sleep(200);
        }

    }
}