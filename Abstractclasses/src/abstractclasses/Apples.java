
package abstractclasses;

public class Apples extends Food {
    
    public void eat(){
        System.out.println("This is a abstract method");
    }
    
    // since the eat method is in the abstract class and the methos itself is abstract you must use the method in any class
    // that inherats it or it will not work.

    @Override
    public String toString() {
        return "ZZZZZ";//To change body of generated methods.
    }

   


}
