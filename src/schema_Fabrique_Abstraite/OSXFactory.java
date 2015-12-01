package schema_Fabrique_Abstraite;

class OSXFactory extends GUIFactory
{
    public Button createButton()
    {
        return(new OSXButton());
    }
}
