package Maven.Sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Desktop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Screen screen = new Screen();
		Pattern pattern = new Pattern("C:\\Users\\c22642\\Desktop\\testing\\ob.png");
		try {
			screen.wait("C:\\\\Users\\\\c22642\\\\Desktop\\\\testing\\\\ob.png",2000);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 screen.doubleClick();
		
		

	}

}
