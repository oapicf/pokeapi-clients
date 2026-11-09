

#include "PokemonFormSprites.h"

using namespace Tiny;

PokemonFormSprites::PokemonFormSprites()
{
	front_default = std::string();
	front_shiny = std::string();
	front_female = std::string();
	front_shiny_female = std::string();
	back_default = std::string();
	back_shiny = std::string();
	back_female = std::string();
	back_shiny_female = std::string();
	other = null;
	versions = null<std::map>();
}

PokemonFormSprites::PokemonFormSprites(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormSprites::~PokemonFormSprites()
{

}

void
PokemonFormSprites::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *front_defaultKey = "front_default";

    if(object.has_key(front_defaultKey))
    {
        bourne::json value = object[front_defaultKey];



        jsonToValue(&front_default, value, "std::string");


    }

    const char *front_shinyKey = "front_shiny";

    if(object.has_key(front_shinyKey))
    {
        bourne::json value = object[front_shinyKey];



        jsonToValue(&front_shiny, value, "std::string");


    }

    const char *front_femaleKey = "front_female";

    if(object.has_key(front_femaleKey))
    {
        bourne::json value = object[front_femaleKey];



        jsonToValue(&front_female, value, "std::string");


    }

    const char *front_shiny_femaleKey = "front_shiny_female";

    if(object.has_key(front_shiny_femaleKey))
    {
        bourne::json value = object[front_shiny_femaleKey];



        jsonToValue(&front_shiny_female, value, "std::string");


    }

    const char *back_defaultKey = "back_default";

    if(object.has_key(back_defaultKey))
    {
        bourne::json value = object[back_defaultKey];



        jsonToValue(&back_default, value, "std::string");


    }

    const char *back_shinyKey = "back_shiny";

    if(object.has_key(back_shinyKey))
    {
        bourne::json value = object[back_shinyKey];



        jsonToValue(&back_shiny, value, "std::string");


    }

    const char *back_femaleKey = "back_female";

    if(object.has_key(back_femaleKey))
    {
        bourne::json value = object[back_femaleKey];



        jsonToValue(&back_female, value, "std::string");


    }

    const char *back_shiny_femaleKey = "back_shiny_female";

    if(object.has_key(back_shiny_femaleKey))
    {
        bourne::json value = object[back_shiny_femaleKey];



        jsonToValue(&back_shiny_female, value, "std::string");


    }

    const char *otherKey = "other";

    if(object.has_key(otherKey))
    {
        bourne::json value = object[otherKey];




        PokemonSpritesOther* obj = &other;
		obj->fromJson(value.dump());

    }

    const char *versionsKey = "versions";

    if(object.has_key(versionsKey))
    {
        bourne::json value = object[versionsKey];


    }


}

bourne::json
PokemonFormSprites::toJson()
{
    bourne::json object = bourne::json::object();





    object["front_default"] = getFrontDefault();






    object["front_shiny"] = getFrontShiny();






    object["front_female"] = getFrontFemale();






    object["front_shiny_female"] = getFrontShinyFemale();






    object["back_default"] = getBackDefault();






    object["back_shiny"] = getBackShiny();






    object["back_female"] = getBackFemale();






    object["back_shiny_female"] = getBackShinyFemale();







	object["other"] = getOther().toJson();





    return object;

}

std::string
PokemonFormSprites::getFrontDefault()
{
	return front_default;
}

void
PokemonFormSprites::setFrontDefault(std::string front_default)
{
	this->front_default = front_default;
}

std::string
PokemonFormSprites::getFrontShiny()
{
	return front_shiny;
}

void
PokemonFormSprites::setFrontShiny(std::string front_shiny)
{
	this->front_shiny = front_shiny;
}

std::string
PokemonFormSprites::getFrontFemale()
{
	return front_female;
}

void
PokemonFormSprites::setFrontFemale(std::string front_female)
{
	this->front_female = front_female;
}

std::string
PokemonFormSprites::getFrontShinyFemale()
{
	return front_shiny_female;
}

void
PokemonFormSprites::setFrontShinyFemale(std::string front_shiny_female)
{
	this->front_shiny_female = front_shiny_female;
}

std::string
PokemonFormSprites::getBackDefault()
{
	return back_default;
}

void
PokemonFormSprites::setBackDefault(std::string back_default)
{
	this->back_default = back_default;
}

std::string
PokemonFormSprites::getBackShiny()
{
	return back_shiny;
}

void
PokemonFormSprites::setBackShiny(std::string back_shiny)
{
	this->back_shiny = back_shiny;
}

std::string
PokemonFormSprites::getBackFemale()
{
	return back_female;
}

void
PokemonFormSprites::setBackFemale(std::string back_female)
{
	this->back_female = back_female;
}

std::string
PokemonFormSprites::getBackShinyFemale()
{
	return back_shiny_female;
}

void
PokemonFormSprites::setBackShinyFemale(std::string back_shiny_female)
{
	this->back_shiny_female = back_shiny_female;
}

PokemonSpritesOther
PokemonFormSprites::getOther()
{
	return other;
}

void
PokemonFormSprites::setOther(PokemonSpritesOther other)
{
	this->other = other;
}

std::map<std::string, std::map<std::string, AnyType>>
PokemonFormSprites::getVersions()
{
	return versions;
}

void
PokemonFormSprites::setVersions(std::map<std::string, std::map<std::string, AnyType>> versions)
{
	this->versions = versions;
}



