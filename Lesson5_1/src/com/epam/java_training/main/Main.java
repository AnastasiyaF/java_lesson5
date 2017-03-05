/*
 * Задача 5.1.
 * Date: 27.02.2017
   Author: Anastasiya Findziukevich
   
 * Используя код листинга 4 напишите приложение, выводящее на консоль календать на год.
 */

package com.epam.java_training.main;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Locale;

public class Main {
	
	public static void printCalendar(){
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month_today = d.get(Calendar.MONTH);
		int year_today = d.get(Calendar.YEAR);
		int weekday = 0;	
		int month_current = 0; //d.get(Calendar.MONTH);
		
		d.set(Calendar.MONTH,0);
		d.set(Calendar.DAY_OF_MONTH,1);
		Locale locale = Locale.getDefault();
	
		
		System.out.println(d.getDisplayName(Calendar.MONTH, Calendar.LONG, locale));
		System.out.println("Вс Пн Вт Ср Чт Пт Сб");
		
		
		do{
			if (d.get(Calendar.MONTH) != month_current){
				month_current = d.get(Calendar.MONTH);
				
				System.out.println("\n" + d.getDisplayName(Calendar.MONTH, Calendar.LONG, locale));
				System.out.println("Вс Пн Вт Ср Чт Пт Сб");

				for(int i = Calendar.SUNDAY; i<weekday; i++)
					System.out.print("   ");
			}
			
			weekday = d.get(Calendar.DAY_OF_WEEK);
		
			int day=d.get(Calendar.DAY_OF_MONTH);
			
			if(day < 10) System.out.print(" ");
				System.out.print(day);
			
			if ((day == today)&&(d.get(Calendar.MONTH) == month_today))
				System.out.print("*");
			else
				System.out.print(" ");
			
			if(weekday == Calendar.SATURDAY)
				System.out.println();
	
			d.add(Calendar.DAY_OF_MONTH,1);
			
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
		}
		while((d.get(Calendar.YEAR) == year_today));
		
		if(weekday != Calendar.SUNDAY){
			System.out.println();
		}
		
	}

	public static void main(String[] args)
	{
		printCalendar();	
	}
}
