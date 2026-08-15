

#include "PokemonShapeDetail_names_inner.h"

using namespace Tiny;

PokemonShapeDetail_names_inner::PokemonShapeDetail_names_inner()
{
	url = std::string();
	name = std::string();
}

PokemonShapeDetail_names_inner::PokemonShapeDetail_names_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonShapeDetail_names_inner::~PokemonShapeDetail_names_inner()
{

}

void
PokemonShapeDetail_names_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
PokemonShapeDetail_names_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();






    object["name"] = getName();



    return object;

}

std::string
PokemonShapeDetail_names_inner::getUrl()
{
	return url;
}

void
PokemonShapeDetail_names_inner::setUrl(std::string  url)
{
	this->url = url;
}

std::string
PokemonShapeDetail_names_inner::getName()
{
	return name;
}

void
PokemonShapeDetail_names_inner::setName(std::string  name)
{
	this->name = name;
}



