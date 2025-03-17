package chapter3.thread.runnable;

public class Main {
    public static void main(String[] args) {

        // 하나의 클래스가 하나의 역할만 담당하도록 기능 분리 (실행로직/제어)

        // MyRunnable : 실행로직 담당
        MyRunnable myTask = new MyRunnable();

        // 기존 쓰레드 클래스를 유지하면서 + 기능을 확장해서 사용
        myTask.printMessage();

        // Thread : 제어 담당
        Thread thread0 = new Thread(myTask);
        Thread thread1 = new Thread(myTask);

        thread0.start();
        thread1.start();
    }
}
