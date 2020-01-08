import java.util.Random;
public class Addressing{
	public String AlphanumericStringGenerator(int length) {
	    private int leftLimit = 48; 
	    private int rightLimit = 122; 
	    private int stringLength = length;
	    Random random = new Random();

	    Addressing(){
	    }
	 
	    String alphanumericString = random.ints(leftLimit, rightLimit + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(stringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	    return alphanumericString;
	}
}