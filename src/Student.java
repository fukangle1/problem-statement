public class Student {
    private String studentID;
    private String studentName;
    private String [] extraActivities;

    public Student(String studentID, String studentName, int activitiesNumber){
    this . studentID = studentID;
    this. studentName = studentName ;
    this. extraActivities = new String[activitiesNumber] ;
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this . studentID = studentID;
    }
    public String getstudentName() {
        return studentName;
    }
    public void setStudentName (String studentName) {
        this . studentName = studentName;
    }
    public String[] getExtraActivities() {
        return extraActivities;
    }
    public void setExtraActivities (String[ ] extraActivities) {
        this . extraActivities = extraActivities;
    }
    public void addExtraActivity(String activity, int index) {
        if (index >= 0 && index < this. extraActivities.length) {
            this.extraActivities [index] = activity;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder( ) ;
        sb.append("Student ID:").append(studentID)
          .append("\nName:" ).append(studentName)
          .append("\nExtra Activities: " ) ;
        for (String activity : extraActivities) {
            sb.append(activity) . append(" ");
        }
        return sb. toString() . trim();
    }
}
