package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


    {
        "request": {
        "type": "City",
                "query": "Tirane, Albania",
                "language": "en",
                "unit": "m"
    },
        "location": {
        "name": "Tirane",
                "country": "Albania",
                "region": "Tirane",
                "lat": "41.328",
                "lon": "19.819",
                "timezone_id": "Europe/Tirane",
                "localtime": "2022-06-11 21:52",
                "localtime_epoch": 1654984320,
                "utc_offset": "2.0"
    },
        "current": {
        "observation_time": "07:52 PM",
                "temperature": 24,
                "weather_code": 116,
                "weather_icons": [
        "https://assets.weatherstack.com/images/wsymbols01_png_64/wsymbol_0004_black_low_cloud.png"
        ],
        "weather_descriptions": [
        "Partly cloudy"
        ],
        "wind_speed": 15,
                "wind_degree": 320,
                "wind_dir": "NW",
                "pressure": 1011,
                "precip": 0,
                "humidity": 50,
                "cloudcover": 50,
                "feelslike": 26,
                "uv_index": 5,
                "visibility": 10,
                "is_day": "no"
    }
    }


    // BASE URL
    http://api.weatherstack.com/

    // Specific endpoint
    current


    ?access_key=c1192590413603096f0ba5a889ac77cc&query=Tirane




}
