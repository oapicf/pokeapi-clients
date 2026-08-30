

#include "VersionSummary.h"

using namespace Tiny;

VersionSummary::VersionSummary()
{
	name = std::string();
	url = std::string();
}

VersionSummary::VersionSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionSummary::~VersionSummary()
{

}

void
VersionSummary::fromJson(std::string jsonObj)
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
VersionSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
VersionSummary::getName()
{
	return name;
}

void
VersionSummary::setName(std::string name)
{
	this->name = name;
}

std::string
VersionSummary::getUrl()
{
	return url;
}

void
VersionSummary::setUrl(std::string url)
{
	this->url = url;
}



