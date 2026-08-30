

#include "NatureName.h"

using namespace Tiny;

NatureName::NatureName()
{
	name = std::string();
	language = LanguageSummary();
}

NatureName::NatureName(std::string jsonString)
{
	this->fromJson(jsonString);
}

NatureName::~NatureName()
{

}

void
NatureName::fromJson(std::string jsonObj)
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
NatureName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
NatureName::getName()
{
	return name;
}

void
NatureName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
NatureName::getLanguage()
{
	return language;
}

void
NatureName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



