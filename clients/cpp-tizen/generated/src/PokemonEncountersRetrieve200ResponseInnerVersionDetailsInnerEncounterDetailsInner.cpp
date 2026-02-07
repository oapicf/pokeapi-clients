#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner()
{
	//__init();
}

Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::~Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner()
{
	//__cleanup();
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::__init()
{
	//chance = double(0);
	//new std::list()std::list> condition_values;
	//max_level = double(0);
	//method = new Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method();
	//min_level = double(0);
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::__cleanup()
{
	//if(chance != NULL) {
	//
	//delete chance;
	//chance = NULL;
	//}
	//if(condition_values != NULL) {
	//condition_values.RemoveAll(true);
	//delete condition_values;
	//condition_values = NULL;
	//}
	//if(max_level != NULL) {
	//
	//delete max_level;
	//max_level = NULL;
	//}
	//if(method != NULL) {
	//
	//delete method;
	//method = NULL;
	//}
	//if(min_level != NULL) {
	//
	//delete min_level;
	//min_level = NULL;
	//}
	//
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *chanceKey = "chance";
	node = json_object_get_member(pJsonObject, chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&chance, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&chance);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *condition_valuesKey = "condition_values";
	node = json_object_get_member(pJsonObject, condition_valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner> new_list;
			Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner")) {
					jsonToValue(&inst, temp_json, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			condition_values = new_list;
		}
		
	}
	const gchar *max_levelKey = "max_level";
	node = json_object_get_member(pJsonObject, max_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&max_level, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&max_level);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *methodKey = "method";
	node = json_object_get_member(pJsonObject, methodKey);
	if (node !=NULL) {
	

		if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method")) {
			jsonToValue(&method, node, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method", "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method");
		} else {
			
			Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method* obj = static_cast<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method*> (&method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *min_levelKey = "min_level";
	node = json_object_get_member(pJsonObject, min_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&min_level, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&min_level);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner(char* json)
{
	this->fromJson(json);
}

char*
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getChance();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getChance());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *chanceKey = "chance";
	json_object_set_member(pJsonObject, chanceKey, node);
	if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner")) {
		list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner> new_list = static_cast<list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner> > (getConditionValues());
		node = converttoJson(&new_list, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner", "array");
	} else {
		node = json_node_alloc();
		list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner> new_list = static_cast<list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner> > (getConditionValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *condition_valuesKey = "condition_values";
	json_object_set_member(pJsonObject, condition_valuesKey, node);
	if (isprimitive("long long")) {
		long long obj = getMaxLevel();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMaxLevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *max_levelKey = "max_level";
	json_object_set_member(pJsonObject, max_levelKey, node);
	if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method")) {
		Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method obj = getMethod();
		node = converttoJson(&obj, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method", "");
	}
	else {
		
		Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method obj = static_cast<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method> (getMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *methodKey = "method";
	json_object_set_member(pJsonObject, methodKey, node);
	if (isprimitive("long long")) {
		long long obj = getMinLevel();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMinLevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *min_levelKey = "min_level";
	json_object_set_member(pJsonObject, min_levelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::getChance()
{
	return chance;
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::setChance(long long  chance)
{
	this->chance = chance;
}

std::list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner>
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::getConditionValues()
{
	return condition_values;
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::setConditionValues(std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner> condition_values)
{
	this->condition_values = condition_values;
}

long long
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::getMaxLevel()
{
	return max_level;
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::setMaxLevel(long long  max_level)
{
	this->max_level = max_level;
}

Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::getMethod()
{
	return method;
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::setMethod(Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method  method)
{
	this->method = method;
}

long long
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::getMinLevel()
{
	return min_level;
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner::setMinLevel(long long  min_level)
{
	this->min_level = min_level;
}


