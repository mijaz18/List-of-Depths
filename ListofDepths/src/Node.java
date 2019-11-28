

class Node {
    //private Node adjacent[];
    //public int adjacentCount;
    private int vertex;
    public Node left;
    public Node right;
    public boolean visited;
    public Node(int vertex) {
        this.vertex = vertex;
        
        //adjacentCount = 0;        
        //adjacent = new Node[adjacentLength];
    }
    
//    public void addAdjacent(Node x) {
//        if (adjacentCount < adjacent.length) {
//            this.adjacent[adjacentCount] = x;
//            adjacentCount++;
//        } else {
//            System.out.print("No more adjacent can be added");
//        }
//    }
//    public Node[] getAdjacent() {
//        return adjacent;
//    }
    public int getVertex() {
        return vertex;
    }
}