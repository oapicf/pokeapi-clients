

#include "PokemonSpeciesDetail_pal_park_encounters_inner.h"

using namespace Tiny;

PokemonSpeciesDetail_pal_park_encounters_inner::PokemonSpeciesDetail_pal_park_encounters_inner()
{
	area = AbilityDetail_pokemon_inner_pokemon();
	base_score = int(0);
	rate = int(0);
}

PokemonSpeciesDetail_pal_park_encounters_inner::PokemonSpeciesDetail_pal_park_encounters_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesDetail_pal_park_encounters_inner::~PokemonSpeciesDetail_pal_park_encounters_inner()
{

}

void
PokemonSpeciesDetail_pal_park_encounters_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *areaKey = "area";

    if(object.has_key(areaKey))
    {
        bourne::json value = object[areaKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &area;
		obj->fromJson(value.dump());

    }

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


}

bourne::json
PokemonSpeciesDetail_pal_park_encounters_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["area"] = getArea().toJson();





    object["base_score"] = getBaseScore();






    object["rate"] = getRate();



    return object;

}

AbilityDetail_pokemon_inner_pokemon
PokemonSpeciesDetail_pal_park_encounters_inner::getArea()
{
	return area;
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::setArea(AbilityDetail_pokemon_inner_pokemon area)
{
	this->area = area;
}

int
PokemonSpeciesDetail_pal_park_encounters_inner::getBaseScore()
{
	return base_score;
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::setBaseScore(int base_score)
{
	this->base_score = base_score;
}

int
PokemonSpeciesDetail_pal_park_encounters_inner::getRate()
{
	return rate;
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::setRate(int rate)
{
	this->rate = rate;
}



