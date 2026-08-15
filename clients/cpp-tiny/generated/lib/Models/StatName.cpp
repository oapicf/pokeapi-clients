

#include "StatName.h"

using namespace Tiny;

StatName::StatName()
{
	name = std::string();
	language = LanguageSummary();
}

StatName::StatName(std::string jsonString)
{
	this->fromJson(jsonString);
}

StatName::~StatName()
{

}

void
StatName::fromJson(std::string jsonObj)
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
StatName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
StatName::getName()
{
	return name;
}

void
StatName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
StatName::getLanguage()
{
	return language;
}

void
StatName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



