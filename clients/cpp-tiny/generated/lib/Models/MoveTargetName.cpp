

#include "MoveTargetName.h"

using namespace Tiny;

MoveTargetName::MoveTargetName()
{
	name = std::string();
	language = LanguageSummary();
}

MoveTargetName::MoveTargetName(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveTargetName::~MoveTargetName()
{

}

void
MoveTargetName::fromJson(std::string jsonObj)
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
MoveTargetName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveTargetName::getName()
{
	return name;
}

void
MoveTargetName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
MoveTargetName::getLanguage()
{
	return language;
}

void
MoveTargetName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



