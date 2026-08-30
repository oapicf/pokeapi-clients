

#include "AbilityName.h"

using namespace Tiny;

AbilityName::AbilityName()
{
	name = std::string();
	language = LanguageSummary();
}

AbilityName::AbilityName(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityName::~AbilityName()
{

}

void
AbilityName::fromJson(std::string jsonObj)
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
AbilityName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
AbilityName::getName()
{
	return name;
}

void
AbilityName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
AbilityName::getLanguage()
{
	return language;
}

void
AbilityName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



