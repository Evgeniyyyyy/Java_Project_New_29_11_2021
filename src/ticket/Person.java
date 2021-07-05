package ticket;

public class Person {
    String name;
    int age;
    String sex;

    public String getName() {
        if (sex == "male") {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
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

  }
