

#include "AbilityEffectText.h"

using namespace Tiny;

AbilityEffectText::AbilityEffectText()
{
	effect = std::string();
	short_effect = std::string();
	language = LanguageSummary();
}

AbilityEffectText::AbilityEffectText(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityEffectText::~AbilityEffectText()
{

}

void
AbilityEffectText::fromJson(std::string jsonObj)
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
AbilityEffectText::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();






    object["short_effect"] = getShortEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
AbilityEffectText::getEffect()
{
	return effect;
}

void
AbilityEffectText::setEffect(std::string  effect)
{
	this->effect = effect;
}

std::string
AbilityEffectText::getShortEffect()
{
	return short_effect;
}

void
AbilityEffectText::setShortEffect(std::string  short_effect)
{
	this->short_effect = short_effect;
}

LanguageSummary
AbilityEffectText::getLanguage()
{
	return language;
}

void
AbilityEffectText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



