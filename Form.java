package myproject;

import java.util.ArrayList;

public class Form {
	protected ArrayList<String> fields;
	protected double amount;
	public Form(){
		this.fields=new ArrayList<String>();
		
	}
	public Form(ArrayList <String>list,double amount) {
		this.fields=list;
		this.amount=amount;
	}
}
