
public class Generic {

	public static String returnTelFormat(String value) {
		if(value.length() == 10 && isNumeric(value) == true) {
			String aux = "(" + value.substring(0, 2) + ")" + value.substring(2, 6) + "-" + value.substring(7, 10);
			return aux;
		}else {
			return "";
		}
	}
	
/*	
	public static String returnCPFFormat(String value) {
		if(value.length() == 11 && isNumeric(value) == true) {
			
		}
	}
*/
	public static boolean validEmail(String val) {
		if(val.contains("@") && val.contains(".com")) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isNumeric(String value) {
		try{
			Double.parseDouble(value);
			return true;
		}catch(NumberFormatException e){
			System.out.println("apapa");
			return false;
		}
	}
}
