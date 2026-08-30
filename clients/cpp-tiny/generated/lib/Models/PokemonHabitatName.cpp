

#include "PokemonHabitatName.h"

using namespace Tiny;

PokemonHabitatName::PokemonHabitatName()
{
	name = std::string();
	language = LanguageSummary();
}

PokemonHabitatName::PokemonHabitatName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonHabitatName::~PokemonHabitatName()
{

}

void
PokemonHabitatName::fromJson(std::string jsonObj)
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
PokemonHabitatName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonHabitatName::getName()
{
	return name;
}

void
PokemonHabitatName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
PokemonHabitatName::getLanguage()
{
	return language;
}

void
PokemonHabitatName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



