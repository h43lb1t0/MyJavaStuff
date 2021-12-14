public class Father extends Person{
    String child1;
    String child2;
    String child3;

    public Father(Name name,int age, Adress address,String child1){
        super(name,age,address);
        this.child1 = child1;
    }
    public Father(Name name,int age, Adress address,String child1, String child2){
        super(name,age,address);
        this.child1 = child1;
        this.child2 = child2;
    }
    public Father(Name name,int age, Adress address,String child1, String child2, String child3){
        super(name,age,address);
        this.child1 = child1;
        this.child2 = child2;
        this.child3 = child3;
    }
}
