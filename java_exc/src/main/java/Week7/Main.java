package Week7;

public class Main {

    public static void main(String[] args) {

        Flyable bird = new Bird();
        bird.fly();

        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();
        piano.play();
    }

}

