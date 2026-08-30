

#include "EvolutionChainSummary.h"

using namespace Tiny;

EvolutionChainSummary::EvolutionChainSummary()
{
	url = std::string();
}

EvolutionChainSummary::EvolutionChainSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionChainSummary::~EvolutionChainSummary()
{

}

void
EvolutionChainSummary::fromJson(std::string jsonObj)
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
EvolutionChainSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
EvolutionChainSummary::getUrl()
{
	return url;
}

void
EvolutionChainSummary::setUrl(std::string url)
{
	this->url = url;
}



