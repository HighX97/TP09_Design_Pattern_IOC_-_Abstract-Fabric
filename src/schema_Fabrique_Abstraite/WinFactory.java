package schema_Fabrique_Abstraite;

class WinFactory extends GUIFactory
{
    public Button createButton()
    {
        return(new WinButton());
    }
}