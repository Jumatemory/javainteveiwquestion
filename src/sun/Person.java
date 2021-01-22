package sun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person  implements Comparator<Person> {
    String name;
    int age;
    String race;

    public Person(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

//    @Override
//    public int compareTo(Person o) {
//        if (this.getAge()>o.age){
//            return 1; }
//        if (this.getAge()<o.age){
//            return -1;
//        } else if(this.getAge()==o.getAge()){
//            return 0;
//        }
//        else if(this.name.compareTo(o.name)>0){
//            return 1;
//        }
//        else if(this.name.compareTo(o.name)<0){
//            return -1;
//        }
//        else if(this.name.compareTo(o.name)==0){
//            return 0;
//        }
//        else if(this.race.compareTo(o.race)>0){
//            return 1;
//        }
//        else if(this.race.compareTo(o.race)<0){
//            return -1;
//        }
//        else
//            return 0;
//
//
//
//    }



    public static void main(String[] args) {
        Person p1 = new Person("Juma", 30, "Asian" );
        Person p2 = new Person("Omaid", 33, "White");
        Person p3 = new Person("Sam", 45, "Brown");
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        Comparator<Person> comp = Comparator.comparing(Person::getRace);
        Collections.sort(arrayList, comp);

        for (Person each : arrayList){
            System.out.println(each.getName() + " "+ each.getAge() + " "+ each.getRace());
        }

    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
