package exceptions;

public class InvalidNumberException extends RuntimeException{

    public InvalidNumberException(){
        super("Weight cannot be negative");
    }

}
