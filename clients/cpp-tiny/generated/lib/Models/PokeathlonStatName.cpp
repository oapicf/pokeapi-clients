

#include "PokeathlonStatName.h"

using namespace Tiny;

PokeathlonStatName::PokeathlonStatName()
{
	name = std::string();
	language = LanguageSummary();
}

PokeathlonStatName::PokeathlonStatName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokeathlonStatName::~PokeathlonStatName()
{

}

void
PokeathlonStatName::fromJson(std::string jsonObj)
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
PokeathlonStatName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokeathlonStatName::getName()
{
	return name;
}

void
PokeathlonStatName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
PokeathlonStatName::getLanguage()
{
	return language;
}

void
PokeathlonStatName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



