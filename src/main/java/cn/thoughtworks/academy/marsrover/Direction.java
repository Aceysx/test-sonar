package cn.thoughtworks.academy.marsrover;

public enum Direction {
    WEST() {
        @Override
        public Direction left() {
            return SOUTH;
        }

        @Override
        public Direction right() {
            return NORTH;
        }

        @Override
        public Offset offset() {
            return new Offset(-1, 0);
        }
    },
    SOUTH() {
        @Override
        public Direction left() {
            return EAST;
        }

        @Override
        public Direction right() {
            return WEST;
        }

        @Override
        public Offset offset() {
            return new Offset(0, -1);
        }
    },
    EAST() {
        @Override
        public Direction left() {
            return NORTH;
        }

        @Override
        public Direction right() {
            return SOUTH;
        }

        @Override
        public Offset offset() {
            return new Offset(1, 0);
        }
    },
    NORTH() {
        @Override
        public Direction left() {
            return WEST;
        }

        @Override
        public Direction right() {
            return EAST;
        }

        @Override
        public Offset offset() {
            return new Offset(0, 1);
        }
    };

    public abstract Direction left();

    public abstract Direction right();

    public abstract Offset offset();
}
