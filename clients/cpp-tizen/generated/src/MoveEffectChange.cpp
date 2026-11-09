#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveEffectChange.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveEffectChange::MoveEffectChange()
{
	//__init();
}

MoveEffectChange::~MoveEffectChange()
{
	//__cleanup();
}

void
MoveEffectChange::__init()
{
	//version_group = null;
	//new std::list()std::list> effect_entries;
}

void
MoveEffectChange::__cleanup()
{
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//if(effect_entries != NULL) {
	//effect_entries.RemoveAll(true);
	//delete effect_entries;
	//effect_entries = NULL;
	//}
	//
}

void
MoveEffectChange::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *effect_entriesKey = "effect_entries";
	node = json_object_get_member(pJsonObject, effect_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveEffectChangeEffectText> new_list;
			MoveEffectChangeEffectText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveEffectChangeEffectText")) {
					jsonToValue(&inst, temp_json, "MoveEffectChangeEffectText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_entries = new_list;
		}
		
	}
}

MoveEffectChange::MoveEffectChange(char* json)
{
	this->fromJson(json);
}

char*
MoveEffectChange::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("MoveEffectChangeEffectText")) {
		list<MoveEffectChangeEffectText> new_list = static_cast<list <MoveEffectChangeEffectText> > (getEffectEntries());
		node = converttoJson(&new_list, "MoveEffectChangeEffectText", "array");
	} else {
		node = json_node_alloc();
		list<MoveEffectChangeEffectText> new_list = static_cast<list <MoveEffectChangeEffectText> > (getEffectEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveEffectChangeEffectText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveEffectChangeEffectText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_entriesKey = "effect_entries";
	json_object_set_member(pJsonObject, effect_entriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

VersionGroupSummary
MoveEffectChange::getVersionGroup()
{
	return version_group;
}

void
MoveEffectChange::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

std::list<MoveEffectChangeEffectText>
MoveEffectChange::getEffectEntries()
{
	return effect_entries;
}

void
MoveEffectChange::setEffectEntries(std::list <MoveEffectChangeEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}


