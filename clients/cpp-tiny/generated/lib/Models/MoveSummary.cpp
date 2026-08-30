

#include "MoveSummary.h"

using namespace Tiny;

MoveSummary::MoveSummary()
{
	name = std::string();
	url = std::string();
}

MoveSummary::MoveSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveSummary::~MoveSummary()
{

}

void
MoveSummary::fromJson(std::string jsonObj)
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
MoveSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
MoveSummary::getName()
{
	return name;
}

void
MoveSummary::setName(std::string name)
{
	this->name = name;
}

std::string
MoveSummary::getUrl()
{
	return url;
}

void
MoveSummary::setUrl(std::string url)
{
	this->url = url;
}



