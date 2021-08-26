package com.amigoscode;

import java.time.LocalDate;
import java.time.Month;

        public class Main {

            public static void main(String[] args) {
                Person biancaNavey = new Person(
                        "Bianca",
                        "Navey",
                        Gender.FEMALE,
                        LocalDate.of(1999, Month.AUGUST, 19)
                );

                Person sophiaSecretary = new Person(
                        "sophia",
                        "Secretary",
                        Gender.FEMALE,
                        LocalDate.of(1997, Month.SEPTEMBER, 21)
                );

                Person priyaRamesh = new Person(
                        "priya",
                        "Ramesh",
                        Gender.FEMALE,
                        LocalDate.of(1998, Month.DECEMBER, 27)
                );
            }
        }



