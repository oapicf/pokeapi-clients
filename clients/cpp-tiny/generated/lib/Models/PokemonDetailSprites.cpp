

#include "PokemonDetail_sprites.h"

using namespace Tiny;

PokemonDetail_sprites::PokemonDetail_sprites()
{
	front_default = std::string();
}

PokemonDetail_sprites::PokemonDetail_sprites(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_sprites::~PokemonDetail_sprites()
{

}

void
PokemonDetail_sprites::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *front_defaultKey = "front_default";

    if(object.has_key(front_defaultKey))
    {
        bourne::json value = object[front_defaultKey];



        jsonToValue(&front_default, value, "std::string");


    }


}

bourne::json
PokemonDetail_sprites::toJson()
{
    bourne::json object = bourne::json::object();





    object["front_default"] = getFrontDefault();



    return object;

}

std::string
PokemonDetail_sprites::getFrontDefault()
{
	return front_default;
}

void
PokemonDetail_sprites::setFrontDefault(std::string  front_default)
{
	this->front_default = front_default;
}



