

#include "PokemonAbilityPast.h"

using namespace Tiny;

PokemonAbilityPast::PokemonAbilityPast()
{
	is_hidden = bool(false);
	slot = int(0);
	ability = null;
}

PokemonAbilityPast::PokemonAbilityPast(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonAbilityPast::~PokemonAbilityPast()
{

}

void
PokemonAbilityPast::fromJson(std::string jsonObj)
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
PokemonAbilityPast::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_hidden"] = isIsHidden();






    object["slot"] = getSlot();







	object["ability"] = getAbility().toJson();


    return object;

}

bool
PokemonAbilityPast::isIsHidden()
{
	return is_hidden;
}

void
PokemonAbilityPast::setIsHidden(bool is_hidden)
{
	this->is_hidden = is_hidden;
}

int
PokemonAbilityPast::getSlot()
{
	return slot;
}

void
PokemonAbilityPast::setSlot(int slot)
{
	this->slot = slot;
}

AbilitySummary
PokemonAbilityPast::getAbility()
{
	return ability;
}

void
PokemonAbilityPast::setAbility(AbilitySummary ability)
{
	this->ability = ability;
}



