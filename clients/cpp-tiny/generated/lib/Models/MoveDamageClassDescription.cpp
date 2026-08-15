

#include "MoveDamageClassDescription.h"

using namespace Tiny;

MoveDamageClassDescription::MoveDamageClassDescription()
{
	description = std::string();
	language = LanguageSummary();
}

MoveDamageClassDescription::MoveDamageClassDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDamageClassDescription::~MoveDamageClassDescription()
{

}

void
MoveDamageClassDescription::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


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
MoveDamageClassDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveDamageClassDescription::getDescription()
{
	return description;
}

void
MoveDamageClassDescription::setDescription(std::string  description)
{
	this->description = description;
}

LanguageSummary
MoveDamageClassDescription::getLanguage()
{
	return language;
}

void
MoveDamageClassDescription::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



