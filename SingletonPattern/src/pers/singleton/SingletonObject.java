package pers.singleton;

public class SingletonObject {
	private static SingletonObject instance = new SingletonObject();
	public static SingletonObject getInstance() {
		return instance;
	}
	private SingletonObject() {
		
	}
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
