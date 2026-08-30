

#include "ItemAttributeSummary.h"

using namespace Tiny;

ItemAttributeSummary::ItemAttributeSummary()
{
	name = std::string();
	url = std::string();
}

ItemAttributeSummary::ItemAttributeSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemAttributeSummary::~ItemAttributeSummary()
{

}

void
ItemAttributeSummary::fromJson(std::string jsonObj)
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
ItemAttributeSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
ItemAttributeSummary::getName()
{
	return name;
}

void
ItemAttributeSummary::setName(std::string name)
{
	this->name = name;
}

std::string
ItemAttributeSummary::getUrl()
{
	return url;
}

void
ItemAttributeSummary::setUrl(std::string url)
{
	this->url = url;
}



