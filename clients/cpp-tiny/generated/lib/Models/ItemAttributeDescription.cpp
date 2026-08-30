

#include "ItemAttributeDescription.h"

using namespace Tiny;

ItemAttributeDescription::ItemAttributeDescription()
{
	description = std::string();
	language = LanguageSummary();
}

ItemAttributeDescription::ItemAttributeDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemAttributeDescription::~ItemAttributeDescription()
{

}

void
ItemAttributeDescription::fromJson(std::string jsonObj)
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
ItemAttributeDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ItemAttributeDescription::getDescription()
{
	return description;
}

void
ItemAttributeDescription::setDescription(std::string description)
{
	this->description = description;
}

LanguageSummary
ItemAttributeDescription::getLanguage()
{
	return language;
}

void
ItemAttributeDescription::setLanguage(LanguageSummary language)
{
	this->language = language;
}



