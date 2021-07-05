package HW;
 /*Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.*/


public class Task9Person1 {
    String name;
    int age;
    String sex;
 //   int salary;

    public Task9Person1(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
     //   this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName(String name) {
        if (sex == "male") {

            return "Mr. " + name;
        }
        else if (sex == "female") {

            return "Mrs. " + name;
        }
        return name;
    }

}
