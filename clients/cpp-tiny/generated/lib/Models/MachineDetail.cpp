

#include "MachineDetail.h"

using namespace Tiny;

MachineDetail::MachineDetail()
{
	id = int(0);
	item = ItemSummary();
	version_group = VersionGroupSummary();
	move = MoveSummary();
}

MachineDetail::MachineDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

MachineDetail::~MachineDetail()
{

}

void
MachineDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *itemKey = "item";

    if(object.has_key(itemKey))
    {
        bourne::json value = object[itemKey];




        ItemSummary* obj = &item;
		obj->fromJson(value.dump());

    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

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
MachineDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["item"] = getItem().toJson();






	object["version_group"] = getVersionGroup().toJson();






	object["move"] = getMove().toJson();


    return object;

}

int
MachineDetail::getId()
{
	return id;
}

void
MachineDetail::setId(int  id)
{
	this->id = id;
}

ItemSummary
MachineDetail::getItem()
{
	return item;
}

void
MachineDetail::setItem(ItemSummary  item)
{
	this->item = item;
}

VersionGroupSummary
MachineDetail::getVersionGroup()
{
	return version_group;
}

void
MachineDetail::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

MoveSummary
MachineDetail::getMove()
{
	return move;
}

void
MachineDetail::setMove(MoveSummary  move)
{
	this->move = move;
}



