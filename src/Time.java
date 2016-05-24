
//Exercise 2.3, page 31

public class Time {
	public static void main(String[] args)
	{
		int hour = 12;
		int minute = 50;
		int second = 30;
		
		System.out.println(hour * 3600 + minute * 60 + second);
		
		int hourtwo = 24;
		int minutetwo = 0;
		int secondtwo = 0;
		
		System.out.println(hourtwo * 3600 + minutetwo * 60 + secondtwo);
		System.out.println(hourtwo * 3600 + minutetwo * 60 + secondtwo - (hour * 3600 + minute * 60 + second));

		
	}
}
