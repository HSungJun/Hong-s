

import java.util.Scanner;

import Manager.Manager;

public class teacher_code {
	public static void main(String[] args) {

		// 디자인 패턴
		// 접근성이 높으며 난이도가 낮은 패턴 
		// MVC 패턴
		// M V C 
		// Modeling Vie Control
		// Model 	- 시각적으로 보여지진 않지만 내부적으로 동작하는 코드
		// View		- 사용자에 의해 조작되고 보여지는 부분
		// Control	- 제어 및 분기관련 코드

		//Refactoring - 짜여져 있는 코드를 나누어 분류함.
		
		
		
		
		//CRUD
		//Create
		//Read
		//Update
		//Delete
		


		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		//매니저를 만듦으로서 manager 내부에 movie[]개짜리 배열이 생성됨.


//		while (true) {
//			System.out.println("<< Netflix Simulator >>");
//			System.out.println("1. 신규 영화 등록");
//			System.out.println("2. 영화 목록 출력");
//			System.out.println("3. 영화 목록 검색");
//			System.out.println("4. 영화 목록 수정");
//			System.out.println("5. 영화 삭제");
//			System.out.println("0. 종료");
//			System.out.print(">>>");
//			int menu = Integer.parseInt(sc.nextLine());
//
//
//			
//				if (menu==1) {
//					//if(movie[index]==null) {
//					System.out.println("제목을 입력해주세요. ");
//					String tit = sc.nextLine();
//					System.out.println("장르를 입력해주세요. ");
//					String gen = sc.nextLine();
//					System.out.println("별점을 입력해주세요. ");
//					double sco = Double.parseDouble(sc.nextLine());
//
//					//movie[index]++ = new Movie(tit, gen, sco); 일시 if 필요없음.
//
//					manager.addMovie(new Movie(tit, gen, sco));
//					// 매니저 addmovie 에 입력받은값을 index에 저장 +1 실행
//
//
//
//					//					}else {
//					//						if(movie[index]!=null) {
//					//							System.out.println("목록이 가득 찼습니다. 목록을 삭제해주세요.");
//					//						}
//				}else if (menu == 2) {
//					Movie[] movie = manager.getMovie();
//
//					System.out.println("영화 이름\t장르\t평점");
//					for(int i = 0; i<manager.getIndex(); i++){
//						System.out.println(movie[i].getTitle()+"\t"+
//								movie[i].getGenre()+"\t"+
//								movie[i].getScore());
//					}
//				}else if (menu == 3) {
//
//				}else if (menu == 4) {
//
//				}else if (menu == 5) {
//
//				}
//				//					int del = 0;
//				//					for (index=0; index < movie.length; index++) {
//				//						if(movie[index]==null) {
//				//							System.out.println("영화가 없습니다.");
//				//							break;
//				//						}
//				//						else if(movie[index]!=null) {
//				//							System.out.println((index+1)+"\t" + movie[index].getTitle()+
//				//									"\t\t"+movie[index].getGenre()+"\t"+movie[index].getScore());
//				//
//				//							System.out.println("삭제할 영화의 번호를 고르세요.");
//				//
//				//							del = Integer.parseInt(sc.nextLine());
//				//
//				//							if (del <= movie.length) {
//				//								movie[del-1] = null;
//				//								System.out.println(del + "번째를 삭제하였습니다. ");
//				//							}
//				//						}
//				//					}	
//
//				else if (menu == 0) {
//					System.out.println("Netflix 를 종료합니다.");
//					System.exit(0);
//				}
			
//	}
	}
}
