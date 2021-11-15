package com.rays.oop;

public class TestInInterface implements InInterface{
	

@Override
public void earnMoney() {
	System.out.println("earnMoney was an unimplemented method in InInterface");
}

@Override
public void Donate() {
	System.out.println("Donate was an unimplemented method in InInterface");
	
}

@Override
public void Party() {
	System.out.println("Party was an unimplemented method in InInterface");
}

public static void main(String[] args) {
	
	TestInInterface t = new TestInInterface();
	t.Donate();
	t.earnMoney();
	t.Party();
}


}
