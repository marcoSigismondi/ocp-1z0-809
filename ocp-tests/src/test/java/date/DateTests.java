package date;

import static org.junit.Assert.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

import org.junit.Test;

public class DateTests {

	@Test
	public void formatTest() {
		Period p = Period.between(LocalDate.now(), LocalDate.of(2017, Month.NOVEMBER, 6)); 
		System.out.println("Between now and yesterday: " + p); 
		Period per = Period.between(LocalDate.now(), LocalDate.of(2017, Month.NOVEMBER, 8)); 
		System.out.println("Between now and tomorrow: " + per); 
		Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2017, Month.NOVEMBER, 7, 23, 25)); 
		System.out.println("Between now and 10 minutes in the past: " + d);
		Duration dur = Duration.between(LocalDateTime.now(), LocalDateTime.of(2017, Month.NOVEMBER, 7, 23, 45)); 
		System.out.println("Between now and 10 minutes in the future: " + dur);
	}

}
