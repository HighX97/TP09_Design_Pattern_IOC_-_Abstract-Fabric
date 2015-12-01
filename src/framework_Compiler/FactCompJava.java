package framework_Compiler;

public class FactCompJava extends FactComp{

	FactCompJava(String language) {
		super(language);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Lexer getLexer() {
		// TODO Auto-generated method stub
		return new LexerJava();
	}

	@Override
	public Parser getParser() {
		// TODO Auto-generated method stub
		return new ParserJava();
	}

	@Override
	public Generator getGenerator() {
		// TODO Auto-generated method stub
		return new GeneratorJava();
	}

}
