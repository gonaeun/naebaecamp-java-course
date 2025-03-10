package chapter2.capsulation.v1;

// 핵시설을 관리하는 개발자
public class DataStore {
    //'B'라는 문자열이 들어오면 핵폭발 발생
    // main에서 'B' 문자열 입력을 막기 위해서 접근제어자 private 설정
    private String store;

    // private 접근제어자를 사용했더니 dataStore에 접근을 할 수 없어서
    // 세터 생성
    // 접근제어를 막아놓고 세터를 외부에 노출한다면, 접근제어를 하는 의미가 사라짐
    // '무분별한 세터'를 방지할 수 있는 첫번째 예시 (로직 설정)
    public void setStore(String store){
        if(store.equals("B")){
            System.out.println("B가 입력되면 압됩니다.");
        } else {
            this.store = store;
        }
    }
}
