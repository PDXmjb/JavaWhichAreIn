import static org.junit.Assert.*;
import org.junit.Test;

public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
  
    @Test
    public void testEmpty() {
        String a[] = new String[] {};
        String b[] = new String[] { };
        String r[] = new String[] { };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void testNotDuplicated() {
	String a[] = new String[] {"arp"};
    	String b[] = new String[] { "marp", "tarp", "starp" };
    	String r[] = new String[] { "arp" };
	assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
  
    @Test
    public void testEmptyB() {
        String a[] = new String[] { "arp", "live", "strong"};
        String b[] = new String[] { };
        String r[] = new String[] { };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
  
    @Test
    public void testNoSubstr() {
        String a[] = new String[] { "tarp", "mice", "bull"};
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong"};
    	String r[] = new String[] { };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}