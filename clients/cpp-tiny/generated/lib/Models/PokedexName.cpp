

#include "PokedexName.h"

using namespace Tiny;

PokedexName::PokedexName()
{
	name = std::string();
	language = LanguageSummary();
}

PokedexName::PokedexName(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokedexName::~PokedexName()
{

}

void
PokedexName::fromJson(std::string jsonObj)
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
PokedexName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokedexName::getName()
{
	return name;
}

void
PokedexName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
PokedexName::getLanguage()
{
	return language;
}

void
PokedexName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



