class CustomException extends Exception { 
    public CustomException() { 
        super("Custom exception occurred."); 
    } 
    
    public CustomException(String message) { 
        super(message); 
    } 
} 
public class Exception_task02 { 
    public static void main(String[] args) { 
        try { 
            throw new CustomException("Custom exception occurred."); 
        } catch (CustomException e) { 
            System.out.println("Custom exception caught: " + e.getMessage()); 
        } 
    } 
} 