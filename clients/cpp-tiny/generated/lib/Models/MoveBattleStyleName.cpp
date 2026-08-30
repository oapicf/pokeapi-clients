

#include "MoveBattleStyleName.h"

using namespace Tiny;

MoveBattleStyleName::MoveBattleStyleName()
{
	name = std::string();
	language = LanguageSummary();
}

MoveBattleStyleName::MoveBattleStyleName(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveBattleStyleName::~MoveBattleStyleName()
{

}

void
MoveBattleStyleName::fromJson(std::string jsonObj)
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
MoveBattleStyleName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveBattleStyleName::getName()
{
	return name;
}

void
MoveBattleStyleName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
MoveBattleStyleName::getLanguage()
{
	return language;
}

void
MoveBattleStyleName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



