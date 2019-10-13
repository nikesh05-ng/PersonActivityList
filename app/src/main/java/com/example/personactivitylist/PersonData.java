package com.example.personactivitylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PersonData {

    private Person data;


    //String person1[] = {"Sabin Tabirca","WBG, UCC, Cork","12345678","sabin.jpg","http://www.cs.ucc.ie"};
    //String person2[] = {"John Herbert","WGB, First Floor","5454565","john.jpg","http://www.cs.ucc.ie"};

    public PersonData(){

        //String xmlData= "<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\\n<PersonData>\\n\\t<Person>\\n\\t\\t<name>Sabin Tabirca</name>\\n\\t\\t<address>WBG, UCC, Cork</address>\\n\\t\\t<phone>12345678</phone>\\n\\t\\t<image>sabin.jpg</image>\\n\\t\\t<url>http://www.cs.ucc.ie</url>\\n\\t</Person>\\n\\t<Person>\\n\\t\\t<name>John Herbert</name>\\n\\t\\t<address>WGB, First Floor</address>\\n\\t\\t<phone>5454565</phone>\\n\\t\\t<image>john.jpg</image>\\n\\t\\t<url>http://www.cs.ucc.ie</url>\\n\\t</Person>\\n</PersonData>";

        //String

    }

    public void setDataPerson(String name){
        if(name.equalsIgnoreCase("Sabin")) {
            data = new Person(
                "Sabin Tabirca",
                "WBG, UCC, Cork",
                "12345678",
                "sabin.jpg",
                "http://www.cs.ucc.ie"
        );
        }else{
            data = new Person(
                    "John Herbert",
                    "WGB, First Floor",
                    "5454565",
                    "john.jpg",
                    "http://www.cs.ucc.ie"
            );

        }
    }

    public Person getData() {

        return data;
    }


}
