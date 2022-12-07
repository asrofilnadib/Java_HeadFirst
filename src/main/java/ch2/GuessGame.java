package main.java.ch2;

import java.util.Random;

class Player {
    public int number;

    public void guess() {
        Random randomGenerate = new Random();
        number = randomGenerate.nextInt(10);
    }
}

public class GuessGame {
    // Deklarasi pemain atau subjectnya
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        // buat tiga object dengan diinisiasi
        // ke p123 atribut class
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // hold nilai yang ditebak pemain
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // cek apakah benar atau salah
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // angka yang ditebak oleh mesin
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Tebaklah nomor dari 0 hingga 9...");

        while (true) {
            System.out.println("Nomor yang ditebak adalah " + targetNumber);

            // each player manggil method guess()
            p1.guess();
            p2.guess();
            p3.guess();

            // hold angka yang ditebak permain
            guessp1 = p1.number;
            System.out.println("Player satu menebak: " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player dua menebak: " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player tiga menebak: " + guessp3);

            // liat apakah tebakan dari para player
            // sesuai dengan nilai yang dibuat oleh mesin
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            // if menang = menang
            // else ulang lagi
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Kita punya pemenangnya!");
                System.out.println("Apakah player satu? " + p1isRight);
                System.out.println("Apakah player dua? " + p2isRight);
                System.out.println("Apakah player tiga? " + p3isRight);
                break;
            } else {
                System.out.println("Semua player harus bermain lagi...");
            }
            System.out.println();
        }
    }
}

class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
