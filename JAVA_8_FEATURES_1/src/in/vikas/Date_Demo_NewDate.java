package in.vikas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class Date_Demo_NewDate {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		LocalDate of = LocalDate.of(2021, 1, 20);
		System.out.println(of);

		LocalDate date = LocalDate.now();
		System.out.println(date);

		date = date.plusDays(3); //adding 3 days in current date
		System.out.println(date);

		date = date.plusMonths(1);//adding 1 month in current date
		System.out.println(date);

		date = date.plusYears(2);//adding 2 years in current date
		System.out.println(date);

		boolean leapYear = LocalDate.parse("2020-12-22").isLeapYear(); //to check leap year
		System.out.println("Leap Year :: " + leapYear);

		boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22")); // to compare dates
		System.out.println("Before Date : " + before);

		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);////adding 2 hours in current time
		System.out.println(time);

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		Period period = Period.between(LocalDate.parse("1991-05-20"), LocalDate.now());
		System.out.println(period);

		Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
		System.out.println(duration);
	}

}
