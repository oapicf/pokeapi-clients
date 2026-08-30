

#include "GrowthRateDescription.h"

using namespace Tiny;

GrowthRateDescription::GrowthRateDescription()
{
	description = std::string();
	language = LanguageSummary();
}

GrowthRateDescription::GrowthRateDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

GrowthRateDescription::~GrowthRateDescription()
{

}

void
GrowthRateDescription::fromJson(std::string jsonObj)
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
GrowthRateDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
GrowthRateDescription::getDescription()
{
	return description;
}

void
GrowthRateDescription::setDescription(std::string description)
{
	this->description = description;
}

LanguageSummary
GrowthRateDescription::getLanguage()
{
	return language;
}

void
GrowthRateDescription::setLanguage(LanguageSummary language)
{
	this->language = language;
}



