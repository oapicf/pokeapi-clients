

#include "PokemonDetail_types_inner.h"

using namespace Tiny;

PokemonDetail_types_inner::PokemonDetail_types_inner()
{
	slot = int(0);
	type = AbilityDetail_pokemon_inner_pokemon();
}

PokemonDetail_types_inner::PokemonDetail_types_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_types_inner::~PokemonDetail_types_inner()
{

}

void
PokemonDetail_types_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slotKey = "slot";

    if(object.has_key(slotKey))
    {
        bourne::json value = object[slotKey];



        jsonToValue(&slot, value, "int");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &type;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonDetail_types_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["slot"] = getSlot();







	object["type"] = getType().toJson();


    return object;

}

int
PokemonDetail_types_inner::getSlot()
{
	return slot;
}

void
PokemonDetail_types_inner::setSlot(int  slot)
{
	this->slot = slot;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_types_inner::getType()
{
	return type;
}

void
PokemonDetail_types_inner::setType(AbilityDetail_pokemon_inner_pokemon  type)
{
	this->type = type;
}



