

#include "PokemonDexEntry.h"

using namespace Tiny;

PokemonDexEntry::PokemonDexEntry()
{
	entry_number = int(0);
	pokedex = PokedexSummary();
}

PokemonDexEntry::PokemonDexEntry(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDexEntry::~PokemonDexEntry()
{

}

void
PokemonDexEntry::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *entry_numberKey = "entry_number";

    if(object.has_key(entry_numberKey))
    {
        bourne::json value = object[entry_numberKey];



        jsonToValue(&entry_number, value, "int");


    }

    const char *pokedexKey = "pokedex";

    if(object.has_key(pokedexKey))
    {
        bourne::json value = object[pokedexKey];




        PokedexSummary* obj = &pokedex;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonDexEntry::toJson()
{
    bourne::json object = bourne::json::object();





    object["entry_number"] = getEntryNumber();







	object["pokedex"] = getPokedex().toJson();


    return object;

}

int
PokemonDexEntry::getEntryNumber()
{
	return entry_number;
}

void
PokemonDexEntry::setEntryNumber(int  entry_number)
{
	this->entry_number = entry_number;
}

PokedexSummary
PokemonDexEntry::getPokedex()
{
	return pokedex;
}

void
PokemonDexEntry::setPokedex(PokedexSummary  pokedex)
{
	this->pokedex = pokedex;
}



