public class this2 {
        void display()
        {
           this.show();
           System.out.println("Inside display");
        }
         
        void show() {
            System.out.println("Inside show");
        }
        public static void main(String args[]) {
            this2 t1 = new this2();
            t1.display();
        }
    }

