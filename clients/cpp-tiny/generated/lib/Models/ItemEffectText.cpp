

#include "ItemEffectText.h"

using namespace Tiny;

ItemEffectText::ItemEffectText()
{
	effect = std::string();
	short_effect = std::string();
	language = LanguageSummary();
}

ItemEffectText::ItemEffectText(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemEffectText::~ItemEffectText()
{

}

void
ItemEffectText::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *effectKey = "effect";

    if(object.has_key(effectKey))
    {
        bourne::json value = object[effectKey];



        jsonToValue(&effect, value, "std::string");


    }

    const char *short_effectKey = "short_effect";

    if(object.has_key(short_effectKey))
    {
        bourne::json value = object[short_effectKey];



        jsonToValue(&short_effect, value, "std::string");


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
ItemEffectText::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();






    object["short_effect"] = getShortEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ItemEffectText::getEffect()
{
	return effect;
}

void
ItemEffectText::setEffect(std::string  effect)
{
	this->effect = effect;
}

std::string
ItemEffectText::getShortEffect()
{
	return short_effect;
}

void
ItemEffectText::setShortEffect(std::string  short_effect)
{
	this->short_effect = short_effect;
}

LanguageSummary
ItemEffectText::getLanguage()
{
	return language;
}

void
ItemEffectText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



