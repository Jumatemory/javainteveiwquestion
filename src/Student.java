public class Student implements Comparable <Student>{

    String name;
    int grade;
    double gap;


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getGap() {
        return gap;
    }
    public boolean equals(Student other){
        return this.grade==other.grade;


    }





    public static void main(String[] args) {
        Student student = new Student();
        student.grade =13;

        Student student1 = new Student();
        student1.grade = 13;
        System.out.println(student.equals(student1));

    }



    @Override
    public int compareTo(Student o) {
        if (getGrade()>o.getGrade()){
            return 1;
        } else if(getGrade()<o.getGrade()   ){
            return -1;
        }
        else
            return 0;
    }
}
