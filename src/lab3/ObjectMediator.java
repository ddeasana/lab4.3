package lab3;

import java.util.ArrayList;

/**
 * Class for a mediator with a list of objects
 */
class ObjectMediator implements IMediator{
    private ArrayList<GraphObject> objects = new ArrayList<>();

    /**Adds object to the list
     * @param object
     */
    public void addObject(GraphObject object){
        objects.add(object);
    }

    /**Sends message from an object sender to other objects
     * @param sender sender of the message
     * @param colour new colour for objects
     */
    public void sendMessage(GraphObject sender, String colour){
        for(GraphObject obj : objects){
            if(obj != sender){
                obj.receiveColour(colour);
            }
        }
    }

    /**
     * Returns description of an object
     */
    public void checkColours(){
        for(GraphObject obj : objects){
            System.out.println(obj.getName() + " is " + obj.getColour());
        }
    }
}