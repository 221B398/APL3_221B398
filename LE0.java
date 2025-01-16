public class Main
{
    String name;
    int age;
    
    void setName(String name){
        this.name=name;
    }
     void setAge(int age){
        this.age=age;
    }
    
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;}
    
	public static void main(String[] args) {
	Main m1=new Main();
	m1.setName("Sudhanshu Mall");
	m1.setAge(21);
	System.out.println(m1.getName());
	System.out.println(m1.getAge());

	}
}