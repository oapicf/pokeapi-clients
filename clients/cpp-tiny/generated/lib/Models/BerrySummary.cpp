

#include "BerrySummary.h"

using namespace Tiny;

BerrySummary::BerrySummary()
{
	name = std::string();
	url = std::string();
}

BerrySummary::BerrySummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerrySummary::~BerrySummary()
{

}

void
BerrySummary::fromJson(std::string jsonObj)
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
BerrySummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
BerrySummary::getName()
{
	return name;
}

void
BerrySummary::setName(std::string name)
{
	this->name = name;
}

std::string
BerrySummary::getUrl()
{
	return url;
}

void
BerrySummary::setUrl(std::string url)
{
	this->url = url;
}



