#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "StatAffectingNatures.h"

using namespace std;
using namespace Tizen::ArtikCloud;

StatAffectingNatures::StatAffectingNatures()
{
	//__init();
}

StatAffectingNatures::~StatAffectingNatures()
{
	//__cleanup();
}

void
StatAffectingNatures::__init()
{
	//new std::list()std::list> increase;
	//new std::list()std::list> decrease;
}

void
StatAffectingNatures::__cleanup()
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
StatAffectingNatures::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *increaseKey = "increase";
	node = json_object_get_member(pJsonObject, increaseKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<NatureSummary> new_list;
			NatureSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("NatureSummary")) {
					jsonToValue(&inst, temp_json, "NatureSummary", "");
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
			list<NatureSummary> new_list;
			NatureSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("NatureSummary")) {
					jsonToValue(&inst, temp_json, "NatureSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			decrease = new_list;
		}
		
	}
}

StatAffectingNatures::StatAffectingNatures(char* json)
{
	this->fromJson(json);
}

char*
StatAffectingNatures::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("NatureSummary")) {
		list<NatureSummary> new_list = static_cast<list <NatureSummary> > (getIncrease());
		node = converttoJson(&new_list, "NatureSummary", "array");
	} else {
		node = json_node_alloc();
		list<NatureSummary> new_list = static_cast<list <NatureSummary> > (getIncrease());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<NatureSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			NatureSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *increaseKey = "increase";
	json_object_set_member(pJsonObject, increaseKey, node);
	if (isprimitive("NatureSummary")) {
		list<NatureSummary> new_list = static_cast<list <NatureSummary> > (getDecrease());
		node = converttoJson(&new_list, "NatureSummary", "array");
	} else {
		node = json_node_alloc();
		list<NatureSummary> new_list = static_cast<list <NatureSummary> > (getDecrease());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<NatureSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			NatureSummary obj = *it;
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

std::list<NatureSummary>
StatAffectingNatures::getIncrease()
{
	return increase;
}

void
StatAffectingNatures::setIncrease(std::list <NatureSummary> increase)
{
	this->increase = increase;
}

std::list<NatureSummary>
StatAffectingNatures::getDecrease()
{
	return decrease;
}

void
StatAffectingNatures::setDecrease(std::list <NatureSummary> decrease)
{
	this->decrease = decrease;
}


