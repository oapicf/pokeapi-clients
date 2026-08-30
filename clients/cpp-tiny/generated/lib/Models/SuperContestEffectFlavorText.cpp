

#include "SuperContestEffectFlavorText.h"

using namespace Tiny;

SuperContestEffectFlavorText::SuperContestEffectFlavorText()
{
	flavor_text = std::string();
	language = LanguageSummary();
}

SuperContestEffectFlavorText::SuperContestEffectFlavorText(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuperContestEffectFlavorText::~SuperContestEffectFlavorText()
{

}

void
SuperContestEffectFlavorText::fromJson(std::string jsonObj)
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
SuperContestEffectFlavorText::toJson()
{
    bourne::json object = bourne::json::object();





    object["flavor_text"] = getFlavorText();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
SuperContestEffectFlavorText::getFlavorText()
{
	return flavor_text;
}

void
SuperContestEffectFlavorText::setFlavorText(std::string flavor_text)
{
	this->flavor_text = flavor_text;
}

LanguageSummary
SuperContestEffectFlavorText::getLanguage()
{
	return language;
}

void
SuperContestEffectFlavorText::setLanguage(LanguageSummary language)
{
	this->language = language;
}



