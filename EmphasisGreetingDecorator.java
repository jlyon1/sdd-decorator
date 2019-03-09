public class EmphasisGreetingDecorator extends GreetingDecorator{
    public EmphasisGreetingDecorator(Greeting g){
        super(g);
    }

    @Override
    public String getGreeting(){
        return this.DecoratedGreeting.getGreeting() + "!";
    }

    @Override
    public String getName(){
        return this.DecoratedGreeting.getName();
    }
}