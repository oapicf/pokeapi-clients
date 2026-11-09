

#include "MoveEffectChangeEffectText.h"

using namespace Tiny;

MoveEffectChangeEffectText::MoveEffectChangeEffectText()
{
	effect = std::string();
	language = null;
}

MoveEffectChangeEffectText::MoveEffectChangeEffectText(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveEffectChangeEffectText::~MoveEffectChangeEffectText()
{

}

void
MoveEffectChangeEffectText::fromJson(std::string jsonObj)
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
MoveEffectChangeEffectText::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveEffectChangeEffectText::getEffect()
{
	return effect;
}

void
MoveEffectChangeEffectText::setEffect(std::string effect)
{
	this->effect = effect;
}

LanguageSummary
MoveEffectChangeEffectText::getLanguage()
{
	return language;
}

void
MoveEffectChangeEffectText::setLanguage(LanguageSummary language)
{
	this->language = language;
}



