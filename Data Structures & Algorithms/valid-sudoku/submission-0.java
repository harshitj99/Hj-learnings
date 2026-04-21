class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j =0; j<9; j++){
                char ch = board[i][j];
                if(ch != '.'){
                    if(seen.contains(ch + "_R_" + i) ||
                       seen.contains(ch + "_C_" + j) ||
                       seen.contains(ch + "_B_" + i/3 + "_" + j/3)){
                       return false;
                       }
                       else{
                    seen.add(ch + "_R_" + i);
                    seen.add(ch + "_C_" + j);
                    seen.add(ch + "_B_" + i/3 + "_" + j/3);
                }
                }
            }
        }
        return true;
    }
}
