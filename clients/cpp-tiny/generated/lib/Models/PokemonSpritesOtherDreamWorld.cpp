

#include "PokemonSpritesOtherDreamWorld.h"

using namespace Tiny;

PokemonSpritesOtherDreamWorld::PokemonSpritesOtherDreamWorld()
{
	front_default = std::string();
	front_female = std::string();
}

PokemonSpritesOtherDreamWorld::PokemonSpritesOtherDreamWorld(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpritesOtherDreamWorld::~PokemonSpritesOtherDreamWorld()
{

}

void
PokemonSpritesOtherDreamWorld::fromJson(std::string jsonObj)
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


}

bourne::json
PokemonSpritesOtherDreamWorld::toJson()
{
    bourne::json object = bourne::json::object();





    object["front_default"] = getFrontDefault();






    object["front_female"] = getFrontFemale();



    return object;

}

std::string
PokemonSpritesOtherDreamWorld::getFrontDefault()
{
	return front_default;
}

void
PokemonSpritesOtherDreamWorld::setFrontDefault(std::string front_default)
{
	this->front_default = front_default;
}

std::string
PokemonSpritesOtherDreamWorld::getFrontFemale()
{
	return front_female;
}

void
PokemonSpritesOtherDreamWorld::setFrontFemale(std::string front_female)
{
	this->front_female = front_female;
}



