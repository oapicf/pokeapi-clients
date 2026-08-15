

#include "LocationAreaName.h"

using namespace Tiny;

LocationAreaName::LocationAreaName()
{
	name = std::string();
	language = LanguageSummary();
}

LocationAreaName::LocationAreaName(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaName::~LocationAreaName()
{

}

void
LocationAreaName::fromJson(std::string jsonObj)
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
LocationAreaName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
LocationAreaName::getName()
{
	return name;
}

void
LocationAreaName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
LocationAreaName::getLanguage()
{
	return language;
}

void
LocationAreaName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



