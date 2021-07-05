package Inheritance2;

public class Inheritance2 {

    public static void main(String[] Args) {

        Worker worker = new Worker();
        //    worker.name = "Elvis";
        //    worker.age = 23;
            worker.salary = 1057;
        worker.getSalary();

        System.out.println(worker.getSalary());

        // объект
        Human clerc = new Human();
        clerc.go();
        Manger rs = new Manger();
        rs.go();
        rs.sal();
    //    rs.salary = 1;
    //    System.out.println(rs.salary);
        Worker w = new Worker();
        w.go();
        w.age = 33;
        System.out.println(w.age);

    }

}
