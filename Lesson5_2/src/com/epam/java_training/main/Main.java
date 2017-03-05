/*
 * ������ 5.2.
 * Date: 27.02.2017
   Author: Anastasiya Findziukevich
   
 * ������� ����� ��������� �������. ������������� ����������� ������ � ������������ ������ �������, 
 * ������ ������ �� ������-���� �������� (��������, �� �������, ���� �������� ��� ������ ��������), 
 * ���������� � �������� �������, ��������� �� ������ �����.
 */
package com.epam.java_training.main;

import com.epam.java_training.task2.Notebook;
import com.epam.java_training.task2.QuickSort;
import com.epam.java_training.task2.Record;



public class Main {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		Record record = new Record("������", "����", "04/28/1989", "8-029-675-78-78");
		
		QuickSort quickSort;
		notebook.printAllRecords();
		
		notebook.addRecord(record);
		notebook.addRecord(record);
		
		notebook.printAllRecords();
		
		record = new Record("������4", "����", "04/28/1970", "8-029-789-29-78");
		notebook.addRecord(record);
		
		record = new Record("������3", "����2", "07/30/1970", "8-029-789-56-78");
		notebook.addRecord(record);
		
		record = new Record("������1", "����1", "04/30/1989", "8-029-675-56-78");
		notebook.addRecord(record);
		
		record = new Record("������2", "����2", "05/01/1989", "8-029-987-56-78");
		notebook.addRecord(record);
		
		record = new Record("������3", "����3", "01/04/1970", "8-029-734-56-78");
		notebook.addRecord(record);
		
		record = new Record("������5", "����5", "04/06/1970", "8-029-789-45-78");
		notebook.addRecord(record);
		
		record = new Record("������6", "����5", "07/06/1970", "8-029-789-45-78");
		notebook.addRecord(record);
		
		notebook.printAllRecords();
		
		
		System.out.println("����� �� ����� ���� :");
		notebook.searchRecords(2, "����");
		
		System.out.println("����� �� ����� ����2 :");
		notebook.searchRecords(2, "����2");

		System.out.println("����� �� ���� ��������  04/28/1989 :");
		notebook.searchRecords(3, "04/28/1989");
		
		System.out.println("����� �� ���� ��������  8-029-675-56-78 :");
		notebook.searchRecords(4, "8-029-675-56-78");
		
		notebook.printAllRecords();
		
		System.out.println("������� ������ � 6 ��������");
		notebook.deleteRecord(6);
		
		
		System.out.println("������� ������ � 3 ��������");
		notebook.deleteRecord(3);
		
		notebook.printAllRecords();
		
		System.out.println("��������� �� �������");
		quickSort  = new QuickSort(notebook.getRecords(), 1);
		quickSort.runSort();
		notebook = new Notebook(quickSort.getRecords());
		notebook.printAllRecords();
	
		System.out.println("��������� �� ���� ��������");
		quickSort  = new QuickSort(notebook.getRecords(), 3);
		quickSort.runSort();
		
		notebook = new Notebook(quickSort.getRecords());
		notebook.printAllRecords();
		
	}

}
