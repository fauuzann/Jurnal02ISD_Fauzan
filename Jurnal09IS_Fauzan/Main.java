public class Main {
 public static void main(String[] args) {
 AdjacencyList myList = new AdjacencyList(9);
 myList.addEdge('A','B');
 myList.addEdge('A','D');
 myList.addEdge('A','E');
 myList.addEdge('D','G');
 myList.addEdge('G','H');
 myList.addEdge('H','I');
 myList.addEdge('I','F');
 myList.addEdge('F','C');
 myList.addEdge('C','B');
 myList.addEdge('B','E');
 myList.addEdge('E','H');
 myList.addEdge('E','F');
 myList.addEdge('F','H');
 myList.printGraph();
}
}