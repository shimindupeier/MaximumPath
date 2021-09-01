public class MaximumPath {
    public static void main(String[] args) {
        int[][] triangle = {{3}, {7,4},{2,4,6}, {8,5,9,3}};
        int sum = triangle[0][0];
        int j = 0;
        for (int i=1; i<triangle.length; i++) {
            int left = triangle[i][j];
            int right = triangle[i][j++];
            sum += Math.max(left, right);
        }
        System.out.println(sum);
    }
}
