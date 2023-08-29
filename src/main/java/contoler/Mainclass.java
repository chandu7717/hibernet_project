package contoler;

import java.util.Scanner;

import dao.Studentdao;

public class Mainclass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Insert");
		System.out.println("2.Fetch");
		System.out.println("3.Udate by id");
		System.out.println("4.Delete by id");
		System.out.println("5.Exit");
		System.out.println("enter the option");
		Studentdao st=new Studentdao();

		switch(sc.nextInt())
		{
		case 1:st.insert();
		break;
		
		case 2:st.fetch();
		break;
		
		case 3:st.update();
		break;
		
		case 4:st.delete();
		break;
		
		case 5:System.err.println("invalid");;
		break;
		
		
		
		
		}
		
		
	}

}
