#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveDetail_effect_changes_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveDetail_effect_changes_inner::MoveDetail_effect_changes_inner()
{
	//__init();
}

MoveDetail_effect_changes_inner::~MoveDetail_effect_changes_inner()
{
	//__cleanup();
}

void
MoveDetail_effect_changes_inner::__init()
{
	//new std::list()std::list> effect_entries;
	//version_group = new AbilityDetail_pokemon_inner_pokemon();
}

void
MoveDetail_effect_changes_inner::__cleanup()
{
	//if(effect_entries != NULL) {
	//effect_entries.RemoveAll(true);
	//delete effect_entries;
	//effect_entries = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//
}

void
MoveDetail_effect_changes_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *effect_entriesKey = "effect_entries";
	node = json_object_get_member(pJsonObject, effect_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveDetail_effect_changes_inner_effect_entries_inner> new_list;
			MoveDetail_effect_changes_inner_effect_entries_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveDetail_effect_changes_inner_effect_entries_inner")) {
					jsonToValue(&inst, temp_json, "MoveDetail_effect_changes_inner_effect_entries_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_entries = new_list;
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

MoveDetail_effect_changes_inner::MoveDetail_effect_changes_inner(char* json)
{
	this->fromJson(json);
}

char*
MoveDetail_effect_changes_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MoveDetail_effect_changes_inner_effect_entries_inner")) {
		list<MoveDetail_effect_changes_inner_effect_entries_inner> new_list = static_cast<list <MoveDetail_effect_changes_inner_effect_entries_inner> > (getEffectEntries());
		node = converttoJson(&new_list, "MoveDetail_effect_changes_inner_effect_entries_inner", "array");
	} else {
		node = json_node_alloc();
		list<MoveDetail_effect_changes_inner_effect_entries_inner> new_list = static_cast<list <MoveDetail_effect_changes_inner_effect_entries_inner> > (getEffectEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveDetail_effect_changes_inner_effect_entries_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveDetail_effect_changes_inner_effect_entries_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_entriesKey = "effect_entries";
	json_object_set_member(pJsonObject, effect_entriesKey, node);
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

std::list<MoveDetail_effect_changes_inner_effect_entries_inner>
MoveDetail_effect_changes_inner::getEffectEntries()
{
	return effect_entries;
}

void
MoveDetail_effect_changes_inner::setEffectEntries(std::list <MoveDetail_effect_changes_inner_effect_entries_inner> effect_entries)
{
	this->effect_entries = effect_entries;
}

AbilityDetail_pokemon_inner_pokemon
MoveDetail_effect_changes_inner::getVersionGroup()
{
	return version_group;
}

void
MoveDetail_effect_changes_inner::setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group)
{
	this->version_group = version_group;
}


