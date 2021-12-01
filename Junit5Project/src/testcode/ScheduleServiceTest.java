package testcode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

import businesscode.ScheduleService;

class ScheduleServiceTest {

	//assuming current timezone is IST.. the only test schedule  continue
	@Test
	void testDoSchedule() {
		TimeZone tzone=TimeZone.getDefault();
		assumeTrue(tzone.getDisplayName().equals("India Standard Time"));
		//System.out.println(tzone);
		
		//test doschedule method
		ScheduleService ss=new ScheduleService();
		assertTrue(ss.doSchedule());
	}
	
	@Test
	public void doScheduleLocaleNonUS() {

	// Assume that the current locale is US
	Locale currentLocale = Locale.getDefault();
	assumeFalse(currentLocale.equals(Locale.US));

	// Test doSchedule method
	ScheduleService scheduleService = new ScheduleService();
	assertTrue(scheduleService.doSchedule());

	}

	//assume current OS is Windows
	@Test
	void testBackupCalendar() {
		assumeTrue(System.getProperty("os.name").startsWith("Windows"));

		// Test doSchedule method
		ScheduleService scheduleService = new ScheduleService();
		assertTrue(scheduleService.backupCalendar());
	}

}
//assert - shows error if false
//assume - skips to the next step if false
