

#include "LocationAreaDetail_pokemon_encounters_inner.h"

using namespace Tiny;

LocationAreaDetail_pokemon_encounters_inner::LocationAreaDetail_pokemon_encounters_inner()
{
	pokemon = AbilityDetail_pokemon_inner_pokemon();
	version_details = std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner>();
}

LocationAreaDetail_pokemon_encounters_inner::LocationAreaDetail_pokemon_encounters_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaDetail_pokemon_encounters_inner::~LocationAreaDetail_pokemon_encounters_inner()
{

}

void
LocationAreaDetail_pokemon_encounters_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pokemonKey = "pokemon";

    if(object.has_key(pokemonKey))
    {
        bourne::json value = object[pokemonKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &pokemon;
		obj->fromJson(value.dump());

    }

    const char *version_detailsKey = "version_details";

    if(object.has_key(version_detailsKey))
    {
        bourne::json value = object[version_detailsKey];


        std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner> version_details_list;
        LocationAreaDetail_pokemon_encounters_inner_version_details_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_details_list.push_back(element);
        }
        version_details = version_details_list;


    }


}

bourne::json
LocationAreaDetail_pokemon_encounters_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["pokemon"] = getPokemon().toJson();




    std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner> version_details_list = getVersionDetails();
    bourne::json version_details_arr = bourne::json::array();

    for(auto& var : version_details_list)
    {
        LocationAreaDetail_pokemon_encounters_inner_version_details_inner obj = var;
        version_details_arr.append(obj.toJson());
    }
    object["version_details"] = version_details_arr;




    return object;

}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_pokemon_encounters_inner::getPokemon()
{
	return pokemon;
}

void
LocationAreaDetail_pokemon_encounters_inner::setPokemon(AbilityDetail_pokemon_inner_pokemon pokemon)
{
	this->pokemon = pokemon;
}

std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner>
LocationAreaDetail_pokemon_encounters_inner::getVersionDetails()
{
	return version_details;
}

void
LocationAreaDetail_pokemon_encounters_inner::setVersionDetails(std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner> version_details)
{
	this->version_details = version_details;
}



