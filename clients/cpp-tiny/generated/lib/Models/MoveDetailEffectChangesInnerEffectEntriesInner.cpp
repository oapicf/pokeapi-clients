

#include "MoveDetail_effect_changes_inner_effect_entries_inner.h"

using namespace Tiny;

MoveDetail_effect_changes_inner_effect_entries_inner::MoveDetail_effect_changes_inner_effect_entries_inner()
{
	effect = std::string();
	language = AbilityDetail_pokemon_inner_pokemon();
}

MoveDetail_effect_changes_inner_effect_entries_inner::MoveDetail_effect_changes_inner_effect_entries_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDetail_effect_changes_inner_effect_entries_inner::~MoveDetail_effect_changes_inner_effect_entries_inner()
{

}

void
MoveDetail_effect_changes_inner_effect_entries_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveDetail_effect_changes_inner_effect_entries_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["effect"] = getEffect();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveDetail_effect_changes_inner_effect_entries_inner::getEffect()
{
	return effect;
}

void
MoveDetail_effect_changes_inner_effect_entries_inner::setEffect(std::string effect)
{
	this->effect = effect;
}

AbilityDetail_pokemon_inner_pokemon
MoveDetail_effect_changes_inner_effect_entries_inner::getLanguage()
{
	return language;
}

void
MoveDetail_effect_changes_inner_effect_entries_inner::setLanguage(AbilityDetail_pokemon_inner_pokemon language)
{
	this->language = language;
}



