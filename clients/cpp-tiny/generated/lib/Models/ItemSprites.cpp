

#include "ItemSprites.h"

using namespace Tiny;

ItemSprites::ItemSprites()
{
	r_default = std::string();
}

ItemSprites::ItemSprites(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemSprites::~ItemSprites()
{

}

void
ItemSprites::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *r_defaultKey = "default";

    if(object.has_key(r_defaultKey))
    {
        bourne::json value = object[r_defaultKey];



        jsonToValue(&r_default, value, "std::string");


    }


}

bourne::json
ItemSprites::toJson()
{
    bourne::json object = bourne::json::object();





    object["r_default"] = getRDefault();



    return object;

}

std::string
ItemSprites::getRDefault()
{
	return r_default;
}

void
ItemSprites::setRDefault(std::string r_default)
{
	this->r_default = r_default;
}



