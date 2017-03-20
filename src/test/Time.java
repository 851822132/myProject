package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());

//		Date d=new Date(1479433183078000l);
//		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(simpleDateFormat.format(d));
		System.out.println(new Date().getTime());
	}

}
