package testes;

import models.Person;

public class Program {

	public static void main(String[] args) {
		
		Person cliente = new Person("Felipe", "62985678171", "70368852113");
		
		System.out.println(cliente.getPhone());
	}

}


	