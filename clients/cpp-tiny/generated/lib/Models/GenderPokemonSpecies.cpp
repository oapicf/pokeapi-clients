

#include "GenderPokemonSpecies.h"

using namespace Tiny;

GenderPokemonSpecies::GenderPokemonSpecies()
{
	rate = int(0);
	pokemon_species = null;
}

GenderPokemonSpecies::GenderPokemonSpecies(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenderPokemonSpecies::~GenderPokemonSpecies()
{

}

void
GenderPokemonSpecies::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
GenderPokemonSpecies::toJson()
{
    bourne::json object = bourne::json::object();





    object["rate"] = getRate();







	object["pokemon_species"] = getPokemonSpecies().toJson();


    return object;

}

int
GenderPokemonSpecies::getRate()
{
	return rate;
}

void
GenderPokemonSpecies::setRate(int rate)
{
	this->rate = rate;
}

PokemonSpeciesSummary
GenderPokemonSpecies::getPokemonSpecies()
{
	return pokemon_species;
}

void
GenderPokemonSpecies::setPokemonSpecies(PokemonSpeciesSummary pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



