

#include "PokedexDescription.h"

using namespace Tiny;

PokedexDescription::PokedexDescription()
{
	description = std::string();
	language = LanguageSummary();
}

PokedexDescription::PokedexDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokedexDescription::~PokedexDescription()
{

}

void
PokedexDescription::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


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
PokedexDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
PokedexDescription::getDescription()
{
	return description;
}

void
PokedexDescription::setDescription(std::string  description)
{
	this->description = description;
}

LanguageSummary
PokedexDescription::getLanguage()
{
	return language;
}

void
PokedexDescription::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



