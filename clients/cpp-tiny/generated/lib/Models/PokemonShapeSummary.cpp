

#include "PokemonShapeSummary.h"

using namespace Tiny;

PokemonShapeSummary::PokemonShapeSummary()
{
	name = std::string();
	url = std::string();
}

PokemonShapeSummary::PokemonShapeSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonShapeSummary::~PokemonShapeSummary()
{

}

void
PokemonShapeSummary::fromJson(std::string jsonObj)
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
PokemonShapeSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokemonShapeSummary::getName()
{
	return name;
}

void
PokemonShapeSummary::setName(std::string name)
{
	this->name = name;
}

std::string
PokemonShapeSummary::getUrl()
{
	return url;
}

void
PokemonShapeSummary::setUrl(std::string url)
{
	this->url = url;
}



