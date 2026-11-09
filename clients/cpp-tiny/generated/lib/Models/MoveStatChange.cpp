

#include "MoveStatChange.h"

using namespace Tiny;

MoveStatChange::MoveStatChange()
{
	change = int(0);
	move = null;
}

MoveStatChange::MoveStatChange(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveStatChange::~MoveStatChange()
{

}

void
MoveStatChange::fromJson(std::string jsonObj)
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




        MoveSummary* obj = &move;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveStatChange::toJson()
{
    bourne::json object = bourne::json::object();





    object["change"] = getChange();







	object["move"] = getMove().toJson();


    return object;

}

int
MoveStatChange::getChange()
{
	return change;
}

void
MoveStatChange::setChange(int change)
{
	this->change = change;
}

MoveSummary
MoveStatChange::getMove()
{
	return move;
}

void
MoveStatChange::setMove(MoveSummary move)
{
	this->move = move;
}



