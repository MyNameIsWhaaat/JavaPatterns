package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

import Tasks.T611.*;
import Tasks.T612.*;
import Tasks.T616.*;
import Tasks.T623.*;
import Tasks.T624.*;
import Tasks.T625.*;
import Tasks.T626.*;
import Tasks.T631.*;
import Tasks.T6310.*;
import Tasks.T6311.Human;
import Tasks.T6311.Watchman;
import Tasks.T632.*;
import Tasks.T639.Trafficlight;


public class Main {
    public static void main(String[] args) {
        // 1. allowNull с null (singleton)
        // Storage<Integer> s1 = Storage.allowNull(null);
        // System.out.println(s1.getOrElse(0)); // → 0

        // // 2. allowNull с 99
        // Storage<Integer> s2 = Storage.allowNull(99);
        // System.out.println(s2.getOrElse(-1)); // → 99

        // // 3. allowNull с null (строка)
        // Storage<String> s3 = Storage.allowNull(null);
        // System.out.println(s3.getOrElse("default")); // → default

        // // 4. allowNull со строкой
        // Storage<String> s4 = Storage.allowNull(null);
        // System.out.println(s4.getOrElse("hello world")); // → hello worl

        // // 5. disallowNull с null — выбросит исключение
        // try {
        //     Storage<String> s5 = Storage.disallowNull(null);
        //     System.out.println(s5.get()); // Exception
        // } catch (IllegalStateException e) {
        //     System.out.println("Exception: " + e.getMessage());
        // }

        // NameGenerator generator = NameGenerator.getInstance();

        // Name a = generator.generate("Александр", "Сергеевич", "Пушкин");
        // Name b = generator.generate("Александр", "Сергеевич", "Пушкин");
        // Name c = generator.generate("Александр", null, "Пушкин");

        // System.out.println(a); 
        // System.out.println(c); 

        // System.out.println(a == b);
        // System.out.println(a == c);

        // DataBase db = new DataBase(2);
        // db.connect();
        // db.connect();
        // db.connect();
        // db.connect();

        // Cat cat = new Cat();
        // CountingCat counter = new CountingCat(cat);

        // someMeowingMethod(counter);

        // System.out.println("Котик мяукнул: " + counter.getCountOfMeows() + " раз");

        //DogCat catdog = new DogCat("kit");

        // catdog.meow();
        // catdog.bark();

        Point3d p = new Point3d(2, 9, 6);
        //System.out.println(p);

        // p.shift(4, Axis.Z);
        //System.out.println(p);

        Circle f= new Circle(Point.create(2, 3), 4);
        //System.out.println(f);
        
        // f.shift(5, Axis.X);
        // System.out.println(f);

        ShiftObjects so = new ShiftObjects();
        so.add(f);
        so.add(p);

        ShiftObjects so2 = new ShiftObjects();
        so2.add(so);

        so2.shift(1, Axis.X);
        so2.show("");

        GradeRule vasyaRule = new GradeRule() {
            public boolean isValid(int mark){
                return mark == 0 || mark == 1;
            }
        };

        GradeRule petyaRule = new GradeRule() {
            public boolean isValid(int mark){
                return mark % 2 == 0;
            }
        };

        Student s = new Student("Вася", vasyaRule, 1, 5);
        //Student s1 = new Student("Петя", petyaRule, 2, 4, 5);

        //System.out.println(s.toString());
        //System.out.println(s1.toString());

       // Student s2 = new Student("Олег");
       // System.out.println(s2.toString());

        // s.setMark(0, 3);
        // System.out.println(s.toString());
        // System.out.println(s1.toString());
       // System.out.println(s2.toString());

        // System.out.println(s.getAverageRating());
        // System.out.println(s.isExcellentStudent());

        // Karateka k = new Karateka("Тайлер");
        // Karateka k2 = new Karateka("Эдвард");

        // Combo c = new Combo();
        // c.add(new PunchAttack(k));
        // c.add(new JumpAttack(k2));
        // c.add(new KickAttack(k));

        // c.execute();

        s.addMark(0);
        System.out.println(s.toString());
        s.undo();
        System.out.println(s.toString());
        s.redo();
        System.out.println(s.toString());
        s.redo();

        Trafficlight tl = new Trafficlight();
        tl.next();
        tl.next();
        tl.next();
        tl.next();
        tl.next();

        Human h = new Tasks.T6311.Student(null, null);
        Tasks.T6311.Student st = new Tasks.T6311.Student("Вася", "");
        Watchman w = new Watchman();
        System.out.println(w.checkUser(st));

        Open o = new Open() {
            public String open(String filename){
                return "Это содержимое файла " + filename;
            }
        };

    }
    
    public static void someMeowingMethod(Meower m){
        m.meow();
        m.meow();
        m.meow();
    }
}