

#include "PokemonSpeciesVariety.h"

using namespace Tiny;

PokemonSpeciesVariety::PokemonSpeciesVariety()
{
	is_default = bool(false);
	pokemon = null;
}

PokemonSpeciesVariety::PokemonSpeciesVariety(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesVariety::~PokemonSpeciesVariety()
{

}

void
PokemonSpeciesVariety::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *is_defaultKey = "is_default";

    if(object.has_key(is_defaultKey))
    {
        bourne::json value = object[is_defaultKey];



        jsonToValue(&is_default, value, "bool");


    }

    const char *pokemonKey = "pokemon";

    if(object.has_key(pokemonKey))
    {
        bourne::json value = object[pokemonKey];




        PokemonSummary* obj = &pokemon;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonSpeciesVariety::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_default"] = isIsDefault();







	object["pokemon"] = getPokemon().toJson();


    return object;

}

bool
PokemonSpeciesVariety::isIsDefault()
{
	return is_default;
}

void
PokemonSpeciesVariety::setIsDefault(bool is_default)
{
	this->is_default = is_default;
}

PokemonSummary
PokemonSpeciesVariety::getPokemon()
{
	return pokemon;
}

void
PokemonSpeciesVariety::setPokemon(PokemonSummary pokemon)
{
	this->pokemon = pokemon;
}



