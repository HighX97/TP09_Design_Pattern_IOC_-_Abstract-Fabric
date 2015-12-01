package framework_Compiler;

public class ParserJava extends Parser{

	@Override
	public AST parse(ScanedText t) {
		System.out.println("I am Parsing a Java scaned text and I generate a Java AbstractSyntaxTee");
		return new AST();
	}

}
