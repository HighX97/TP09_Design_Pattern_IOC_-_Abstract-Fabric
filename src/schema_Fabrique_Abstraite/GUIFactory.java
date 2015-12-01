package schema_Fabrique_Abstraite;

public abstract class GUIFactory
{
   public static GUIFactory getFactory()
   {
        int sys = readFromConfigFile("OS_TYPE");

        if (sys == 0)
            return(new WinFactory());

        return(new OSXFactory());
   }
   private static int readFromConfigFile(String string) {
	// TODO Auto-generated method stub
	return 0;
}
public abstract Button createButton();
}
