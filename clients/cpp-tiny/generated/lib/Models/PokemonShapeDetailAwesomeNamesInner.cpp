

#include "PokemonShapeDetail_awesome_names_inner.h"

using namespace Tiny;

PokemonShapeDetail_awesome_names_inner::PokemonShapeDetail_awesome_names_inner()
{
	awesome_name = std::string();
	language = AbilityDetail_pokemon_inner_pokemon();
}

PokemonShapeDetail_awesome_names_inner::PokemonShapeDetail_awesome_names_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonShapeDetail_awesome_names_inner::~PokemonShapeDetail_awesome_names_inner()
{

}

void
PokemonShapeDetail_awesome_names_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonShapeDetail_awesome_names_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["awesome_name"] = getAwesomeName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokemonShapeDetail_awesome_names_inner::getAwesomeName()
{
	return awesome_name;
}

void
PokemonShapeDetail_awesome_names_inner::setAwesomeName(std::string  awesome_name)
{
	this->awesome_name = awesome_name;
}

AbilityDetail_pokemon_inner_pokemon
PokemonShapeDetail_awesome_names_inner::getLanguage()
{
	return language;
}

void
PokemonShapeDetail_awesome_names_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon  language)
{
	this->language = language;
}



