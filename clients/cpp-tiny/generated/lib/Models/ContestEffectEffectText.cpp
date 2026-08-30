

#include "ContestEffectEffectText.h"

using namespace Tiny;

ContestEffectEffectText::ContestEffectEffectText()
{
	effect = std::string();
	language = LanguageSummary();
}

ContestEffectEffectText::ContestEffectEffectText(std::string jsonString)
{
	this->fromJson(jsonString);
}

ContestEffectEffectText::~ContestEffectEffectText()
{

}

void
ContestEffectEffectText::fromJson(std::string jsonObj)
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
ContestEffectEffectText::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ContestEffectEffectText::getEffect()
{
	return effect;
}

void
ContestEffectEffectText::setEffect(std::string effect)
{
	this->effect = effect;
}

LanguageSummary
ContestEffectEffectText::getLanguage()
{
	return language;
}

void
ContestEffectEffectText::setLanguage(LanguageSummary language)
{
	this->language = language;
}



