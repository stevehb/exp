// using this data structure
struct Point {
  int x;
  int y;
};

// 
void fillGrid(Point orig, byte** grid, int width, int height) {
  std::queue<Point> q;
  q.push(orig);

  // the main flood loop
  while(!q.empty()) {
    Point pnt = q.front();
    q.pop();

    // grab adjacent points
    Point adj[4];
    adj[0].x = pnt.x;   adj[0].y = pnt.y-1;   // up
    adj[1].x = pnt.x+1; adj[1].y = pnt.y;     // right
    adj[2].x = pnt.x;   adj[2].y = pnt.y+1;   // down
    adj[3].x = pnt.x-1; adj[3].y = pnt.y;     // left

    for(int i = 0; i < 4; i++) {
      // don't forget boundaries!
      if(adj[i].x < 0 || adj[i].x >= width ||
         adj[i].y < 0 || adj[i].y >= height)
        continue;

      // if adjacent point meets some criteria, then set
      // its value and include it in the queue
      if(includePoint(adj[i], grid)) {
        setPoint(adj[i], grid);
        q.push(adj[i]);
      }
    }
  }
}
