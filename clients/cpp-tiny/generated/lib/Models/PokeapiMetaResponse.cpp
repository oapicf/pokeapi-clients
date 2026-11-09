

#include "PokeapiMetaResponse.h"

using namespace Tiny;

PokeapiMetaResponse::PokeapiMetaResponse()
{
	deploy_date = std::string();
	hash = std::string();
	tag = std::string();
}

PokeapiMetaResponse::PokeapiMetaResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokeapiMetaResponse::~PokeapiMetaResponse()
{

}

void
PokeapiMetaResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deploy_dateKey = "deploy_date";

    if(object.has_key(deploy_dateKey))
    {
        bourne::json value = object[deploy_dateKey];



        jsonToValue(&deploy_date, value, "std::string");


    }

    const char *hashKey = "hash";

    if(object.has_key(hashKey))
    {
        bourne::json value = object[hashKey];



        jsonToValue(&hash, value, "std::string");


    }

    const char *tagKey = "tag";

    if(object.has_key(tagKey))
    {
        bourne::json value = object[tagKey];



        jsonToValue(&tag, value, "std::string");


    }


}

bourne::json
PokeapiMetaResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["deploy_date"] = getDeployDate();






    object["hash"] = getHash();






    object["tag"] = getTag();



    return object;

}

std::string
PokeapiMetaResponse::getDeployDate()
{
	return deploy_date;
}

void
PokeapiMetaResponse::setDeployDate(std::string deploy_date)
{
	this->deploy_date = deploy_date;
}

std::string
PokeapiMetaResponse::getHash()
{
	return hash;
}

void
PokeapiMetaResponse::setHash(std::string hash)
{
	this->hash = hash;
}

std::string
PokeapiMetaResponse::getTag()
{
	return tag;
}

void
PokeapiMetaResponse::setTag(std::string tag)
{
	this->tag = tag;
}



