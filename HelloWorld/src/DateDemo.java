import java.util.Date;
import java.text.*;

public class DateDemo {
	static public void testTheDate() {
		Date newDate = new Date();
		System.out.println(newDate.toString());
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + ft.format(newDate));
	}

}
