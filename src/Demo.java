import java.util.Calendar;
import java.util.Scanner;

//打印出日历  小程序 
//2018/3/3
public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入查询的年份与月份");
		int year = input.nextInt();
		int month = input.nextInt();
		Data data = new Data(year,month);
		data.print();
	}

}
class Data{
	private int year;
	private int month;
	
	//构造函数
	public Data(int year,int month) {
		this.year = year;
		this.month = month;
	}
	
	//得到本月第一天是周几   0表示周日 月份从0开始
   public int getFirstDay() {
	   Calendar calendar  = Calendar.getInstance();
	   calendar.set(this.year,this.month-1, 1);
	   return calendar.get(Calendar.DAY_OF_WEEK)-1;
   }
	
	//得到本月的天数
	public int getMonthDay() {
		switch(this.month) {
		case 1:
			return 31;
		case 2:
			if(this.isLeapYear()) {
				return 29;
			}
			else {
				return 28;
			}
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
				return 0;
		}
		
	}
   
	//将日历打印
	public void print() {
		printTitle();
		printData();
	}
	
	//表头
	public void printTitle() {
		System.out.println("             "+this.year+"年"+this.month+"月");
		System.out.println("----------------------------------");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//System.out.println("Sun    Mon    Tues    Wed    Thur    Fri    Sat");
	}
	
	//具体的日期
	public void printData() {
		for(int i=0;i<this.getFirstDay();i++) {
			System.out.print("\t");
		}
		for(int i=0;i<this.getMonthDay();i++) {
			System.out.print(i+1+"\t");
			if((i+this.getFirstDay()+1)%7==0) {
				System.out.println();
			}
		}
	}
	
	//判断是否是闰年
	public boolean isLeapYear() {
		return (this.year%4==0&&this.year%100!=0)||this.year%400==0;
	}
}
