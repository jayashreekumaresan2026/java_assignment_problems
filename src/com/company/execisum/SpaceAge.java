package com.company.execisum;

public class SpaceAge {
        private static final double YEAR_IN_SECONDS = 31557600;
        private static final double MERCURY_ORBIT = 0.2408467;
        private static final double VENUS_ORBIT = 0.61519726;
        private static final double MARS_ORBIT = 1.8808158;
        private static final double JUPITER_ORBIT = 11.862615;
        private static final double SATURN_ORBIT = 29.447498;
        private static final double URANUS_ORBIT = 84.016846;
        private static final double NEPTUNE_ORBIT = 164.79132;
        private double seconds;

        SpaceAge(long seconds) {
            this.seconds = seconds;
        }

        double getSeconds() {
            return seconds;
        }

        double onEarth() {
            return seconds / YEAR_IN_SECONDS;
        }

        double onMercury() {
          return onEarth()/MERCURY_ORBIT;
        }

        double onVenus() {
        return onEarth()/VENUS_ORBIT;
        }

        double onMars() {
            return onEarth()/MARS_ORBIT;
        }

        double onJupiter() {
            return onEarth()/JUPITER_ORBIT;
        }

        double onSaturn() {
    return onEarth()/SATURN_ORBIT;
        }

        double onUranus() {
            return onEarth()/URANUS_ORBIT;
        }

        double onNeptune() {
            return onEarth()/NEPTUNE_ORBIT;
        }

    public static void main(String[] args) {
        SpaceAge spaceAge = new SpaceAge(1000000000);
        spaceAge.getSeconds();
        System.out.println(spaceAge.onEarth());
    }

}
