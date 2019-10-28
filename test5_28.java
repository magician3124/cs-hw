import java.util.Scanner;
public class test5_28{
	public static String strday(int a){
		String String_day = null;
		switch(a){
			case 1:
				String_day = "Monday";
				break;
			case 2:
				String_day = "Tuesday";
				break;
			case 3:
				String_day = "Wednesday";
				break;
			case 4:
				String_day = "Thursday";
				break;
			case 5:
				String_day = "Friday";
				break;
			case 6:
				String_day = "Saturday";
				break;
			case 7:
				String_day = "Sunday";
				break;
		}
		return String_day;
	}

	public static String strdate(int a){
		String String_date = null;
		switch(a){
			case 1:
				String_date = "January";
				break;
			case 2:
				String_date = "Febuary";
				break;
			case 3:
				String_date = "March";
				break;
			case 4:
				String_date = "April";
				break;
			case 5:
				String_date = "May";
				break;
			case 6:
				String_date = "June";
				break;
			case 7:
				String_date = "July";
				break;
			case 8:
				String_date = "August";
				break;
			case 9:
				String_date = "September";
				break;
			case 10:
				String_date = "October";
				break;
			case 11:
				String_date = "November";
				break;
			case 12:
				String_date = "December";
				break;
		}
		return String_date;
	}

	public static int getWeek(Date date){
		int[] weeks = {1, 2, 3, 4, 5, 6, 7};
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if(week_index<0){
			week_index = 0;
		} 
		return weeks[week_index];
	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("What is the year: ");
		int year = input.nextInt();
		System.out.print("What day is the first day of the year: (enter number to represent the day e.g. 1 = monday, 2 = tuesday...) ");
		int day = input.nextInt();
		for(int k = 0; k < 12; k++){
			if(k == 0){
				System.out.println(strdate(k+1) + ", 1 " + year + " is " + strday(day));
			}else{
				System.out.println(strdate(k+1) + ", 1 " + year + " is " + strday(disday(k+1)));
			}

		}

	}
}