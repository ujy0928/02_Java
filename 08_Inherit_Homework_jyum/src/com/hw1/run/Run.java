package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] std = new Student[3];
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		// 학생 정보 모두 출력
		// 향상된 for문
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는
		 * 구조를 제공
		 * 일반적인 for문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 할 수 있음
		 * 
		 * for(데이터타입 변수명 : 배열 또는 컬렉션) {
		 * 		// 반복해서 실행할 코드
		 * }
		 * */
		
		for(Student s : std) {
			if(s == null) {
				break;
			}
			System.out.println(s.information());
		}
		
//		for(int i = 0; i < std.length; i++) {
//			System.out.println(std[i].information());
//		}
		
		System.out.println("===================================================");
		
		Employee[] emp = new Employee[10];
		Scanner sc = new Scanner(System.in);
		int index = 0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emp[index++] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("계속 추가하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'N' || ch == 'n') {
				for(Employee e : emp) {
					if(e == null) {
						break;
					}
					System.out.println(e.information());
				}
				break;
			}
		}
	}

}
