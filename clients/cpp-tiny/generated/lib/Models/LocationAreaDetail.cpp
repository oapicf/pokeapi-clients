

#include "LocationAreaDetail.h"

using namespace Tiny;

LocationAreaDetail::LocationAreaDetail()
{
	id = int(0);
	name = std::string();
	game_index = int(0);
	encounter_method_rates = std::list<LocationAreaDetail_encounter_method_rates_inner>();
	location = LocationSummary();
	names = std::list<LocationAreaName>();
	pokemon_encounters = std::list<LocationAreaDetail_pokemon_encounters_inner>();
}

LocationAreaDetail::LocationAreaDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaDetail::~LocationAreaDetail()
{

}

void
LocationAreaDetail::fromJson(std::string jsonObj)
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

    const char *game_indexKey = "game_index";

    if(object.has_key(game_indexKey))
    {
        bourne::json value = object[game_indexKey];



        jsonToValue(&game_index, value, "int");


    }

    const char *encounter_method_ratesKey = "encounter_method_rates";

    if(object.has_key(encounter_method_ratesKey))
    {
        bourne::json value = object[encounter_method_ratesKey];


        std::list<LocationAreaDetail_encounter_method_rates_inner> encounter_method_rates_list;
        LocationAreaDetail_encounter_method_rates_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            encounter_method_rates_list.push_back(element);
        }
        encounter_method_rates = encounter_method_rates_list;


    }

    const char *locationKey = "location";

    if(object.has_key(locationKey))
    {
        bourne::json value = object[locationKey];




        LocationSummary* obj = &location;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<LocationAreaName> names_list;
        LocationAreaName element;
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


        std::list<LocationAreaDetail_pokemon_encounters_inner> pokemon_encounters_list;
        LocationAreaDetail_pokemon_encounters_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_encounters_list.push_back(element);
        }
        pokemon_encounters = pokemon_encounters_list;


    }


}

bourne::json
LocationAreaDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["game_index"] = getGameIndex();





    std::list<LocationAreaDetail_encounter_method_rates_inner> encounter_method_rates_list = getEncounterMethodRates();
    bourne::json encounter_method_rates_arr = bourne::json::array();

    for(auto& var : encounter_method_rates_list)
    {
        LocationAreaDetail_encounter_method_rates_inner obj = var;
        encounter_method_rates_arr.append(obj.toJson());
    }
    object["encounter_method_rates"] = encounter_method_rates_arr;








	object["location"] = getLocation().toJson();




    std::list<LocationAreaName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        LocationAreaName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<LocationAreaDetail_pokemon_encounters_inner> pokemon_encounters_list = getPokemonEncounters();
    bourne::json pokemon_encounters_arr = bourne::json::array();

    for(auto& var : pokemon_encounters_list)
    {
        LocationAreaDetail_pokemon_encounters_inner obj = var;
        pokemon_encounters_arr.append(obj.toJson());
    }
    object["pokemon_encounters"] = pokemon_encounters_arr;




    return object;

}

int
LocationAreaDetail::getId()
{
	return id;
}

void
LocationAreaDetail::setId(int id)
{
	this->id = id;
}

std::string
LocationAreaDetail::getName()
{
	return name;
}

void
LocationAreaDetail::setName(std::string name)
{
	this->name = name;
}

int
LocationAreaDetail::getGameIndex()
{
	return game_index;
}

void
LocationAreaDetail::setGameIndex(int game_index)
{
	this->game_index = game_index;
}

std::list<LocationAreaDetail_encounter_method_rates_inner>
LocationAreaDetail::getEncounterMethodRates()
{
	return encounter_method_rates;
}

void
LocationAreaDetail::setEncounterMethodRates(std::list<LocationAreaDetail_encounter_method_rates_inner> encounter_method_rates)
{
	this->encounter_method_rates = encounter_method_rates;
}

LocationSummary
LocationAreaDetail::getLocation()
{
	return location;
}

void
LocationAreaDetail::setLocation(LocationSummary location)
{
	this->location = location;
}

std::list<LocationAreaName>
LocationAreaDetail::getNames()
{
	return names;
}

void
LocationAreaDetail::setNames(std::list<LocationAreaName> names)
{
	this->names = names;
}

std::list<LocationAreaDetail_pokemon_encounters_inner>
LocationAreaDetail::getPokemonEncounters()
{
	return pokemon_encounters;
}

void
LocationAreaDetail::setPokemonEncounters(std::list<LocationAreaDetail_pokemon_encounters_inner> pokemon_encounters)
{
	this->pokemon_encounters = pokemon_encounters;
}



