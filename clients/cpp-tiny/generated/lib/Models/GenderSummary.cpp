

#include "GenderSummary.h"

using namespace Tiny;

GenderSummary::GenderSummary()
{
	name = std::string();
	url = std::string();
}

GenderSummary::GenderSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenderSummary::~GenderSummary()
{

}

void
GenderSummary::fromJson(std::string jsonObj)
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
GenderSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
GenderSummary::getName()
{
	return name;
}

void
GenderSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
GenderSummary::getUrl()
{
	return url;
}

void
GenderSummary::setUrl(std::string  url)
{
	this->url = url;
}



