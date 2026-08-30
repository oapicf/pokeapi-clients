

#include "StatSummary.h"

using namespace Tiny;

StatSummary::StatSummary()
{
	name = std::string();
	url = std::string();
}

StatSummary::StatSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

StatSummary::~StatSummary()
{

}

void
StatSummary::fromJson(std::string jsonObj)
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
StatSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
StatSummary::getName()
{
	return name;
}

void
StatSummary::setName(std::string name)
{
	this->name = name;
}

std::string
StatSummary::getUrl()
{
	return url;
}

void
StatSummary::setUrl(std::string url)
{
	this->url = url;
}



