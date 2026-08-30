

#include "CharacteristicSummary.h"

using namespace Tiny;

CharacteristicSummary::CharacteristicSummary()
{
	url = std::string();
}

CharacteristicSummary::CharacteristicSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

CharacteristicSummary::~CharacteristicSummary()
{

}

void
CharacteristicSummary::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
CharacteristicSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
CharacteristicSummary::getUrl()
{
	return url;
}

void
CharacteristicSummary::setUrl(std::string url)
{
	this->url = url;
}



