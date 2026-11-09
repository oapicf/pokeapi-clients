

#include "PokemonShapeAwesomeName.h"

using namespace Tiny;

PokemonShapeAwesomeName::PokemonShapeAwesomeName()
{
	awesome_name = std::string();
	language = null;
}

PokemonShapeAwesomeName::PokemonShapeAwesomeName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonShapeAwesomeName::~PokemonShapeAwesomeName()
{

}

void
PokemonShapeAwesomeName::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *awesome_nameKey = "awesome_name";

    if(object.has_key(awesome_nameKey))
    {
        bourne::json value = object[awesome_nameKey];



        jsonToValue(&awesome_name, value, "std::string");


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
PokemonShapeAwesomeName::toJson()
{
    bourne::json object = bourne::json::object();





    object["awesome_name"] = getAwesomeName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonShapeAwesomeName::getAwesomeName()
{
	return awesome_name;
}

void
PokemonShapeAwesomeName::setAwesomeName(std::string awesome_name)
{
	this->awesome_name = awesome_name;
}

LanguageSummary
PokemonShapeAwesomeName::getLanguage()
{
	return language;
}

void
PokemonShapeAwesomeName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



