/*
 * Задача 5.2.
 * Date: 27.02.2017
   Author: Anastasiya Findziukevich
   
 * Создать класс “Записная книжка”. Предусмотреть возможность работы с произвольным числом записей, 
 * пойска записи по какому-либо признаку (например, по фамилии, дате рождения или номеру телефона), 
 * добавления и удаления записей, ортировки по разным полям.
 */
package com.epam.java_training.main;

import com.epam.java_training.task2.Notebook;
import com.epam.java_training.task2.QuickSort;
import com.epam.java_training.task2.Record;



public class Main {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		Record record = new Record("Иванов", "Иван", "04/28/1989", "8-029-675-78-78");
		
		QuickSort quickSort;
		notebook.printAllRecords();
		
		notebook.addRecord(record);
		notebook.addRecord(record);
		
		notebook.printAllRecords();
		
		record = new Record("Иванов4", "Иван", "04/28/1970", "8-029-789-29-78");
		notebook.addRecord(record);
		
		record = new Record("Иванов3", "Иван2", "07/30/1970", "8-029-789-56-78");
		notebook.addRecord(record);
		
		record = new Record("Иванов1", "Иван1", "04/30/1989", "8-029-675-56-78");
		notebook.addRecord(record);
		
		record = new Record("Иванов2", "Иван2", "05/01/1989", "8-029-987-56-78");
		notebook.addRecord(record);
		
		record = new Record("Иванов3", "Иван3", "01/04/1970", "8-029-734-56-78");
		notebook.addRecord(record);
		
		record = new Record("Иванов5", "Иван5", "04/06/1970", "8-029-789-45-78");
		notebook.addRecord(record);
		
		record = new Record("Иванов6", "Иван5", "07/06/1970", "8-029-789-45-78");
		notebook.addRecord(record);
		
		notebook.printAllRecords();
		
		
		System.out.println("Поиск по имени Иван :");
		notebook.searchRecords(2, "Иван");
		
		System.out.println("Поиск по имени Иван2 :");
		notebook.searchRecords(2, "Иван2");

		System.out.println("Поиск по дате рождения  04/28/1989 :");
		notebook.searchRecords(3, "04/28/1989");
		
		System.out.println("Поиск по дате телефону  8-029-675-56-78 :");
		notebook.searchRecords(4, "8-029-675-56-78");
		
		notebook.printAllRecords();
		
		System.out.println("Удалить запись с 6 позицией");
		notebook.deleteRecord(6);
		
		
		System.out.println("Удалить запись с 3 позицией");
		notebook.deleteRecord(3);
		
		notebook.printAllRecords();
		
		System.out.println("Сортирока по фамилии");
		quickSort  = new QuickSort(notebook.getRecords(), 1);
		quickSort.runSort();
		notebook = new Notebook(quickSort.getRecords());
		notebook.printAllRecords();
	
		System.out.println("Сортирока по дате рождения");
		quickSort  = new QuickSort(notebook.getRecords(), 3);
		quickSort.runSort();
		
		notebook = new Notebook(quickSort.getRecords());
		notebook.printAllRecords();
		
	}

}
