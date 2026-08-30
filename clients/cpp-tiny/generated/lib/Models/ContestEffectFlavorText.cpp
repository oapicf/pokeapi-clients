

#include "ContestEffectFlavorText.h"

using namespace Tiny;

ContestEffectFlavorText::ContestEffectFlavorText()
{
	flavor_text = std::string();
	language = LanguageSummary();
}

ContestEffectFlavorText::ContestEffectFlavorText(std::string jsonString)
{
	this->fromJson(jsonString);
}

ContestEffectFlavorText::~ContestEffectFlavorText()
{

}

void
ContestEffectFlavorText::fromJson(std::string jsonObj)
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


}

bourne::json
ContestEffectFlavorText::toJson()
{
    bourne::json object = bourne::json::object();





    object["flavor_text"] = getFlavorText();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ContestEffectFlavorText::getFlavorText()
{
	return flavor_text;
}

void
ContestEffectFlavorText::setFlavorText(std::string flavor_text)
{
	this->flavor_text = flavor_text;
}

LanguageSummary
ContestEffectFlavorText::getLanguage()
{
	return language;
}

void
ContestEffectFlavorText::setLanguage(LanguageSummary language)
{
	this->language = language;
}



