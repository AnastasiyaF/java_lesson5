package com.epam.java_training.task2;

public class Record {
	
	private String surname;
	private String name;
	private String dateofbirth;
	private String telephone;
	
	
	public Record(){
		
		surname = "";
		name = "";
		
		dateofbirth = "01/01/1900";
		telephone = "";
		
	}
	
	public Record(String surname, String name,
			        String dateofbirth, String telephone){

		this.surname = surname;
		this.name = name;

		this.dateofbirth = dateofbirth;
		this.telephone = telephone;
		
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setDateofbirth(String dateofbirth){
		this.dateofbirth = dateofbirth;
	}
	
	public String getDateofbirth(){
		return this.dateofbirth;
	}
	
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	
	public String getTelephone(){
		return this.telephone;
	}
	
	public void show(){
		
		System.out.println(" surname = " + surname + ", name = " + name +
			   ", dateofbirth = " + dateofbirth +
		       ", telephone = " + telephone);
	}
	
	public boolean compareFields(int type_field, String value){
		
		switch(type_field){
		case 1:		return this.surname.equals(value);
		case 2:		return this.name.equals(value);
		case 3:		return this.dateofbirth.equals(value);
		case 4:		return this.telephone.equals(value);
		}
		
		return false;
		
	}
	
	public String filterFields(int type_field){
		
		switch(type_field){
		case 1:		return this.getSurname();
		case 2:		return this.getName();
		case 3:		return this.getDateofbirth();
		case 4:		return this.getTelephone();
		default:    return null;
		}
		
	}
	
	public void printFields(){
		System.out.println("1 - surname");
		System.out.println("2 - name");
		System.out.println("3 - dateofbirth");
		System.out.println("4 - telephone");
	}
	
}
