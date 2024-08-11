package Graph.MyGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

 enum GRAPH_DIRECTION{

    DIRECTED,
    UNDIRECTED,
}

public class Building_Graph_from_Scratch {
    class Node {
        public String value;

        public Node(String value) {
            this.value = value;
        }

        public String toString() {return this.value;}

        
    }

    private Map<Node, List<Node>> adjacencyList;

    private Map<String, Node> nodes;

    public Building_Graph_from_Scratch() {
        this.adjacencyList = new HashMap<Node, List<Node>>();
        this.nodes = new HashMap<>();
    }

    public Node createNode(String value) {

        if (!nodes.containsKey(value))
            nodes.put(value, new Node(value));

        return nodes.get(value);
    }

    public void createConnection(Node from, Node to, GRAPH_DIRECTION direction){
        if(!adjacencyList.containsKey(from)){
            adjacencyList.put(from, new ArrayList<Node>());
        }

        if (!adjacencyList.containsKey(to)){
            adjacencyList.put(to, new ArrayList<Node>());{
            
        }

        adjacencyList.get(from).add(to);

        if(direction == GRAPH_DIRECTION.UNDIRECTED){
            adjacencyList.get(to).add(from);
        }

    }
}

//  BFS Traversal
    public List<Node> getBFS(Node startingNode){
        List<Node> result = new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        q.offer(startingNode);
        visited.add(startingNode);

        while(!q.isEmpty()){
            Node current = q.poll();
            result.add(current);

            for(Node child: adjacencyList.get(current)){
                if(!visited.contains(child)){
                    q.offer(child);
                    visited.add(child);
                }
            }
            
        }
        return result;
    }

    private
    
    public List<Node> getDFS(Node initalNode){

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(var entry: adjacencyList.entrySet()){
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    

}
