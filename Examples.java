
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * 
 * @author Deanna Rice and Phillip Abell
 *
 */
public class Examples {
	public Examples() {}
	
	HeapChecker h1 = new HeapChecker();
	IHeap emptyHeap = new MtHeap();
	IHeap fullHeap = new DataHeap(9);
	IHeap largeHeap = new DataHeap(2, new DataHeap(9), new DataHeap(12));
	IHeap myHeap = new DataHeap(14);
	IHeap myBinTree = new DataHeap(4, new DataHeap(14), new DataHeap(7));
	
	
	@Test
	public void test1(){
		assertTrue(h1.addEltTester(fullHeap,5,fullHeap.addElt(5)));
	}
    @Test
	 public void test2(){
	    assertTrue(h1.addEltTester(myHeap,5,myBinTree));
	  }
	@Test
	public void addEmptyElt() {
		assertTrue(h1.addEltTester(emptyHeap,2,new DataBT(2)));
	}
	
	@Test
	public void addToFilled() {
		assertTrue(h1.addEltTester(fullHeap,2,fullHeap.addElt(2)));
	}
	
	@Test
	public void addToBigList() {
		assertTrue(h1.addEltTester(largeHeap,5,largeHeap.addElt(5)));
	}
	
	@Test
	public void removeBecomesEmpty(){
		assertTrue(h1.remMinEltTester(fullHeap,fullHeap.remMinElt()));
	}
	
	@Test
	public void removingWithEmpty() {
		assertTrue(h1.remMinEltTester(emptyHeap,emptyHeap.remMinElt()));
	}
	
	@Test
	public void removeBigHeap() {
		assertTrue(h1.remMinEltTester(largeHeap,largeHeap.remMinElt()));
	}

}

