#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "StatDetail_affecting_natures.h"

using namespace std;
using namespace Tizen::ArtikCloud;

StatDetail_affecting_natures::StatDetail_affecting_natures()
{
	//__init();
}

StatDetail_affecting_natures::~StatDetail_affecting_natures()
{
	//__cleanup();
}

void
StatDetail_affecting_natures::__init()
{
	//new std::list()std::list> increase;
	//new std::list()std::list> decrease;
}

void
StatDetail_affecting_natures::__cleanup()
{
	//if(increase != NULL) {
	//increase.RemoveAll(true);
	//delete increase;
	//increase = NULL;
	//}
	//if(decrease != NULL) {
	//decrease.RemoveAll(true);
	//delete decrease;
	//decrease = NULL;
	//}
	//
}

void
StatDetail_affecting_natures::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *increaseKey = "increase";
	node = json_object_get_member(pJsonObject, increaseKey);
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
			increase = new_list;
		}
		
	}
	const gchar *decreaseKey = "decrease";
	node = json_object_get_member(pJsonObject, decreaseKey);
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
			decrease = new_list;
		}
		
	}
}

StatDetail_affecting_natures::StatDetail_affecting_natures(char* json)
{
	this->fromJson(json);
}

char*
StatDetail_affecting_natures::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getIncrease());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getIncrease());
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


	
	const gchar *increaseKey = "increase";
	json_object_set_member(pJsonObject, increaseKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getDecrease());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getDecrease());
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


	
	const gchar *decreaseKey = "decrease";
	json_object_set_member(pJsonObject, decreaseKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
StatDetail_affecting_natures::getIncrease()
{
	return increase;
}

void
StatDetail_affecting_natures::setIncrease(std::list <AbilityDetail_pokemon_inner_pokemon> increase)
{
	this->increase = increase;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
StatDetail_affecting_natures::getDecrease()
{
	return decrease;
}

void
StatDetail_affecting_natures::setDecrease(std::list <AbilityDetail_pokemon_inner_pokemon> decrease)
{
	this->decrease = decrease;
}


