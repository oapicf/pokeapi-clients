

#include "PokedexDetail_pokemon_entries_inner.h"

using namespace Tiny;

PokedexDetail_pokemon_entries_inner::PokedexDetail_pokemon_entries_inner()
{
	entry_number = int(0);
	pokemon_species = AbilityDetail_pokemon_inner_pokemon();
}

PokedexDetail_pokemon_entries_inner::PokedexDetail_pokemon_entries_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokedexDetail_pokemon_entries_inner::~PokedexDetail_pokemon_entries_inner()
{

}

void
PokedexDetail_pokemon_entries_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &pokemon_species;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokedexDetail_pokemon_entries_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["entry_number"] = getEntryNumber();







	object["pokemon_species"] = getPokemonSpecies().toJson();


    return object;

}

int
PokedexDetail_pokemon_entries_inner::getEntryNumber()
{
	return entry_number;
}

void
PokedexDetail_pokemon_entries_inner::setEntryNumber(int  entry_number)
{
	this->entry_number = entry_number;
}

AbilityDetail_pokemon_inner_pokemon
PokedexDetail_pokemon_entries_inner::getPokemonSpecies()
{
	return pokemon_species;
}

void
PokedexDetail_pokemon_entries_inner::setPokemonSpecies(AbilityDetail_pokemon_inner_pokemon  pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



