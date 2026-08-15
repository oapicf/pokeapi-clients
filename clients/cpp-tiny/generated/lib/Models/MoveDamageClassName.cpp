

#include "MoveDamageClassName.h"

using namespace Tiny;

MoveDamageClassName::MoveDamageClassName()
{
	name = std::string();
	language = LanguageSummary();
}

MoveDamageClassName::MoveDamageClassName(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDamageClassName::~MoveDamageClassName()
{

}

void
MoveDamageClassName::fromJson(std::string jsonObj)
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
MoveDamageClassName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveDamageClassName::getName()
{
	return name;
}

void
MoveDamageClassName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
MoveDamageClassName::getLanguage()
{
	return language;
}

void
MoveDamageClassName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



