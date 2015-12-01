package framework_Compiler;

public class ParserCpp extends Parser{

	@Override
	public AST parse(ScanedText t) {
		System.out.println("I am Parsing a C++ scaned text a C++ AbstractSyntaxTee");
		return new AST();
	}

}
