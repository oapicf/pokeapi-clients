

#include "MoveMetaCategoryDescription.h"

using namespace Tiny;

MoveMetaCategoryDescription::MoveMetaCategoryDescription()
{
	description = std::string();
	language = LanguageSummary();
}

MoveMetaCategoryDescription::MoveMetaCategoryDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveMetaCategoryDescription::~MoveMetaCategoryDescription()
{

}

void
MoveMetaCategoryDescription::fromJson(std::string jsonObj)
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
MoveMetaCategoryDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveMetaCategoryDescription::getDescription()
{
	return description;
}

void
MoveMetaCategoryDescription::setDescription(std::string  description)
{
	this->description = description;
}

LanguageSummary
MoveMetaCategoryDescription::getLanguage()
{
	return language;
}

void
MoveMetaCategoryDescription::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



