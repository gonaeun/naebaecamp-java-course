package chapter3.thread.multi;

public class Main {
    public static void main(String[] args) {
        System.out.println("::: main 쓰레드 시작 :::");

        MyThread thread0 = new MyThread();  // 인스턴스화
        MyThread thread1 = new MyThread();

        // 1. thread0 시작
        System.out.println("thread0 시작");
        thread0.start();  // 쓰레드 실행시킬 땐, run()이라고 하면 안돼!

        // 2. thread1 시작
        System.out.println("thread1 시작");
        thread1.start();

        System.out.println("::: main 쓰레드 종료 :::");
        // 멀티쓰레드 : 병렬 처리 확인됨
    }
}
