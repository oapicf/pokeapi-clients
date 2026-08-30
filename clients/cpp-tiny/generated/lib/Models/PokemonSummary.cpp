

#include "PokemonSummary.h"

using namespace Tiny;

PokemonSummary::PokemonSummary()
{
	name = std::string();
	url = std::string();
}

PokemonSummary::PokemonSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSummary::~PokemonSummary()
{

}

void
PokemonSummary::fromJson(std::string jsonObj)
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
PokemonSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokemonSummary::getName()
{
	return name;
}

void
PokemonSummary::setName(std::string name)
{
	this->name = name;
}

std::string
PokemonSummary::getUrl()
{
	return url;
}

void
PokemonSummary::setUrl(std::string url)
{
	this->url = url;
}



