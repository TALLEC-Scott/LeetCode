
import java.lang.module.Configuration;

public class RectangleArea{

    public static int computeArea(int x1, int y1, int x2, int y2)
    {
        if (x2 < x1 || y2 < y1)
            return 0;
        var dist1 = x2 - x1;
        var dist2 = y2- y1;
        return dist1 * dist2;
    }

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        var x1 = Math.max(ax1, bx1);
        var y1 = Math.max(ay1, by1);
        var x2 = Math.min(ax2, bx2);
        var y2 = Math.min(ay2, by2);
        var areaA = ComputeArea.computeArea(ax1,ay1,ax2,ay2);
        var areaB = ComputeArea.computeArea(bx1,by1,bx2,by2);
        var areaBIntersectA = ComputeArea.computeArea(x1, y1, x2, y2);
        return areaA + areaB - areaBIntersectA;
    }

    public static void main(String[] args) {
       var thing = new RectangleArea();
       var res = thing.computeArea(-3, 0, 0, 2, 0, -1, 9, 2 );
       System.out.println(res);
        var res2 = thing.computeArea(-2, -2, 2, 2, -2, -2, 2, 2 );
        System.out.println(res2);
        var res3 = thing.computeArea(-2, -2, 2 ,2 , 3 , 3 , 4 ,4);

        System.out.println(res3);
    }
}
