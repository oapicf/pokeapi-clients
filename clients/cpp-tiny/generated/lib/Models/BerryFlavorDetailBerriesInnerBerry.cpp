

#include "BerryFlavorDetail_berries_inner_berry.h"

using namespace Tiny;

BerryFlavorDetail_berries_inner_berry::BerryFlavorDetail_berries_inner_berry()
{
	name = std::string();
	url = std::string();
}

BerryFlavorDetail_berries_inner_berry::BerryFlavorDetail_berries_inner_berry(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFlavorDetail_berries_inner_berry::~BerryFlavorDetail_berries_inner_berry()
{

}

void
BerryFlavorDetail_berries_inner_berry::fromJson(std::string jsonObj)
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
BerryFlavorDetail_berries_inner_berry::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
BerryFlavorDetail_berries_inner_berry::getName()
{
	return name;
}

void
BerryFlavorDetail_berries_inner_berry::setName(std::string  name)
{
	this->name = name;
}

std::string
BerryFlavorDetail_berries_inner_berry::getUrl()
{
	return url;
}

void
BerryFlavorDetail_berries_inner_berry::setUrl(std::string  url)
{
	this->url = url;
}



