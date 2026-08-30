

#include "PokeathlonStatSummary.h"

using namespace Tiny;

PokeathlonStatSummary::PokeathlonStatSummary()
{
	name = std::string();
	url = std::string();
}

PokeathlonStatSummary::PokeathlonStatSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokeathlonStatSummary::~PokeathlonStatSummary()
{

}

void
PokeathlonStatSummary::fromJson(std::string jsonObj)
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
PokeathlonStatSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PokeathlonStatSummary::getName()
{
	return name;
}

void
PokeathlonStatSummary::setName(std::string name)
{
	this->name = name;
}

std::string
PokeathlonStatSummary::getUrl()
{
	return url;
}

void
PokeathlonStatSummary::setUrl(std::string url)
{
	this->url = url;
}



