public class longest {
    public static int buttonWithLongestTime(int[][] events) {
        int longest = events[0][1], gap = 0;
        int index = events[0][0];
        for (int i = 1; i < events.length; i++) {
            gap = events[i][1] - events[i - 1][1];
            System.out.println(events[i][1] + " - " + events[i - 1][1] + " = " + gap);
            // System.out.println(events[i][0] + "<"+ index);
            System.out.println(gap +">"+longest +"= ");
            if (gap > longest || (gap == longest && events[i][0] < index)) {
                longest = gap;
                index = events[i][0];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // int[][] ev = {{1,2},{2,5},{3,9},{1,15}};
        // int[][] ev = { { 10, 5 }, { 1, 7 } };
        //int[][] ev = {{9,4},{19,5},{2,8},{3,11},{2,15}};
        int[][] ev = {{12,2},{8,3},{18,5},{4,6},{3,7},{1,9},{2,17},{18,20}};
        //int[][] ev = { { 8, 4 }, { 7, 6 }, { 19, 9 }, { 8, 14 }, { 13, 15 }, { 2, 16 }, { 2, 18 } };
        int longest1 = buttonWithLongestTime(ev);
        System.out.println("index : " + longest1);
    }
}
