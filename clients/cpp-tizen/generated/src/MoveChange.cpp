#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveChange.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveChange::MoveChange()
{
	//__init();
}

MoveChange::~MoveChange()
{
	//__cleanup();
}

void
MoveChange::__init()
{
	//accuracy = int(0);
	//power = int(0);
	//pp = int(0);
	//effect_chance = int(0);
	//new std::list()std::list> effect_entries;
	//type = new TypeSummary();
	//version_group = new VersionGroupSummary();
}

void
MoveChange::__cleanup()
{
	//if(accuracy != NULL) {
	//
	//delete accuracy;
	//accuracy = NULL;
	//}
	//if(power != NULL) {
	//
	//delete power;
	//power = NULL;
	//}
	//if(pp != NULL) {
	//
	//delete pp;
	//pp = NULL;
	//}
	//if(effect_chance != NULL) {
	//
	//delete effect_chance;
	//effect_chance = NULL;
	//}
	//if(effect_entries != NULL) {
	//effect_entries.RemoveAll(true);
	//delete effect_entries;
	//effect_entries = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//
}

void
MoveChange::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *accuracyKey = "accuracy";
	node = json_object_get_member(pJsonObject, accuracyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&accuracy, node, "int", "");
		} else {
			
		}
	}
	const gchar *powerKey = "power";
	node = json_object_get_member(pJsonObject, powerKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&power, node, "int", "");
		} else {
			
		}
	}
	const gchar *ppKey = "pp";
	node = json_object_get_member(pJsonObject, ppKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pp, node, "int", "");
		} else {
			
		}
	}
	const gchar *effect_chanceKey = "effect_chance";
	node = json_object_get_member(pJsonObject, effect_chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&effect_chance, node, "int", "");
		} else {
			
		}
	}
	const gchar *effect_entriesKey = "effect_entries";
	node = json_object_get_member(pJsonObject, effect_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveChange_effect_entries_inner> new_list;
			MoveChange_effect_entries_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveChange_effect_entries_inner")) {
					jsonToValue(&inst, temp_json, "MoveChange_effect_entries_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_entries = new_list;
		}
		
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("TypeSummary")) {
			jsonToValue(&type, node, "TypeSummary", "TypeSummary");
		} else {
			
			TypeSummary* obj = static_cast<TypeSummary*> (&type);
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

MoveChange::MoveChange(char* json)
{
	this->fromJson(json);
}

char*
MoveChange::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getAccuracy();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *accuracyKey = "accuracy";
	json_object_set_member(pJsonObject, accuracyKey, node);
	if (isprimitive("int")) {
		int obj = getPower();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *powerKey = "power";
	json_object_set_member(pJsonObject, powerKey, node);
	if (isprimitive("int")) {
		int obj = getPp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ppKey = "pp";
	json_object_set_member(pJsonObject, ppKey, node);
	if (isprimitive("int")) {
		int obj = getEffectChance();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *effect_chanceKey = "effect_chance";
	json_object_set_member(pJsonObject, effect_chanceKey, node);
	if (isprimitive("MoveChange_effect_entries_inner")) {
		list<MoveChange_effect_entries_inner> new_list = static_cast<list <MoveChange_effect_entries_inner> > (getEffectEntries());
		node = converttoJson(&new_list, "MoveChange_effect_entries_inner", "array");
	} else {
		node = json_node_alloc();
		list<MoveChange_effect_entries_inner> new_list = static_cast<list <MoveChange_effect_entries_inner> > (getEffectEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveChange_effect_entries_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveChange_effect_entries_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_entriesKey = "effect_entries";
	json_object_set_member(pJsonObject, effect_entriesKey, node);
	if (isprimitive("TypeSummary")) {
		TypeSummary obj = getType();
		node = converttoJson(&obj, "TypeSummary", "");
	}
	else {
		
		TypeSummary obj = static_cast<TypeSummary> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
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

int
MoveChange::getAccuracy()
{
	return accuracy;
}

void
MoveChange::setAccuracy(int  accuracy)
{
	this->accuracy = accuracy;
}

int
MoveChange::getPower()
{
	return power;
}

void
MoveChange::setPower(int  power)
{
	this->power = power;
}

int
MoveChange::getPp()
{
	return pp;
}

void
MoveChange::setPp(int  pp)
{
	this->pp = pp;
}

int
MoveChange::getEffectChance()
{
	return effect_chance;
}

void
MoveChange::setEffectChance(int  effect_chance)
{
	this->effect_chance = effect_chance;
}

std::list<MoveChange_effect_entries_inner>
MoveChange::getEffectEntries()
{
	return effect_entries;
}

void
MoveChange::setEffectEntries(std::list <MoveChange_effect_entries_inner> effect_entries)
{
	this->effect_entries = effect_entries;
}

TypeSummary
MoveChange::getType()
{
	return type;
}

void
MoveChange::setType(TypeSummary  type)
{
	this->type = type;
}

VersionGroupSummary
MoveChange::getVersionGroup()
{
	return version_group;
}

void
MoveChange::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}


