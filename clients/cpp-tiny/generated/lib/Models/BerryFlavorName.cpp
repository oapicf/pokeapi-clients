

#include "BerryFlavorName.h"

using namespace Tiny;

BerryFlavorName::BerryFlavorName()
{
	name = std::string();
	language = LanguageSummary();
}

BerryFlavorName::BerryFlavorName(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFlavorName::~BerryFlavorName()
{

}

void
BerryFlavorName::fromJson(std::string jsonObj)
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
BerryFlavorName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
BerryFlavorName::getName()
{
	return name;
}

void
BerryFlavorName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
BerryFlavorName::getLanguage()
{
	return language;
}

void
BerryFlavorName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



