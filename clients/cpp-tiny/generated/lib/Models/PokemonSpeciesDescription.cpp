

#include "PokemonSpeciesDescription.h"

using namespace Tiny;

PokemonSpeciesDescription::PokemonSpeciesDescription()
{
	description = std::string();
	language = LanguageSummary();
}

PokemonSpeciesDescription::PokemonSpeciesDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesDescription::~PokemonSpeciesDescription()
{

}

void
PokemonSpeciesDescription::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


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
PokemonSpeciesDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonSpeciesDescription::getDescription()
{
	return description;
}

void
PokemonSpeciesDescription::setDescription(std::string  description)
{
	this->description = description;
}

LanguageSummary
PokemonSpeciesDescription::getLanguage()
{
	return language;
}

void
PokemonSpeciesDescription::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



