package threads;
class Buffer1 {
    private int item;
    private boolean available = false;

    // Producer method
    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    // Consumer method
    public synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}

class Producer1 extends Thread {
    Buffer1 buffer;

    Producer1(Buffer1 buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer1 extends Thread {
    Buffer1 buffer;

    Consumer1(Buffer1 buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerWithSync {
    public static void main(String[] args) {
        Buffer1 buffer = new Buffer1();
        Producer1 p = new Producer1(buffer);
        Consumer1 c = new Consumer1(buffer);

        p.start();
        c.start();
    }
}
