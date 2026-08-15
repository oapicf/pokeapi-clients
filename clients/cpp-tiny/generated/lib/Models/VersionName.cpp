

#include "VersionName.h"

using namespace Tiny;

VersionName::VersionName()
{
	name = std::string();
	language = LanguageSummary();
}

VersionName::VersionName(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionName::~VersionName()
{

}

void
VersionName::fromJson(std::string jsonObj)
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
VersionName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
VersionName::getName()
{
	return name;
}

void
VersionName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
VersionName::getLanguage()
{
	return language;
}

void
VersionName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



