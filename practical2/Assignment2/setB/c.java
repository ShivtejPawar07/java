import java.util.Random;

class NumberGenerator extends Thread {
    public int num;
    
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                num = rand.nextInt(100); // Generate a random number between 0-99
                System.out.println("Generated Number: " + num);
                
                if (num % 2 == 0) {
                    SquareThread square = new SquareThread(num);
                    square.start();
                } else {
                    CubeThread cube = new CubeThread(num);
                    cube.start();
                }
                
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Number Generator Interrupted!");
        }
    }
}

class SquareThread extends Thread {
    int number;
    
    SquareThread(int num) {
        this.number = num;
    }
    
    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class CubeThread extends Thread {
    int number;
    
    CubeThread(int num) {
        this.number = num;
    }
    
    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

 class MultiThreadApp {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();
   }
}