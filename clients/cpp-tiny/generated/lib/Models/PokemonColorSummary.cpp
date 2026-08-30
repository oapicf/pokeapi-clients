

#include "PokemonColorSummary.h"

using namespace Tiny;

PokemonColorSummary::PokemonColorSummary()
{
	name = std::string();
	url = std::string();
}

PokemonColorSummary::PokemonColorSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonColorSummary::~PokemonColorSummary()
{

}

void
PokemonColorSummary::fromJson(std::string jsonObj)
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
PokemonColorSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokemonColorSummary::getName()
{
	return name;
}

void
PokemonColorSummary::setName(std::string name)
{
	this->name = name;
}

std::string
PokemonColorSummary::getUrl()
{
	return url;
}

void
PokemonColorSummary::setUrl(std::string url)
{
	this->url = url;
}



