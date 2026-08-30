

#include "ItemPocketSummary.h"

using namespace Tiny;

ItemPocketSummary::ItemPocketSummary()
{
	name = std::string();
	url = std::string();
}

ItemPocketSummary::ItemPocketSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemPocketSummary::~ItemPocketSummary()
{

}

void
ItemPocketSummary::fromJson(std::string jsonObj)
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
ItemPocketSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
ItemPocketSummary::getName()
{
	return name;
}

void
ItemPocketSummary::setName(std::string name)
{
	this->name = name;
}

std::string
ItemPocketSummary::getUrl()
{
	return url;
}

void
ItemPocketSummary::setUrl(std::string url)
{
	this->url = url;
}



