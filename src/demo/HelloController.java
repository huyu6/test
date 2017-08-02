package demo;

import com.jfinal.core.Controller;
import com.jfinal.core.JFinal;

public class HelloController extends Controller{
	public void index() 

	{ renderText("Hello JFinal World.");
}
	public static void main(String[] args) {
	JFinal.start("WebRoot", 80, "/", 5);
}
}