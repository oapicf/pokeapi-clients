

#include "ItemCategoryName.h"

using namespace Tiny;

ItemCategoryName::ItemCategoryName()
{
	name = std::string();
	language = LanguageSummary();
}

ItemCategoryName::ItemCategoryName(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemCategoryName::~ItemCategoryName()
{

}

void
ItemCategoryName::fromJson(std::string jsonObj)
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
ItemCategoryName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ItemCategoryName::getName()
{
	return name;
}

void
ItemCategoryName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
ItemCategoryName::getLanguage()
{
	return language;
}

void
ItemCategoryName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



