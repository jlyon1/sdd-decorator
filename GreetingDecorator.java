
public abstract class GreetingDecorator implements Greeting {
    protected Greeting DecoratedGreeting;

    public GreetingDecorator(Greeting g){
        super();
        this.DecoratedGreeting = g;
    }
}