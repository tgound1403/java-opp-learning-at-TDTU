//Define a Student class
public class Student {
    //3 properties
    private String name;
    private String major;
    private int age;
    //Constructor 1
    public Student(){};
    //Constructor 2
    public Student(String name, String major, int age){
        this.name= name;
        this.major = major;
        this.age = age;
    };
    public Student( Student st){
        this.name = st.getName();
        this.major = st.getMajor();
        this.age = st.getAge();
    }
    //getters and setters
    public String getName(){
        return this.name;
    }
    public String getMajor(){
        return  this.major;
    }
    public int getAge(){
        return  this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setAge(int age){
        this.age = age;
    }

}