

#include "TypePokemon.h"

using namespace Tiny;

TypePokemon::TypePokemon()
{
	slot = int(0);
	pokemon = null;
}

TypePokemon::TypePokemon(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypePokemon::~TypePokemon()
{

}

void
TypePokemon::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slotKey = "slot";

    if(object.has_key(slotKey))
    {
        bourne::json value = object[slotKey];



        jsonToValue(&slot, value, "int");


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
TypePokemon::toJson()
{
    bourne::json object = bourne::json::object();





    object["slot"] = getSlot();







	object["pokemon"] = getPokemon().toJson();


    return object;

}

int
TypePokemon::getSlot()
{
	return slot;
}

void
TypePokemon::setSlot(int slot)
{
	this->slot = slot;
}

PokemonSummary
TypePokemon::getPokemon()
{
	return pokemon;
}

void
TypePokemon::setPokemon(PokemonSummary pokemon)
{
	this->pokemon = pokemon;
}



