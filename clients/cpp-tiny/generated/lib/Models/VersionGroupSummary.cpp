

#include "VersionGroupSummary.h"

using namespace Tiny;

VersionGroupSummary::VersionGroupSummary()
{
	name = std::string();
	url = std::string();
}

VersionGroupSummary::VersionGroupSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionGroupSummary::~VersionGroupSummary()
{

}

void
VersionGroupSummary::fromJson(std::string jsonObj)
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
VersionGroupSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
VersionGroupSummary::getName()
{
	return name;
}

void
VersionGroupSummary::setName(std::string  name)
{
	this->name = name;
}

std::string
VersionGroupSummary::getUrl()
{
	return url;
}

void
VersionGroupSummary::setUrl(std::string  url)
{
	this->url = url;
}



