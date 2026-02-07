#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokeathlonStatDetail_affecting_natures.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokeathlonStatDetail_affecting_natures::PokeathlonStatDetail_affecting_natures()
{
	//__init();
}

PokeathlonStatDetail_affecting_natures::~PokeathlonStatDetail_affecting_natures()
{
	//__cleanup();
}

void
PokeathlonStatDetail_affecting_natures::__init()
{
	//new std::list()std::list> decrease;
	//new std::list()std::list> increase;
}

void
PokeathlonStatDetail_affecting_natures::__cleanup()
{
	//if(decrease != NULL) {
	//decrease.RemoveAll(true);
	//delete decrease;
	//decrease = NULL;
	//}
	//if(increase != NULL) {
	//increase.RemoveAll(true);
	//delete increase;
	//increase = NULL;
	//}
	//
}

void
PokeathlonStatDetail_affecting_natures::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *decreaseKey = "decrease";
	node = json_object_get_member(pJsonObject, decreaseKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokeathlonStatDetail_affecting_natures_decrease_inner> new_list;
			PokeathlonStatDetail_affecting_natures_decrease_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokeathlonStatDetail_affecting_natures_decrease_inner")) {
					jsonToValue(&inst, temp_json, "PokeathlonStatDetail_affecting_natures_decrease_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			decrease = new_list;
		}
		
	}
	const gchar *increaseKey = "increase";
	node = json_object_get_member(pJsonObject, increaseKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokeathlonStatDetail_affecting_natures_increase_inner> new_list;
			PokeathlonStatDetail_affecting_natures_increase_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokeathlonStatDetail_affecting_natures_increase_inner")) {
					jsonToValue(&inst, temp_json, "PokeathlonStatDetail_affecting_natures_increase_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			increase = new_list;
		}
		
	}
}

PokeathlonStatDetail_affecting_natures::PokeathlonStatDetail_affecting_natures(char* json)
{
	this->fromJson(json);
}

char*
PokeathlonStatDetail_affecting_natures::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PokeathlonStatDetail_affecting_natures_decrease_inner")) {
		list<PokeathlonStatDetail_affecting_natures_decrease_inner> new_list = static_cast<list <PokeathlonStatDetail_affecting_natures_decrease_inner> > (getDecrease());
		node = converttoJson(&new_list, "PokeathlonStatDetail_affecting_natures_decrease_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokeathlonStatDetail_affecting_natures_decrease_inner> new_list = static_cast<list <PokeathlonStatDetail_affecting_natures_decrease_inner> > (getDecrease());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokeathlonStatDetail_affecting_natures_decrease_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokeathlonStatDetail_affecting_natures_decrease_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *decreaseKey = "decrease";
	json_object_set_member(pJsonObject, decreaseKey, node);
	if (isprimitive("PokeathlonStatDetail_affecting_natures_increase_inner")) {
		list<PokeathlonStatDetail_affecting_natures_increase_inner> new_list = static_cast<list <PokeathlonStatDetail_affecting_natures_increase_inner> > (getIncrease());
		node = converttoJson(&new_list, "PokeathlonStatDetail_affecting_natures_increase_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokeathlonStatDetail_affecting_natures_increase_inner> new_list = static_cast<list <PokeathlonStatDetail_affecting_natures_increase_inner> > (getIncrease());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokeathlonStatDetail_affecting_natures_increase_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokeathlonStatDetail_affecting_natures_increase_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *increaseKey = "increase";
	json_object_set_member(pJsonObject, increaseKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<PokeathlonStatDetail_affecting_natures_decrease_inner>
PokeathlonStatDetail_affecting_natures::getDecrease()
{
	return decrease;
}

void
PokeathlonStatDetail_affecting_natures::setDecrease(std::list <PokeathlonStatDetail_affecting_natures_decrease_inner> decrease)
{
	this->decrease = decrease;
}

std::list<PokeathlonStatDetail_affecting_natures_increase_inner>
PokeathlonStatDetail_affecting_natures::getIncrease()
{
	return increase;
}

void
PokeathlonStatDetail_affecting_natures::setIncrease(std::list <PokeathlonStatDetail_affecting_natures_increase_inner> increase)
{
	this->increase = increase;
}


