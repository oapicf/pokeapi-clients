

#include "StatDetail_affecting_natures.h"

using namespace Tiny;

StatDetail_affecting_natures::StatDetail_affecting_natures()
{
	increase = std::list<AbilityDetail_pokemon_inner_pokemon>();
	decrease = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

StatDetail_affecting_natures::StatDetail_affecting_natures(std::string jsonString)
{
	this->fromJson(jsonString);
}

StatDetail_affecting_natures::~StatDetail_affecting_natures()
{

}

void
StatDetail_affecting_natures::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *increaseKey = "increase";

    if(object.has_key(increaseKey))
    {
        bourne::json value = object[increaseKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> increase_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            increase_list.push_back(element);
        }
        increase = increase_list;


    }

    const char *decreaseKey = "decrease";

    if(object.has_key(decreaseKey))
    {
        bourne::json value = object[decreaseKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> decrease_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            decrease_list.push_back(element);
        }
        decrease = decrease_list;


    }


}

bourne::json
StatDetail_affecting_natures::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AbilityDetail_pokemon_inner_pokemon> increase_list = getIncrease();
    bourne::json increase_arr = bourne::json::array();

    for(auto& var : increase_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        increase_arr.append(obj.toJson());
    }
    object["increase"] = increase_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> decrease_list = getDecrease();
    bourne::json decrease_arr = bourne::json::array();

    for(auto& var : decrease_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        decrease_arr.append(obj.toJson());
    }
    object["decrease"] = decrease_arr;




    return object;

}

std::list<AbilityDetail_pokemon_inner_pokemon>
StatDetail_affecting_natures::getIncrease()
{
	return increase;
}

void
StatDetail_affecting_natures::setIncrease(std::list<AbilityDetail_pokemon_inner_pokemon> increase)
{
	this->increase = increase;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
StatDetail_affecting_natures::getDecrease()
{
	return decrease;
}

void
StatDetail_affecting_natures::setDecrease(std::list<AbilityDetail_pokemon_inner_pokemon> decrease)
{
	this->decrease = decrease;
}



