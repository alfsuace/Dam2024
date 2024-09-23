package com.alfsuace.dam2024.features.superhero.data.remote

import com.alfsuace.dam2024.features.superhero.domain.Appearance
import com.alfsuace.dam2024.features.superhero.domain.Biography
import com.alfsuace.dam2024.features.superhero.domain.Connections
import com.alfsuace.dam2024.features.superhero.domain.Images
import com.alfsuace.dam2024.features.superhero.domain.Powerstats
import com.alfsuace.dam2024.features.superhero.domain.Superhero
import com.alfsuace.dam2024.features.superhero.domain.Work

class SuperheroMockDataRepository {

    fun getSuperheroes(): List<Superhero> {
        return listOf(
            Superhero(
                id = 1,
                name = "A-Bomb",
                slug = "1-a-bomb",
                powerstats = Powerstats(
                    intelligence = 38,
                    strength = 100,
                    speed = 17,
                    durability = 80,
                    power = 24,
                    combat = 64
                ),
                appearance = Appearance(
                    gender = "Male",
                    race = "Human",
                    height = listOf("6'8", "203 cm"),
                    weight = listOf("980 lb", "441 kg"),
                    eyeColor = "Yellow",
                    hairColor = "No Hair"
                ),
                biography = Biography(
                    fullName = "Richard Milhouse Jones",
                    alterEgos = "No alter egos found.",
                    aliases = listOf("Rick Jones"),
                    placeOfBirth = "Scarsdale, Arizona",
                    firstAppearance = "Hulk Vol 2 #2 (April, 2008) (as A-Bomb)",
                    publisher = "Marvel Comics",
                    alignment = "good"
                ),
                work = Work(
                    occupation = "Musician, adventurer, author; formerly talk show host",
                    base = "-"
                ),
                connections = Connections(
                    groupAffiliation = "Hulk Family; Excelsior (sponsor), Avengers (honorary member); formerly partner of the Hulk, Captain America and Captain Marvel; Teen Brigade; ally of Rom",
                    relatives = "Marlo Chandler-Jones (wife); Polly (aunt); Mrs. Chandler (mother-in-law); Keith Chandler, Ray Chandler, three unidentified others (brothers-in-law); unidentified father (deceased); Jackie Shorr (alleged mother; unconfirmed)"
                ),
                images = Images(
                    xs = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/1-a-bomb.jpg",
                    sm = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/1-a-bomb.jpg",
                    md = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                    lg = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/1-a-bomb.jpg"
                )
            ),
            Superhero(
                id = 2,
                name = "Abe Sapien",
                slug = "2-abe-sapien",
                powerstats = Powerstats(
                    intelligence = 88,
                    strength = 28,
                    speed = 35,
                    durability = 65,
                    power = 100,
                    combat = 85
                ),
                appearance = Appearance(
                    gender = "Male",
                    race = "Icthyo Sapien",
                    height = listOf("6'3", "191 cm"),
                    weight = listOf("145 lb", "65 kg"),
                    eyeColor = "Blue",
                    hairColor = "No Hair"
                ),
                biography = Biography(
                    fullName = "Abraham Sapien",
                    alterEgos = "No alter egos found.",
                    aliases = listOf("Langdon Everett Caul", "Abraham Sapien", "Langdon Caul"),
                    placeOfBirth = "-",
                    firstAppearance = "Hellboy: Seed of Destruction (1993)",
                    publisher = "Dark Horse Comics",
                    alignment = "good"
                ),
                work = Work(
                    occupation = "Paranormal Investigator",
                    base = "-"
                ),
                connections = Connections(
                    groupAffiliation = "Bureau for Paranormal Research and Defense",
                    relatives = "Edith Howard (wife, deceased)"
                ),
                images = Images(
                    xs = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/2-abe-sapien.jpg",
                    sm = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/2-abe-sapien.jpg",
                    md = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/2-abe-sapien.jpg",
                    lg = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/2-abe-sapien.jpg"
                )
            ),
            Superhero(
                id = 3,
                name = "Abin Sur",
                slug = "3-abin-sur",
                powerstats = Powerstats(
                    intelligence = 50,
                    strength = 90,
                    speed = 53,
                    durability = 64,
                    power = 99,
                    combat = 65
                ),
                appearance = Appearance(
                    gender = "Male",
                    race = "Ungaran",
                    height = listOf("6'1", "185 cm"),
                    weight = listOf("200 lb", "90 kg"),
                    eyeColor = "Blue",
                    hairColor = "No Hair"
                ),
                biography = Biography(
                    fullName = "",
                    alterEgos = "No alter egos found.",
                    aliases = listOf("Lagzia"),
                    placeOfBirth = "Ungara",
                    firstAppearance = "Showcase #22 (October, 1959)",
                    publisher = "DC Comics",
                    alignment = "good"
                ),
                work = Work(
                    occupation = "Green Lantern, former history professor",
                    base = "Oa"
                ),
                connections = Connections(
                    groupAffiliation = "Green Lantern Corps, Black Lantern Corps",
                    relatives = "Amon Sur (son), Arin Sur (sister), Thaal Sinestro (brother-in-law), Soranik Natu (niece)"
                ),
                images = Images(
                    xs = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/3-abin-sur.jpg",
                    sm = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/3-abin-sur.jpg",
                    md = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/3-abin-sur.jpg",
                    lg = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/3-abin-sur.jpg"
                )
            ),
            Superhero(
                id = 4,
                name = "Abomination",
                slug = "4-abomination",
                powerstats = Powerstats(
                    intelligence = 63,
                    strength = 80,
                    speed = 53,
                    durability = 90,
                    power = 62,
                    combat = 95
                ),
                appearance = Appearance(
                    gender = "Male",
                    race = "Human / Radiation",
                    height = listOf("6'8", "203 cm"),
                    weight = listOf("980 lb", "441 kg"),
                    eyeColor = "Green",
                    hairColor = "No Hair"
                ),
                biography = Biography(
                    fullName = "Emil Blonsky",
                    alterEgos = "No alter egos found.",
                    aliases = listOf("Agent R-7", "Ravager of Worlds"),
                    placeOfBirth = "Zagreb, Yugoslavia",
                    firstAppearance = "Tales to Astonish #90",
                    publisher = "Marvel Comics",
                    alignment = "bad"
                ),
                work = Work(
                    occupation = "Ex-Spy",
                    base = "Mobile"
                ),
                connections = Connections(
                    groupAffiliation = "former member of the crew of the Andromeda Starship, ally of the Abominations and Forgotten",
                    relatives = "Nadia Dornova Blonsky (wife, separated)"
                ),
                images = Images(
                    xs = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/4-abomination.jpg",
                    sm = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/4-abomination.jpg",
                    md = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/4-abomination.jpg",
                    lg = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/4-abomination.jpg"
                )
            ),
            Superhero(
                id = 5,
                name = "Abraxas",
                slug = "5-abraxas",
                powerstats = Powerstats(
                    intelligence = 88,
                    strength = 63,
                    speed = 83,
                    durability = 100,
                    power = 100,
                    combat = 55
                ),
                appearance = Appearance(
                    gender = "Male",
                    race = "Cosmic Entity",
                    height = listOf("-", "0 cm"),
                    weight = listOf("- lb", "0 kg"),
                    eyeColor = "Blue",
                    hairColor = "Black"
                ),
                biography = Biography(
                    fullName = "Abraxas",
                    alterEgos = "No alter egos found.",
                    aliases = listOf("-"),
                    placeOfBirth = "Within Eternity",
                    firstAppearance = "Fantastic Four Annual #2001",
                    publisher = "Marvel Comics",
                    alignment = "bad"
                ),
                work = Work(
                    occupation = "Dimensional destroyer",
                    base = "-"
                ),
                connections = Connections(
                    groupAffiliation = "Cosmic Beings",
                    relatives = "Eternity (\"Father\")"
                ),
                images = Images(
                    xs = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/5-abraxas.jpg",
                    sm = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/5-abraxas.jpg",
                    md = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/5-abraxas.jpg",
                    lg = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/5-abraxas.jpg"
                )
            )
        )
    }

}