import java.util.Comparator;

class Student{
    private String name;
    private int rollNo;
    private String address;
    //constructor
    public Student(String name, int rollNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name:" + name + ", Roll number: " + rollNo + ", Address: " + address;
    }
}

class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        //use compareTo method to sort students according to name
        return student1.getName().compareTo(student2.getName());
    }
}

class SortByRollNo implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        //sorting by roll number in ascending order
        if(student1.getRollNo() < student2.getRollNo()) {
            return -1;
        } else if(student1.getRollNo() > student2.getRollNo()) {
            return 1;
        } else
            return 0;
    }
}


