package com.cloudate9.module2.part1;

public class Main {

        public static void main(String[] args) {

            Planet earth = new Planet("Earth", PlanetType.ROCKY);
            Planet earth2 = new Planet("Earth", PlanetType.ROCKY);
            Planet jupiter = new Planet("Jupiter", PlanetType.GAS);
            Planet pluto = new Planet("Pluto", PlanetType.DWARF);

            System.out.println("earth.equals(earth2) = " + earth.equals(earth2));
            System.out.println("earth.equals(jupiter) = " + earth.equals(jupiter));
            System.out.println("earth.equals(pluto) = " + earth.equals(pluto));

            System.out.println("earth.hashCode() = " + earth.hashCode());
            System.out.println("earth2.hashCode() = " + earth2.hashCode());
            System.out.println("jupiter.hashCode() = " + jupiter.hashCode());
            System.out.println("pluto.hashCode() = " + pluto.hashCode());

            System.out.println("earth.toString() = " + earth);
            System.out.println("earth2.toString() = " + earth2);
            System.out.println("jupiter.toString() = " + jupiter);
            System.out.println("pluto.toString() = " + pluto);

        }
}
