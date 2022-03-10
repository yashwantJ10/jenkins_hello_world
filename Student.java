public class Student {
  public Integer id;
  public String name;
  public Integer age;
  public String gender;
  public String engDepartment;
  public Integer enrollmentYear;
  public Double  percent;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEngDepartment() {
    return engDepartment;
  }

  public void setEngDepartment(String engDepartment) {
    this.engDepartment = engDepartment;
  }

  public Integer getEnrollmentYear() {
    return enrollmentYear;
  }

  public void setEnrollmentYear(Integer enrollmentYear) {
    this.enrollmentYear = enrollmentYear;
  }

  public Double getPercent() {
    return percent;
  }

  public void setPercent(Double percent) {
    this.percent = percent;
  }

  public Student(Integer id, String name, Integer age, String gender, String engDepartment, Integer enrollmentYear, Double percent) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.engDepartment = engDepartment;
    this.enrollmentYear = enrollmentYear;
    this.percent = percent;
  }
}
