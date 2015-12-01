package schema_Fabrique_Abstraite;

class WinButton extends Button
{
    public void paint()
    {
        System.out.println("I'm a WinButton: "+ getCaption());
    }
}
