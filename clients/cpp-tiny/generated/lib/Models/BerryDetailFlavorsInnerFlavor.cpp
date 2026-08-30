

#include "BerryDetail_flavors_inner_flavor.h"

using namespace Tiny;

BerryDetail_flavors_inner_flavor::BerryDetail_flavors_inner_flavor()
{
	name = std::string();
	url = std::string();
}

BerryDetail_flavors_inner_flavor::BerryDetail_flavors_inner_flavor(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryDetail_flavors_inner_flavor::~BerryDetail_flavors_inner_flavor()
{

}

void
BerryDetail_flavors_inner_flavor::fromJson(std::string jsonObj)
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
BerryDetail_flavors_inner_flavor::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
BerryDetail_flavors_inner_flavor::getName()
{
	return name;
}

void
BerryDetail_flavors_inner_flavor::setName(std::string name)
{
	this->name = name;
}

std::string
BerryDetail_flavors_inner_flavor::getUrl()
{
	return url;
}

void
BerryDetail_flavors_inner_flavor::setUrl(std::string url)
{
	this->url = url;
}



