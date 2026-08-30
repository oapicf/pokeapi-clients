

#include "MoveLearnMethodDescription.h"

using namespace Tiny;

MoveLearnMethodDescription::MoveLearnMethodDescription()
{
	description = std::string();
	language = LanguageSummary();
}

MoveLearnMethodDescription::MoveLearnMethodDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveLearnMethodDescription::~MoveLearnMethodDescription()
{

}

void
MoveLearnMethodDescription::fromJson(std::string jsonObj)
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
MoveLearnMethodDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveLearnMethodDescription::getDescription()
{
	return description;
}

void
MoveLearnMethodDescription::setDescription(std::string description)
{
	this->description = description;
}

LanguageSummary
MoveLearnMethodDescription::getLanguage()
{
	return language;
}

void
MoveLearnMethodDescription::setLanguage(LanguageSummary language)
{
	this->language = language;
}



