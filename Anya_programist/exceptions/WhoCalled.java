package Anya_programist.exceptions;


import java.io.FileNotFoundException;
import java.io.IOException;

public class WhoCalled {

}

class A1{
	public void f() throws IOException{}
}
class B1 extends A5 {
	public void f() throws IOException, FileNotFoundException {}
}