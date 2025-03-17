package chapter3.thread.multi;

public class MyThread extends Thread {
// Thread 클래스를 상속 받아서 쓰레드 구현

    @Override
    public void run() { // run 메서드 오버라이딩
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드 : " + threadName);

        for(int i = 0; i<10; i++){
            System.out.println("현재 쓰레드 : " + threadName + " - " + i);
            try {
                Thread.sleep(500);  // 딜레이 0.5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("종료된 쓰레드 : " + threadName);
    }
}
