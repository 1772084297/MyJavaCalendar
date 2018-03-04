import java.util.Calendar;
import java.util.Scanner;

//��ӡ������  С���� 
//2018/3/3
public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������ѯ��������·�");
		int year = input.nextInt();
		int month = input.nextInt();
		Data data = new Data(year,month);
		data.print();
	}

}
class Data{
	private int year;
	private int month;
	
	//���캯��
	public Data(int year,int month) {
		this.year = year;
		this.month = month;
	}
	
	//�õ����µ�һ�����ܼ�   0��ʾ���� �·ݴ�0��ʼ
   public int getFirstDay() {
	   Calendar calendar  = Calendar.getInstance();
	   calendar.set(this.year,this.month-1, 1);
	   return calendar.get(Calendar.DAY_OF_WEEK)-1;
   }
	
	//�õ����µ�����
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
   
	//��������ӡ
	public void print() {
		printTitle();
		printData();
	}
	
	//��ͷ
	public void printTitle() {
		System.out.println("             "+this.year+"��"+this.month+"��");
		System.out.println("----------------------------------");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		//System.out.println("Sun    Mon    Tues    Wed    Thur    Fri    Sat");
	}
	
	//���������
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
	
	//�ж��Ƿ�������
	public boolean isLeapYear() {
		return (this.year%4==0&&this.year%100!=0)||this.year%400==0;
	}
}
