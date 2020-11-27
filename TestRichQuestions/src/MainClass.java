import java.util.ArrayList;

public class MainClass {

    public MainClass() {}

    public static void testBFSFunction() {

        BFSExample.Node node40 =new BFSExample.Node(40);
        BFSExample.Node node10 =new BFSExample.Node(10);
        BFSExample.Node node20 =new BFSExample.Node(20);
        BFSExample.Node node30 =new BFSExample.Node(30);
        BFSExample.Node node60 =new BFSExample.Node(60);
        BFSExample.Node node50 =new BFSExample.Node(50);
        BFSExample.Node node70 =new BFSExample.Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);
        System.out.println("The BFS traversal of the graph is ");
        BFSExample bfsExample = new BFSExample();
        bfsExample.bfs(node40);
    }

    public static void testBFSWithAdjacencyMatrix() {

        BFSExample2.Node node40 =new BFSExample2.Node(40);
        BFSExample2.Node node10 =new BFSExample2.Node(10);
        BFSExample2.Node node20 =new BFSExample2.Node(20);
        BFSExample2.Node node30 =new BFSExample2.Node(30);
        BFSExample2.Node node60 =new BFSExample2.Node(60);
        BFSExample2.Node node50 =new BFSExample2.Node(50);
        BFSExample2.Node node70 =new BFSExample2.Node(70);

        BFSExample2.nodes.add(node40);
        BFSExample2.nodes.add(node10);
        BFSExample2.nodes.add(node20);
        BFSExample2.nodes.add(node30);
        BFSExample2.nodes.add(node60);
        BFSExample2.nodes.add(node50);
        BFSExample2.nodes.add(node70);
        int adjacency_matrix[][] = {
                {0,1,1,0,0,0,0}, // Node 1: 40
                {0,0,0,1,0,0,0}, // Node 2 :10
                {0,1,0,1,1,1,0}, // Node 3: 20
                {0,0,0,0,1,0,0}, // Node 4: 30
                {0,0,0,0,0,0,1}, // Node 5: 60
                {0,0,0,0,0,0,1}, // Node 6: 50
                {0,0,0,0,0,0,0}, // Node 7: 70
        };
        System.out.println("The BFS traversal of the graph is ");
        BFSExample2 bfsExample = new BFSExample2();
        bfsExample.bfs(adjacency_matrix, node40);
    }

    public static void treePathSum() {
        TreePathSum.TreeNode root = new TreePathSum.TreeNode(12);
        root.left = new TreePathSum.TreeNode(7);
        root.right = new TreePathSum.TreeNode(1);
        root.left.left = new TreePathSum.TreeNode(9);
        root.right.left = new TreePathSum.TreeNode(10);
        root.right.right = new TreePathSum.TreeNode(5);
        System.out.println("Tree has path: " + TreePathSum.hasPath(root, 23));
        System.out.println("Tree has path: " + TreePathSum.hasPath(root, 16));
    }

    public static void main(String arg[])
    {
        // the following is test straightforward bfs implementation....
        //testBFSFunction();
        //testBFSWithAdjacencyMatrix();
        treePathSum();
    }
}
