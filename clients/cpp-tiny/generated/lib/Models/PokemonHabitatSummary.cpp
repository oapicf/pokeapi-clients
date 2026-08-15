

#include "PokemonHabitatSummary.h"

using namespace Tiny;

PokemonHabitatSummary::PokemonHabitatSummary()
{
	name = std::string();
	url = std::string();
}

PokemonHabitatSummary::PokemonHabitatSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonHabitatSummary::~PokemonHabitatSummary()
{

}

void
PokemonHabitatSummary::fromJson(std::string jsonObj)
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
PokemonHabitatSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokemonHabitatSummary::getName()
{
	return name;
}

void
PokemonHabitatSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
PokemonHabitatSummary::getUrl()
{
	return url;
}

void
PokemonHabitatSummary::setUrl(std::string  url)
{
	this->url = url;
}



