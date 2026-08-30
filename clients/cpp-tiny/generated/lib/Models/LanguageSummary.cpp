

#include "LanguageSummary.h"

using namespace Tiny;

LanguageSummary::LanguageSummary()
{
	name = std::string();
	url = std::string();
}

LanguageSummary::LanguageSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

LanguageSummary::~LanguageSummary()
{

}

void
LanguageSummary::fromJson(std::string jsonObj)
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
LanguageSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
LanguageSummary::getName()
{
	return name;
}

void
LanguageSummary::setName(std::string name)
{
	this->name = name;
}

std::string
LanguageSummary::getUrl()
{
	return url;
}

void
LanguageSummary::setUrl(std::string url)
{
	this->url = url;
}



