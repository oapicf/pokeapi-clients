

#include "MoveDetail_stat_changes_inner.h"

using namespace Tiny;

MoveDetail_stat_changes_inner::MoveDetail_stat_changes_inner()
{
	change = int(0);
	stat = AbilityDetail_pokemon_inner_pokemon();
}

MoveDetail_stat_changes_inner::MoveDetail_stat_changes_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDetail_stat_changes_inner::~MoveDetail_stat_changes_inner()
{

}

void
MoveDetail_stat_changes_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *changeKey = "change";

    if(object.has_key(changeKey))
    {
        bourne::json value = object[changeKey];



        jsonToValue(&change, value, "int");


    }

    const char *statKey = "stat";

    if(object.has_key(statKey))
    {
        bourne::json value = object[statKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &stat;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveDetail_stat_changes_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["change"] = getChange();







	object["stat"] = getStat().toJson();


    return object;

}

int
MoveDetail_stat_changes_inner::getChange()
{
	return change;
}

void
MoveDetail_stat_changes_inner::setChange(int change)
{
	this->change = change;
}

AbilityDetail_pokemon_inner_pokemon
MoveDetail_stat_changes_inner::getStat()
{
	return stat;
}

void
MoveDetail_stat_changes_inner::setStat(AbilityDetail_pokemon_inner_pokemon stat)
{
	this->stat = stat;
}



