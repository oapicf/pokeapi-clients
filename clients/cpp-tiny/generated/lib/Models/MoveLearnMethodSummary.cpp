

#include "MoveLearnMethodSummary.h"

using namespace Tiny;

MoveLearnMethodSummary::MoveLearnMethodSummary()
{
	name = std::string();
	url = std::string();
}

MoveLearnMethodSummary::MoveLearnMethodSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveLearnMethodSummary::~MoveLearnMethodSummary()
{

}

void
MoveLearnMethodSummary::fromJson(std::string jsonObj)
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
MoveLearnMethodSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
MoveLearnMethodSummary::getName()
{
	return name;
}

void
MoveLearnMethodSummary::setName(std::string name)
{
	this->name = name;
}

std::string
MoveLearnMethodSummary::getUrl()
{
	return url;
}

void
MoveLearnMethodSummary::setUrl(std::string url)
{
	this->url = url;
}



