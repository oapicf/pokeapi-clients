

#include "MoveBattleStyleSummary.h"

using namespace Tiny;

MoveBattleStyleSummary::MoveBattleStyleSummary()
{
	name = std::string();
	url = std::string();
}

MoveBattleStyleSummary::MoveBattleStyleSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveBattleStyleSummary::~MoveBattleStyleSummary()
{

}

void
MoveBattleStyleSummary::fromJson(std::string jsonObj)
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
MoveBattleStyleSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
MoveBattleStyleSummary::getName()
{
	return name;
}

void
MoveBattleStyleSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
MoveBattleStyleSummary::getUrl()
{
	return url;
}

void
MoveBattleStyleSummary::setUrl(std::string  url)
{
	this->url = url;
}



