

#include "LocationSummary.h"

using namespace Tiny;

LocationSummary::LocationSummary()
{
	name = std::string();
	url = std::string();
}

LocationSummary::LocationSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationSummary::~LocationSummary()
{

}

void
LocationSummary::fromJson(std::string jsonObj)
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
LocationSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
LocationSummary::getName()
{
	return name;
}

void
LocationSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
LocationSummary::getUrl()
{
	return url;
}

void
LocationSummary::setUrl(std::string  url)
{
	this->url = url;
}



