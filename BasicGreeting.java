
public class BasicGreeting implements Greeting{

    private String name;

    public BasicGreeting(String name){
        this.name = name;
    }

    public String getGreeting(){
        return "hi " + this.name;
    }

    public String getName(){
        return this.name;
    }

}