public class Day07Exception extends Exception{
    public Day07Exception(){
        super();
    }

    public Day07Exception(String message){
        super(message);
    }

    public Day07Exception(String message, Throwable cause){
        super(message, cause)   ;
    }

    public Day07Exception(Throwable cause){
        super(cause);
    }
}
