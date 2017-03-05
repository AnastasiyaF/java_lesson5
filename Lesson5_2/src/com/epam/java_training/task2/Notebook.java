package com.epam.java_training.task2;

public class Notebook {
	
	private Record[] records;
	int count_records;
	
	public Notebook(){
		count_records = 0;
	}
	
	public Notebook(Record[] record_massive){
		this.records = record_massive;
		this.count_records = record_massive.length;
	}
	
	public Record[] getRecords(){
		return this.records;
	}
	
	public void addRecord(Record record){
		
		if (this.existRecord(record) == true){
			
			System.out.println("The record already exists with such fields and cannot be added.");
			record.show();
			return;
			
		}
		
		Record[] new_records = new Record[this.count_records + 1];
		
		if (this.count_records == 0){
			new_records[0] = record;
		}
		else{
			for (int i = 0; i < this.count_records; i++){
				new_records[i] = this.records[i];
			}	
			new_records[this.count_records] = record;
		}
		
		this.count_records = this.count_records + 1;
		this.records = new_records;
	}
	
	public void deleteRecord(int position){
		int i_new = 0;
		
		if (position < 1){
			System.out.println("The position should be more then 1.");
		}
		else if (this.count_records == 0){
			
			System.out.println("The notebook is empty.");
			return;
		}
		else if (this.count_records < position){
			System.out.println("There are not records with such position " + position + "in the notebook.");
			return;
		}
		
		if (this.count_records == 1){
			
			this.records[0].show();
			
			this.count_records = 0;
			this.records = null;
			
			System.out.println("The record is deleted. Currently no records.");
			
			return;
		}
		
		Record[] new_records = new Record[this.count_records - 1];
		
		for (int i = 0; i < this.count_records; i++){
			
			if (i == position - 1){
				this.records[i].show();
			}
			else{
				new_records[i_new] = this.records[i];
				i_new++;
			}
			
		}	
		
		this.count_records = this.count_records - 1;
		this.records = new_records;
	}
	
	public void searchRecords(int case_field, String value){
		
		int count_records = 0;
	
		for (int i = 0; i < this.count_records; i++){
			
			if (this.records[i].compareFields(case_field, value) == true){
				this.records[i].show();
				count_records++;
			}
		}
		
		if (count_records == 0){
			System.out.println("No records for such filter");
		}
		
	}
	
	public boolean existRecord(Record current_record){
		
		for (int i = 0; i < this.count_records; i++){
			if ((this.records[i].getSurname().equals(current_record.getSurname()) == true) &&
			(this.records[i].getName().equals(current_record.getName()) == true) &&
			(this.records[i].getName().equals(current_record.getName()) == true) &&
			(this.records[i].getName().equals(current_record.getName()) == true)){
				return true;
			}
			
		}
		
		return false;
	}
	
	public void printAllRecords(){
		
		
		if (count_records == 0){
			System.out.println("No records in the notebook.");
		}
		else{
			System.out.println("All records from the notebook:");
		}
		
		for (int i = 0; i < this.count_records; i++){
			this.records[i].show();
		}
		
	}
		
}
	
