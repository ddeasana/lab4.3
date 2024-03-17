package lab3;

public class Main {
    public static void main(String[] args){

        ObjectMediator mediator = new ObjectMediator();
        GraphObject obj1 = new GraphObject("circle",mediator,"blue" );
        GraphObject obj2 = new GraphObject("square",mediator,"red" );
        GraphObject obj3 = new GraphObject("triangle",mediator,"yellow" );

        mediator.addObject(obj1);
        mediator.addObject(obj2);
        mediator.addObject(obj3);

        obj1.sendNewColour("green");
        mediator.checkColours();

        obj3.sendNewColour("pink");
        mediator.checkColours();
    }
}
