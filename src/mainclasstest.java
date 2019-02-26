public class mainclasstest {
    public static void main(String[] args) throws Exception {
        int[] x={4,5,6,7,9,543,55,5533,5325};
        int m=x.length;
        while(m!=0) {
            for (int i = 0; i < (x.length) - 1; i++) {
                if (x[i + 1] > x[i]) {
                    int temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;


                }
            }
            m--;
        }
        for(int y:x)
        {
            System.out.println(y);
        }

    }
}

