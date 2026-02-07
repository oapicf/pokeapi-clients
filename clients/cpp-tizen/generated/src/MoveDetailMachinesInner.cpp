#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveDetail_machines_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveDetail_machines_inner::MoveDetail_machines_inner()
{
	//__init();
}

MoveDetail_machines_inner::~MoveDetail_machines_inner()
{
	//__cleanup();
}

void
MoveDetail_machines_inner::__init()
{
	//machine = new MoveDetail_machines_inner_machine();
	//version_group = new AbilityDetail_pokemon_inner_pokemon();
}

void
MoveDetail_machines_inner::__cleanup()
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
MoveDetail_machines_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *machineKey = "machine";
	node = json_object_get_member(pJsonObject, machineKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveDetail_machines_inner_machine")) {
			jsonToValue(&machine, node, "MoveDetail_machines_inner_machine", "MoveDetail_machines_inner_machine");
		} else {
			
			MoveDetail_machines_inner_machine* obj = static_cast<MoveDetail_machines_inner_machine*> (&machine);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&version_group, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MoveDetail_machines_inner::MoveDetail_machines_inner(char* json)
{
	this->fromJson(json);
}

char*
MoveDetail_machines_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MoveDetail_machines_inner_machine")) {
		MoveDetail_machines_inner_machine obj = getMachine();
		node = converttoJson(&obj, "MoveDetail_machines_inner_machine", "");
	}
	else {
		
		MoveDetail_machines_inner_machine obj = static_cast<MoveDetail_machines_inner_machine> (getMachine());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *machineKey = "machine";
	json_object_set_member(pJsonObject, machineKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getVersionGroup();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getVersionGroup());
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

MoveDetail_machines_inner_machine
MoveDetail_machines_inner::getMachine()
{
	return machine;
}

void
MoveDetail_machines_inner::setMachine(MoveDetail_machines_inner_machine  machine)
{
	this->machine = machine;
}

AbilityDetail_pokemon_inner_pokemon
MoveDetail_machines_inner::getVersionGroup()
{
	return version_group;
}

void
MoveDetail_machines_inner::setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group)
{
	this->version_group = version_group;
}


