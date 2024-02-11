public class constructor_creation_02 {
    // constructor creation


        static class Square{
            int a,b,c;

            public void calculateArea(){
                System.out.println("Area :"+a*b*c);
            }

            Square(int a,int b,int c){

                this.a = a;
                this.b = b;
                this.c = c;
                calculateArea();
            }

        }
        public static void main(String a[]){

            // creating a class for finding the volume od a square

            Square s = new Square(3,4,5);

        }
    }

