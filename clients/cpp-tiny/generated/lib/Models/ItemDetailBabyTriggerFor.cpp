

#include "ItemDetail_baby_trigger_for.h"

using namespace Tiny;

ItemDetail_baby_trigger_for::ItemDetail_baby_trigger_for()
{
	url = std::string();
}

ItemDetail_baby_trigger_for::ItemDetail_baby_trigger_for(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDetail_baby_trigger_for::~ItemDetail_baby_trigger_for()
{

}

void
ItemDetail_baby_trigger_for::fromJson(std::string jsonObj)
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
ItemDetail_baby_trigger_for::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
ItemDetail_baby_trigger_for::getUrl()
{
	return url;
}

void
ItemDetail_baby_trigger_for::setUrl(std::string url)
{
	this->url = url;
}



