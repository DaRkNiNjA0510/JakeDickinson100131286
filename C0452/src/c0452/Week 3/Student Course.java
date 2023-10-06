class Course{
  private String coursecode;
  private String coursename;

  //empty constructor
  public Course(){

    //populated constructor
    public Course (String courseCode, String coursename){
      this.courseCode= courseCode;
      this.courseName= courseName;
}
    
    public void printCourse(){
    system.out.println(courseCode + ":"+courseName);
    }
    
      public String getCourseCode(){
        return this.courseCode;
      }

    public String getCourseName(){
      return this.courseName;
    }

  }