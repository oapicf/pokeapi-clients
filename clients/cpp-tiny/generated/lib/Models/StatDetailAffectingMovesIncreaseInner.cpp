

#include "StatDetail_affecting_moves_increase_inner.h"

using namespace Tiny;

StatDetail_affecting_moves_increase_inner::StatDetail_affecting_moves_increase_inner()
{
	change = int(0);
	move = AbilityDetail_pokemon_inner_pokemon();
}

StatDetail_affecting_moves_increase_inner::StatDetail_affecting_moves_increase_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

StatDetail_affecting_moves_increase_inner::~StatDetail_affecting_moves_increase_inner()
{

}

void
StatDetail_affecting_moves_increase_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *changeKey = "change";

    if(object.has_key(changeKey))
    {
        bourne::json value = object[changeKey];



        jsonToValue(&change, value, "int");


    }

    const char *moveKey = "move";

    if(object.has_key(moveKey))
    {
        bourne::json value = object[moveKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &move;
		obj->fromJson(value.dump());

    }


}

bourne::json
StatDetail_affecting_moves_increase_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["change"] = getChange();







	object["move"] = getMove().toJson();


    return object;

}

int
StatDetail_affecting_moves_increase_inner::getChange()
{
	return change;
}

void
StatDetail_affecting_moves_increase_inner::setChange(int  change)
{
	this->change = change;
}

AbilityDetail_pokemon_inner_pokemon
StatDetail_affecting_moves_increase_inner::getMove()
{
	return move;
}

void
StatDetail_affecting_moves_increase_inner::setMove(AbilityDetail_pokemon_inner_pokemon  move)
{
	this->move = move;
}



