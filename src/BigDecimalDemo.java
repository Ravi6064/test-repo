import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/**
 * @author B0216853
 *
 */

class MyBigDecimal extends java.math.BigDecimal {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str;
    public MyBigDecimal(String str){
        super(str);
        this.str = str.trim();
    }
    public String toString(){ return str; }
}

public class BigDecimalDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add(BigDecimal.valueOf(Double.valueOf(".111")).toString());
		list.add(new BigDecimal("20.00").toString());
		list.add(new BigDecimal("100").toString());
		list.add(new BigDecimal("0.1").toString());
		list.add(new BigDecimal(".1").toString());
		
		String[] s = "56.6".split("[.]");

		//System.out.println("56.6".split(".")[1]);
		

	}

}
