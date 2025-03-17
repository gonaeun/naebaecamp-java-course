package chapter3.thread.runnable;

public class MyRunnable extends MyNewClass implements Runnable {
    // 클래스는 다중 상속 불가
    // 기존 쓰레드 기능을 유지하면서 확장을 통해 추가적인 기능 활용 (Runnable이 인터페이스라서 가능)

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
