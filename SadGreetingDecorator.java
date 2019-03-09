public class SadGreetingDecorator extends GreetingDecorator{
    public SadGreetingDecorator(Greeting g){
        super(g);
    }

    @Override
    public String getGreeting(){
        return this.DecoratedGreeting.getGreeting() + "...";
    }

    @Override
    public String getName(){
        return this.DecoratedGreeting.getName();
    }
}