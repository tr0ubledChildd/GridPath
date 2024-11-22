public class Main{
    public static void main(String[] args){
        int[][] nums = {
            {12, 3, 4, 13, 5},
            {11, 21, 2, 14, 16},
            {7, 8, 9, 15, 0},
            {18, 22, 30, 25, 6}
        };
        GridPath one = new GridPath(nums);
        System.out.println(one);
        System.out.println(one.getNextLoc(0,0));
        int[][] secondGrid = {
            {12, 30, 40, 25, 5},
            {11, 3, 22, 15, 43},
            {7, 2, 9, 4, 0},
            {8, 33, 18, 6, 1}
        };
        GridPath two = new GridPath(secondGrid);
        System.out.println(two);
    }
}