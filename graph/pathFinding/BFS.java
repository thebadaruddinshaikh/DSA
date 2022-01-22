package com.dsa.graph.pathFinding;

import com.dsa.graph.Node;

import java.util.*;
public class BFS {


    public int shortestPath(Node start, Node end) {
        int layer = 0;
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(start);
        HashSet<Node<Integer>> set = new HashSet<>();
        while (queue.size() != 0) {
            int size = queue.size();
                for(int i = 0; i < size; i++) {
                    Node<Integer> node = queue.poll();
                    if(node == end)
                        return layer;
                    //add unexplored children to the queue
                }
                layer++;
            }
        return layer;
    }
}

