//Define a Test class 
public class Test {
    //main method
    public static void main(String[] args) {
        Student me = new Student("Nguyen Trieu Duong","Computer Science", 19);
        Student someone = new Student();
        Student st = new Student(me);
        someone.setName("Anonymous");
        someone.setMajor("Unknown");
        someone.setAge(20);
        System.out.println(me.getName());
        System.out.println(me.getMajor());
        System.out.println(me.getAge());
        System.out.println("");
        System.out.println(st.getName());
        System.out.println(st.getMajor());
        System.out.println(st.getAge());
        
    }
}