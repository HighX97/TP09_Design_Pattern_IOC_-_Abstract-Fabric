package framework_Compiler;

public class LexerJava extends Lexer {

	@Override
	public ScanedText scan(ProgramText t) {
		System.out.println("I am scanning a Java program text");
		return new ScanedText();
	}

}
