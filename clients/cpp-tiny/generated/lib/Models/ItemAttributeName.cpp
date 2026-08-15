

#include "ItemAttributeName.h"

using namespace Tiny;

ItemAttributeName::ItemAttributeName()
{
	name = std::string();
	language = LanguageSummary();
}

ItemAttributeName::ItemAttributeName(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemAttributeName::~ItemAttributeName()
{

}

void
ItemAttributeName::fromJson(std::string jsonObj)
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
ItemAttributeName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ItemAttributeName::getName()
{
	return name;
}

void
ItemAttributeName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
ItemAttributeName::getLanguage()
{
	return language;
}

void
ItemAttributeName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



