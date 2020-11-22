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

    public static void main(String arg[])
    {
        // the following is test straightforward bfs implementation....
        testBFSFunction();

    }
}
