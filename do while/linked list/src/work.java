import java.util.LinkedList;

public class work {

    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();

        // Add at least 5 students by adding elements to the front of the list
        studentList.addFirst(new Student("AXCELl", 1001));
        studentList.addFirst(new Student("OLLY", 1020));
        studentList.addFirst(new Student("ROMEO", 1034));
        studentList.addFirst(new Student("DINOS", 10435));
        studentList.addFirst(new Student("BOIPELO", 100025));
        printList("List after adding students to the front:", studentList);

        // Add a student called „John” at the end of the list
        studentList.addLast(new Student("John", 106));
        printList("List after adding 'John' to the end:", studentList);

        // Find student called „Elizabeth”. If found, delete the next student. If not found, inform the user.
        int elizabethIndex = findStudentIndex(studentList, "Elizabeth");
        if (elizabethIndex != -1 && elizabethIndex < studentList.size() - 1) {
            studentList.remove(elizabethIndex + 1);
            System.out.println("Deleted the student after 'Elizabeth'.");
        } else if (elizabethIndex != -1) {
            System.out.println("Elizabeth found, but no student found after Elizabeth.");
        } else {
            System.out.println("Elizabeth not found.");
        }

        // Print the final list after all operations
        printList("Final List:", studentList);
    }

    // Helper method to find the index of a student by name
    private static int findStudentIndex(LinkedList<Student> list, String studentName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(studentName)) {
                return i;
            }
        }
        return -1;
    }

    // Helper method to print the list
    private static void printList(String message, LinkedList<Student> list) {
        System.out.println(message);
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println();
    }

}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
