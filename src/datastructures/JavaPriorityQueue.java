package datastructures;

import java.util.*;
class Stu implements Comparable<Stu> {
    int id;
    String stname;
    double cgpa;
    Stu(int id, String name, double cgpa) {
        this.id = id;
        this.stname = name;
        this.cgpa = cgpa;
    }

    public int compareTo(Stu b) {
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
    public List<Stu> getStudents(List<String> events) {
        PriorityQueue<Stu> queue = new PriorityQueue<Stu>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).contains("SERVED")) {
                if (queue.size() > 0) { queue.poll(); }
            } else {
                String[] data = events.get(i).split(" ");
                queue.add(new Stu(Integer.parseInt(data[3]), data[1], Double.valueOf(data[2])));
            }
        }

        List<Stu> result = new ArrayList<>();
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

        List<Stu> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Stu st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

/*
Sample Input 0
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Sample Output 0
Dan
Ashley
Shafaet
Maria
 */