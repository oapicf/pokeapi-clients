

#include "EncounterMethodName.h"

using namespace Tiny;

EncounterMethodName::EncounterMethodName()
{
	name = std::string();
	language = LanguageSummary();
}

EncounterMethodName::EncounterMethodName(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterMethodName::~EncounterMethodName()
{

}

void
EncounterMethodName::fromJson(std::string jsonObj)
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
EncounterMethodName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
EncounterMethodName::getName()
{
	return name;
}

void
EncounterMethodName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
EncounterMethodName::getLanguage()
{
	return language;
}

void
EncounterMethodName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



