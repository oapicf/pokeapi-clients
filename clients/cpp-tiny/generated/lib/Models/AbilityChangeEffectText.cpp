

#include "AbilityChangeEffectText.h"

using namespace Tiny;

AbilityChangeEffectText::AbilityChangeEffectText()
{
	effect = std::string();
	language = LanguageSummary();
}

AbilityChangeEffectText::AbilityChangeEffectText(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityChangeEffectText::~AbilityChangeEffectText()
{

}

void
AbilityChangeEffectText::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *effectKey = "effect";

    if(object.has_key(effectKey))
    {
        bourne::json value = object[effectKey];



        jsonToValue(&effect, value, "std::string");


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
AbilityChangeEffectText::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
AbilityChangeEffectText::getEffect()
{
	return effect;
}

void
AbilityChangeEffectText::setEffect(std::string effect)
{
	this->effect = effect;
}

LanguageSummary
AbilityChangeEffectText::getLanguage()
{
	return language;
}

void
AbilityChangeEffectText::setLanguage(LanguageSummary language)
{
	this->language = language;
}



