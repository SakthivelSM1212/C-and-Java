public class thread_rjs {
    public static void main(String[] args) {
        a a = new a();
        a.start();
        b b = new b();
        b.start();
    }
}

class a extends Thread {
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println(i);
        }
    }
}

class b extends Thread {
    public void run() {
        for (int i = 97; i < 123; i++) {
            System.out.println((char) i);
        }
    }
}