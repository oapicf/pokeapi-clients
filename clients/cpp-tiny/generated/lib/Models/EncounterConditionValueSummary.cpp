

#include "EncounterConditionValueSummary.h"

using namespace Tiny;

EncounterConditionValueSummary::EncounterConditionValueSummary()
{
	name = std::string();
	url = std::string();
}

EncounterConditionValueSummary::EncounterConditionValueSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterConditionValueSummary::~EncounterConditionValueSummary()
{

}

void
EncounterConditionValueSummary::fromJson(std::string jsonObj)
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
EncounterConditionValueSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
EncounterConditionValueSummary::getName()
{
	return name;
}

void
EncounterConditionValueSummary::setName(std::string name)
{
	this->name = name;
}

std::string
EncounterConditionValueSummary::getUrl()
{
	return url;
}

void
EncounterConditionValueSummary::setUrl(std::string url)
{
	this->url = url;
}



