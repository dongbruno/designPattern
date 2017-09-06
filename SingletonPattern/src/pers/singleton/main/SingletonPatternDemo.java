package pers.singleton.main;

import pers.singleton.SingletonObject;

public class SingletonPatternDemo {
	public static void main(String args[]) {
		SingletonObject singletonObject = SingletonObject.getInstance();
		//SingletonObject singleton = new SingletonObject();
		singletonObject.showMessage();
	}
	
}
