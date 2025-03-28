class PrintThread extends Thread {
    private String text;
    private int count;

    // Constructor to initialize text and count
    public PrintThread(String text, int count) {
        this.text = text;
        this.count = count;
    }

    // Overriding run() method to print text 'n' times
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        // Creating threads with required text and count
        PrintThread t1 = new PrintThread("COVID19", 10);
        PrintThread t2 = new PrintThread("LOCKDOWN2020", 20);
        PrintThread t3 = new PrintThread("VACCINATED2021", 30);
        
        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
