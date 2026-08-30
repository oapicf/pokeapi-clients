

#include "MoveMetaAilmentSummary.h"

using namespace Tiny;

MoveMetaAilmentSummary::MoveMetaAilmentSummary()
{
	name = std::string();
	url = std::string();
}

MoveMetaAilmentSummary::MoveMetaAilmentSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveMetaAilmentSummary::~MoveMetaAilmentSummary()
{

}

void
MoveMetaAilmentSummary::fromJson(std::string jsonObj)
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
MoveMetaAilmentSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
MoveMetaAilmentSummary::getName()
{
	return name;
}

void
MoveMetaAilmentSummary::setName(std::string name)
{
	this->name = name;
}

std::string
MoveMetaAilmentSummary::getUrl()
{
	return url;
}

void
MoveMetaAilmentSummary::setUrl(std::string url)
{
	this->url = url;
}



