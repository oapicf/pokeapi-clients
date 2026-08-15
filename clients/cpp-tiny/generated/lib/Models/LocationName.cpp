

#include "LocationName.h"

using namespace Tiny;

LocationName::LocationName()
{
	name = std::string();
	language = LanguageSummary();
}

LocationName::LocationName(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationName::~LocationName()
{

}

void
LocationName::fromJson(std::string jsonObj)
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
LocationName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
LocationName::getName()
{
	return name;
}

void
LocationName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
LocationName::getLanguage()
{
	return language;
}

void
LocationName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



