

#include "EggGroupDetail_pokemon_species_inner.h"

using namespace Tiny;

EggGroupDetail_pokemon_species_inner::EggGroupDetail_pokemon_species_inner()
{
	name = std::string();
	url = std::string();
}

EggGroupDetail_pokemon_species_inner::EggGroupDetail_pokemon_species_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

EggGroupDetail_pokemon_species_inner::~EggGroupDetail_pokemon_species_inner()
{

}

void
EggGroupDetail_pokemon_species_inner::fromJson(std::string jsonObj)
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
EggGroupDetail_pokemon_species_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
EggGroupDetail_pokemon_species_inner::getName()
{
	return name;
}

void
EggGroupDetail_pokemon_species_inner::setName(std::string name)
{
	this->name = name;
}

std::string
EggGroupDetail_pokemon_species_inner::getUrl()
{
	return url;
}

void
EggGroupDetail_pokemon_species_inner::setUrl(std::string url)
{
	this->url = url;
}



