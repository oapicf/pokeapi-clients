

#include "LocationAreaPokemonEncounter.h"

using namespace Tiny;

LocationAreaPokemonEncounter::LocationAreaPokemonEncounter()
{
	pokemon = null;
	version_details = std::list<LocationAreaPokemonEncounterVersion>();
}

LocationAreaPokemonEncounter::LocationAreaPokemonEncounter(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaPokemonEncounter::~LocationAreaPokemonEncounter()
{

}

void
LocationAreaPokemonEncounter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pokemonKey = "pokemon";

    if(object.has_key(pokemonKey))
    {
        bourne::json value = object[pokemonKey];




        PokemonSummary* obj = &pokemon;
		obj->fromJson(value.dump());

    }

    const char *version_detailsKey = "version_details";

    if(object.has_key(version_detailsKey))
    {
        bourne::json value = object[version_detailsKey];


        std::list<LocationAreaPokemonEncounterVersion> version_details_list;
        LocationAreaPokemonEncounterVersion element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_details_list.push_back(element);
        }
        version_details = version_details_list;


    }


}

bourne::json
LocationAreaPokemonEncounter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pokemon"] = getPokemon().toJson();




    std::list<LocationAreaPokemonEncounterVersion> version_details_list = getVersionDetails();
    bourne::json version_details_arr = bourne::json::array();

    for(auto& var : version_details_list)
    {
        LocationAreaPokemonEncounterVersion obj = var;
        version_details_arr.append(obj.toJson());
    }
    object["version_details"] = version_details_arr;




    return object;

}

PokemonSummary
LocationAreaPokemonEncounter::getPokemon()
{
	return pokemon;
}

void
LocationAreaPokemonEncounter::setPokemon(PokemonSummary pokemon)
{
	this->pokemon = pokemon;
}

std::list<LocationAreaPokemonEncounterVersion>
LocationAreaPokemonEncounter::getVersionDetails()
{
	return version_details;
}

void
LocationAreaPokemonEncounter::setVersionDetails(std::list<LocationAreaPokemonEncounterVersion> version_details)
{
	this->version_details = version_details;
}



