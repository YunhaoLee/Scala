public class Student {
    private String name;
    private Integer age;

    private static String school = "atguigu";

    public void printInfo(){
        System.out.println(this.name + " " + this.age + " " + Student.school);
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public static void main(String[] args) {
        Student lee = new Student("Lee", 20);
        Student bob = new Student("Bob", 22);
        lee.printInfo();
        bob.printInfo();
    }
}
