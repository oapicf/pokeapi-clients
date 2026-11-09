

#include "PokemonDexNumber.h"

using namespace Tiny;

PokemonDexNumber::PokemonDexNumber()
{
	entry_number = int(0);
	pokemon_species = null;
}

PokemonDexNumber::PokemonDexNumber(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDexNumber::~PokemonDexNumber()
{

}

void
PokemonDexNumber::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *entry_numberKey = "entry_number";

    if(object.has_key(entry_numberKey))
    {
        bourne::json value = object[entry_numberKey];



        jsonToValue(&entry_number, value, "int");


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
PokemonDexNumber::toJson()
{
    bourne::json object = bourne::json::object();





    object["entry_number"] = getEntryNumber();







	object["pokemon_species"] = getPokemonSpecies().toJson();


    return object;

}

int
PokemonDexNumber::getEntryNumber()
{
	return entry_number;
}

void
PokemonDexNumber::setEntryNumber(int entry_number)
{
	this->entry_number = entry_number;
}

PokemonSpeciesSummary
PokemonDexNumber::getPokemonSpecies()
{
	return pokemon_species;
}

void
PokemonDexNumber::setPokemonSpecies(PokemonSpeciesSummary pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



