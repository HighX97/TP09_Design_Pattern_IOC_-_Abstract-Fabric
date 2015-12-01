package schema_Fabrique_Abstraite;

class OSXButton extends Button
{
    public void paint()
    {
        System.out.println("I'm an OSXButton: "+ getCaption());
    }
}
