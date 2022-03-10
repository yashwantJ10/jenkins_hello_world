import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
  private static List<Student> studentList;

  public static void main(String[] args) {
    studentList = new ArrayList<>(Arrays.asList(
      new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
      new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
      new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
      new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, (double) 80),
      new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, (double) 70),
      new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, (double) 70),
      new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, (double) 70),
      new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, (double) 80),
      new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, (double) 85),
      new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, (double) 82),
      new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, (double) 83),
      new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, (double) 60.4),
      new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, (double) 45.6),
      new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, (double) 95.8),
      new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, (double) 88.4),
      new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4),
      new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5)
    ));

   printDeps();
//    enrolledAfterYear(2018);
//    getAllMaleStudents();
//    groupMaleFemale();
//    avgAge();
  }

  static void avgMarsInEachDep() {
//    Map<String, List<Student>> depSpec = studentList.stream()
//      .collect(Collectors.groupingBy(Student::getEngDepartment));
//    depSpec.entrySet().stream().
  }

  static void avgAge() {
    Map<String, List<Student>> genderSpecMap = groupMaleFemale();
    OptionalDouble avgMale = genderSpecMap.get("Male").stream().mapToInt(Student::getAge).average();
    OptionalDouble avgFemale = genderSpecMap.get("Female").stream().mapToInt(Student::getAge).average();
    System.out.println("avg Male " + avgMale);
    System.out.println("avg Female " + avgFemale);
  }

  static Map<String, List<Student>> groupMaleFemale() {
    Map<String, List<Student>> genderSpec = studentList.stream()
      .collect(Collectors.groupingBy(Student::getGender));
    System.out.println("\ngender Spec " + genderSpec.toString());
    return genderSpec;
  }

  static void getAllMaleStudents() {
    studentList.stream()
      .filter(student -> student.getGender().equalsIgnoreCase("male"))
      .forEach(student -> System.out.println("\nstudents " + student.getName()));
  }

  static void enrolledAfterYear(Integer enrollMentYear) {
    studentList.stream()
      .filter(student -> student.getEnrollmentYear() > enrollMentYear)
      .forEach(student -> System.out.println("\nstudents " + student.getName()));
  }

  static void printDeps() {
    List<String> distinctDeps =  studentList.stream()
      .map(Student::getEngDepartment)
      .distinct()
      .collect(Collectors.toList());
    System.out.println("\nDeps " + distinctDeps);
  }
}
