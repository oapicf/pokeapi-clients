

#include "PokemonFormType.h"

using namespace Tiny;

PokemonFormType::PokemonFormType()
{
	slot = int(0);
	type = null;
}

PokemonFormType::PokemonFormType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormType::~PokemonFormType()
{

}

void
PokemonFormType::fromJson(std::string jsonObj)
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
PokemonFormType::toJson()
{
    bourne::json object = bourne::json::object();





    object["slot"] = getSlot();







	object["type"] = getType().toJson();


    return object;

}

int
PokemonFormType::getSlot()
{
	return slot;
}

void
PokemonFormType::setSlot(int slot)
{
	this->slot = slot;
}

TypeSummary
PokemonFormType::getType()
{
	return type;
}

void
PokemonFormType::setType(TypeSummary type)
{
	this->type = type;
}



