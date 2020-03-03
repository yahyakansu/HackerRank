package objectorientedprogramming;

import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class Mybook extends Book{
    @Override
    void setTitle(String str) {
        title=str;
    }
}
public class JavaAbstract {
    public static void main(String []args){
        //Book new_novel=new Book();
        // This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        Mybook new_novel = new Mybook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}

/*
Sample Input
A tale of two cities

Sample Output
The title is: A tale of two cities
 */