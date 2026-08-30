

#include "MachineSummary.h"

using namespace Tiny;

MachineSummary::MachineSummary()
{
	url = std::string();
}

MachineSummary::MachineSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

MachineSummary::~MachineSummary()
{

}

void
MachineSummary::fromJson(std::string jsonObj)
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
MachineSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
MachineSummary::getUrl()
{
	return url;
}

void
MachineSummary::setUrl(std::string url)
{
	this->url = url;
}



