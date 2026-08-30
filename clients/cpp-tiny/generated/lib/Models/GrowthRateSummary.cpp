

#include "GrowthRateSummary.h"

using namespace Tiny;

GrowthRateSummary::GrowthRateSummary()
{
	name = std::string();
	url = std::string();
}

GrowthRateSummary::GrowthRateSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

GrowthRateSummary::~GrowthRateSummary()
{

}

void
GrowthRateSummary::fromJson(std::string jsonObj)
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
GrowthRateSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
GrowthRateSummary::getName()
{
	return name;
}

void
GrowthRateSummary::setName(std::string name)
{
	this->name = name;
}

std::string
GrowthRateSummary::getUrl()
{
	return url;
}

void
GrowthRateSummary::setUrl(std::string url)
{
	this->url = url;
}



