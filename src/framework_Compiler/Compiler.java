package framework_Compiler;

public abstract class Compiler {
	
	protected Lexer lexer;
	protected Parser parser;
	protected Generator gen;
	protected String language;
	protected FactComp factComp;
	
	Compiler(String language)
	{
		this.language = language;
		System.out.println("Compiling : "+language+" programm");
	}
	
	public void compile(ProgramText programme)
	{	
		System.out.println("Compilation started");
		gen.generate(parser.parse(lexer.scan(programme)));
		System.out.println("Compilation finished");
	}
	

}
