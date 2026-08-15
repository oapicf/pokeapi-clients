

#include "TypeDetail_damage_relations.h"

using namespace Tiny;

TypeDetail_damage_relations::TypeDetail_damage_relations()
{
	no_damage_to = std::list<AbilityDetail_pokemon_inner_pokemon>();
	half_damage_to = std::list<AbilityDetail_pokemon_inner_pokemon>();
	double_damage_to = std::list<AbilityDetail_pokemon_inner_pokemon>();
	no_damage_from = std::list<AbilityDetail_pokemon_inner_pokemon>();
	half_damage_from = std::list<AbilityDetail_pokemon_inner_pokemon>();
	double_damage_from = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

TypeDetail_damage_relations::TypeDetail_damage_relations(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeDetail_damage_relations::~TypeDetail_damage_relations()
{

}

void
TypeDetail_damage_relations::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *no_damage_toKey = "no_damage_to";

    if(object.has_key(no_damage_toKey))
    {
        bourne::json value = object[no_damage_toKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> no_damage_to_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            no_damage_to_list.push_back(element);
        }
        no_damage_to = no_damage_to_list;


    }

    const char *half_damage_toKey = "half_damage_to";

    if(object.has_key(half_damage_toKey))
    {
        bourne::json value = object[half_damage_toKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> half_damage_to_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            half_damage_to_list.push_back(element);
        }
        half_damage_to = half_damage_to_list;


    }

    const char *double_damage_toKey = "double_damage_to";

    if(object.has_key(double_damage_toKey))
    {
        bourne::json value = object[double_damage_toKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> double_damage_to_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            double_damage_to_list.push_back(element);
        }
        double_damage_to = double_damage_to_list;


    }

    const char *no_damage_fromKey = "no_damage_from";

    if(object.has_key(no_damage_fromKey))
    {
        bourne::json value = object[no_damage_fromKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> no_damage_from_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            no_damage_from_list.push_back(element);
        }
        no_damage_from = no_damage_from_list;


    }

    const char *half_damage_fromKey = "half_damage_from";

    if(object.has_key(half_damage_fromKey))
    {
        bourne::json value = object[half_damage_fromKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> half_damage_from_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            half_damage_from_list.push_back(element);
        }
        half_damage_from = half_damage_from_list;


    }

    const char *double_damage_fromKey = "double_damage_from";

    if(object.has_key(double_damage_fromKey))
    {
        bourne::json value = object[double_damage_fromKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> double_damage_from_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            double_damage_from_list.push_back(element);
        }
        double_damage_from = double_damage_from_list;


    }


}

bourne::json
TypeDetail_damage_relations::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AbilityDetail_pokemon_inner_pokemon> no_damage_to_list = getNoDamageTo();
    bourne::json no_damage_to_arr = bourne::json::array();

    for(auto& var : no_damage_to_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        no_damage_to_arr.append(obj.toJson());
    }
    object["no_damage_to"] = no_damage_to_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> half_damage_to_list = getHalfDamageTo();
    bourne::json half_damage_to_arr = bourne::json::array();

    for(auto& var : half_damage_to_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        half_damage_to_arr.append(obj.toJson());
    }
    object["half_damage_to"] = half_damage_to_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> double_damage_to_list = getDoubleDamageTo();
    bourne::json double_damage_to_arr = bourne::json::array();

    for(auto& var : double_damage_to_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        double_damage_to_arr.append(obj.toJson());
    }
    object["double_damage_to"] = double_damage_to_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> no_damage_from_list = getNoDamageFrom();
    bourne::json no_damage_from_arr = bourne::json::array();

    for(auto& var : no_damage_from_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        no_damage_from_arr.append(obj.toJson());
    }
    object["no_damage_from"] = no_damage_from_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> half_damage_from_list = getHalfDamageFrom();
    bourne::json half_damage_from_arr = bourne::json::array();

    for(auto& var : half_damage_from_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        half_damage_from_arr.append(obj.toJson());
    }
    object["half_damage_from"] = half_damage_from_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> double_damage_from_list = getDoubleDamageFrom();
    bourne::json double_damage_from_arr = bourne::json::array();

    for(auto& var : double_damage_from_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        double_damage_from_arr.append(obj.toJson());
    }
    object["double_damage_from"] = double_damage_from_arr;




    return object;

}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_damage_relations::getNoDamageTo()
{
	return no_damage_to;
}

void
TypeDetail_damage_relations::setNoDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> no_damage_to)
{
	this->no_damage_to = no_damage_to;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_damage_relations::getHalfDamageTo()
{
	return half_damage_to;
}

void
TypeDetail_damage_relations::setHalfDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> half_damage_to)
{
	this->half_damage_to = half_damage_to;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_damage_relations::getDoubleDamageTo()
{
	return double_damage_to;
}

void
TypeDetail_damage_relations::setDoubleDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> double_damage_to)
{
	this->double_damage_to = double_damage_to;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_damage_relations::getNoDamageFrom()
{
	return no_damage_from;
}

void
TypeDetail_damage_relations::setNoDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> no_damage_from)
{
	this->no_damage_from = no_damage_from;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_damage_relations::getHalfDamageFrom()
{
	return half_damage_from;
}

void
TypeDetail_damage_relations::setHalfDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> half_damage_from)
{
	this->half_damage_from = half_damage_from;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_damage_relations::getDoubleDamageFrom()
{
	return double_damage_from;
}

void
TypeDetail_damage_relations::setDoubleDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> double_damage_from)
{
	this->double_damage_from = double_damage_from;
}



