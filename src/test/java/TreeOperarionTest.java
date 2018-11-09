import org.junit.Assert;
import org.junit.Test;

import question9.BinaryTree;
import question9.TreeOperation;

public class TreeOperarionTest {
		
								//7
				  //5   						12
			//3  		6  				9  				15
		//1 	4  					8 		10  	13  	17


	@Test
    public void resultMustBeEquals19Node2() {
		
		BinaryTree binaryTree13 = new BinaryTree(17, null, null);
		BinaryTree binaryTree12 = new BinaryTree(13, null, null);
		BinaryTree binaryTree11 = new BinaryTree(10, null, null);
		BinaryTree binaryTree10 = new BinaryTree(8, null, null);
		BinaryTree binaryTree9 = new BinaryTree(4, null, null);
		BinaryTree binaryTree8 = new BinaryTree(1, null, null);
		
		BinaryTree binaryTree7 = new BinaryTree(15, binaryTree12, binaryTree13);		
		BinaryTree binaryTree6 = new BinaryTree(9, binaryTree10, binaryTree11);
		BinaryTree binaryTree5 = new BinaryTree(6, null, null);
		BinaryTree binaryTree4 = new BinaryTree(3, binaryTree8, binaryTree9);
		
		BinaryTree binaryTree3 = new BinaryTree(12, binaryTree6, binaryTree7);
		BinaryTree binaryTree2 = new BinaryTree(5, binaryTree4, binaryTree5);
		
		BinaryTree binaryTree = new BinaryTree(7, binaryTree2, binaryTree3);

		int result = 19;

        TreeOperation operation = new TreeOperation();

        Assert.assertEquals(result, operation.getSumByNode(binaryTree2));
    }

	@Test
    public void resultMustBeEquals84Node3() {
		
		BinaryTree binaryTree13 = new BinaryTree(17, null, null);
		BinaryTree binaryTree12 = new BinaryTree(13, null, null);
		BinaryTree binaryTree11 = new BinaryTree(10, null, null);
		BinaryTree binaryTree10 = new BinaryTree(8, null, null);
		BinaryTree binaryTree9 = new BinaryTree(4, null, null);
		BinaryTree binaryTree8 = new BinaryTree(1, null, null);
		
		BinaryTree binaryTree7 = new BinaryTree(15, binaryTree12, binaryTree13);		
		BinaryTree binaryTree6 = new BinaryTree(9, binaryTree10, binaryTree11);
		BinaryTree binaryTree5 = new BinaryTree(6, null, null);
		BinaryTree binaryTree4 = new BinaryTree(3, binaryTree8, binaryTree9);
		
		BinaryTree binaryTree3 = new BinaryTree(12, binaryTree6, binaryTree7);
		BinaryTree binaryTree2 = new BinaryTree(5, binaryTree4, binaryTree5);
		
		BinaryTree binaryTree = new BinaryTree(7, binaryTree2, binaryTree3);

		int result = 84;

        TreeOperation operation = new TreeOperation();

        Assert.assertEquals(result, operation.getSumByNode(binaryTree3));
    }
}
