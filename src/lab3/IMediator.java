package lab3;
/**Interface for a mediator*/
public interface IMediator {
    public void addObject(GraphObject object);
    public void sendMessage(GraphObject sender, String colour);
}
