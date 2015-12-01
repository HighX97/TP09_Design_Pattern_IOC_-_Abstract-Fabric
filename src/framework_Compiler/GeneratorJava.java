package framework_Compiler;

public class GeneratorJava extends Generator{

	@Override
	public File generate(AST a) {
		System.out.println("I am generating an JVM program text from Java AbstractSyntaxTree");
		return new File();
	}

}
