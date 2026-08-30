

#include "AbilityDetail_pokemon_inner_pokemon.h"

using namespace Tiny;

AbilityDetail_pokemon_inner_pokemon::AbilityDetail_pokemon_inner_pokemon()
{
	name = std::string();
	url = std::string();
}

AbilityDetail_pokemon_inner_pokemon::AbilityDetail_pokemon_inner_pokemon(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityDetail_pokemon_inner_pokemon::~AbilityDetail_pokemon_inner_pokemon()
{

}

void
AbilityDetail_pokemon_inner_pokemon::fromJson(std::string jsonObj)
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
AbilityDetail_pokemon_inner_pokemon::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
AbilityDetail_pokemon_inner_pokemon::getName()
{
	return name;
}

void
AbilityDetail_pokemon_inner_pokemon::setName(std::string name)
{
	this->name = name;
}

std::string
AbilityDetail_pokemon_inner_pokemon::getUrl()
{
	return url;
}

void
AbilityDetail_pokemon_inner_pokemon::setUrl(std::string url)
{
	this->url = url;
}



