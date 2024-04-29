package Exceptionhandle;

import javax.imageio.IIOException;

class Super{
	
	public static void letsGo() throws ArithmeticException
	{
		int i=100/0;
		
		throw new ArithmeticException("hi");
	}
}
public class Compiletime  {

	public static void main(String[] args) throws ArithmeticException {
      
		try {
			Super.letsGo();
	}catch(ArithmeticException e) {
		System.out.println("got it");
	}
	}
}
