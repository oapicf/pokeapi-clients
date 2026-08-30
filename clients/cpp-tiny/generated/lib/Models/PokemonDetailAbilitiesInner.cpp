

#include "PokemonDetail_abilities_inner.h"

using namespace Tiny;

PokemonDetail_abilities_inner::PokemonDetail_abilities_inner()
{
	ability = AbilityDetail_pokemon_inner_pokemon();
	is_hidden = bool(false);
	slot = int(0);
}

PokemonDetail_abilities_inner::PokemonDetail_abilities_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_abilities_inner::~PokemonDetail_abilities_inner()
{

}

void
PokemonDetail_abilities_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *abilityKey = "ability";

    if(object.has_key(abilityKey))
    {
        bourne::json value = object[abilityKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &ability;
		obj->fromJson(value.dump());

    }

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


}

bourne::json
PokemonDetail_abilities_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["ability"] = getAbility().toJson();





    object["is_hidden"] = isIsHidden();






    object["slot"] = getSlot();



    return object;

}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_abilities_inner::getAbility()
{
	return ability;
}

void
PokemonDetail_abilities_inner::setAbility(AbilityDetail_pokemon_inner_pokemon ability)
{
	this->ability = ability;
}

bool
PokemonDetail_abilities_inner::isIsHidden()
{
	return is_hidden;
}

void
PokemonDetail_abilities_inner::setIsHidden(bool is_hidden)
{
	this->is_hidden = is_hidden;
}

int
PokemonDetail_abilities_inner::getSlot()
{
	return slot;
}

void
PokemonDetail_abilities_inner::setSlot(int slot)
{
	this->slot = slot;
}



