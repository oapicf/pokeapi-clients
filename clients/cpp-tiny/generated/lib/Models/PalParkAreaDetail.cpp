

#include "PalParkAreaDetail.h"

using namespace Tiny;

PalParkAreaDetail::PalParkAreaDetail()
{
	id = int(0);
	name = std::string();
	names = std::list<PalParkAreaName>();
	pokemon_encounters = std::list<PalParkAreaDetail_pokemon_encounters_inner>();
}

PalParkAreaDetail::PalParkAreaDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

PalParkAreaDetail::~PalParkAreaDetail()
{

}

void
PalParkAreaDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<PalParkAreaName> names_list;
        PalParkAreaName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *pokemon_encountersKey = "pokemon_encounters";

    if(object.has_key(pokemon_encountersKey))
    {
        bourne::json value = object[pokemon_encountersKey];


        std::list<PalParkAreaDetail_pokemon_encounters_inner> pokemon_encounters_list;
        PalParkAreaDetail_pokemon_encounters_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_encounters_list.push_back(element);
        }
        pokemon_encounters = pokemon_encounters_list;


    }


}

bourne::json
PalParkAreaDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<PalParkAreaName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        PalParkAreaName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<PalParkAreaDetail_pokemon_encounters_inner> pokemon_encounters_list = getPokemonEncounters();
    bourne::json pokemon_encounters_arr = bourne::json::array();

    for(auto& var : pokemon_encounters_list)
    {
        PalParkAreaDetail_pokemon_encounters_inner obj = var;
        pokemon_encounters_arr.append(obj.toJson());
    }
    object["pokemon_encounters"] = pokemon_encounters_arr;




    return object;

}

int
PalParkAreaDetail::getId()
{
	return id;
}

void
PalParkAreaDetail::setId(int id)
{
	this->id = id;
}

std::string
PalParkAreaDetail::getName()
{
	return name;
}

void
PalParkAreaDetail::setName(std::string name)
{
	this->name = name;
}

std::list<PalParkAreaName>
PalParkAreaDetail::getNames()
{
	return names;
}

void
PalParkAreaDetail::setNames(std::list<PalParkAreaName> names)
{
	this->names = names;
}

std::list<PalParkAreaDetail_pokemon_encounters_inner>
PalParkAreaDetail::getPokemonEncounters()
{
	return pokemon_encounters;
}

void
PalParkAreaDetail::setPokemonEncounters(std::list<PalParkAreaDetail_pokemon_encounters_inner> pokemon_encounters)
{
	this->pokemon_encounters = pokemon_encounters;
}



