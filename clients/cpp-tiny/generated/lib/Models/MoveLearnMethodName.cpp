

#include "MoveLearnMethodName.h"

using namespace Tiny;

MoveLearnMethodName::MoveLearnMethodName()
{
	name = std::string();
	language = LanguageSummary();
}

MoveLearnMethodName::MoveLearnMethodName(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveLearnMethodName::~MoveLearnMethodName()
{

}

void
MoveLearnMethodName::fromJson(std::string jsonObj)
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
MoveLearnMethodName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveLearnMethodName::getName()
{
	return name;
}

void
MoveLearnMethodName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
MoveLearnMethodName::getLanguage()
{
	return language;
}

void
MoveLearnMethodName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



