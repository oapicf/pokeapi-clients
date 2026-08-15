

#include "NatureDetail_pokeathlon_stat_changes_inner.h"

using namespace Tiny;

NatureDetail_pokeathlon_stat_changes_inner::NatureDetail_pokeathlon_stat_changes_inner()
{
	max_change = int(0);
	pokeathlon_stat = AbilityDetail_pokemon_inner_pokemon();
}

NatureDetail_pokeathlon_stat_changes_inner::NatureDetail_pokeathlon_stat_changes_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

NatureDetail_pokeathlon_stat_changes_inner::~NatureDetail_pokeathlon_stat_changes_inner()
{

}

void
NatureDetail_pokeathlon_stat_changes_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *max_changeKey = "max_change";

    if(object.has_key(max_changeKey))
    {
        bourne::json value = object[max_changeKey];



        jsonToValue(&max_change, value, "int");


    }

    const char *pokeathlon_statKey = "pokeathlon_stat";

    if(object.has_key(pokeathlon_statKey))
    {
        bourne::json value = object[pokeathlon_statKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &pokeathlon_stat;
		obj->fromJson(value.dump());

    }


}

bourne::json
NatureDetail_pokeathlon_stat_changes_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["max_change"] = getMaxChange();







	object["pokeathlon_stat"] = getPokeathlonStat().toJson();


    return object;

}

int
NatureDetail_pokeathlon_stat_changes_inner::getMaxChange()
{
	return max_change;
}

void
NatureDetail_pokeathlon_stat_changes_inner::setMaxChange(int  max_change)
{
	this->max_change = max_change;
}

AbilityDetail_pokemon_inner_pokemon
NatureDetail_pokeathlon_stat_changes_inner::getPokeathlonStat()
{
	return pokeathlon_stat;
}

void
NatureDetail_pokeathlon_stat_changes_inner::setPokeathlonStat(AbilityDetail_pokemon_inner_pokemon  pokeathlon_stat)
{
	this->pokeathlon_stat = pokeathlon_stat;
}



