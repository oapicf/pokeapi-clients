

#include "MoveName.h"

using namespace Tiny;

MoveName::MoveName()
{
	name = std::string();
	language = LanguageSummary();
}

MoveName::MoveName(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveName::~MoveName()
{

}

void
MoveName::fromJson(std::string jsonObj)
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
MoveName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveName::getName()
{
	return name;
}

void
MoveName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
MoveName::getLanguage()
{
	return language;
}

void
MoveName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



