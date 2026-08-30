

#include "LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.h"

using namespace Tiny;

LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details()
{
	min_level = int(0);
	max_level = int(0);
	condition_values = AbilityDetail_pokemon_inner_pokemon();
	chance = int(0);
	method = AbilityDetail_pokemon_inner_pokemon();
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::~LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details()
{

}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *min_levelKey = "min_level";

    if(object.has_key(min_levelKey))
    {
        bourne::json value = object[min_levelKey];



        jsonToValue(&min_level, value, "int");


    }

    const char *max_levelKey = "max_level";

    if(object.has_key(max_levelKey))
    {
        bourne::json value = object[max_levelKey];



        jsonToValue(&max_level, value, "int");


    }

    const char *condition_valuesKey = "condition_values";

    if(object.has_key(condition_valuesKey))
    {
        bourne::json value = object[condition_valuesKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &condition_values;
		obj->fromJson(value.dump());

    }

    const char *chanceKey = "chance";

    if(object.has_key(chanceKey))
    {
        bourne::json value = object[chanceKey];



        jsonToValue(&chance, value, "int");


    }

    const char *methodKey = "method";

    if(object.has_key(methodKey))
    {
        bourne::json value = object[methodKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &method;
		obj->fromJson(value.dump());

    }


}

bourne::json
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::toJson()
{
    bourne::json object = bourne::json::object();





    object["min_level"] = getMinLevel();






    object["max_level"] = getMaxLevel();







	object["condition_values"] = getConditionValues().toJson();





    object["chance"] = getChance();







	object["method"] = getMethod().toJson();


    return object;

}

int
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getMinLevel()
{
	return min_level;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setMinLevel(int min_level)
{
	this->min_level = min_level;
}

int
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getMaxLevel()
{
	return max_level;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setMaxLevel(int max_level)
{
	this->max_level = max_level;
}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getConditionValues()
{
	return condition_values;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setConditionValues(AbilityDetail_pokemon_inner_pokemon condition_values)
{
	this->condition_values = condition_values;
}

int
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getChance()
{
	return chance;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setChance(int chance)
{
	this->chance = chance;
}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getMethod()
{
	return method;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setMethod(AbilityDetail_pokemon_inner_pokemon method)
{
	this->method = method;
}



