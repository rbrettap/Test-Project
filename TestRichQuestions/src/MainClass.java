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

        BFSExample.Node node40 =new BFSExample.Node(40);
        BFSExample.Node node10 =new BFSExample.Node(10);
        BFSExample.Node node20 =new BFSExample.Node(20);
        BFSExample.Node node30 =new BFSExample.Node(30);
        BFSExample.Node node60 =new BFSExample.Node(60);
        BFSExample.Node node50 =new BFSExample.Node(50);
        BFSExample.Node node70 =new BFSExample.Node(70);
        ArrayList<BFSExample.Node> nodes=new ArrayList<BFSExample.Node>();

        nodes.add(node40);
        nodes.add(node10);
        nodes.add(node20);
        nodes.add(node30);
        nodes.add(node60);
        nodes.add(node50);
        nodes.add(node70);

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
        BFSExample bfsExample = new BFSExample();
        bfsExample.bfs(adjacency_matrix, node40);
    }

    public static void main(String arg[])
    {
        // the following is test straightforward bfs implementation....
        //testBFSFunction();
        testBFSWithAdjacencyMatrix();

    }
}
