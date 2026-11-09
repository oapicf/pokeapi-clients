

#include "PokemonSpeciesGenus.h"

using namespace Tiny;

PokemonSpeciesGenus::PokemonSpeciesGenus()
{
	genus = std::string();
	language = null;
}

PokemonSpeciesGenus::PokemonSpeciesGenus(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesGenus::~PokemonSpeciesGenus()
{

}

void
PokemonSpeciesGenus::fromJson(std::string jsonObj)
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




        LanguageSummary* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonSpeciesGenus::toJson()
{
    bourne::json object = bourne::json::object();





    object["genus"] = getGenus();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonSpeciesGenus::getGenus()
{
	return genus;
}

void
PokemonSpeciesGenus::setGenus(std::string genus)
{
	this->genus = genus;
}

LanguageSummary
PokemonSpeciesGenus::getLanguage()
{
	return language;
}

void
PokemonSpeciesGenus::setLanguage(LanguageSummary language)
{
	this->language = language;
}



