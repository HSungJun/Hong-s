import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = (0);
		int in = (0);	
		int horse = (0);


		while (true) {
			
			try {
				System.out.println("』【』【井原惟績拭 神重依聖 発慎杯艦陥.』【』【");
				System.out.println("五敢研 識澱背 爽室推. ");
				System.out.println("1. 惟績 獣拙");
				System.out.println("2. 接衝 中穿");
				System.out.println("3. 接衝 繕噺");
				System.out.println("4. 曽戟");
				System.out.print(">>>>>>>>   ");

				int select = Integer.parseInt(sc.nextLine());

				if (select==1) {
					System.out.println("惟績聖 獣拙馬畏柔艦陥. ");
					System.out.println("源聖 識澱背爽室推. ");
					System.out.println("1.嬢鍵 源");
					System.out.println("2.含軒奄亜 薦析 匙献 源");
					System.out.println("3.錘戚 疏精 源");
					horse = Integer.parseInt(sc.nextLine());
					if (horse < 0 || horse > 4) {
						System.out.println("背雁 源 掻拭辞 陥獣 茨虞爽室推.");
					}else {
						
						System.out.println("薄仙 接衝精 " + total + "脊艦陥.");
						System.out.println("杖原研 壕特 馬獣畏柔艦猿? ");
						int bat = Integer.parseInt(sc.nextLine());
					
						if (bat > total) {
							System.out.println("接衝戚 採膳杯艦陥.");
							System.out.println("薄仙 接衝精 " + total +"据脊艦陥.");
							System.out.println("接衝聖 中穿背 爽室推.");

						}else if (bat <= total) {
							
							System.out.println(bat+" 据聖 壕特馬心柔艦陥. 亜綜焼たたたたたたた");
							total -= bat; 
							double win = Math.random()*3+1;

							System.out.println("======衣引======");
							System.out.println("               ");
							if(horse == (int)win) {
								System.out.println("壕特拭 失因馬写柔艦陥!");
								total = (total + (bat*2));
								System.out.println("薄仙 接衝精" +total + " 据 脊艦陥.");
							}else { 
								System.out.println("壕特拭 叔鳶馬写柔艦陥.");
								System.out.println("壕特榎衝" + bat + " 据聖 籍生写柔艦陥.");
							}
						}
					}
				}else if (select ==2) {
					System.out.println("接衝 中穿聖 識澱馬写柔艦陥.");
					System.out.println("杖原研 中穿 馬獣畏柔艦猿? ");
					in = Integer.parseInt(sc.nextLine());
					System.out.println(in + "据戚 中穿鞠醸柔艦陥. ");
					total += in;
				}else if (select ==3) {
					System.out.println("接衝繕噺研 識澱馬写柔艦陥. ");
					System.out.println("薄仙 接衝精 " + total +" 据 脊艦陥.");

				}else if (select==4) {
					System.out.println("曽戟馬奄研 識澱馬写柔艦陥. ");
					System.exit(0);
				}else {System.out.println("五敢研 陥獣 溌昔背 爽室推");}

			}catch (Exception e) {
				System.out.println("五敢拭 限澗 収切研 脊径背爽室推.");
			}
		}
	}
}	
