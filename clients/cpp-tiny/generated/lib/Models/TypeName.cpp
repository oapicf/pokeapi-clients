

#include "TypeName.h"

using namespace Tiny;

TypeName::TypeName()
{
	name = std::string();
	language = null;
}

TypeName::TypeName(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeName::~TypeName()
{

}

void
TypeName::fromJson(std::string jsonObj)
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
TypeName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
TypeName::getName()
{
	return name;
}

void
TypeName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
TypeName::getLanguage()
{
	return language;
}

void
TypeName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



