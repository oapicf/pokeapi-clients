

#include "EncounterConditionSummary.h"

using namespace Tiny;

EncounterConditionSummary::EncounterConditionSummary()
{
	name = std::string();
	url = std::string();
}

EncounterConditionSummary::EncounterConditionSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterConditionSummary::~EncounterConditionSummary()
{

}

void
EncounterConditionSummary::fromJson(std::string jsonObj)
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
EncounterConditionSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
EncounterConditionSummary::getName()
{
	return name;
}

void
EncounterConditionSummary::setName(std::string name)
{
	this->name = name;
}

std::string
EncounterConditionSummary::getUrl()
{
	return url;
}

void
EncounterConditionSummary::setUrl(std::string url)
{
	this->url = url;
}



