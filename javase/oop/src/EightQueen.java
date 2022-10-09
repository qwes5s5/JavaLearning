public class EightQueen {
    public static void main(String[] args) {
        Queen myQueen = new Queen();
        myQueen.putQ(0);
    }
}
class Queen{
    int[][] map = new int[8][8];
    int COUNT = 0;
    public void show() {
        System.out.println("第" + (++COUNT) + "次摆法");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public boolean checkQ(int row,int col){
        for(int i = row; i>=0;i--){
            if(map[i][col]==1){
                return false;
            }
        }
        for(int i = row,j=col; i>=0&&j>=0;i--,j--){
            if(map[i][j]==1){
                return false;
            }
        }
        for(int i = row,j=col; i>=0&&j<8;i--,j++){
            if(map[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public void putQ(int row){
        for(int j=0;j<8;j++){
            if(checkQ(row,j)){
                map[row][j]=1;
                if(row==7){
                    show();
                }
                else{
                    putQ(row+1);
                }
            }
            map[row][j]=0;
        }
    }
}
