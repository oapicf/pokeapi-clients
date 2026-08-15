

#include "EggGroupSummary.h"

using namespace Tiny;

EggGroupSummary::EggGroupSummary()
{
	name = std::string();
	url = std::string();
}

EggGroupSummary::EggGroupSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

EggGroupSummary::~EggGroupSummary()
{

}

void
EggGroupSummary::fromJson(std::string jsonObj)
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
EggGroupSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
EggGroupSummary::getName()
{
	return name;
}

void
EggGroupSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
EggGroupSummary::getUrl()
{
	return url;
}

void
EggGroupSummary::setUrl(std::string  url)
{
	this->url = url;
}



