

#include "ItemName.h"

using namespace Tiny;

ItemName::ItemName()
{
	name = std::string();
	language = LanguageSummary();
}

ItemName::ItemName(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemName::~ItemName()
{

}

void
ItemName::fromJson(std::string jsonObj)
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
ItemName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ItemName::getName()
{
	return name;
}

void
ItemName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
ItemName::getLanguage()
{
	return language;
}

void
ItemName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



