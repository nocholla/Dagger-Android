package com.nocholla.dagger.recyclerview.model;

import com.google.gson.annotations.SerializedName;

public class Film {
    @SerializedName("title")
    public String title;
    @SerializedName("director")
    public String director;
}

/*
{
    "title": "The Empire Strikes Back",
    "episode_id": 5,
    "opening_crawl": "It is a dark time for the\r\nRebellion. Although the Death\r\nStar has been destroyed,\r\nImperial troops have driven the\r\nRebel forces from their hidden\r\nbase and pursued them across\r\nthe galaxy.\r\n\r\nEvading the dreaded Imperial\r\nStarfleet, a group of freedom\r\nfighters led by Luke Skywalker\r\nhas established a new secret\r\nbase on the remote ice world\r\nof Hoth.\r\n\r\nThe evil lord Darth Vader,\r\nobsessed with finding young\r\nSkywalker, has dispatched\r\nthousands of remote probes into\r\nthe far reaches of space....",
    "director": "Irvin Kershner",
    "producer": "Gary Kurtz, Rick McCallum",
    "release_date": "1980-05-17",
    "characters": [
        "https://swapi.co/api/people/1/",
        "https://swapi.co/api/people/2/",
        "https://swapi.co/api/people/3/",
        "https://swapi.co/api/people/4/",
        "https://swapi.co/api/people/5/",
        "https://swapi.co/api/people/10/",
        "https://swapi.co/api/people/13/",
        "https://swapi.co/api/people/14/",
        "https://swapi.co/api/people/18/",
        "https://swapi.co/api/people/20/",
        "https://swapi.co/api/people/21/",
        "https://swapi.co/api/people/22/",
        "https://swapi.co/api/people/23/",
        "https://swapi.co/api/people/24/",
        "https://swapi.co/api/people/25/",
        "https://swapi.co/api/people/26/"
    ],
    "planets": [
        "https://swapi.co/api/planets/4/",
        "https://swapi.co/api/planets/5/",
        "https://swapi.co/api/planets/6/",
        "https://swapi.co/api/planets/27/"
    ],
    "starships": [
        "https://swapi.co/api/starships/15/",
        "https://swapi.co/api/starships/10/",
        "https://swapi.co/api/starships/11/",
        "https://swapi.co/api/starships/12/",
        "https://swapi.co/api/starships/21/",
        "https://swapi.co/api/starships/22/",
        "https://swapi.co/api/starships/23/",
        "https://swapi.co/api/starships/3/",
        "https://swapi.co/api/starships/17/"
    ],
    "vehicles": [
        "https://swapi.co/api/vehicles/8/",
        "https://swapi.co/api/vehicles/14/",
        "https://swapi.co/api/vehicles/16/",
        "https://swapi.co/api/vehicles/18/",
        "https://swapi.co/api/vehicles/19/",
        "https://swapi.co/api/vehicles/20/"
    ],
    "species": [
        "https://swapi.co/api/species/6/",
        "https://swapi.co/api/species/7/",
        "https://swapi.co/api/species/3/",
        "https://swapi.co/api/species/2/",
        "https://swapi.co/api/species/1/"
    ],
    "created": "2014-12-12T11:26:24.656000Z",
    "edited": "2017-04-19T10:57:29.544256Z",
    "url": "https://swapi.co/api/films/2/"
}

 */