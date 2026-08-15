

#include "TypeDetail_sprites_value_value.h"

using namespace Tiny;

TypeDetail_sprites_value_value::TypeDetail_sprites_value_value()
{
	nameicon = std::string();
}

TypeDetail_sprites_value_value::TypeDetail_sprites_value_value(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeDetail_sprites_value_value::~TypeDetail_sprites_value_value()
{

}

void
TypeDetail_sprites_value_value::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameiconKey = "name-icon";

    if(object.has_key(nameiconKey))
    {
        bourne::json value = object[nameiconKey];



        jsonToValue(&nameicon, value, "std::string");


    }


}

bourne::json
TypeDetail_sprites_value_value::toJson()
{
    bourne::json object = bourne::json::object();





    object["nameicon"] = getNameicon();



    return object;

}

std::string
TypeDetail_sprites_value_value::getNameicon()
{
	return nameicon;
}

void
TypeDetail_sprites_value_value::setNameicon(std::string  nameicon)
{
	this->nameicon = nameicon;
}



