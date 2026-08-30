

#include "NatureSummary.h"

using namespace Tiny;

NatureSummary::NatureSummary()
{
	name = std::string();
	url = std::string();
}

NatureSummary::NatureSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

NatureSummary::~NatureSummary()
{

}

void
NatureSummary::fromJson(std::string jsonObj)
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
NatureSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
NatureSummary::getName()
{
	return name;
}

void
NatureSummary::setName(std::string name)
{
	this->name = name;
}

std::string
NatureSummary::getUrl()
{
	return url;
}

void
NatureSummary::setUrl(std::string url)
{
	this->url = url;
}



