

#include "AbilitySummary.h"

using namespace Tiny;

AbilitySummary::AbilitySummary()
{
	name = std::string();
	url = std::string();
}

AbilitySummary::AbilitySummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilitySummary::~AbilitySummary()
{

}

void
AbilitySummary::fromJson(std::string jsonObj)
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
AbilitySummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
AbilitySummary::getName()
{
	return name;
}

void
AbilitySummary::setName(std::string name)
{
	this->name = name;
}

std::string
AbilitySummary::getUrl()
{
	return url;
}

void
AbilitySummary::setUrl(std::string url)
{
	this->url = url;
}



