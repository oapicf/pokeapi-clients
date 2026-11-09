

#include "TypeGameSprite.h"

using namespace Tiny;

TypeGameSprite::TypeGameSprite()
{
	name_icon = std::string();
	symbol_icon = std::string();
}

TypeGameSprite::TypeGameSprite(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeGameSprite::~TypeGameSprite()
{

}

void
TypeGameSprite::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *name_iconKey = "name_icon";

    if(object.has_key(name_iconKey))
    {
        bourne::json value = object[name_iconKey];



        jsonToValue(&name_icon, value, "std::string");


    }

    const char *symbol_iconKey = "symbol_icon";

    if(object.has_key(symbol_iconKey))
    {
        bourne::json value = object[symbol_iconKey];



        jsonToValue(&symbol_icon, value, "std::string");


    }


}

bourne::json
TypeGameSprite::toJson()
{
    bourne::json object = bourne::json::object();





    object["name_icon"] = getNameIcon();






    object["symbol_icon"] = getSymbolIcon();



    return object;

}

std::string
TypeGameSprite::getNameIcon()
{
	return name_icon;
}

void
TypeGameSprite::setNameIcon(std::string name_icon)
{
	this->name_icon = name_icon;
}

std::string
TypeGameSprite::getSymbolIcon()
{
	return symbol_icon;
}

void
TypeGameSprite::setSymbolIcon(std::string symbol_icon)
{
	this->symbol_icon = symbol_icon;
}



