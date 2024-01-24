public class Person implements  Comparable<Person>{
    @Override
    public int compareTo(Person o) {
        //
//        if (this.name.compareTo(o.name)<0){
//            return -1;
//        }else if (this.name.compareTo(o.name)>0){
//            return 1;
//        }
//        return 0;
        return Double.compare(this.weight,o.weight);
    }

    private int id;
    private String name;
    private int age;
    private double weight;

    public Person() {
    }

    public Person(int id, String name, int age, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
