#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemMachine.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemMachine::ItemMachine()
{
	//__init();
}

ItemMachine::~ItemMachine()
{
	//__cleanup();
}

void
ItemMachine::__init()
{
	//machine = null;
	//version_group = null;
}

void
ItemMachine::__cleanup()
{
	//if(machine != NULL) {
	//
	//delete machine;
	//machine = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//
}

void
ItemMachine::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *machineKey = "machine";
	node = json_object_get_member(pJsonObject, machineKey);
	if (node !=NULL) {
	

		if (isprimitive("MachineSummary")) {
			jsonToValue(&machine, node, "MachineSummary", "MachineSummary");
		} else {
			
			MachineSummary* obj = static_cast<MachineSummary*> (&machine);
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
}

ItemMachine::ItemMachine(char* json)
{
	this->fromJson(json);
}

char*
ItemMachine::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MachineSummary")) {
		MachineSummary obj = getMachine();
		node = converttoJson(&obj, "MachineSummary", "");
	}
	else {
		
		MachineSummary obj = static_cast<MachineSummary> (getMachine());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *machineKey = "machine";
	json_object_set_member(pJsonObject, machineKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MachineSummary
ItemMachine::getMachine()
{
	return machine;
}

void
ItemMachine::setMachine(MachineSummary  machine)
{
	this->machine = machine;
}

VersionGroupSummary
ItemMachine::getVersionGroup()
{
	return version_group;
}

void
ItemMachine::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}


