public class Lab {

    // методы для красоты, для людского
    public static double func1(float x) {
        return (Math.pow(Math.pow(2 / 3F * Math.log(Math.abs(x)), 2), 2 * Math.sin(Math.asin((x - 2.5) / 25))));
    }

    public static double func2(float x) {
        return (Math.pow(Math.cos(Math.pow(x, x)), Math.pow((2 * Math.atan((x - 2.5) / 25)), 2) / (1 - Math.pow(1 / 2F / Math.asin((x - 2.5) / 25), 2))));
    }

    public static double func3(float x) {
        return (Math.pow(Math.sin(Math.pow(3 / 4F * (1 / 3F + x), 2)), Math.pow(Math.asin(Math.cos(x)) + 1, 2) / 2));
    }

    public static void main(String[] args) {

        // первый массив
        short z[] = new short[10];
        short k = 0;
        for (short i = 5; i < 24; i++) {
            if (i % 2 == 1) {
                z[k] = i;
                k++;

            }
        }
        //второй массив
        float[] x = new float[10];
        // рандомим 10 чисел.
        //Короче, там чуть-чуть не хватает до 10, поэтому прибавляем чуть-чуть к десятке
        //Если больше 10, то это 10.УРА! ПОБЕДА!
        for (int i = 0; i < x.length; i++) {
            float a = 0f;
            if (Math.random() > 0.5) {
                a += 1e-9f;

            }
            x[i] = (float) (Math.random() * (25) - 15) + a;
            if (x[i] > 10) {
                x[i] = 10;
            }
        }

        // третий массив
        double v[][] = new double[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch (z[i]) {
                    case 17:
                        v[i][j] = func1(x[j]);
                        break;
                    case 7, 11, 13, 15, 19:
                        v[i][j] = func2(x[j]);
                        break;
                    default:
                        v[i][j] = func3(x[j]);
                        break;
                }
                System.out.printf("%12.4f ", v[i][j]);

            }
            System.out.println();
        }


    }

}
