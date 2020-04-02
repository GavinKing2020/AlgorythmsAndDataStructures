package algo;

public class Multithreading {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("Thread running");
            }
        };
        thread.start();
    }


}
/*class MyThread extends Thread {
    public void run(){
        System.out.println("My Thread running");
    }
}*/
