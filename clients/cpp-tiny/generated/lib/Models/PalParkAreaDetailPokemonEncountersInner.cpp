

#include "PalParkAreaDetail_pokemon_encounters_inner.h"

using namespace Tiny;

PalParkAreaDetail_pokemon_encounters_inner::PalParkAreaDetail_pokemon_encounters_inner()
{
	base_score = int(0);
	pokemonspecies = AbilityDetail_pokemon_inner_pokemon();
	rate = int(0);
}

PalParkAreaDetail_pokemon_encounters_inner::PalParkAreaDetail_pokemon_encounters_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PalParkAreaDetail_pokemon_encounters_inner::~PalParkAreaDetail_pokemon_encounters_inner()
{

}

void
PalParkAreaDetail_pokemon_encounters_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *base_scoreKey = "base_score";

    if(object.has_key(base_scoreKey))
    {
        bourne::json value = object[base_scoreKey];



        jsonToValue(&base_score, value, "int");


    }

    const char *pokemonspeciesKey = "pokemon-species";

    if(object.has_key(pokemonspeciesKey))
    {
        bourne::json value = object[pokemonspeciesKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &pokemonspecies;
		obj->fromJson(value.dump());

    }

    const char *rateKey = "rate";

    if(object.has_key(rateKey))
    {
        bourne::json value = object[rateKey];



        jsonToValue(&rate, value, "int");


    }


}

bourne::json
PalParkAreaDetail_pokemon_encounters_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["base_score"] = getBaseScore();







	object["pokemonspecies"] = getPokemonspecies().toJson();





    object["rate"] = getRate();



    return object;

}

int
PalParkAreaDetail_pokemon_encounters_inner::getBaseScore()
{
	return base_score;
}

void
PalParkAreaDetail_pokemon_encounters_inner::setBaseScore(int base_score)
{
	this->base_score = base_score;
}

AbilityDetail_pokemon_inner_pokemon
PalParkAreaDetail_pokemon_encounters_inner::getPokemonspecies()
{
	return pokemonspecies;
}

void
PalParkAreaDetail_pokemon_encounters_inner::setPokemonspecies(AbilityDetail_pokemon_inner_pokemon pokemonspecies)
{
	this->pokemonspecies = pokemonspecies;
}

int
PalParkAreaDetail_pokemon_encounters_inner::getRate()
{
	return rate;
}

void
PalParkAreaDetail_pokemon_encounters_inner::setRate(int rate)
{
	this->rate = rate;
}



