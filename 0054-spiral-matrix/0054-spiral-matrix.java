class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int rb = 0;
        int re = mat.length-1;
        int cb = 0;
        int ce = mat[0].length-1;
        List<Integer> res = new ArrayList<>();
        while(rb<=re && cb<=ce){
            for(int i=cb;i<=ce;i++){
                res.add(mat[rb][i]);
            }
            rb++;
            for(int i=rb;i<=re;i++){
                res.add(mat[i][ce]);
            }
            ce--;
            if(rb<=re){
               for(int i=ce;i>=cb;i--){
                res.add(mat[re][i]);
                } 
            }
            re--;
            if(cb<=ce){
                for(int i=re; i>=rb;i--){
                    res.add(mat[i][cb]);
                }
            }
            cb++;
        }
        return res;
    }
}