

#include "PokemonEncounterDetailResponse.h"

using namespace Tiny;

PokemonEncounterDetailResponse::PokemonEncounterDetailResponse()
{
	chance = int(0);
	condition_values = std::list<EncounterConditionValueSummary>();
	max_level = int(0);
	method = null;
	min_level = int(0);
}

PokemonEncounterDetailResponse::PokemonEncounterDetailResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonEncounterDetailResponse::~PokemonEncounterDetailResponse()
{

}

void
PokemonEncounterDetailResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *chanceKey = "chance";

    if(object.has_key(chanceKey))
    {
        bourne::json value = object[chanceKey];



        jsonToValue(&chance, value, "int");


    }

    const char *condition_valuesKey = "condition_values";

    if(object.has_key(condition_valuesKey))
    {
        bourne::json value = object[condition_valuesKey];


        std::list<EncounterConditionValueSummary> condition_values_list;
        EncounterConditionValueSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            condition_values_list.push_back(element);
        }
        condition_values = condition_values_list;


    }

    const char *max_levelKey = "max_level";

    if(object.has_key(max_levelKey))
    {
        bourne::json value = object[max_levelKey];



        jsonToValue(&max_level, value, "int");


    }

    const char *methodKey = "method";

    if(object.has_key(methodKey))
    {
        bourne::json value = object[methodKey];




        EncounterMethodSummary* obj = &method;
		obj->fromJson(value.dump());

    }

    const char *min_levelKey = "min_level";

    if(object.has_key(min_levelKey))
    {
        bourne::json value = object[min_levelKey];



        jsonToValue(&min_level, value, "int");


    }


}

bourne::json
PokemonEncounterDetailResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["chance"] = getChance();





    std::list<EncounterConditionValueSummary> condition_values_list = getConditionValues();
    bourne::json condition_values_arr = bourne::json::array();

    for(auto& var : condition_values_list)
    {
        EncounterConditionValueSummary obj = var;
        condition_values_arr.append(obj.toJson());
    }
    object["condition_values"] = condition_values_arr;







    object["max_level"] = getMaxLevel();







	object["method"] = getMethod().toJson();





    object["min_level"] = getMinLevel();



    return object;

}

int
PokemonEncounterDetailResponse::getChance()
{
	return chance;
}

void
PokemonEncounterDetailResponse::setChance(int chance)
{
	this->chance = chance;
}

std::list<EncounterConditionValueSummary>
PokemonEncounterDetailResponse::getConditionValues()
{
	return condition_values;
}

void
PokemonEncounterDetailResponse::setConditionValues(std::list<EncounterConditionValueSummary> condition_values)
{
	this->condition_values = condition_values;
}

int
PokemonEncounterDetailResponse::getMaxLevel()
{
	return max_level;
}

void
PokemonEncounterDetailResponse::setMaxLevel(int max_level)
{
	this->max_level = max_level;
}

EncounterMethodSummary
PokemonEncounterDetailResponse::getMethod()
{
	return method;
}

void
PokemonEncounterDetailResponse::setMethod(EncounterMethodSummary method)
{
	this->method = method;
}

int
PokemonEncounterDetailResponse::getMinLevel()
{
	return min_level;
}

void
PokemonEncounterDetailResponse::setMinLevel(int min_level)
{
	this->min_level = min_level;
}



