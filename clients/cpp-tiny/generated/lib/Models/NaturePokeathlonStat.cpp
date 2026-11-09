

#include "NaturePokeathlonStat.h"

using namespace Tiny;

NaturePokeathlonStat::NaturePokeathlonStat()
{
	max_change = int(0);
	pokeathlon_stat = null;
}

NaturePokeathlonStat::NaturePokeathlonStat(std::string jsonString)
{
	this->fromJson(jsonString);
}

NaturePokeathlonStat::~NaturePokeathlonStat()
{

}

void
NaturePokeathlonStat::fromJson(std::string jsonObj)
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




        PokeathlonStatSummary* obj = &pokeathlon_stat;
		obj->fromJson(value.dump());

    }


}

bourne::json
NaturePokeathlonStat::toJson()
{
    bourne::json object = bourne::json::object();





    object["max_change"] = getMaxChange();







	object["pokeathlon_stat"] = getPokeathlonStat().toJson();


    return object;

}

int
NaturePokeathlonStat::getMaxChange()
{
	return max_change;
}

void
NaturePokeathlonStat::setMaxChange(int max_change)
{
	this->max_change = max_change;
}

PokeathlonStatSummary
NaturePokeathlonStat::getPokeathlonStat()
{
	return pokeathlon_stat;
}

void
NaturePokeathlonStat::setPokeathlonStat(PokeathlonStatSummary pokeathlon_stat)
{
	this->pokeathlon_stat = pokeathlon_stat;
}



