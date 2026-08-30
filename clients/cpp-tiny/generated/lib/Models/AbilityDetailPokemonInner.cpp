

#include "AbilityDetail_pokemon_inner.h"

using namespace Tiny;

AbilityDetail_pokemon_inner::AbilityDetail_pokemon_inner()
{
	is_hidden = bool(false);
	slot = int(0);
	pokemon = AbilityDetail_pokemon_inner_pokemon();
}

AbilityDetail_pokemon_inner::AbilityDetail_pokemon_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityDetail_pokemon_inner::~AbilityDetail_pokemon_inner()
{

}

void
AbilityDetail_pokemon_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &pokemon;
		obj->fromJson(value.dump());

    }


}

bourne::json
AbilityDetail_pokemon_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_hidden"] = isIsHidden();






    object["slot"] = getSlot();







	object["pokemon"] = getPokemon().toJson();


    return object;

}

bool
AbilityDetail_pokemon_inner::isIsHidden()
{
	return is_hidden;
}

void
AbilityDetail_pokemon_inner::setIsHidden(bool is_hidden)
{
	this->is_hidden = is_hidden;
}

int
AbilityDetail_pokemon_inner::getSlot()
{
	return slot;
}

void
AbilityDetail_pokemon_inner::setSlot(int slot)
{
	this->slot = slot;
}

AbilityDetail_pokemon_inner_pokemon
AbilityDetail_pokemon_inner::getPokemon()
{
	return pokemon;
}

void
AbilityDetail_pokemon_inner::setPokemon(AbilityDetail_pokemon_inner_pokemon pokemon)
{
	this->pokemon = pokemon;
}



