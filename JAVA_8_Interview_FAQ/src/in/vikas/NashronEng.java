package in.vikas;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashronEng {

	public static void main(String[] args) throws Exception, ScriptException {
		ScriptEngine se=new ScriptEngineManager().getEngineByName("Nashorn");
		se.eval(new FileReader("one.js"));
	}
}
