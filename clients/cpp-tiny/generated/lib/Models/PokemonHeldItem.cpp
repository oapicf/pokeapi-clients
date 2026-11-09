

#include "PokemonHeldItem.h"

using namespace Tiny;

PokemonHeldItem::PokemonHeldItem()
{
	pokemon = null;
	version_details = std::list<PokemonHeldItemVersion>();
}

PokemonHeldItem::PokemonHeldItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonHeldItem::~PokemonHeldItem()
{

}

void
PokemonHeldItem::fromJson(std::string jsonObj)
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


        std::list<PokemonHeldItemVersion> version_details_list;
        PokemonHeldItemVersion element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_details_list.push_back(element);
        }
        version_details = version_details_list;


    }


}

bourne::json
PokemonHeldItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["pokemon"] = getPokemon().toJson();




    std::list<PokemonHeldItemVersion> version_details_list = getVersionDetails();
    bourne::json version_details_arr = bourne::json::array();

    for(auto& var : version_details_list)
    {
        PokemonHeldItemVersion obj = var;
        version_details_arr.append(obj.toJson());
    }
    object["version_details"] = version_details_arr;




    return object;

}

PokemonSummary
PokemonHeldItem::getPokemon()
{
	return pokemon;
}

void
PokemonHeldItem::setPokemon(PokemonSummary pokemon)
{
	this->pokemon = pokemon;
}

std::list<PokemonHeldItemVersion>
PokemonHeldItem::getVersionDetails()
{
	return version_details;
}

void
PokemonHeldItem::setVersionDetails(std::list<PokemonHeldItemVersion> version_details)
{
	this->version_details = version_details;
}



