

#include "PokemonSpeciesDetail_genera_inner.h"

using namespace Tiny;

PokemonSpeciesDetail_genera_inner::PokemonSpeciesDetail_genera_inner()
{
	genus = std::string();
	language = AbilityDetail_pokemon_inner_pokemon();
}

PokemonSpeciesDetail_genera_inner::PokemonSpeciesDetail_genera_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesDetail_genera_inner::~PokemonSpeciesDetail_genera_inner()
{

}

void
PokemonSpeciesDetail_genera_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *genusKey = "genus";

    if(object.has_key(genusKey))
    {
        bourne::json value = object[genusKey];



        jsonToValue(&genus, value, "std::string");


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonSpeciesDetail_genera_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["genus"] = getGenus();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonSpeciesDetail_genera_inner::getGenus()
{
	return genus;
}

void
PokemonSpeciesDetail_genera_inner::setGenus(std::string  genus)
{
	this->genus = genus;
}

AbilityDetail_pokemon_inner_pokemon
PokemonSpeciesDetail_genera_inner::getLanguage()
{
	return language;
}

void
PokemonSpeciesDetail_genera_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon  language)
{
	this->language = language;
}



