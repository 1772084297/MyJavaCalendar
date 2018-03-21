# MyJavaCalendar
第一次提交 
实现输入年份跟月份 查询到本月份的日历表
import java.util.Scanner;
public class task4 {
	static void li4_15() {
		System.out.print("Enter a leatter: ");
		Scanner input=new Scanner(System.in);
		String string=input.nextLine();
		char ch=string.charAt(0);
		switch (ch) {
		case 'a':
		case 'A':
		case 'b':	
		case 'B':
		case 'C':
		case 'c':
			System.out.println("The corresponding number is "+2);
			break;
		case 'd':
		case 'e':
		case 'f':
		case 'D':
		case 'E':
		case 'F':
			System.out.println("The corresponding number is "+3);
			break;
		case 'g':
		case 'h':
		case 'i':
		case 'G':
		case 'H':
		case 'I':
			System.out.println("The corresponding number is "+4);
			break;
		case 'j':
		case 'k':
		case 'l':
		case 'J':
		case 'K':
		case 'L':
			System.out.println("The corresponding number is "+5);
			break;
		case 'm':
		case 'n':
		case 'o':
		case 'M':
		case 'N':
		case 'O':
			System.out.println("The corresponding number is "+6);
			break;
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			System.out.println("The corresponding number is "+7);
			break;
		case 't':
		case 'u':
		case 'v':
		case 'T':
		case 'U':
		case 'V':
			System.out.println("The corresponding number is "+8);
			break;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			System.out.println("The corresponding number is "+9);
			break;
		default:
			System.out.println(ch+" is an invalid input");
			break;
		}
	}
	
	static boolean li4_17() {
		int l=0;
		String[] month= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.print("Enter a year: ");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		
		
		System.out.print("Enter a month: ");
		Scanner input1=new Scanner(System.in);
		String mon=input1.nextLine();
		//String m=mon.substring(0,3);
		
		int[] moday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) { 
            moday[1]=29;
		}
		
		//System.out.println(month[l]);
		
		while((month[l]!=mon)&&(l<month.length)){
			System.out.println(month[l]);
			l++;
		}
		
		//for(;l<month.length;l++) {
			
		//}
		
		if(l==month.length) {
			System.out.println("Error.");
			return false;
		}
		else {
			System.out.println(month[l]+" "+year+" has "+moday[l]+" days.");
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//li4_15();
		li4_17();
	}

}
