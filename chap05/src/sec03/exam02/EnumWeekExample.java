package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null; //Week은 내가 만든 자료형 변수 today 변수이름
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//week = week+1; (다음 날)
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println(today);
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 자야지");
		} else if(today == Week.MONDAY) {
			System.out.println("월요일에는 공부해야지");
		} else if(today == Week.TUESDAY) {
			System.out.println("화요일에는 공부해야지");
		} else if(today == Week.WEDNESDAY) {
			System.out.println("수요일에는 공부해야지");
		} else if(today == Week.THURSDAY) {
			System.out.println("목요일에는 공부해야지");
		} else if(today == Week.FRIDAY) {
			System.out.println("금요일에는 공부해야지");
		} else{
			System.out.println("토요일에는 자야지");
		}	
	
	
	
	
	
	}
}
