

#include "EncounterConditionName.h"

using namespace Tiny;

EncounterConditionName::EncounterConditionName()
{
	name = std::string();
	language = LanguageSummary();
}

EncounterConditionName::EncounterConditionName(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterConditionName::~EncounterConditionName()
{

}

void
EncounterConditionName::fromJson(std::string jsonObj)
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
EncounterConditionName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
EncounterConditionName::getName()
{
	return name;
}

void
EncounterConditionName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
EncounterConditionName::getLanguage()
{
	return language;
}

void
EncounterConditionName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



