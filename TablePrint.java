//Table

/*
public class TablePrint {
    public static void main(String[] args) {
        int n=1,i=1;
        while (i<=10){
            n=i*2;
            System.out.print(" "+n);
            i++;
        }
    }
}
*/

/*
import java.util.Scanner;
public class TablePrint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter eny value");
        int aa=s.nextInt();
        int n=1, i=1;
        while (i<=10){
            n=i*aa;
            System.out.print(" "+n);
            i++;
        }
    }
}
*/


/*
public class TablePrint {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
        int n=1;
        n=i*2;
            System.out.print(" "+n);
        }
    }
}
*/

/*
import java.util.Scanner;
public class TablePrint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter any value");
        int aa=s.nextInt();
        for (int i=1; i<=10; i++){
            int n=i*aa;
            System.out.print(" "+n);
        }
    }
}
*/


/*
public class TablePrint {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.print(" "+i*2);
        }
    }
}
*/

/*
import java.util.Scanner;
public class TablePrint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter any value");
        int aa=s.nextInt();
        for (int i=1; i<=10; i++){
            System.out.print(" "+i*aa);
        }
    }
}
*/


/*
import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter value 5 or 10 only");
        int aa=s.nextInt();
        for (int i=1; i<=10; i++){
            if (aa==5){
                System.out.print(" "+i*10);
            }
            else if (aa==10){
                System.out.print(" "+i*5);
            }
            else {
                System.out.print("Please enter valid value");
                break;
            }
        }
    }
}
*/
