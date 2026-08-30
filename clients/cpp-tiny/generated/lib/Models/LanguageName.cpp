

#include "LanguageName.h"

using namespace Tiny;

LanguageName::LanguageName()
{
	name = std::string();
	language = LanguageSummary();
}

LanguageName::LanguageName(std::string jsonString)
{
	this->fromJson(jsonString);
}

LanguageName::~LanguageName()
{

}

void
LanguageName::fromJson(std::string jsonObj)
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
LanguageName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
LanguageName::getName()
{
	return name;
}

void
LanguageName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
LanguageName::getLanguage()
{
	return language;
}

void
LanguageName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



