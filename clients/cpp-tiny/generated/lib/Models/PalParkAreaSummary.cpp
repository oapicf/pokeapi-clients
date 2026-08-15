

#include "PalParkAreaSummary.h"

using namespace Tiny;

PalParkAreaSummary::PalParkAreaSummary()
{
	name = std::string();
	url = std::string();
}

PalParkAreaSummary::PalParkAreaSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PalParkAreaSummary::~PalParkAreaSummary()
{

}

void
PalParkAreaSummary::fromJson(std::string jsonObj)
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
PalParkAreaSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
PalParkAreaSummary::getName()
{
	return name;
}

void
PalParkAreaSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
PalParkAreaSummary::getUrl()
{
	return url;
}

void
PalParkAreaSummary::setUrl(std::string  url)
{
	this->url = url;
}



