

#include "RegionName.h"

using namespace Tiny;

RegionName::RegionName()
{
	name = std::string();
	language = LanguageSummary();
}

RegionName::RegionName(std::string jsonString)
{
	this->fromJson(jsonString);
}

RegionName::~RegionName()
{

}

void
RegionName::fromJson(std::string jsonObj)
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
RegionName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
RegionName::getName()
{
	return name;
}

void
RegionName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
RegionName::getLanguage()
{
	return language;
}

void
RegionName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



