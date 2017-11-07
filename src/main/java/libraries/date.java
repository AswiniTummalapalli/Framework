package libraries;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM_dd_YY_hh:mm a");
		String formatedDate=sdf.format(date);
		System.out.println(formatedDate);
		
	}

}
