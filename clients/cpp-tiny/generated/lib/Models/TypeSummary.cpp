

#include "TypeSummary.h"

using namespace Tiny;

TypeSummary::TypeSummary()
{
	name = std::string();
	url = std::string();
}

TypeSummary::TypeSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeSummary::~TypeSummary()
{

}

void
TypeSummary::fromJson(std::string jsonObj)
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
TypeSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
TypeSummary::getName()
{
	return name;
}

void
TypeSummary::setName(std::string name)
{
	this->name = name;
}

std::string
TypeSummary::getUrl()
{
	return url;
}

void
TypeSummary::setUrl(std::string url)
{
	this->url = url;
}



