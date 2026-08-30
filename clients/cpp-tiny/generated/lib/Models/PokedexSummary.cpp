

#include "PokedexSummary.h"

using namespace Tiny;

PokedexSummary::PokedexSummary()
{
	name = std::string();
	url = std::string();
}

PokedexSummary::PokedexSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokedexSummary::~PokedexSummary()
{

}

void
PokedexSummary::fromJson(std::string jsonObj)
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
PokedexSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokedexSummary::getName()
{
	return name;
}

void
PokedexSummary::setName(std::string name)
{
	this->name = name;
}

std::string
PokedexSummary::getUrl()
{
	return url;
}

void
PokedexSummary::setUrl(std::string url)
{
	this->url = url;
}



