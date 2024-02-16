class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int arr1[]=new int[n+1];
        for(int i:arr){
            if(map.containsKey(i)){
                int t=map.get(i);
                arr1[t]--;
                arr1[t+1]++;
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
                arr1[1]++;
            }

            // map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int i=1;i<=n;i++){
            // if(i<=k)k-=i;
            // else break;
            // System.out.println(i);
            if(i*arr1[i]<=k){
                k-=i*arr1[i];
                c+=arr1[i];
            }
            else{
                while(k>0){
                    k-=i;
                    if(k>=0)c++;
                }
                    break;
            }
        }
        return map.size()-c;
    }
}