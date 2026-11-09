

#include "PokemonFormFlavorText.h"

using namespace Tiny;

PokemonFormFlavorText::PokemonFormFlavorText()
{
	flavor_text = std::string();
	language = null;
	version = null;
}

PokemonFormFlavorText::PokemonFormFlavorText(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormFlavorText::~PokemonFormFlavorText()
{

}

void
PokemonFormFlavorText::fromJson(std::string jsonObj)
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
PokemonFormFlavorText::toJson()
{
    bourne::json object = bourne::json::object();





    object["flavor_text"] = getFlavorText();







	object["language"] = getLanguage().toJson();






	object["version"] = getVersion().toJson();


    return object;

}

std::string
PokemonFormFlavorText::getFlavorText()
{
	return flavor_text;
}

void
PokemonFormFlavorText::setFlavorText(std::string flavor_text)
{
	this->flavor_text = flavor_text;
}

LanguageSummary
PokemonFormFlavorText::getLanguage()
{
	return language;
}

void
PokemonFormFlavorText::setLanguage(LanguageSummary language)
{
	this->language = language;
}

VersionSummary
PokemonFormFlavorText::getVersion()
{
	return version;
}

void
PokemonFormFlavorText::setVersion(VersionSummary version)
{
	this->version = version;
}



