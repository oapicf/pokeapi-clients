

#include "ItemFlingEffectSummary.h"

using namespace Tiny;

ItemFlingEffectSummary::ItemFlingEffectSummary()
{
	name = std::string();
	url = std::string();
}

ItemFlingEffectSummary::ItemFlingEffectSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemFlingEffectSummary::~ItemFlingEffectSummary()
{

}

void
ItemFlingEffectSummary::fromJson(std::string jsonObj)
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
ItemFlingEffectSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
ItemFlingEffectSummary::getName()
{
	return name;
}

void
ItemFlingEffectSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
ItemFlingEffectSummary::getUrl()
{
	return url;
}

void
ItemFlingEffectSummary::setUrl(std::string  url)
{
	this->url = url;
}



