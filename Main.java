import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        //setting array of students
        students.add(new Student("James",12,"123 Main St"));
        students.add(new Student("Dan",56,"234 Main St"));
        students.add(new Student("Adam",10,"345 Main St"));
        students.add(new Student("Helen",88,"456 Main St"));
        students.add(new Student("Betty",45,"567 Main St"));
        students.add(new Student("Carl",4,"678 Main St"));
        students.add(new Student("Jen",21,"789 Main St"));
        students.add(new Student("Trevor",4,"890 Main St"));
        students.add(new Student("Kevin",46,"12 Main St"));
        students.add(new Student("Sarah",98,"34 Main St"));
        //print unsorted
        System.out.println("Unsorted");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(""); //blank space between unsorted & sorted lists
        //calling the sort by rollno method
        selectionSortByRollNo(students);
        System.out.println("Students in ascending order of roll number: ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(""); //blank space between sorted lists
        //call sort by name method
        selectionSortByName(students);
        System.out.println("Students in alphabetical order: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    public static void selectionSortByRollNo(ArrayList<Student> students){ //selection sort algorithm sorting by rollno
        SortByRollNo sortByRollNo = new SortByRollNo(); //use comparator in student class
      //for loop to iterate through arraylist students
        for (int i = 0; i < students.size(); i++) {
            int minIndex = i;
            for (int j = i; j < students.size(); j++) {
                //if element at j is less than element at minIndex, update the minIndex
                if(sortByRollNo.compare(students.get(j), students.get(minIndex)) < 0){
                    minIndex =  j;
                }
            }
            Student temp = students.get(i);
            //setting the element at minIndex to index i
            students.set(i,students.get(minIndex));
            //setting the minIndex by the temp element
            students.set(minIndex,temp);
        }
    }

    public static void selectionSortByName(ArrayList<Student> students){ //selection sort algorithm sorting by name
        SortByName sortByName = new SortByName(); //use comparator in student class
        //for loop to iterate through arraylist students
        for (int i = 0; i < students.size(); i++) {
            int minIndex = i;
            for (int j = i; j < students.size(); j++) {
                //if element j is less than minIndex, set minIndex to j
                if(sortByName.compare(students.get(j), students.get(minIndex)) < 0){
                    minIndex =  j;
                }
            }
            Student temp = students.get(i);
            //setting the element at minIndex to i
            students.set(i,students.get(minIndex));
            //setting the minIndex to temp element
            students.set(minIndex,temp);
        }
    }
}

