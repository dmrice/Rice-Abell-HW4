
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Deanna Rice and Phillip Abell
 *
 */
public class Examples {
	public Examples() {}
	
	HeapChecker HT = new HeapChecker();
	IHeap emptyHeap = new MtHeap();
	IHeap fullHeap = new DataHeap(9);
	IHeap largeHeap = new DataHeap(2, new DataHeap(9), new DataHeap(12));
	IHeap myHeap = new DataHeap(14);
	IHeap myBinTree = new DataHeap(2, new DataHeap(14), new DataHeap(5));
	
	@Test
	public void test1(){
		assertTrue(HT.addEltTester(fullHeap,5,fullHeap.addElt(5)));
	}
    @Test
	 public void test2(){
	    assertFalse(HT.addEltTester(myHeap,5,myBinTree));
    }
	@Test
	public void addEmptyElt() {
		assertTrue(HT.addEltTester(emptyHeap,2,new DataBT(2)));
	}
	
	@Test
	public void addToFilled() {
		assertTrue(HT.addEltTester(fullHeap,2,fullHeap.addElt(2)));
	}
	
	@Test
	public void addToBigList() {
		assertTrue(HT.addEltTester(largeHeap,5,largeHeap.addElt(5)));
	}
	
	@Test
	public void removeBecomesEmpty(){
		assertTrue(HT.remMinEltTester(fullHeap,fullHeap.remMinElt()));
	}
	
	@Test
	public void removingWithEmpty() {
		assertTrue(HT.remMinEltTester(emptyHeap,emptyHeap.remMinElt()));
	}
	
	@Test
	public void removeBigHeap() {
		assertTrue(HT.remMinEltTester(largeHeap,largeHeap.remMinElt()));
	}

}

