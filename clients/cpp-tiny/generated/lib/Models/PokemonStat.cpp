

#include "PokemonStat.h"

using namespace Tiny;

PokemonStat::PokemonStat()
{
	base_stat = int(0);
	effort = int(0);
	stat = StatSummary();
}

PokemonStat::PokemonStat(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonStat::~PokemonStat()
{

}

void
PokemonStat::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *base_statKey = "base_stat";

    if(object.has_key(base_statKey))
    {
        bourne::json value = object[base_statKey];



        jsonToValue(&base_stat, value, "int");


    }

    const char *effortKey = "effort";

    if(object.has_key(effortKey))
    {
        bourne::json value = object[effortKey];



        jsonToValue(&effort, value, "int");


    }

    const char *statKey = "stat";

    if(object.has_key(statKey))
    {
        bourne::json value = object[statKey];




        StatSummary* obj = &stat;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonStat::toJson()
{
    bourne::json object = bourne::json::object();





    object["base_stat"] = getBaseStat();






    object["effort"] = getEffort();







	object["stat"] = getStat().toJson();


    return object;

}

int
PokemonStat::getBaseStat()
{
	return base_stat;
}

void
PokemonStat::setBaseStat(int base_stat)
{
	this->base_stat = base_stat;
}

int
PokemonStat::getEffort()
{
	return effort;
}

void
PokemonStat::setEffort(int effort)
{
	this->effort = effort;
}

StatSummary
PokemonStat::getStat()
{
	return stat;
}

void
PokemonStat::setStat(StatSummary stat)
{
	this->stat = stat;
}



