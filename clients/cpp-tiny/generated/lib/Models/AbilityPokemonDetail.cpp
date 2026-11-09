

#include "AbilityPokemonDetail.h"

using namespace Tiny;

AbilityPokemonDetail::AbilityPokemonDetail()
{
	is_hidden = bool(false);
	slot = int(0);
	pokemon = null;
}

AbilityPokemonDetail::AbilityPokemonDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityPokemonDetail::~AbilityPokemonDetail()
{

}

void
AbilityPokemonDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *is_hiddenKey = "is_hidden";

    if(object.has_key(is_hiddenKey))
    {
        bourne::json value = object[is_hiddenKey];



        jsonToValue(&is_hidden, value, "bool");


    }

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
AbilityPokemonDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_hidden"] = isIsHidden();






    object["slot"] = getSlot();







	object["pokemon"] = getPokemon().toJson();


    return object;

}

bool
AbilityPokemonDetail::isIsHidden()
{
	return is_hidden;
}

void
AbilityPokemonDetail::setIsHidden(bool is_hidden)
{
	this->is_hidden = is_hidden;
}

int
AbilityPokemonDetail::getSlot()
{
	return slot;
}

void
AbilityPokemonDetail::setSlot(int slot)
{
	this->slot = slot;
}

PokemonSummary
AbilityPokemonDetail::getPokemon()
{
	return pokemon;
}

void
AbilityPokemonDetail::setPokemon(PokemonSummary pokemon)
{
	this->pokemon = pokemon;
}



