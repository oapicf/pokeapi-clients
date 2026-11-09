

#include "MoveEffectEffectText.h"

using namespace Tiny;

MoveEffectEffectText::MoveEffectEffectText()
{
	effect = std::string();
	short_effect = std::string();
	language = null;
}

MoveEffectEffectText::MoveEffectEffectText(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveEffectEffectText::~MoveEffectEffectText()
{

}

void
MoveEffectEffectText::fromJson(std::string jsonObj)
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
MoveEffectEffectText::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();






    object["short_effect"] = getShortEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveEffectEffectText::getEffect()
{
	return effect;
}

void
MoveEffectEffectText::setEffect(std::string effect)
{
	this->effect = effect;
}

std::string
MoveEffectEffectText::getShortEffect()
{
	return short_effect;
}

void
MoveEffectEffectText::setShortEffect(std::string short_effect)
{
	this->short_effect = short_effect;
}

LanguageSummary
MoveEffectEffectText::getLanguage()
{
	return language;
}

void
MoveEffectEffectText::setLanguage(LanguageSummary language)
{
	this->language = language;
}



