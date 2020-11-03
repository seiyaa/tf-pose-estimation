// Code migrated from https://github.com/ildoonet/tf-pose-estimation

package com.ricardotejo.openpose;

public class CommonQD {

    public enum CocoPart

    {
        RShoulder(0),
        RElbow(1),
        RWrist(2),
        LShoulder(3),
        LElbow(4),
        LWrist(5),
        RHip(6),
        RKnee(7),
        RAnkle(8),
        LHip(9),
        LKnee(10),
        LAnkle(11),
        HEAD(12),
        NECK(13);

        public final int index;

        CocoPart(int index) {
            this.index = index;
        }
    }
    //13
    public static int[][] CocoPairs =
            /*{{1, 2}, {1, 5}, {2, 3}, {3, 4}, {5, 6}, {6, 7}, {1, 8}, {8, 9}, {9, 10}, {1, 11},
            {11, 12}, {12, 13}, {1, 0}, {0, 14}, {14, 16}, {0, 15}, {15, 17}, {2, 16}, {5, 17}};*/ //  # = 19
            {
                {0, 1}, {1, 2}, {3, 4}, {4, 5}, {6, 7}, {7, 8},
                {9, 10}, {10, 11}, {12, 13}, {13, 0}, {13, 3}, {13, 6}, {13, 9} //  # = 13
            };

    //13
    public static int[][] CocoPairsRender = {
            CocoPairs[0], CocoPairs[1], CocoPairs[2], CocoPairs[3], CocoPairs[4], CocoPairs[5], CocoPairs[6],
            CocoPairs[7], CocoPairs[8], CocoPairs[9], CocoPairs[10], CocoPairs[11], CocoPairs[12] }; //13

    //13
    public static int[][] CocoPairsNetwork = {
            /*{12, 13}, {20, 21}, {14, 15}, {16, 17}, {22, 23}, {24, 25}, {0, 1}, {2, 3}, {4, 5},
            {6, 7}, {8, 9}, {10, 11}, {28, 29}, {30, 31}, {34, 35}, {32, 33}, {36, 37}, {18, 19}, {26, 27}*///# = 19
            {0, 1}, {2, 3}, {4, 5}, {6, 7}, {8, 9}, {10, 11}, {12, 13},{14, 15}, {16, 17},
            {18, 19}, {20, 21}, {22, 23}, {24, 25}
            };
    //13
    public static int[][] CocoColors = {
            {255, 0, 0}, {255, 85, 0}, {255, 170, 0}, {255, 255, 0}, {170, 255, 0}, {85, 255, 0}, {0, 255, 0},
            {0, 255, 85}, {0, 255, 170}, {0, 255, 255}, {0, 170, 255}, {0, 85, 255}, {0, 0, 255}
            };

}
