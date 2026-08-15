

#include "PalParkAreaName.h"

using namespace Tiny;

PalParkAreaName::PalParkAreaName()
{
	name = std::string();
	language = LanguageSummary();
}

PalParkAreaName::PalParkAreaName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PalParkAreaName::~PalParkAreaName()
{

}

void
PalParkAreaName::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


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
PalParkAreaName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PalParkAreaName::getName()
{
	return name;
}

void
PalParkAreaName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
PalParkAreaName::getLanguage()
{
	return language;
}

void
PalParkAreaName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



