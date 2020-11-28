import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSExample2
{
    private Queue<Node> queue;
    static ArrayList<Node> nodes=new ArrayList<Node>();
    static class Node
    {
        int data;
        boolean visited;

        Node(int data)
        {
            this.data=data;

        }
    }

    public BFSExample2()
    {
        queue = new LinkedList<Node>();
    }

    // find neighbors of node using adjacency matrix
    // if adjacency_matrix[i][j]==1, then nodes at index i and index j are connected
    public ArrayList<Node> findNeighbours(int adjacency_matrix[][],Node x)
    {
        int nodeIndex=-1;

        ArrayList<Node> neighbours=new ArrayList<Node>();
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

    public void bfs(int adjacency_matrix[][], Node node)
    {
        queue.add(node);
        node.visited=true;
        while (!queue.isEmpty())
        {

            Node element=queue.remove();
            System.out.print(element.data + "\t");
            ArrayList<Node> neighbours=findNeighbours(adjacency_matrix,element);
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
}
 