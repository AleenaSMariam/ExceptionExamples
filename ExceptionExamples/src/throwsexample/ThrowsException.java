package throwsexample;

import java.io.IOException;

public class ThrowsException {
	
	public void addition(int n1,int n2) throws Exception  {
		try {
		int res;
		res=n1+n2;
		if(res>10) {
			throw new ArithmeticException();
		}
		else 
			throw new IOException();
	}
	
	catch (ArithmeticException e){
		System.out.println("Arithmetic exception occured");
	}
	catch (IOException ex) {

		System.out.println("IO Exception occured");	
	}
		finally {
			System.out.println("--Finnaly Block--");
		}
		System.out.println("Throws exception ends");
	}

	public static void main(String[] args) throws Exception  {
		ThrowsException obj=new ThrowsException();
		obj.addition(5,4);

	}

}
