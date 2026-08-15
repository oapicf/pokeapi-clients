

#include "GenerationName.h"

using namespace Tiny;

GenerationName::GenerationName()
{
	name = std::string();
	language = LanguageSummary();
}

GenerationName::GenerationName(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerationName::~GenerationName()
{

}

void
GenerationName::fromJson(std::string jsonObj)
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
GenerationName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
GenerationName::getName()
{
	return name;
}

void
GenerationName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
GenerationName::getLanguage()
{
	return language;
}

void
GenerationName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



