

#include "PokemonEvolution_known_move.h"

using namespace Tiny;

PokemonEvolution_known_move::PokemonEvolution_known_move()
{
	name = std::string();
	url = std::string();
}

PokemonEvolution_known_move::PokemonEvolution_known_move(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonEvolution_known_move::~PokemonEvolution_known_move()
{

}

void
PokemonEvolution_known_move::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
PokemonEvolution_known_move::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokemonEvolution_known_move::getName()
{
	return name;
}

void
PokemonEvolution_known_move::setName(std::string name)
{
	this->name = name;
}

std::string
PokemonEvolution_known_move::getUrl()
{
	return url;
}

void
PokemonEvolution_known_move::setUrl(std::string url)
{
	this->url = url;
}



