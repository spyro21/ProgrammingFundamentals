import java.util.Scanner;
import java.util.ArrayList;

class Main {
  static ArrayList<String> todo = new ArrayList<String>();

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
        
        boolean isDone = false;
        
        while(!isDone){
            
            System.out.println("enter item or exit while loop with ('-1'): ");
            String item = input.nextLine();
            if(item.contains("-1")){isDone = true;}
            else {todo.add(item);
             for(int index = 0; index < todo.size();index++){
                System.out.println((index + 1) + ". " + todo.get(index));
            }
            }
           
        }
        
        System.out.println("final todo");
        for(int index = 0; index < todo.size();index++){
                System.out.println((index + 1) + ". " + todo.get(index));
            }
        
  }
}
