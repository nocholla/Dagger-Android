package com.nocholla.dagger.recyclerview.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StarWars {

    @SerializedName("results")
    public List<People> results = null;

    public class People {
        @SerializedName("name")
        public String name;
        @SerializedName("height")
        public String height;
        @SerializedName("mass")
        public String mass;
        @SerializedName("birth_year")
        public String birthYear;
        @SerializedName("gender")
        public String gender;
        @SerializedName("homeworld")
        public String homeworld;
        @SerializedName("films")
        public List<String> films = null;
    }

}

/*
https://swapi.co/api/people/

{
    "count": 87,
    "next": "https://swapi.co/api/people/?page=2",
    "previous": null,
    "results": [
        {
            "name": "Luke Skywalker",
            "height": "172",
            "mass": "77",
            "hair_color": "blond",
            "skin_color": "fair",
            "eye_color": "blue",
            "birth_year": "19BBY",
            "gender": "male",
            "homeworld": "https://swapi.co/api/planets/1/",
            "films": [
                "https://swapi.co/api/films/2/",
                "https://swapi.co/api/films/6/",
                "https://swapi.co/api/films/3/",
                "https://swapi.co/api/films/1/",
                "https://swapi.co/api/films/7/"
            ],
            "species": [
                "https://swapi.co/api/species/1/"
            ],
            "vehicles": [
                "https://swapi.co/api/vehicles/14/",
                "https://swapi.co/api/vehicles/30/"
            ],
            "starships": [
                "https://swapi.co/api/starships/12/",
                "https://swapi.co/api/starships/22/"
            ],
            "created": "2014-12-09T13:50:51.644000Z",
            "edited": "2014-12-20T21:17:56.891000Z",
            "url": "https://swapi.co/api/people/1/"
        }
    ]
}
 */