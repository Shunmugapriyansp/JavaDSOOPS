package tester;

class Super_class {
   int num ;
   
   public Super_class(int num){
	   this.num = num;
   }

   // display method of superclass
   public void display() {
      System.out.println("This is the display method of superclass");
   }
}

public class Sub_class extends Super_class {
   public Sub_class(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

int num = 10;


   // display method of sub class
   public void display() {
      System.out.println("This is the display method of subclass");
   }

   public void my_method() {
      // Instantiating subclass
      //Sub_class sub = new Sub_class();

      // Invoking the display() method of sub class
     display();

      // Invoking the display() method of superclass
      super.display();

      // printing the value of variable num of subclass
      System.out.println("value of the variable named num in sub class:"+ num);

      // printing the value of variable num of superclass
      System.out.println("value of the variable named num in super class:"+ super.num);
   }

   public static void main(String args[]) {
      Sub_class obj = new Sub_class(0);
      obj.my_method();
   }
}