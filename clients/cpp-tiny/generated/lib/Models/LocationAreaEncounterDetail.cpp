

#include "LocationAreaEncounterDetail.h"

using namespace Tiny;

LocationAreaEncounterDetail::LocationAreaEncounterDetail()
{
	min_level = int(0);
	max_level = int(0);
	chance = int(0);
	method = null;
	condition_values = std::list<EncounterConditionValueSummary>();
	pokemon_details = null;
}

LocationAreaEncounterDetail::LocationAreaEncounterDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaEncounterDetail::~LocationAreaEncounterDetail()
{

}

void
LocationAreaEncounterDetail::fromJson(std::string jsonObj)
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




        EncounterMethodSummary* obj = &method;
		obj->fromJson(value.dump());

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

    const char *pokemon_detailsKey = "pokemon_details";

    if(object.has_key(pokemon_detailsKey))
    {
        bourne::json value = object[pokemon_detailsKey];




        EncounterPokemonDetail* obj = &pokemon_details;
		obj->fromJson(value.dump());

    }


}

bourne::json
LocationAreaEncounterDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["min_level"] = getMinLevel();






    object["max_level"] = getMaxLevel();






    object["chance"] = getChance();







	object["method"] = getMethod().toJson();




    std::list<EncounterConditionValueSummary> condition_values_list = getConditionValues();
    bourne::json condition_values_arr = bourne::json::array();

    for(auto& var : condition_values_list)
    {
        EncounterConditionValueSummary obj = var;
        condition_values_arr.append(obj.toJson());
    }
    object["condition_values"] = condition_values_arr;








	object["pokemon_details"] = getPokemonDetails().toJson();


    return object;

}

int
LocationAreaEncounterDetail::getMinLevel()
{
	return min_level;
}

void
LocationAreaEncounterDetail::setMinLevel(int min_level)
{
	this->min_level = min_level;
}

int
LocationAreaEncounterDetail::getMaxLevel()
{
	return max_level;
}

void
LocationAreaEncounterDetail::setMaxLevel(int max_level)
{
	this->max_level = max_level;
}

int
LocationAreaEncounterDetail::getChance()
{
	return chance;
}

void
LocationAreaEncounterDetail::setChance(int chance)
{
	this->chance = chance;
}

EncounterMethodSummary
LocationAreaEncounterDetail::getMethod()
{
	return method;
}

void
LocationAreaEncounterDetail::setMethod(EncounterMethodSummary method)
{
	this->method = method;
}

std::list<EncounterConditionValueSummary>
LocationAreaEncounterDetail::getConditionValues()
{
	return condition_values;
}

void
LocationAreaEncounterDetail::setConditionValues(std::list<EncounterConditionValueSummary> condition_values)
{
	this->condition_values = condition_values;
}

EncounterPokemonDetail
LocationAreaEncounterDetail::getPokemonDetails()
{
	return pokemon_details;
}

void
LocationAreaEncounterDetail::setPokemonDetails(EncounterPokemonDetail pokemon_details)
{
	this->pokemon_details = pokemon_details;
}



