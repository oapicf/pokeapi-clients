

#include "PokemonSpritesOtherHome.h"

using namespace Tiny;

PokemonSpritesOtherHome::PokemonSpritesOtherHome()
{
	front_default = std::string();
	front_female = std::string();
	front_shiny = std::string();
	front_shiny_female = std::string();
}

PokemonSpritesOtherHome::PokemonSpritesOtherHome(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpritesOtherHome::~PokemonSpritesOtherHome()
{

}

void
PokemonSpritesOtherHome::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *front_defaultKey = "front_default";

    if(object.has_key(front_defaultKey))
    {
        bourne::json value = object[front_defaultKey];



        jsonToValue(&front_default, value, "std::string");


    }

    const char *front_femaleKey = "front_female";

    if(object.has_key(front_femaleKey))
    {
        bourne::json value = object[front_femaleKey];



        jsonToValue(&front_female, value, "std::string");


    }

    const char *front_shinyKey = "front_shiny";

    if(object.has_key(front_shinyKey))
    {
        bourne::json value = object[front_shinyKey];



        jsonToValue(&front_shiny, value, "std::string");


    }

    const char *front_shiny_femaleKey = "front_shiny_female";

    if(object.has_key(front_shiny_femaleKey))
    {
        bourne::json value = object[front_shiny_femaleKey];



        jsonToValue(&front_shiny_female, value, "std::string");


    }


}

bourne::json
PokemonSpritesOtherHome::toJson()
{
    bourne::json object = bourne::json::object();





    object["front_default"] = getFrontDefault();






    object["front_female"] = getFrontFemale();






    object["front_shiny"] = getFrontShiny();






    object["front_shiny_female"] = getFrontShinyFemale();



    return object;

}

std::string
PokemonSpritesOtherHome::getFrontDefault()
{
	return front_default;
}

void
PokemonSpritesOtherHome::setFrontDefault(std::string front_default)
{
	this->front_default = front_default;
}

std::string
PokemonSpritesOtherHome::getFrontFemale()
{
	return front_female;
}

void
PokemonSpritesOtherHome::setFrontFemale(std::string front_female)
{
	this->front_female = front_female;
}

std::string
PokemonSpritesOtherHome::getFrontShiny()
{
	return front_shiny;
}

void
PokemonSpritesOtherHome::setFrontShiny(std::string front_shiny)
{
	this->front_shiny = front_shiny;
}

std::string
PokemonSpritesOtherHome::getFrontShinyFemale()
{
	return front_shiny_female;
}

void
PokemonSpritesOtherHome::setFrontShinyFemale(std::string front_shiny_female)
{
	this->front_shiny_female = front_shiny_female;
}



