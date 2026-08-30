

#include "MoveTargetDescription.h"

using namespace Tiny;

MoveTargetDescription::MoveTargetDescription()
{
	description = std::string();
	language = LanguageSummary();
}

MoveTargetDescription::MoveTargetDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveTargetDescription::~MoveTargetDescription()
{

}

void
MoveTargetDescription::fromJson(std::string jsonObj)
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
MoveTargetDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveTargetDescription::getDescription()
{
	return description;
}

void
MoveTargetDescription::setDescription(std::string description)
{
	this->description = description;
}

LanguageSummary
MoveTargetDescription::getLanguage()
{
	return language;
}

void
MoveTargetDescription::setLanguage(LanguageSummary language)
{
	this->language = language;
}



