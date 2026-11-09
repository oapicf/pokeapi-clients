

#include "PokemonType.h"

using namespace Tiny;

PokemonType::PokemonType()
{
	slot = int(0);
	type = null;
}

PokemonType::PokemonType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonType::~PokemonType()
{

}

void
PokemonType::fromJson(std::string jsonObj)
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




        TypeSummary* obj = &type;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonType::toJson()
{
    bourne::json object = bourne::json::object();





    object["slot"] = getSlot();







	object["type"] = getType().toJson();


    return object;

}

int
PokemonType::getSlot()
{
	return slot;
}

void
PokemonType::setSlot(int slot)
{
	this->slot = slot;
}

TypeSummary
PokemonType::getType()
{
	return type;
}

void
PokemonType::setType(TypeSummary type)
{
	this->type = type;
}



