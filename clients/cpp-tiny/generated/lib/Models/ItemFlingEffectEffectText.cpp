

#include "ItemFlingEffectEffectText.h"

using namespace Tiny;

ItemFlingEffectEffectText::ItemFlingEffectEffectText()
{
	effect = std::string();
	language = LanguageSummary();
}

ItemFlingEffectEffectText::ItemFlingEffectEffectText(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemFlingEffectEffectText::~ItemFlingEffectEffectText()
{

}

void
ItemFlingEffectEffectText::fromJson(std::string jsonObj)
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
ItemFlingEffectEffectText::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ItemFlingEffectEffectText::getEffect()
{
	return effect;
}

void
ItemFlingEffectEffectText::setEffect(std::string  effect)
{
	this->effect = effect;
}

LanguageSummary
ItemFlingEffectEffectText::getLanguage()
{
	return language;
}

void
ItemFlingEffectEffectText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



