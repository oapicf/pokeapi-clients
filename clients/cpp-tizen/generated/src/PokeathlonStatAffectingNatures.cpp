#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokeathlonStatAffectingNatures.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokeathlonStatAffectingNatures::PokeathlonStatAffectingNatures()
{
	//__init();
}

PokeathlonStatAffectingNatures::~PokeathlonStatAffectingNatures()
{
	//__cleanup();
}

void
PokeathlonStatAffectingNatures::__init()
{
	//new std::list()std::list> increase;
	//new std::list()std::list> decrease;
}

void
PokeathlonStatAffectingNatures::__cleanup()
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
PokeathlonStatAffectingNatures::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *increaseKey = "increase";
	node = json_object_get_member(pJsonObject, increaseKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokeathlonStatAffectingNature> new_list;
			PokeathlonStatAffectingNature inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokeathlonStatAffectingNature")) {
					jsonToValue(&inst, temp_json, "PokeathlonStatAffectingNature", "");
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
			list<PokeathlonStatAffectingNature> new_list;
			PokeathlonStatAffectingNature inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokeathlonStatAffectingNature")) {
					jsonToValue(&inst, temp_json, "PokeathlonStatAffectingNature", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			decrease = new_list;
		}
		
	}
}

PokeathlonStatAffectingNatures::PokeathlonStatAffectingNatures(char* json)
{
	this->fromJson(json);
}

char*
PokeathlonStatAffectingNatures::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PokeathlonStatAffectingNature")) {
		list<PokeathlonStatAffectingNature> new_list = static_cast<list <PokeathlonStatAffectingNature> > (getIncrease());
		node = converttoJson(&new_list, "PokeathlonStatAffectingNature", "array");
	} else {
		node = json_node_alloc();
		list<PokeathlonStatAffectingNature> new_list = static_cast<list <PokeathlonStatAffectingNature> > (getIncrease());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokeathlonStatAffectingNature>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokeathlonStatAffectingNature obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *increaseKey = "increase";
	json_object_set_member(pJsonObject, increaseKey, node);
	if (isprimitive("PokeathlonStatAffectingNature")) {
		list<PokeathlonStatAffectingNature> new_list = static_cast<list <PokeathlonStatAffectingNature> > (getDecrease());
		node = converttoJson(&new_list, "PokeathlonStatAffectingNature", "array");
	} else {
		node = json_node_alloc();
		list<PokeathlonStatAffectingNature> new_list = static_cast<list <PokeathlonStatAffectingNature> > (getDecrease());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokeathlonStatAffectingNature>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokeathlonStatAffectingNature obj = *it;
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

std::list<PokeathlonStatAffectingNature>
PokeathlonStatAffectingNatures::getIncrease()
{
	return increase;
}

void
PokeathlonStatAffectingNatures::setIncrease(std::list <PokeathlonStatAffectingNature> increase)
{
	this->increase = increase;
}

std::list<PokeathlonStatAffectingNature>
PokeathlonStatAffectingNatures::getDecrease()
{
	return decrease;
}

void
PokeathlonStatAffectingNatures::setDecrease(std::list <PokeathlonStatAffectingNature> decrease)
{
	this->decrease = decrease;
}


