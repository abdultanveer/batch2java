package exceptions;
class InvalidAgeException extends Exception{  
	InvalidAgeException(String s){  
		super("your age is less");  
	}  
}  