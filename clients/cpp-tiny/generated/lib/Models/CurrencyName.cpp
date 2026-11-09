

#include "CurrencyName.h"

using namespace Tiny;

CurrencyName::CurrencyName()
{
	name = std::string();
	language = null;
}

CurrencyName::CurrencyName(std::string jsonString)
{
	this->fromJson(jsonString);
}

CurrencyName::~CurrencyName()
{

}

void
CurrencyName::fromJson(std::string jsonObj)
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
CurrencyName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
CurrencyName::getName()
{
	return name;
}

void
CurrencyName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
CurrencyName::getLanguage()
{
	return language;
}

void
CurrencyName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



