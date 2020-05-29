class Student {
    private String name;
    private int age;
    private char gender;
 //   private String phone;
 //   private String address;
 //   private String email;

    //默认构造器
    public void Student(){
    }
    //带所有成员变量的构造器
    public void Student(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        //    this.phone=phone;
        //    this.address=address;
        //    this.email=email;
    }
    //姓名setter,getter方法
    public void setName(String name){
        if (name.length()>6 || name.length()<2){
            System.out.println("输入的姓名有误！");
            return;
        }
        else{
            this.name=name;
        }
    }
    public String getName(){
        return this.name;
    }
    //年龄setter,getter方法
    public void setAge(int age){
        if (age>100 || age<0){
            System.out.println("输入的年龄有误！");
            return;
        }
        else{
            this.age=age;
        }
    }
    public int getAge(){
        return this.age;
    }
    //性别setter,getter方法
    public void setGender(char gender){
        if (gender !='男' && gender !='女'){
            System.out.println("性别输入有误，请输入‘男’或‘女’！");
            return;
        }
        else{
            this.gender=gender;
        }
    }
    public char getGender(){
        return this.gender;
    }
    //

}

public class Test {
    public static void main(String [] args){
        Student[] students=new Student[3];
        for (int i=0;i<3;i++){
            students[i]=new Student();
        }
        students[0].setName("张潇洒");
        students[0].setAge(24);
        students[0].setGender('男');
        System.out.println(students[0].getName() + ",性别是：" + students[0].getGender() + ",年龄是：" + students[0].getAge());
    }
}
