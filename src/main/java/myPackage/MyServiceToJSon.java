package myPackage;

public class MyServiceToJSon {

	public MyClasse myMethod(String s){
		System.out.println("Je suis myMethod de MyService. Je recois " + s + " que je retourne");
		return new MyClasse(s, 5);
	}

}
