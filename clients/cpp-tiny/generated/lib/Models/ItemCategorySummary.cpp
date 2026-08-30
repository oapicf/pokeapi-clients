

#include "ItemCategorySummary.h"

using namespace Tiny;

ItemCategorySummary::ItemCategorySummary()
{
	name = std::string();
	url = std::string();
}

ItemCategorySummary::ItemCategorySummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemCategorySummary::~ItemCategorySummary()
{

}

void
ItemCategorySummary::fromJson(std::string jsonObj)
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
ItemCategorySummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
ItemCategorySummary::getName()
{
	return name;
}

void
ItemCategorySummary::setName(std::string name)
{
	this->name = name;
}

std::string
ItemCategorySummary::getUrl()
{
	return url;
}

void
ItemCategorySummary::setUrl(std::string url)
{
	this->url = url;
}



