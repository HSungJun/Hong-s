package Exam01;

import java.util.Scanner;

public class Movie_teacher {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Movie movie = null;
		
		while(true) {
			System.out.println("<< Netflix Simulator >>");
			System.out.println("1. �ű� ��ȭ ���");
			System.out.println("2. ��ȭ ��� ���");
			System.out.println("0. ����");
			System.out.print(">>>");
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu==1) {
				System.out.println("������ �Է����ּ���. ");
				String tit = sc.nextLine();
				
				System.out.println("�帣�� �Է����ּ���. ");
				String gen = sc.nextLine();
				
				System.out.println("������ �Է����ּ���. ");
				double sco = Double.parseDouble(sc.nextLine());
				
				movie = new Movie(tit, gen, sco);
			}
		}
		
	}
	
}