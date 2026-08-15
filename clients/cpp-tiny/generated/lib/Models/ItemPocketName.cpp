

#include "ItemPocketName.h"

using namespace Tiny;

ItemPocketName::ItemPocketName()
{
	name = std::string();
	language = LanguageSummary();
}

ItemPocketName::ItemPocketName(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemPocketName::~ItemPocketName()
{

}

void
ItemPocketName::fromJson(std::string jsonObj)
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
ItemPocketName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ItemPocketName::getName()
{
	return name;
}

void
ItemPocketName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
ItemPocketName::getLanguage()
{
	return language;
}

void
ItemPocketName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



