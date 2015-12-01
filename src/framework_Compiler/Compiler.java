package framework_Compiler;

public class Compiler {
	
	protected Lexer lexer;
	protected Parser parser;
	protected Generator gen;
	protected String language;
	protected FactComp factComp;
	
	Compiler(String language) throws Exception
	{
		this.language = language;
		factComp=FactComp.getFactory(language);
		lexer = factComp.getLexer();
		parser = factComp.getParser();
		gen = factComp.getGenerator();
		System.out.println("Compiler "+language+" initialized");
	}
	
	public void compile(ProgramText programme)
	{	
		System.out.println("Compilation started");
		gen.generate(parser.parse(lexer.scan(programme)));
		System.out.println("Compilation finished");
	}
	
	public static void main(String[] args)
	{
		try{
		System.out.println("---------------------------");
		Compiler c1  = new Compiler("Java");
		c1.compile(new ProgramText("..."));
		System.out.println("---------------------------");
		Compiler c2  = new Compiler("Cpp");
		c2.compile(new ProgramText("..."));
		System.out.println("---------------------------");
		Compiler c3  = new Compiler("Ada");
		c3.compile(new ProgramText("..."));
		System.out.println("---------------------------");
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	

}
