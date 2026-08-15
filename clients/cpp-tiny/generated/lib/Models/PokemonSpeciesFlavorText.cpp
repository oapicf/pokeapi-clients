

#include "PokemonSpeciesFlavorText.h"

using namespace Tiny;

PokemonSpeciesFlavorText::PokemonSpeciesFlavorText()
{
	flavor_text = std::string();
	language = LanguageSummary();
	version = VersionSummary();
}

PokemonSpeciesFlavorText::PokemonSpeciesFlavorText(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesFlavorText::~PokemonSpeciesFlavorText()
{

}

void
PokemonSpeciesFlavorText::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *flavor_textKey = "flavor_text";

    if(object.has_key(flavor_textKey))
    {
        bourne::json value = object[flavor_textKey];



        jsonToValue(&flavor_text, value, "std::string");


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        LanguageSummary* obj = &language;
		obj->fromJson(value.dump());

    }

    const char *versionKey = "version";

    if(object.has_key(versionKey))
    {
        bourne::json value = object[versionKey];




        VersionSummary* obj = &version;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonSpeciesFlavorText::toJson()
{
    bourne::json object = bourne::json::object();





    object["flavor_text"] = getFlavorText();







	object["language"] = getLanguage().toJson();






	object["version"] = getVersion().toJson();


    return object;

}

std::string
PokemonSpeciesFlavorText::getFlavorText()
{
	return flavor_text;
}

void
PokemonSpeciesFlavorText::setFlavorText(std::string  flavor_text)
{
	this->flavor_text = flavor_text;
}

LanguageSummary
PokemonSpeciesFlavorText::getLanguage()
{
	return language;
}

void
PokemonSpeciesFlavorText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}

VersionSummary
PokemonSpeciesFlavorText::getVersion()
{
	return version;
}

void
PokemonSpeciesFlavorText::setVersion(VersionSummary  version)
{
	this->version = version;
}



