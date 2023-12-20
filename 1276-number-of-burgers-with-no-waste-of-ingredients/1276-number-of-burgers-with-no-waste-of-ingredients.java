class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> arr=new ArrayList<>();
        if(tomatoSlices%2==1)return arr;
        if(cheeseSlices>tomatoSlices/2||cheeseSlices<tomatoSlices/4) return arr;
        int t=tomatoSlices/2-cheeseSlices;
        arr.add(t);
        arr.add(cheeseSlices-t);
        return arr;
    }
}