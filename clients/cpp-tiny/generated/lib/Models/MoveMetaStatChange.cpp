

#include "MoveMetaStatChange.h"

using namespace Tiny;

MoveMetaStatChange::MoveMetaStatChange()
{
	change = int(0);
	stat = null;
}

MoveMetaStatChange::MoveMetaStatChange(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveMetaStatChange::~MoveMetaStatChange()
{

}

void
MoveMetaStatChange::fromJson(std::string jsonObj)
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




        StatSummary* obj = &stat;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveMetaStatChange::toJson()
{
    bourne::json object = bourne::json::object();





    object["change"] = getChange();







	object["stat"] = getStat().toJson();


    return object;

}

int
MoveMetaStatChange::getChange()
{
	return change;
}

void
MoveMetaStatChange::setChange(int change)
{
	this->change = change;
}

StatSummary
MoveMetaStatChange::getStat()
{
	return stat;
}

void
MoveMetaStatChange::setStat(StatSummary stat)
{
	this->stat = stat;
}



