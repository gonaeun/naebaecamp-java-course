package chapter3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
//        Student John = new Student("John");
//        camp.setStudent(John);

        // Optional 객체 활용
        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent();
        if (flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생 데이터가 없습니다.");
        }

        // 1. student = null
//        Student student = camp.getStudent();
//        System.out.println("student = " + student);

        // 직접적인 null 처리 방법 >> 매번 null이 발생할 것을 예측해서 if문을 사용하기 어려움
//        String studentName;
//        if (student != null) {
//            studentName = student.getName();
//        } else {
//            studentName = "등록된 학생이 아닙니다.";
//        }
//        System.out.println("studentName = " + studentName);

        // 2. NullPointerException
//        String studentName = student.getName();
//        System.out.println("studentName = " + studentName);
    }
}
