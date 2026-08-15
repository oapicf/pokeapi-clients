

#include "TypeDetail_pokemon_inner.h"

using namespace Tiny;

TypeDetail_pokemon_inner::TypeDetail_pokemon_inner()
{
	slot = int(0);
	pokemon = TypeDetail_pokemon_inner_pokemon();
}

TypeDetail_pokemon_inner::TypeDetail_pokemon_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeDetail_pokemon_inner::~TypeDetail_pokemon_inner()
{

}

void
TypeDetail_pokemon_inner::fromJson(std::string jsonObj)
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




        TypeDetail_pokemon_inner_pokemon* obj = &pokemon;
		obj->fromJson(value.dump());

    }


}

bourne::json
TypeDetail_pokemon_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["slot"] = getSlot();







	object["pokemon"] = getPokemon().toJson();


    return object;

}

int
TypeDetail_pokemon_inner::getSlot()
{
	return slot;
}

void
TypeDetail_pokemon_inner::setSlot(int  slot)
{
	this->slot = slot;
}

TypeDetail_pokemon_inner_pokemon
TypeDetail_pokemon_inner::getPokemon()
{
	return pokemon;
}

void
TypeDetail_pokemon_inner::setPokemon(TypeDetail_pokemon_inner_pokemon  pokemon)
{
	this->pokemon = pokemon;
}



