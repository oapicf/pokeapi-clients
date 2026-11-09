

#include "PokemonSpeciesPalParkEncounter.h"

using namespace Tiny;

PokemonSpeciesPalParkEncounter::PokemonSpeciesPalParkEncounter()
{
	base_score = int(0);
	rate = int(0);
	area = null;
}

PokemonSpeciesPalParkEncounter::PokemonSpeciesPalParkEncounter(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesPalParkEncounter::~PokemonSpeciesPalParkEncounter()
{

}

void
PokemonSpeciesPalParkEncounter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *base_scoreKey = "base_score";

    if(object.has_key(base_scoreKey))
    {
        bourne::json value = object[base_scoreKey];



        jsonToValue(&base_score, value, "int");


    }

    const char *rateKey = "rate";

    if(object.has_key(rateKey))
    {
        bourne::json value = object[rateKey];



        jsonToValue(&rate, value, "int");


    }

    const char *areaKey = "area";

    if(object.has_key(areaKey))
    {
        bourne::json value = object[areaKey];




        PalParkAreaSummary* obj = &area;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonSpeciesPalParkEncounter::toJson()
{
    bourne::json object = bourne::json::object();





    object["base_score"] = getBaseScore();






    object["rate"] = getRate();







	object["area"] = getArea().toJson();


    return object;

}

int
PokemonSpeciesPalParkEncounter::getBaseScore()
{
	return base_score;
}

void
PokemonSpeciesPalParkEncounter::setBaseScore(int base_score)
{
	this->base_score = base_score;
}

int
PokemonSpeciesPalParkEncounter::getRate()
{
	return rate;
}

void
PokemonSpeciesPalParkEncounter::setRate(int rate)
{
	this->rate = rate;
}

PalParkAreaSummary
PokemonSpeciesPalParkEncounter::getArea()
{
	return area;
}

void
PokemonSpeciesPalParkEncounter::setArea(PalParkAreaSummary area)
{
	this->area = area;
}



