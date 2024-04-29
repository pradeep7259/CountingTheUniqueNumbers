package Exceptionhandle;

public class UncheckeExcption extends Exception {

	private static final long serialVersionUID = 1L;

	private String message;
	private Object val;

	public UncheckeExcption(String message, Object val) {
		String returnval = String.valueOf("%s " + val + "%s" + message);
		System.out.println(val+"Age");
	}

	public Object getVal() {
		return val;
	}

	public String getMessage() {
		return message;
	}
}
