package framework_Compiler;

public class FactCompCpp extends FactComp {

	FactCompCpp(String language) {
		super(language);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Lexer getLexer() {
		// TODO Auto-generated method stub
		return new LexerCpp();
	}

	@Override
	public Parser getParser() {
		// TODO Auto-generated method stub
		return new ParserCpp();
	}

	@Override
	public Generator getGenerator() {
		// TODO Auto-generated method stub
		return new GeneratorCpp();
	}

}
