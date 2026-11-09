

#include "PokemonFormName.h"

using namespace Tiny;

PokemonFormName::PokemonFormName()
{
	name = std::string();
	language = null;
}

PokemonFormName::PokemonFormName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormName::~PokemonFormName()
{

}

void
PokemonFormName::fromJson(std::string jsonObj)
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
PokemonFormName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonFormName::getName()
{
	return name;
}

void
PokemonFormName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
PokemonFormName::getLanguage()
{
	return language;
}

void
PokemonFormName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



