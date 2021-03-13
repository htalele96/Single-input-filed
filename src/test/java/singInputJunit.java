import static org.junit.Assert.*;

import org.junit.Test;

public class singInputJunit {

	@Test
	public void test() {
		SingleInputFiled input1=new SingleInputFiled();
		input1.goTo();
		input1.inputFiled("Welcome to selemnium Demo");
		input1.showmsg();
		input1.outputFiled();
	 }
	 
	 
	}


