package fallmerayer.enums;

/**
 * Enum for <b>Übung 4</b>
 * <p></p>
 *
 * It implements the method of the interface {@link Distance}.
 *
 */
public enum Distances implements Distance{
    /**
     * Implements the calculation of the euclidean distance of 2- or 3-dimensional points
     */
    EUCLIDEAN{
        /**
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return euclidean distance of 2-dimensional points
         */
        @Override
        public double distance(double x1, double y1, double x2, double y2) {
            return Math.sqrt((x1 - x2) * (x1 -x2) + (y1-y2) * (y1-y2));
        }

        /**
         * @param x1
         * @param y1
         * @param z1
         * @param x2
         * @param y2
         * @param z2
         * @return euclidean distance of 3-dimensional points
         */
        @Override
        public double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
            return Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) );
        }
    },
    /**
     * Implements the calculation of the manhattan distance of 2- or 3-dimensional points
     */
    MANHATTAN{
        /**
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return manhattan distance of 2-dimensional points
         */
        @Override
        public double distance(double x1, double y1, double x2, double y2) {
            return Math.abs(x1 - x2) + Math.abs(y1 - y2);
        }

        /**
         * @param x1
         * @param y1
         * @param z1
         * @param x2
         * @param y2
         * @param z2
         * @return manhattan distance of 3-dimensional points
         */
        @Override
        public double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
            return Math.abs(x1 - x2) + Math.abs(y1 - y2) + Math.abs(z1 - z2);
        }
    }


}
