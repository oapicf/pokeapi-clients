#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MachineDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MachineDetail::MachineDetail()
{
	//__init();
}

MachineDetail::~MachineDetail()
{
	//__cleanup();
}

void
MachineDetail::__init()
{
	//id = int(0);
	//item = new ItemSummary();
	//version_group = new VersionGroupSummary();
	//move = new MoveSummary();
}

void
MachineDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(item != NULL) {
	//
	//delete item;
	//item = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//if(move != NULL) {
	//
	//delete move;
	//move = NULL;
	//}
	//
}

void
MachineDetail::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *itemKey = "item";
	node = json_object_get_member(pJsonObject, itemKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemSummary")) {
			jsonToValue(&item, node, "ItemSummary", "ItemSummary");
		} else {
			
			ItemSummary* obj = static_cast<ItemSummary*> (&item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionGroupSummary")) {
			jsonToValue(&version_group, node, "VersionGroupSummary", "VersionGroupSummary");
		} else {
			
			VersionGroupSummary* obj = static_cast<VersionGroupSummary*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *moveKey = "move";
	node = json_object_get_member(pJsonObject, moveKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveSummary")) {
			jsonToValue(&move, node, "MoveSummary", "MoveSummary");
		} else {
			
			MoveSummary* obj = static_cast<MoveSummary*> (&move);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MachineDetail::MachineDetail(char* json)
{
	this->fromJson(json);
}

char*
MachineDetail::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("ItemSummary")) {
		ItemSummary obj = getItem();
		node = converttoJson(&obj, "ItemSummary", "");
	}
	else {
		
		ItemSummary obj = static_cast<ItemSummary> (getItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemKey = "item";
	json_object_set_member(pJsonObject, itemKey, node);
	if (isprimitive("VersionGroupSummary")) {
		VersionGroupSummary obj = getVersionGroup();
		node = converttoJson(&obj, "VersionGroupSummary", "");
	}
	else {
		
		VersionGroupSummary obj = static_cast<VersionGroupSummary> (getVersionGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *version_groupKey = "version_group";
	json_object_set_member(pJsonObject, version_groupKey, node);
	if (isprimitive("MoveSummary")) {
		MoveSummary obj = getMove();
		node = converttoJson(&obj, "MoveSummary", "");
	}
	else {
		
		MoveSummary obj = static_cast<MoveSummary> (getMove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *moveKey = "move";
	json_object_set_member(pJsonObject, moveKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


