

#include "PokemonFormSummary.h"

using namespace Tiny;

PokemonFormSummary::PokemonFormSummary()
{
	name = std::string();
	url = std::string();
}

PokemonFormSummary::PokemonFormSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormSummary::~PokemonFormSummary()
{

}

void
PokemonFormSummary::fromJson(std::string jsonObj)
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
PokemonFormSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokemonFormSummary::getName()
{
	return name;
}

void
PokemonFormSummary::setName(std::string name)
{
	this->name = name;
}

std::string
PokemonFormSummary::getUrl()
{
	return url;
}

void
PokemonFormSummary::setUrl(std::string url)
{
	this->url = url;
}



