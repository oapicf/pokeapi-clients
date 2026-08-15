

#include "PokemonSpeciesSummary.h"

using namespace Tiny;

PokemonSpeciesSummary::PokemonSpeciesSummary()
{
	name = std::string();
	url = std::string();
}

PokemonSpeciesSummary::PokemonSpeciesSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesSummary::~PokemonSpeciesSummary()
{

}

void
PokemonSpeciesSummary::fromJson(std::string jsonObj)
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
PokemonSpeciesSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokemonSpeciesSummary::getName()
{
	return name;
}

void
PokemonSpeciesSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
PokemonSpeciesSummary::getUrl()
{
	return url;
}

void
PokemonSpeciesSummary::setUrl(std::string  url)
{
	this->url = url;
}



