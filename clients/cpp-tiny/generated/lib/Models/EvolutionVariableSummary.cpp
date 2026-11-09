

#include "EvolutionVariableSummary.h"

using namespace Tiny;

EvolutionVariableSummary::EvolutionVariableSummary()
{
	name = std::string();
	url = std::string();
}

EvolutionVariableSummary::EvolutionVariableSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionVariableSummary::~EvolutionVariableSummary()
{

}

void
EvolutionVariableSummary::fromJson(std::string jsonObj)
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
EvolutionVariableSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
EvolutionVariableSummary::getName()
{
	return name;
}

void
EvolutionVariableSummary::setName(std::string name)
{
	this->name = name;
}

std::string
EvolutionVariableSummary::getUrl()
{
	return url;
}

void
EvolutionVariableSummary::setUrl(std::string url)
{
	this->url = url;
}



