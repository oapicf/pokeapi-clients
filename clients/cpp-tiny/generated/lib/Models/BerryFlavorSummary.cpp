

#include "BerryFlavorSummary.h"

using namespace Tiny;

BerryFlavorSummary::BerryFlavorSummary()
{
	name = std::string();
	url = std::string();
}

BerryFlavorSummary::BerryFlavorSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFlavorSummary::~BerryFlavorSummary()
{

}

void
BerryFlavorSummary::fromJson(std::string jsonObj)
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
BerryFlavorSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
BerryFlavorSummary::getName()
{
	return name;
}

void
BerryFlavorSummary::setName(std::string name)
{
	this->name = name;
}

std::string
BerryFlavorSummary::getUrl()
{
	return url;
}

void
BerryFlavorSummary::setUrl(std::string url)
{
	this->url = url;
}



