

#include "CharacteristicDescription.h"

using namespace Tiny;

CharacteristicDescription::CharacteristicDescription()
{
	description = std::string();
	language = LanguageSummary();
}

CharacteristicDescription::CharacteristicDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

CharacteristicDescription::~CharacteristicDescription()
{

}

void
CharacteristicDescription::fromJson(std::string jsonObj)
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
CharacteristicDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
CharacteristicDescription::getDescription()
{
	return description;
}

void
CharacteristicDescription::setDescription(std::string description)
{
	this->description = description;
}

LanguageSummary
CharacteristicDescription::getLanguage()
{
	return language;
}

void
CharacteristicDescription::setLanguage(LanguageSummary language)
{
	this->language = language;
}



