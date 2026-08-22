class Solution {
    
    static boolean isSafeToMove(int newX,int newY,int n,int[][] maze,boolean[][] visited){
        if(newX<0 || newX>=n || newY<0 || newY>=n){
            return false;
        }
       else if(maze[newX][newY]==0){
            return false;
        }
       else if(visited[newX][newY]==true){
            return false;
        }
        else{
            return true;
        }
    }
    
    static void solve(int[][] maze,int srcX,int srcY,int destX,int destY,
    String path,ArrayList<String> ans,boolean[][] visited){
        // base case
        if(srcX==destX && srcY==destY){
            ans.add(path);
            return;
        }
        visited[srcX][srcY]=true;
        int n=maze.length;
        //up
        int newX=srcX-1;
        int newY=srcY;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,path + "U",ans,visited);
        }
        //down
         newX=srcX+1;
         newY=srcY;
         if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,path + "D",ans,visited);
        }
        //left
         newX=srcX;
         newY=srcY-1;
         if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,path + "L",ans,visited);
        }
        //right
         newX=srcX;
         newY=srcY+1;
         if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,path + "R",ans,visited);
        }
        // backtracking
            visited[srcX][srcY]=false;
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int n=maze.length;
        boolean[][] visited = new boolean[n][n];
        String path="";
        int srcX=0;
        int srcY=0;
        int destX=n-1;
        int destY=n-1;
        if(maze[0][0]==0 || maze[n-1][n-1]==0){
            return ans;
        }
        solve(maze,srcX,srcY,destX,destY,path,ans,visited);
        Collections.sort(ans);
        return ans;
    }
}