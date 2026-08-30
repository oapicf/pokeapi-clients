

#include "ItemDetail_sprites.h"

using namespace Tiny;

ItemDetail_sprites::ItemDetail_sprites()
{
	r_default = std::string();
}

ItemDetail_sprites::ItemDetail_sprites(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDetail_sprites::~ItemDetail_sprites()
{

}

void
ItemDetail_sprites::fromJson(std::string jsonObj)
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
ItemDetail_sprites::toJson()
{
    bourne::json object = bourne::json::object();





    object["r_default"] = getRDefault();



    return object;

}

std::string
ItemDetail_sprites::getRDefault()
{
	return r_default;
}

void
ItemDetail_sprites::setRDefault(std::string r_default)
{
	this->r_default = r_default;
}



