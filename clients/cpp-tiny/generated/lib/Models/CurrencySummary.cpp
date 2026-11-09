

#include "CurrencySummary.h"

using namespace Tiny;

CurrencySummary::CurrencySummary()
{
	name = std::string();
	url = std::string();
}

CurrencySummary::CurrencySummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

CurrencySummary::~CurrencySummary()
{

}

void
CurrencySummary::fromJson(std::string jsonObj)
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
CurrencySummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
CurrencySummary::getName()
{
	return name;
}

void
CurrencySummary::setName(std::string name)
{
	this->name = name;
}

std::string
CurrencySummary::getUrl()
{
	return url;
}

void
CurrencySummary::setUrl(std::string url)
{
	this->url = url;
}



