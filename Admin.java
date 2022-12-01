package myproject;

import java.util.ArrayList;

public class Admin {
	private ArrayList<ProviderCreator>providers;
	public Admin() {
		providers=new ArrayList<ProviderCreator>();
	}
	public void addProvider(ProviderCreator obj) {
		this.providers.add(obj);
	}
	public void print() {
		
		for(ProviderCreator obj: providers) {
			System.out.println(obj.creatProvider());
		}
			
			
	}
}
