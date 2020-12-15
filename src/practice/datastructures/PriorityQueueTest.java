package practice.datastructures;

import java.util.*;

class Student_ implements Comparable {
    private String name;
    private double CGPA;
    private String id;

    public Student_(String name, double CGPA, String id) {
        this.name = name;
        this.CGPA = CGPA;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Student_ s = (Student_) o;
        if (this.CGPA > s.getCGPA())
            return -1; // GT to LT
        else if (this.CGPA < s.getCGPA())
            return 1;
        else if (this.getName().equals(s.getName()))
            return this.getId().compareTo(s.getId());
        else
            return this.getName().compareTo(s.getName());
    }
}

class Priorities {

    PriorityQueue<Student_> priorityQueue = new PriorityQueue<>();

    List<Student_> getStudents(List<String> events) {
        for (String event : events) {
            if ("SERVED".equals(event))
                priorityQueue.poll();
            else {
                String[] attributes = event.split(" ");
                Student_ student_ = new Student_(attributes[1], Double.parseDouble(attributes[2]), attributes[3]);
                priorityQueue.add(student_);
            }
        }
        //return new ArrayList<>(priorityQueue); // <- this didn't return the queue in order
        //we needed to poll the elements of the queue to achieve the expected order
        List<Student_> students = new ArrayList<>();
        while (! priorityQueue.isEmpty()) {
            students.add(priorityQueue.poll());
        }
        return students;
    }

}

public class PriorityQueueTest {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student_> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student_ st: students) {
                System.out.println(st.getName());
            }
        }
    }

}
