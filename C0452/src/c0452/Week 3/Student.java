class Student{
  //data
  private int ID;
  private String name;
  Course myCourse;

  //empty Constructor
  public Student (){
  }

  //populated constructor
  public Student(int ID, String name){
    this.ID = ID;
    this.name = name;
    this.myCourse = myCourse;
  }

  //print method
  public void printStudent(){
  System.out.println(ID+":"+ name);
  System.outprintln(myCourse.getCourseCode()+"+" myCourse.getCourseName());
  }

  //Enrol
  public void enroll (Course course){
    this.myCourse = course;
  }

}