#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveDetail_contest_combos_normal.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveDetail_contest_combos_normal::MoveDetail_contest_combos_normal()
{
	//__init();
}

MoveDetail_contest_combos_normal::~MoveDetail_contest_combos_normal()
{
	//__cleanup();
}

void
MoveDetail_contest_combos_normal::__init()
{
	//new std::list()std::list> use_before;
	//new std::list()std::list> use_after;
}

void
MoveDetail_contest_combos_normal::__cleanup()
{
	//if(use_before != NULL) {
	//use_before.RemoveAll(true);
	//delete use_before;
	//use_before = NULL;
	//}
	//if(use_after != NULL) {
	//use_after.RemoveAll(true);
	//delete use_after;
	//use_after = NULL;
	//}
	//
}

void
MoveDetail_contest_combos_normal::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *use_beforeKey = "use_before";
	node = json_object_get_member(pJsonObject, use_beforeKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityDetail_pokemon_inner_pokemon> new_list;
			AbilityDetail_pokemon_inner_pokemon inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
					jsonToValue(&inst, temp_json, "AbilityDetail_pokemon_inner_pokemon", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			use_before = new_list;
		}
		
	}
	const gchar *use_afterKey = "use_after";
	node = json_object_get_member(pJsonObject, use_afterKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityDetail_pokemon_inner_pokemon> new_list;
			AbilityDetail_pokemon_inner_pokemon inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
					jsonToValue(&inst, temp_json, "AbilityDetail_pokemon_inner_pokemon", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			use_after = new_list;
		}
		
	}
}

MoveDetail_contest_combos_normal::MoveDetail_contest_combos_normal(char* json)
{
	this->fromJson(json);
}

char*
MoveDetail_contest_combos_normal::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getUseBefore());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getUseBefore());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityDetail_pokemon_inner_pokemon>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityDetail_pokemon_inner_pokemon obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *use_beforeKey = "use_before";
	json_object_set_member(pJsonObject, use_beforeKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getUseAfter());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getUseAfter());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityDetail_pokemon_inner_pokemon>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityDetail_pokemon_inner_pokemon obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *use_afterKey = "use_after";
	json_object_set_member(pJsonObject, use_afterKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveDetail_contest_combos_normal::getUseBefore()
{
	return use_before;
}

void
MoveDetail_contest_combos_normal::setUseBefore(std::list <AbilityDetail_pokemon_inner_pokemon> use_before)
{
	this->use_before = use_before;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveDetail_contest_combos_normal::getUseAfter()
{
	return use_after;
}

void
MoveDetail_contest_combos_normal::setUseAfter(std::list <AbilityDetail_pokemon_inner_pokemon> use_after)
{
	this->use_after = use_after;
}


