

#include "PokemonColorName.h"

using namespace Tiny;

PokemonColorName::PokemonColorName()
{
	name = std::string();
	language = LanguageSummary();
}

PokemonColorName::PokemonColorName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonColorName::~PokemonColorName()
{

}

void
PokemonColorName::fromJson(std::string jsonObj)
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
PokemonColorName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonColorName::getName()
{
	return name;
}

void
PokemonColorName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
PokemonColorName::getLanguage()
{
	return language;
}

void
PokemonColorName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



