

#include "MoveMetaCategorySummary.h"

using namespace Tiny;

MoveMetaCategorySummary::MoveMetaCategorySummary()
{
	name = std::string();
	url = std::string();
}

MoveMetaCategorySummary::MoveMetaCategorySummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveMetaCategorySummary::~MoveMetaCategorySummary()
{

}

void
MoveMetaCategorySummary::fromJson(std::string jsonObj)
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
MoveMetaCategorySummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
MoveMetaCategorySummary::getName()
{
	return name;
}

void
MoveMetaCategorySummary::setName(std::string name)
{
	this->name = name;
}

std::string
MoveMetaCategorySummary::getUrl()
{
	return url;
}

void
MoveMetaCategorySummary::setUrl(std::string url)
{
	this->url = url;
}



