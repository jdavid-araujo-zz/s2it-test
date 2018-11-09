package question9;

public class TreeOperation {

    public TreeOperation() {}
	
    public int getSumByNode(BinaryTree binaryTree) {
    	
    	if (binaryTree == null) {
    	    return 0;
    	}

    	return binaryTree.getValor() + getSumByNode(binaryTree.getLeft()) + getSumByNode(binaryTree.getRight());
    }
    
}
