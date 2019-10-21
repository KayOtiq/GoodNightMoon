import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GoodNightMoon {

	public static void main(String[] args) {
		// Creating a second simple project to show a pipeline working
		System.out.println("Good night, Moon!  We need another project to run");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now)); //2016/11/16 12:08:43
	}

}
