package framework_Compiler;

public abstract class FactComp {
	
	private static String language;
	
	FactComp(String language)
	{
		this.setLanguage(language);
	}
	
	public static FactComp getFactory(String language) throws Exception
	{
		if (language.equalsIgnoreCase("Java"))
		{
			System.out.println("Compiling : Java program.");
			return new FactCompJava(getLanguage());
		}
		else if (language.equalsIgnoreCase("Cpp"))
		{
			System.out.println("Compiling : C++ program.");
			return new FactCompCpp(getLanguage());
		}
		else
		{
			throw new Exception("Non supported Language : "+language+" , Extend the framework to support it");
		}
	}

	public static String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		FactComp.language = language;
	}
	
	public abstract Lexer getLexer();
	public abstract Parser getParser();
	public abstract Generator getGenerator();

}
