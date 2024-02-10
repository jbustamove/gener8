package com.jcworx;

import java.util.Set;

/**
 * Generate different permutations of data in order to be used for rapid
 * experimentation or
 * for creating values that will live in test doubles.
 * 
 * @author jbustamove
 */
public final class Gener8 {

        private enum SeedData {
                STREET_ADDRESSES(Set.of(
                                "22B Baker Street",
                                "17 Fighter Lane",
                                "88 Rocky Boulevard",
                                "121 Sana Road",
                                "369 Victor Street",
                                "545 Hamville Crescent",
                                "222 Clement Trail",
                                "654 Ponyville Blvd",
                                "1000 Workers Court",
                                "2000 Pioneer Place",
                                "866 Argentia Road East",
                                "26 Plymouth Drive",
                                "100 Byzantine Road South",
                                "999 Mycon Street",
                                "222 Brine Trail",
                                "66 Winterweld Court",
                                "99 Aranchini Street",
                                "32 Palace Boulevard South",
                                "22 Garath Street South",
                                "434 Star Lane",
                                "18 Flagship Drive",
                                "86 Ramrod Street",
                                "21 Helios Court")),
                CITIES(Set.of(
                                "Moscow",
                                "Havana",
                                "Washington",
                                "Ottawa",
                                "Mexico City",
                                "Rome",
                                "Beijing",
                                "Belfast",
                                "London",
                                "Marseilles",
                                "Paris",
                                "Pripyat",
                                "Doha",
                                "Buenos Aires",
                                "Lima",
                                "Cartagena",
                                "Bogota",
                                "Brazilia",
                                "Rio",
                                "Santiago",
                                "Winchester",
                                "Honolulu",
                                "Seoul",
                                "Tokyo",
                                "Nagasaki",
                                "Warsaw",
                                "Berlin",
                                "Athens",
                                "Jerusalem",
                                "Riad",
                                "Dubai")),
                COUNTRIES();

                private Set<String> dataSet;

                SeedData(Set<String> dataSet) {
                        this.dataSet = dataSet;
                }

                public Set<String> getDataSet() {
                        return dataSet;
                }

                private enum Person {
                        MALE_FIRST_NAMES(Set.of(
                                        "John",
                                        "Marco",
                                        "Alessio",
                                        "Alex",
                                        "Luca",
                                        "Christian",
                                        "David",
                                        "Matthew",
                                        "Matteo",
                                        "Donald",
                                        "Raymond",
                                        "Wesley",
                                        "William",
                                        "Geordi",
                                        "Benjamin",
                                        "Michael",
                                        "Joseph",
                                        "Emilio",
                                        "Frank",
                                        "Peter",
                                        "Patrick",
                                        "Alfred",
                                        "Mason",
                                        "Jack",
                                        "Christopher",
                                        "Daniel",
                                        "Thomas",
                                        "Luke",
                                        "Paul",
                                        "Robert",
                                        "Jose",
                                        "Derek",
                                        "Sandeep",
                                        "Abdul",
                                        "Andrea",
                                        "Carmine",
                                        "Dominic",
                                        "Nicholas",
                                        "Luis",
                                        "Lionel",
                                        "Pedro",
                                        "Zack")),
                        FEMALE_FIRST_NAMES(Set.of(
                                        "Cristina",
                                        "Gabriella",
                                        "Nikita",
                                        "Riley",
                                        "Sandra",
                                        "Janet",
                                        "Gina",
                                        "Maria",
                                        "Melva",
                                        "Mary",
                                        "Melissa",
                                        "Antonia",
                                        "Ashley",
                                        "Cheryl",
                                        "Kirsten",
                                        "Cathy",
                                        "Karen",
                                        "Michelle",
                                        "Josie",
                                        "Jessica",
                                        "Jennifer",
                                        "Daniela",
                                        "Wanda",
                                        "Patricia",
                                        "Carmen",
                                        "Danise",
                                        "Denise",
                                        "Elva",
                                        "Alicia",
                                        "Sharon",
                                        "Kelly",
                                        "Kristina",
                                        "Domenica",
                                        "Lupita",
                                        "Consuelo",
                                        "Lucia",
                                        "Cassandra",
                                        "Penelope",
                                        "Rosie",
                                        "Roma",
                                        "Bella")),
                        LAST_NAMES(Set.of(
                                        "Bartain",
                                        "Martinez",
                                        "Rodriguez",
                                        "Couchman",
                                        "Entablini",
                                        "Mangia-Cavalo",
                                        "Ronaldo",
                                        "Klose",
                                        "Jordan",
                                        "James",
                                        "Patterson",
                                        "D'Amato",
                                        "Buggatti",
                                        "Martel",
                                        "Santana",
                                        "Shbudalono",
                                        "Ford",
                                        "Trump",
                                        "Biden",
                                        "Clinton",
                                        "Gomez",
                                        "Gutierez",
                                        "Escobar",
                                        "Hoyos",
                                        "Gallego",
                                        "Clapton")),
                        TITLES(Set.of(
                                        "Mr.",
                                        "Mrs.",
                                        "Ms.",
                                        "Miss",
                                        "Dr."));

                        private Set<String> personDataSet;

                        Person(Set<String> dataSet) {
                                this.personDataSet = dataSet;
                        }

                        public Set<String> getPersonDataSet() {
                                return personDataSet;
                        }

                }

                private enum Address {
                        ADDRESS
                }

        }
}
