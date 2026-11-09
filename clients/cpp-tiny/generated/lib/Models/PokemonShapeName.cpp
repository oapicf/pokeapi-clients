

#include "PokemonShapeName.h"

using namespace Tiny;

PokemonShapeName::PokemonShapeName()
{
	name = std::string();
	language = null;
}

PokemonShapeName::PokemonShapeName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonShapeName::~PokemonShapeName()
{

}

void
PokemonShapeName::fromJson(std::string jsonObj)
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
PokemonShapeName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonShapeName::getName()
{
	return name;
}

void
PokemonShapeName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
PokemonShapeName::getLanguage()
{
	return language;
}

void
PokemonShapeName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



