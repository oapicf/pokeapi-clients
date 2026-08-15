

#include "MoveChange_effect_entries_inner.h"

using namespace Tiny;

MoveChange_effect_entries_inner::MoveChange_effect_entries_inner()
{
	effect = std::string();
	short_effect = std::string();
	language = AbilityDetail_pokemon_inner_pokemon();
}

MoveChange_effect_entries_inner::MoveChange_effect_entries_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveChange_effect_entries_inner::~MoveChange_effect_entries_inner()
{

}

void
MoveChange_effect_entries_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveChange_effect_entries_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();






    object["short_effect"] = getShortEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveChange_effect_entries_inner::getEffect()
{
	return effect;
}

void
MoveChange_effect_entries_inner::setEffect(std::string  effect)
{
	this->effect = effect;
}

std::string
MoveChange_effect_entries_inner::getShortEffect()
{
	return short_effect;
}

void
MoveChange_effect_entries_inner::setShortEffect(std::string  short_effect)
{
	this->short_effect = short_effect;
}

AbilityDetail_pokemon_inner_pokemon
MoveChange_effect_entries_inner::getLanguage()
{
	return language;
}

void
MoveChange_effect_entries_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon  language)
{
	this->language = language;
}



