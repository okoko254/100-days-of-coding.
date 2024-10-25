// A C++ program to Clone an Undirected Graph
#include<bits/stdc++.h>
using namespace std;
 
struct GraphNode//class GraphNode
{
    int val;//initializing a value
    
 /*a vector called neighbour
  is declared to store  pointers to GraphNode objects*/
    vector<GraphNode*> neighbours;//vector node will hold neighbouring nodes of a particular node in agraph
};
 
//GraphNode * indicates that the function returns a pointer to GraphNode object
//cloneGraph is the function name
/*GraphNode *src is the parameter of the function
function takes a pointer to the object as input*/
GraphNode *cloneGraph(GraphNode *src)//function declaration-it clones a graph
{
    /*A Map to keep track of all the
    nodes which have already been created*/
    map<GraphNode*, GraphNode*> m;//stores mapping from each original to its cloned node.
                                   //helps to ensure no repetition and retrieve thhe clone when needed
    queue<GraphNode*> q;//used for BFS travesal of the graph.
    
 
    // Enqueue src node
    q.push(src);//push source node to the queue
    GraphNode *node;//declare node pointer for traversals
 
    // Make a clone Node
    node = new GraphNode();
    node->val = src->val;
 
    // Put the clone node into the Map
    m[src] = node;
    while (!q.empty())
    {
        //Get the front node from the queue
        //and then visit all its neighbours
        GraphNode *u = q.front();//retrieve front node from the queue
        q.pop();//remove retrieved node
        vector<GraphNode *> v = u->neighbours;//get neighbours of current node
        int n = v.size();
        for (int i = 0; i < n; i++)
        {
            // Check if this node has already been created
            if (m[v[i]] == NULL)
            {
                // If not then create a new Node and
                // put into the HashMap
                node = new GraphNode();
                node->val = v[i]->val;
                m[v[i]] = node;
                q.push(v[i]);
            }
 
            // add these neighbours to the cloned graph node
            m[u]->neighbours.push_back(m[v[i]]);
        }
    }
 
    // Return the address of cloned src Node
    return m[src];
}
 
// Build the desired graph
GraphNode *buildGraph()
{
    /*
        Note : All the edges are Undirected
        Given Graph:
        1--2
        | |
        4--3
    */
    GraphNode *node1 = new GraphNode();
    node1->val = 1;
    GraphNode *node2 = new GraphNode();
    node2->val = 2;
    GraphNode *node3 = new GraphNode();
    node3->val = 3;
    GraphNode *node4 = new GraphNode();
    node4->val = 4;
    vector<GraphNode *> v;//vector v created to store the neighbours of each node
    //set neighbours for node 1
    v.push_back(node2);
    v.push_back(node4);
    node1->neighbours = v;
    v.clear();
    //set neighbours for node 2
    v.push_back(node1);
    v.push_back(node3);
    node2->neighbours = v;
    v.clear();
    //set neighbours for node 3
    v.push_back(node2);
    v.push_back(node4);
    node3->neighbours = v;
    v.clear();
    //set neighbours for node 4
    v.push_back(node3);
    v.push_back(node1);
    node4->neighbours = v;
    return node1;
}
 
// A simple bfs traversal of a graph to
// check for proper cloning of the graph
void bfs(GraphNode *src)//function name
{
    map<GraphNode*, bool> visit;//a map to keep track of visited nodes
    queue<GraphNode*> q;//queue to manage the BFS traversals
    q.push(src);//pushes starting node to the queue
    visit[src] = true;//marks starting node as visited
    while (!q.empty())
    {
        GraphNode *u = q.front();
        cout << "Value of Node " << u->val << "\n";
        cout << "Address of Node " <<u << "\n";
        q.pop();
        vector<GraphNode *> v = u->neighbours;
        int n = v.size();
        for (int i = 0; i < n; i++)
        {
            if (!visit[v[i]])
            {
                visit[v[i]] = true;
                q.push(v[i]);
            }
        }
    }
    cout << endl;
}
 
//function calling
int main()
{
    GraphNode *src = buildGraph();
    cout <<" original\n";
    bfs(src);
    GraphNode *newsrc = cloneGraph(src);
    cout << "cloned\n";
    bfs(newsrc);
    return 0;
}