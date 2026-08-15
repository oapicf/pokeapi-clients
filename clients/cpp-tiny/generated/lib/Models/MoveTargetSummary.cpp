

#include "MoveTargetSummary.h"

using namespace Tiny;

MoveTargetSummary::MoveTargetSummary()
{
	name = std::string();
	url = std::string();
}

MoveTargetSummary::MoveTargetSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveTargetSummary::~MoveTargetSummary()
{

}

void
MoveTargetSummary::fromJson(std::string jsonObj)
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
MoveTargetSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
MoveTargetSummary::getName()
{
	return name;
}

void
MoveTargetSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
MoveTargetSummary::getUrl()
{
	return url;
}

void
MoveTargetSummary::setUrl(std::string  url)
{
	this->url = url;
}



