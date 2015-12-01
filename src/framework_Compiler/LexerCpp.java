package framework_Compiler;

public class LexerCpp extends Lexer {


	public ScanedText scan(ProgramText t) {
		System.out.println("I am scanning a C++ program text");
		return new ScanedText();
	}

}
