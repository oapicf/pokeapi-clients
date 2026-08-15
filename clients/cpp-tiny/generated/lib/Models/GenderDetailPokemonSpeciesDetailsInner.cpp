

#include "GenderDetail_pokemon_species_details_inner.h"

using namespace Tiny;

GenderDetail_pokemon_species_details_inner::GenderDetail_pokemon_species_details_inner()
{
	rate = int(0);
	pokemon_species = AbilityDetail_pokemon_inner_pokemon();
}

GenderDetail_pokemon_species_details_inner::GenderDetail_pokemon_species_details_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenderDetail_pokemon_species_details_inner::~GenderDetail_pokemon_species_details_inner()
{

}

void
GenderDetail_pokemon_species_details_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &pokemon_species;
		obj->fromJson(value.dump());

    }


}

bourne::json
GenderDetail_pokemon_species_details_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["rate"] = getRate();







	object["pokemon_species"] = getPokemonSpecies().toJson();


    return object;

}

int
GenderDetail_pokemon_species_details_inner::getRate()
{
	return rate;
}

void
GenderDetail_pokemon_species_details_inner::setRate(int  rate)
{
	this->rate = rate;
}

AbilityDetail_pokemon_inner_pokemon
GenderDetail_pokemon_species_details_inner::getPokemonSpecies()
{
	return pokemon_species;
}

void
GenderDetail_pokemon_species_details_inner::setPokemonSpecies(AbilityDetail_pokemon_inner_pokemon  pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



