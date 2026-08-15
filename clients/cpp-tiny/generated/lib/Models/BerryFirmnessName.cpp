

#include "BerryFirmnessName.h"

using namespace Tiny;

BerryFirmnessName::BerryFirmnessName()
{
	name = std::string();
	language = LanguageSummary();
}

BerryFirmnessName::BerryFirmnessName(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFirmnessName::~BerryFirmnessName()
{

}

void
BerryFirmnessName::fromJson(std::string jsonObj)
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
BerryFirmnessName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
BerryFirmnessName::getName()
{
	return name;
}

void
BerryFirmnessName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
BerryFirmnessName::getLanguage()
{
	return language;
}

void
BerryFirmnessName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



