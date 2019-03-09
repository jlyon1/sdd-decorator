
public class Main {
    public static void main(String args[]){
        Greeting x = new BasicGreeting("SDD");
        Greeting d = new EmphasisGreetingDecorator(x);
        Greeting s = new SadGreetingDecorator(d);

        System.out.println(x.getGreeting());   
        System.out.println(d.getGreeting());
        System.out.println(s.getGreeting());

        // Output: 
        // hi SDD
        // hi SDD!
        // hi SDD!...
    }
}