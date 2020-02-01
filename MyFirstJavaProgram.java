import java.io.*;


public class MyFirstJavaProgram {
    public static void main(String []args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);

        TestClass testObj = new TestClass();
        testObj.testMain();
        try {
            testObj.copyFile();
          }
          catch(IOException e) {
            e.printStackTrace();
          }

    }
}

//enum
class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE };
    FreshJuiceSize size;

}

//array, loop, byte stream
class TestClass{

    public void testMain(){
        int [] jarray = {10, 20, 30, 40, 50, 60};
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String i : names){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.print("\n");
        System.out.println("string length: " + names.length);
        String oneString = "string one ";
        String twoString = "+ string two ";
        String thirdString = oneString.concat(twoString);
        System.out.println("third merged string is: " + thirdString);
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
     
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
           result[j] = list[i];
        }
        return result;
    }    

    public void copyFile() throws IOException{
        FileInputStream in = null;
        FileOutputStream out =null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            
            int c;
            while((c=in.read()) != -1){
                out.write(c);
            }
            
        } finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}

