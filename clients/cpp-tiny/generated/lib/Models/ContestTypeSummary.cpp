

#include "ContestTypeSummary.h"

using namespace Tiny;

ContestTypeSummary::ContestTypeSummary()
{
	name = std::string();
	url = std::string();
}

ContestTypeSummary::ContestTypeSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

ContestTypeSummary::~ContestTypeSummary()
{

}

void
ContestTypeSummary::fromJson(std::string jsonObj)
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
ContestTypeSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
ContestTypeSummary::getName()
{
	return name;
}

void
ContestTypeSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
ContestTypeSummary::getUrl()
{
	return url;
}

void
ContestTypeSummary::setUrl(std::string  url)
{
	this->url = url;
}



