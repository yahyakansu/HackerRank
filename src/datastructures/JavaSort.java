package datastructures;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }

    public String getFname() { return fname; }

    public double getCgpa() { return cgpa; }
}

//Complete the code

class compareStudent implements Comparator<bignumber.Student>{
    double d=0.001;
    @Override
    public int compare(bignumber.Student s1, bignumber.Student s2){
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > d) {
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1; // descending order
        } else if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        } else {
            return s1.getId() - s2.getId();
        }
    }
}


public class JavaSort {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        List<bignumber.Student> studentList = new ArrayList<bignumber.Student>();
        while (testCases-- > 0) {
            int id       = scan.nextInt();
            String fname = scan.next();
            double cgpa  = scan.nextDouble();
            bignumber.Student st   = new bignumber.Student(id, fname, cgpa);
            studentList.add(st);
        }
        scan.close();

        Collections.sort(studentList, new compareStudent());
        for (bignumber.Student st: studentList) {
            System.out.println(st.getFname());
        }
    }
}

/*
Sample Input
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76

Sample Output
Ashis
Fahim
Samara
Samiha
Rumpa
 */
