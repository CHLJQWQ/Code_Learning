public class OOPTest1 {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student();
        stu1.name="小明";
        stu2.name="李华";
        stu1.read();
        stu2.read();
    }
}

class Student{
    String name;
    void read(){
        System.out.println("大家好，我是"+name);
    }
}
class Example{

}