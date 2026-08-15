

#include "PokemonFormDetail_form_names_inner.h"

using namespace Tiny;

PokemonFormDetail_form_names_inner::PokemonFormDetail_form_names_inner()
{
	language = AbilityDetail_pokemon_inner_pokemon();
	name = std::string();
}

PokemonFormDetail_form_names_inner::PokemonFormDetail_form_names_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormDetail_form_names_inner::~PokemonFormDetail_form_names_inner()
{

}

void
PokemonFormDetail_form_names_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &language;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
PokemonFormDetail_form_names_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["language"] = getLanguage().toJson();





    object["name"] = getName();



    return object;

}

AbilityDetail_pokemon_inner_pokemon
PokemonFormDetail_form_names_inner::getLanguage()
{
	return language;
}

void
PokemonFormDetail_form_names_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon  language)
{
	this->language = language;
}

std::string
PokemonFormDetail_form_names_inner::getName()
{
	return name;
}

void
PokemonFormDetail_form_names_inner::setName(std::string  name)
{
	this->name = name;
}



