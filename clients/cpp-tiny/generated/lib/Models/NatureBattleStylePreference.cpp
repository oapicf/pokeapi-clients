

#include "NatureBattleStylePreference.h"

using namespace Tiny;

NatureBattleStylePreference::NatureBattleStylePreference()
{
	low_hp_preference = int(0);
	high_hp_preference = int(0);
	move_battle_style = MoveBattleStyleSummary();
}

NatureBattleStylePreference::NatureBattleStylePreference(std::string jsonString)
{
	this->fromJson(jsonString);
}

NatureBattleStylePreference::~NatureBattleStylePreference()
{

}

void
NatureBattleStylePreference::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *low_hp_preferenceKey = "low_hp_preference";

    if(object.has_key(low_hp_preferenceKey))
    {
        bourne::json value = object[low_hp_preferenceKey];



        jsonToValue(&low_hp_preference, value, "int");


    }

    const char *high_hp_preferenceKey = "high_hp_preference";

    if(object.has_key(high_hp_preferenceKey))
    {
        bourne::json value = object[high_hp_preferenceKey];



        jsonToValue(&high_hp_preference, value, "int");


    }

    const char *move_battle_styleKey = "move_battle_style";

    if(object.has_key(move_battle_styleKey))
    {
        bourne::json value = object[move_battle_styleKey];




        MoveBattleStyleSummary* obj = &move_battle_style;
		obj->fromJson(value.dump());

    }


}

bourne::json
NatureBattleStylePreference::toJson()
{
    bourne::json object = bourne::json::object();





    object["low_hp_preference"] = getLowHpPreference();






    object["high_hp_preference"] = getHighHpPreference();







	object["move_battle_style"] = getMoveBattleStyle().toJson();


    return object;

}

int
NatureBattleStylePreference::getLowHpPreference()
{
	return low_hp_preference;
}

void
NatureBattleStylePreference::setLowHpPreference(int  low_hp_preference)
{
	this->low_hp_preference = low_hp_preference;
}

int
NatureBattleStylePreference::getHighHpPreference()
{
	return high_hp_preference;
}

void
NatureBattleStylePreference::setHighHpPreference(int  high_hp_preference)
{
	this->high_hp_preference = high_hp_preference;
}

MoveBattleStyleSummary
NatureBattleStylePreference::getMoveBattleStyle()
{
	return move_battle_style;
}

void
NatureBattleStylePreference::setMoveBattleStyle(MoveBattleStyleSummary  move_battle_style)
{
	this->move_battle_style = move_battle_style;
}



