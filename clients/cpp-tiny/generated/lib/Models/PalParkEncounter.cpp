

#include "PalParkEncounter.h"

using namespace Tiny;

PalParkEncounter::PalParkEncounter()
{
	base_score = int(0);
	rate = int(0);
	pokemon_species = null;
}

PalParkEncounter::PalParkEncounter(std::string jsonString)
{
	this->fromJson(jsonString);
}

PalParkEncounter::~PalParkEncounter()
{

}

void
PalParkEncounter::fromJson(std::string jsonObj)
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

    const char *pokemon_speciesKey = "pokemon_species";

    if(object.has_key(pokemon_speciesKey))
    {
        bourne::json value = object[pokemon_speciesKey];




        PokemonSpeciesSummary* obj = &pokemon_species;
		obj->fromJson(value.dump());

    }


}

bourne::json
PalParkEncounter::toJson()
{
    bourne::json object = bourne::json::object();





    object["base_score"] = getBaseScore();






    object["rate"] = getRate();







	object["pokemon_species"] = getPokemonSpecies().toJson();


    return object;

}

int
PalParkEncounter::getBaseScore()
{
	return base_score;
}

void
PalParkEncounter::setBaseScore(int base_score)
{
	this->base_score = base_score;
}

int
PalParkEncounter::getRate()
{
	return rate;
}

void
PalParkEncounter::setRate(int rate)
{
	this->rate = rate;
}

PokemonSpeciesSummary
PalParkEncounter::getPokemonSpecies()
{
	return pokemon_species;
}

void
PalParkEncounter::setPokemonSpecies(PokemonSpeciesSummary pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



