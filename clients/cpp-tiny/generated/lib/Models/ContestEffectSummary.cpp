

#include "ContestEffectSummary.h"

using namespace Tiny;

ContestEffectSummary::ContestEffectSummary()
{
	url = std::string();
}

ContestEffectSummary::ContestEffectSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

ContestEffectSummary::~ContestEffectSummary()
{

}

void
ContestEffectSummary::fromJson(std::string jsonObj)
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
ContestEffectSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
ContestEffectSummary::getUrl()
{
	return url;
}

void
ContestEffectSummary::setUrl(std::string  url)
{
	this->url = url;
}



