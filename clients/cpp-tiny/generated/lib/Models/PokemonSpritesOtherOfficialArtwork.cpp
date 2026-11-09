

#include "PokemonSpritesOtherOfficialArtwork.h"

using namespace Tiny;

PokemonSpritesOtherOfficialArtwork::PokemonSpritesOtherOfficialArtwork()
{
	front_default = std::string();
	front_shiny = std::string();
	versions = null<std::map>();
}

PokemonSpritesOtherOfficialArtwork::PokemonSpritesOtherOfficialArtwork(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpritesOtherOfficialArtwork::~PokemonSpritesOtherOfficialArtwork()
{

}

void
PokemonSpritesOtherOfficialArtwork::fromJson(std::string jsonObj)
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

    const char *versionsKey = "versions";

    if(object.has_key(versionsKey))
    {
        bourne::json value = object[versionsKey];


    }


}

bourne::json
PokemonSpritesOtherOfficialArtwork::toJson()
{
    bourne::json object = bourne::json::object();





    object["front_default"] = getFrontDefault();






    object["front_shiny"] = getFrontShiny();






    return object;

}

std::string
PokemonSpritesOtherOfficialArtwork::getFrontDefault()
{
	return front_default;
}

void
PokemonSpritesOtherOfficialArtwork::setFrontDefault(std::string front_default)
{
	this->front_default = front_default;
}

std::string
PokemonSpritesOtherOfficialArtwork::getFrontShiny()
{
	return front_shiny;
}

void
PokemonSpritesOtherOfficialArtwork::setFrontShiny(std::string front_shiny)
{
	this->front_shiny = front_shiny;
}

std::map<std::string, std::map<std::string, AnyType>>
PokemonSpritesOtherOfficialArtwork::getVersions()
{
	return versions;
}

void
PokemonSpritesOtherOfficialArtwork::setVersions(std::map<std::string, std::map<std::string, AnyType>> versions)
{
	this->versions = versions;
}



