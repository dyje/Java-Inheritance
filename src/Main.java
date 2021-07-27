class Animals{
    public int age;
    public float weight;
    public void running(){};
    public void eating(){};

    public Animals(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

class Felidae extends Animals{

    public Felidae(int age, float weight) {
        super(age, weight);
    }

    public void sound(){
        System.out.println("meowing meowing");
    }
}

class Tiger extends Felidae{
    public Tiger(int age, int weight){
        super (age, weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Tiger cub = new Tiger(1,10);
        cub.sound();
    }
}


