package Week3;

public class LoopingAndArrays {

    public static void main(String[] args) {

        int[] oneToFive = {1, 2, 3, 4, 5};

        for (int i = 0; i < oneToFive.length; i++) {
            System.out.println(oneToFive[i]);
        }

        int i = 5;

        while (i > oneToFive.length) {
            System.out.println(i);
            i--;
        }

        String[] names = {"Ryan", "Samantha", "Paulo", "Wilmer", "Preston"};


        for (int y = 0; y < names.length; y++ ) {
            System.out.println(names[y]);
        }




    }
}

