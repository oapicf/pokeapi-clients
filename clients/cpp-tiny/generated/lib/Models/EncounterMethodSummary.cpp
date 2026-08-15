

#include "EncounterMethodSummary.h"

using namespace Tiny;

EncounterMethodSummary::EncounterMethodSummary()
{
	name = std::string();
	url = std::string();
}

EncounterMethodSummary::EncounterMethodSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterMethodSummary::~EncounterMethodSummary()
{

}

void
EncounterMethodSummary::fromJson(std::string jsonObj)
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
EncounterMethodSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
EncounterMethodSummary::getName()
{
	return name;
}

void
EncounterMethodSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
EncounterMethodSummary::getUrl()
{
	return url;
}

void
EncounterMethodSummary::setUrl(std::string  url)
{
	this->url = url;
}



