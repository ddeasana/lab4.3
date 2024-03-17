package lab3;

/** Class for different graphic objects, with fields such as name and colour*/
class GraphObject{
    private String name;
    private IMediator mediator;
    private String colour;

    /**
     * @return name of the object
     */
    public String getName(){
        return name;
    }

    /**
     * @return colour of the object
     */
    public String getColour(){
        return colour;
    }

    /**Constructor for a GraphObject class
     * @param name
     * @param mediator
     * @param colour
     */
    public GraphObject(String name, IMediator mediator, String colour){
        this.name = name;
        this.mediator = mediator;
        this.colour = colour;
    }

    /**Sends a message to mediator
     * @param colour new colour
     */
    public void sendNewColour(String colour){
        System.out.println(name + " asked to change colour to " + colour);
        this.colour = colour;
        mediator.sendMessage(this, colour);
    }

    /** Receives a new colour from the mediator
     * @param colour new colour of the object
     */
    public void receiveColour(String colour){
        this.colour = colour;
        System.out.println(name + " changed their colour to " + colour);
    }

}
