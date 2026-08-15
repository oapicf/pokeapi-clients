

#include "RegionSummary.h"

using namespace Tiny;

RegionSummary::RegionSummary()
{
	name = std::string();
	url = std::string();
}

RegionSummary::RegionSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

RegionSummary::~RegionSummary()
{

}

void
RegionSummary::fromJson(std::string jsonObj)
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
RegionSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
RegionSummary::getName()
{
	return name;
}

void
RegionSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
RegionSummary::getUrl()
{
	return url;
}

void
RegionSummary::setUrl(std::string  url)
{
	this->url = url;
}



