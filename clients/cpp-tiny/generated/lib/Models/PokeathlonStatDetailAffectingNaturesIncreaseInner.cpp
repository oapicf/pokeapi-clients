

#include "PokeathlonStatDetail_affecting_natures_increase_inner.h"

using namespace Tiny;

PokeathlonStatDetail_affecting_natures_increase_inner::PokeathlonStatDetail_affecting_natures_increase_inner()
{
	max_change = int(0);
	nature = AbilityDetail_pokemon_inner_pokemon();
}

PokeathlonStatDetail_affecting_natures_increase_inner::PokeathlonStatDetail_affecting_natures_increase_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokeathlonStatDetail_affecting_natures_increase_inner::~PokeathlonStatDetail_affecting_natures_increase_inner()
{

}

void
PokeathlonStatDetail_affecting_natures_increase_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *max_changeKey = "max_change";

    if(object.has_key(max_changeKey))
    {
        bourne::json value = object[max_changeKey];



        jsonToValue(&max_change, value, "int");


    }

    const char *natureKey = "nature";

    if(object.has_key(natureKey))
    {
        bourne::json value = object[natureKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &nature;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokeathlonStatDetail_affecting_natures_increase_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["max_change"] = getMaxChange();







	object["nature"] = getNature().toJson();


    return object;

}

int
PokeathlonStatDetail_affecting_natures_increase_inner::getMaxChange()
{
	return max_change;
}

void
PokeathlonStatDetail_affecting_natures_increase_inner::setMaxChange(int max_change)
{
	this->max_change = max_change;
}

AbilityDetail_pokemon_inner_pokemon
PokeathlonStatDetail_affecting_natures_increase_inner::getNature()
{
	return nature;
}

void
PokeathlonStatDetail_affecting_natures_increase_inner::setNature(AbilityDetail_pokemon_inner_pokemon nature)
{
	this->nature = nature;
}



