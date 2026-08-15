

#include "EvolutionTriggerSummary.h"

using namespace Tiny;

EvolutionTriggerSummary::EvolutionTriggerSummary()
{
	name = std::string();
	url = std::string();
}

EvolutionTriggerSummary::EvolutionTriggerSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionTriggerSummary::~EvolutionTriggerSummary()
{

}

void
EvolutionTriggerSummary::fromJson(std::string jsonObj)
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
EvolutionTriggerSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
EvolutionTriggerSummary::getName()
{
	return name;
}

void
EvolutionTriggerSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
EvolutionTriggerSummary::getUrl()
{
	return url;
}

void
EvolutionTriggerSummary::setUrl(std::string  url)
{
	this->url = url;
}



