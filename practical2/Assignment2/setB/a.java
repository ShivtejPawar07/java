import java.util.Random;

class SumCalculator extends Thread {
    private int[] numbers;
    private int start, end;
    private int sum;
    
    public SumCalculator(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public void run() {
        sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
class Demo {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        Random rand = new Random();
        
        // Generate 1000 random integers
        for (int i = 0; i < 1000; i++) {
            numbers[i] = rand.nextInt(100); // Random number between 0-99
        }
        
        int numThreads = 10;
        SumCalculator[] threads = new SumCalculator[numThreads];
        int range = 100;
        
        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new SumCalculator(numbers, i * range, (i + 1) * range);
            threads[i].start();
        }
        
        int totalSum = 0;
        
        // Wait for all threads to complete
        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join(); // Ensures main thread waits for all threads to finish
                totalSum += threads[i].getSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Calculate and print average
        double average = totalSum / 1000.0;
        System.out.println("Total Sum: " + totalSum);
        System.out.println("Average: " + average);
}
}