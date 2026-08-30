

#include "ContestTypeName.h"

using namespace Tiny;

ContestTypeName::ContestTypeName()
{
	name = std::string();
	color = std::string();
	language = LanguageSummary();
}

ContestTypeName::ContestTypeName(std::string jsonString)
{
	this->fromJson(jsonString);
}

ContestTypeName::~ContestTypeName()
{

}

void
ContestTypeName::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *colorKey = "color";

    if(object.has_key(colorKey))
    {
        bourne::json value = object[colorKey];



        jsonToValue(&color, value, "std::string");


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        LanguageSummary* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
ContestTypeName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["color"] = getColor();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ContestTypeName::getName()
{
	return name;
}

void
ContestTypeName::setName(std::string name)
{
	this->name = name;
}

std::string
ContestTypeName::getColor()
{
	return color;
}

void
ContestTypeName::setColor(std::string color)
{
	this->color = color;
}

LanguageSummary
ContestTypeName::getLanguage()
{
	return language;
}

void
ContestTypeName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



