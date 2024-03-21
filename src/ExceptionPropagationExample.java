import java.io.IOException; 
class ExceptionPropagationExample { 
    void m() throws IOException 
    { 
        throw new IOException("example of ExceptionPropagation"); 
    } 
    void n() throws IOException 
    { 
        m(); 
    } 
    void p() 
    { 
        try { 
            n(); 
        } 
        catch (Exception e) { 
            System.out.println("exception handled"+"  :  "+e); 
        } 
    } 
    public static void main(String args[]) 
    { 
        ExceptionPropagationExample obj = new ExceptionPropagationExample(); 
        obj.p(); 
        System.out.println("normal flow..."); 
    } 
} 