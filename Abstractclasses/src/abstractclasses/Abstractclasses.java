
package abstractclasses;

public class Abstractclasses {

    public static void main(String[] args) {
       Food fo = new Apples();
       // food is and abstract class. apples inherats food.
       
        System.out.println(fo); // printing location not words.
        fo.eat();
       
        
        
    }
    
}
