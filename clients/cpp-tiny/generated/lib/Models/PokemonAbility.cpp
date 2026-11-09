

#include "PokemonAbility.h"

using namespace Tiny;

PokemonAbility::PokemonAbility()
{
	is_hidden = bool(false);
	slot = int(0);
	ability = null;
}

PokemonAbility::PokemonAbility(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonAbility::~PokemonAbility()
{

}

void
PokemonAbility::fromJson(std::string jsonObj)
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

    const char *abilityKey = "ability";

    if(object.has_key(abilityKey))
    {
        bourne::json value = object[abilityKey];




        AbilitySummary* obj = &ability;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonAbility::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_hidden"] = isIsHidden();






    object["slot"] = getSlot();







	object["ability"] = getAbility().toJson();


    return object;

}

bool
PokemonAbility::isIsHidden()
{
	return is_hidden;
}

void
PokemonAbility::setIsHidden(bool is_hidden)
{
	this->is_hidden = is_hidden;
}

int
PokemonAbility::getSlot()
{
	return slot;
}

void
PokemonAbility::setSlot(int slot)
{
	this->slot = slot;
}

AbilitySummary
PokemonAbility::getAbility()
{
	return ability;
}

void
PokemonAbility::setAbility(AbilitySummary ability)
{
	this->ability = ability;
}



