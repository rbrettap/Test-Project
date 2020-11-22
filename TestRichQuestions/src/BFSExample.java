import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSExample
{
    private Queue<Node> queue;
    static ArrayList<Node> nodes=new ArrayList<Node>();
    static class Node
    {
        int data;
        boolean visited;
        List<Node> neighbours;
        Node(int data)
        {
            this.data=data;
            this.neighbours=new ArrayList<>();

        }
        public void addneighbours(Node neighbourNode)
        {
            this.neighbours.add(neighbourNode);
        }
        public List<Node> getNeighbours() {
            return neighbours;
        }
        public void setNeighbours(List<Node> neighbours) {
            this.neighbours = neighbours;
        }
    }

    public BFSExample()
    {
        queue = new LinkedList<Node>();
    }

    public void bfs(Node node)
    {
        queue.add(node);
        node.visited=true;
        while (!queue.isEmpty())
        {
            Node element=queue.remove();
            System.out.print(element.data + "t");
            List<Node> neighbours=element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    queue.add(n);
                    n.visited=true;
                }
            }
        }
    }

    // find neighbors of node using adjacency matrix
    // if adjacency_matrix[i][j]==1, then nodes at index i and index j are connected
    public ArrayList<BFSExample.Node> findNeighbours(int adjacency_matrix[][], BFSExample.Node x)
    {
        int nodeIndex=-1;

        ArrayList<BFSExample.Node> neighbours=new ArrayList<BFSExample.Node>();
        for (int i = 0; i < nodes.size(); i++) {
            if(nodes.get(i).equals(x))
            {
                nodeIndex=i;
                break;
            }
        }

        if(nodeIndex!=-1)
        {
            for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
                if(adjacency_matrix[nodeIndex][j]==1)
                {
                    neighbours.add(nodes.get(j));
                }
            }
        }
        return neighbours;
    }


    public void bfs(int adjacency_matrix[][], BFSExample.Node node)
    {
        queue.add(node);
        node.visited=true;
        while (!queue.isEmpty())
        {

            BFSExample.Node element=queue.remove();
            System.out.print(element.data + "t");
            ArrayList<BFSExample.Node> neighbours = findNeighbours(adjacency_matrix,element);
            for (int i = 0; i < neighbours.size(); i++) {
                BFSExample.Node n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    queue.add(n);
                    n.visited=true;

                }
            }

        }
    }
}
 