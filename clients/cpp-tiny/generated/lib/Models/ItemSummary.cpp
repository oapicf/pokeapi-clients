

#include "ItemSummary.h"

using namespace Tiny;

ItemSummary::ItemSummary()
{
	name = std::string();
	url = std::string();
}

ItemSummary::ItemSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemSummary::~ItemSummary()
{

}

void
ItemSummary::fromJson(std::string jsonObj)
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
ItemSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
ItemSummary::getName()
{
	return name;
}

void
ItemSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
ItemSummary::getUrl()
{
	return url;
}

void
ItemSummary::setUrl(std::string  url)
{
	this->url = url;
}



