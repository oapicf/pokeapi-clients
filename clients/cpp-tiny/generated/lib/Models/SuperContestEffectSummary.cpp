

#include "SuperContestEffectSummary.h"

using namespace Tiny;

SuperContestEffectSummary::SuperContestEffectSummary()
{
	url = std::string();
}

SuperContestEffectSummary::SuperContestEffectSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuperContestEffectSummary::~SuperContestEffectSummary()
{

}

void
SuperContestEffectSummary::fromJson(std::string jsonObj)
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
SuperContestEffectSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
SuperContestEffectSummary::getUrl()
{
	return url;
}

void
SuperContestEffectSummary::setUrl(std::string  url)
{
	this->url = url;
}



