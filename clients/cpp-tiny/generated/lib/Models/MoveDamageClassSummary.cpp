

#include "MoveDamageClassSummary.h"

using namespace Tiny;

MoveDamageClassSummary::MoveDamageClassSummary()
{
	name = std::string();
	url = std::string();
}

MoveDamageClassSummary::MoveDamageClassSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDamageClassSummary::~MoveDamageClassSummary()
{

}

void
MoveDamageClassSummary::fromJson(std::string jsonObj)
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
MoveDamageClassSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
MoveDamageClassSummary::getName()
{
	return name;
}

void
MoveDamageClassSummary::setName(std::string name)
{
	this->name = name;
}

std::string
MoveDamageClassSummary::getUrl()
{
	return url;
}

void
MoveDamageClassSummary::setUrl(std::string url)
{
	this->url = url;
}



