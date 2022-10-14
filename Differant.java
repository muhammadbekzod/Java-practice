class Point {
        private int x, y;

        public Point(int x, int y) {
                this.x = x;
                this.y = y;
        }

        public String toString() {
                return "Point(" + x + ", " + y + ")";
        }

        public boolean equals(Object obj) {
                if (obj instanceof Point) {
                        Point p = (Point) obj;
                        if (x == p.x && y == p.y) {
                                return true;
                        }
                }
                return false;
        }
}

public class Differant {
        public static void main(String[] args) {
                Point p1 = new Point(2, 30);
                Point p2 = new Point(3, 70);
                System.out.println(p1);
                System.out.println(p2);

                if (p1.equals(p2)) {
                        System.out.println("p1 and p2 are the same");
                } else {
                        System.out.println("p1 and p2 are differant");
                }
        }
}
