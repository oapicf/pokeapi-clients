

#include "EncounterConditionValueName.h"

using namespace Tiny;

EncounterConditionValueName::EncounterConditionValueName()
{
	name = std::string();
	language = LanguageSummary();
}

EncounterConditionValueName::EncounterConditionValueName(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterConditionValueName::~EncounterConditionValueName()
{

}

void
EncounterConditionValueName::fromJson(std::string jsonObj)
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
EncounterConditionValueName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
EncounterConditionValueName::getName()
{
	return name;
}

void
EncounterConditionValueName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
EncounterConditionValueName::getLanguage()
{
	return language;
}

void
EncounterConditionValueName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



