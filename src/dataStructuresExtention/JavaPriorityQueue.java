package dataStructuresExtention;

import java.util.*;
class Student implements Comparable<Student> {
    int id;
    String stname;
    double cgpa;
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.stname = name;
        this.cgpa = cgpa;
    }

    public int compareTo(Student b) {
        if (this.cgpa > b.cgpa) { return -1; }
        if (this.cgpa < b.cgpa) { return 1; }
        if (this.cgpa == b.cgpa) {
            if (this.stname.compareTo(b.stname) < 0 ) { return -1; }
            if (this.stname.compareTo(b.stname) > 0) { return 1; }
            if (this.stname.compareTo(b.stname) == 0) {
                if (this.id < b.id) { return -1; }
                if (this.id > b.id) { return 1; }
            }
        }
        return 0;
    }

    public String getName() {
        return stname;
    }
}

class Priorities {
    Priorities() {}
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<Student>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).contains("SERVED")) {
                if (queue.size() > 0) { queue.poll(); }
            } else {
                String[] data = events.get(i).split(" ");
                queue.add(new Student(Integer.parseInt(data[3]), data[1], Double.valueOf(data[2])));
            }
        }

        List<Student> result = new ArrayList<>();
        while (queue.size() > 0) {
            result.add(queue.poll());
        }
        return result;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}