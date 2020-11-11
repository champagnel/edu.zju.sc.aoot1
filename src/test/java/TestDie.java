import com.sun.org.apache.xerces.internal.xs.XSIDCDefinition;
import edu.zju.sc.aoot.Die;
import junit.framework.Assert;
import org.junit.Test;

public class TestDie {

	@Test
	public void testConstructor(){
		Die die = new Die(6);
		int temp = die.numOfSide();
		Assert.assertEquals(temp, 6);
	}
	@Test
	public void testDie(){
		Die die = new Die();
		int side = die.numOfSide();
		Assert.assertEquals(side, 6);
	}
}
