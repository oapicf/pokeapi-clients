

#include "PokemonSpeciesName.h"

using namespace Tiny;

PokemonSpeciesName::PokemonSpeciesName()
{
	name = std::string();
	language = null;
}

PokemonSpeciesName::PokemonSpeciesName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesName::~PokemonSpeciesName()
{

}

void
PokemonSpeciesName::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


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
PokemonSpeciesName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonSpeciesName::getName()
{
	return name;
}

void
PokemonSpeciesName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
PokemonSpeciesName::getLanguage()
{
	return language;
}

void
PokemonSpeciesName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



