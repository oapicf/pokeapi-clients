

#include "PokemonFormDetail_sprites.h"

using namespace Tiny;

PokemonFormDetail_sprites::PokemonFormDetail_sprites()
{
	r_default = std::string();
}

PokemonFormDetail_sprites::PokemonFormDetail_sprites(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormDetail_sprites::~PokemonFormDetail_sprites()
{

}

void
PokemonFormDetail_sprites::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *r_defaultKey = "default";

    if(object.has_key(r_defaultKey))
    {
        bourne::json value = object[r_defaultKey];



        jsonToValue(&r_default, value, "std::string");


    }


}

bourne::json
PokemonFormDetail_sprites::toJson()
{
    bourne::json object = bourne::json::object();





    object["r_default"] = getRDefault();



    return object;

}

std::string
PokemonFormDetail_sprites::getRDefault()
{
	return r_default;
}

void
PokemonFormDetail_sprites::setRDefault(std::string r_default)
{
	this->r_default = r_default;
}



