#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "StatAffectingMoves.h"

using namespace std;
using namespace Tizen::ArtikCloud;

StatAffectingMoves::StatAffectingMoves()
{
	//__init();
}

StatAffectingMoves::~StatAffectingMoves()
{
	//__cleanup();
}

void
StatAffectingMoves::__init()
{
	//new std::list()std::list> increase;
	//new std::list()std::list> decrease;
}

void
StatAffectingMoves::__cleanup()
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
StatAffectingMoves::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *increaseKey = "increase";
	node = json_object_get_member(pJsonObject, increaseKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveStatChange> new_list;
			MoveStatChange inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveStatChange")) {
					jsonToValue(&inst, temp_json, "MoveStatChange", "");
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
			list<MoveStatChange> new_list;
			MoveStatChange inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveStatChange")) {
					jsonToValue(&inst, temp_json, "MoveStatChange", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			decrease = new_list;
		}
		
	}
}

StatAffectingMoves::StatAffectingMoves(char* json)
{
	this->fromJson(json);
}

char*
StatAffectingMoves::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MoveStatChange")) {
		list<MoveStatChange> new_list = static_cast<list <MoveStatChange> > (getIncrease());
		node = converttoJson(&new_list, "MoveStatChange", "array");
	} else {
		node = json_node_alloc();
		list<MoveStatChange> new_list = static_cast<list <MoveStatChange> > (getIncrease());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveStatChange>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveStatChange obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *increaseKey = "increase";
	json_object_set_member(pJsonObject, increaseKey, node);
	if (isprimitive("MoveStatChange")) {
		list<MoveStatChange> new_list = static_cast<list <MoveStatChange> > (getDecrease());
		node = converttoJson(&new_list, "MoveStatChange", "array");
	} else {
		node = json_node_alloc();
		list<MoveStatChange> new_list = static_cast<list <MoveStatChange> > (getDecrease());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveStatChange>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveStatChange obj = *it;
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

std::list<MoveStatChange>
StatAffectingMoves::getIncrease()
{
	return increase;
}

void
StatAffectingMoves::setIncrease(std::list <MoveStatChange> increase)
{
	this->increase = increase;
}

std::list<MoveStatChange>
StatAffectingMoves::getDecrease()
{
	return decrease;
}

void
StatAffectingMoves::setDecrease(std::list <MoveStatChange> decrease)
{
	this->decrease = decrease;
}


