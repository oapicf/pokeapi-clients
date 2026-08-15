

#include "PokemonSpeciesDetail_varieties_inner.h"

using namespace Tiny;

PokemonSpeciesDetail_varieties_inner::PokemonSpeciesDetail_varieties_inner()
{
	is_default = bool(false);
	pokemon = AbilityDetail_pokemon_inner_pokemon();
}

PokemonSpeciesDetail_varieties_inner::PokemonSpeciesDetail_varieties_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesDetail_varieties_inner::~PokemonSpeciesDetail_varieties_inner()
{

}

void
PokemonSpeciesDetail_varieties_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &pokemon;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonSpeciesDetail_varieties_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_default"] = isIsDefault();







	object["pokemon"] = getPokemon().toJson();


    return object;

}

bool
PokemonSpeciesDetail_varieties_inner::isIsDefault()
{
	return is_default;
}

void
PokemonSpeciesDetail_varieties_inner::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

AbilityDetail_pokemon_inner_pokemon
PokemonSpeciesDetail_varieties_inner::getPokemon()
{
	return pokemon;
}

void
PokemonSpeciesDetail_varieties_inner::setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon)
{
	this->pokemon = pokemon;
}



