#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonEncounterDetailResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonEncounterDetailResponse::PokemonEncounterDetailResponse()
{
	//__init();
}

PokemonEncounterDetailResponse::~PokemonEncounterDetailResponse()
{
	//__cleanup();
}

void
PokemonEncounterDetailResponse::__init()
{
	//chance = int(0);
	//new std::list()std::list> condition_values;
	//max_level = int(0);
	//method = null;
	//min_level = int(0);
}

void
PokemonEncounterDetailResponse::__cleanup()
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
PokemonEncounterDetailResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *chanceKey = "chance";
	node = json_object_get_member(pJsonObject, chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&chance, node, "int", "");
		} else {
			
		}
	}
	const gchar *condition_valuesKey = "condition_values";
	node = json_object_get_member(pJsonObject, condition_valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EncounterConditionValueSummary> new_list;
			EncounterConditionValueSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EncounterConditionValueSummary")) {
					jsonToValue(&inst, temp_json, "EncounterConditionValueSummary", "");
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
	

		if (isprimitive("int")) {
			jsonToValue(&max_level, node, "int", "");
		} else {
			
		}
	}
	const gchar *methodKey = "method";
	node = json_object_get_member(pJsonObject, methodKey);
	if (node !=NULL) {
	

		if (isprimitive("EncounterMethodSummary")) {
			jsonToValue(&method, node, "EncounterMethodSummary", "EncounterMethodSummary");
		} else {
			
			EncounterMethodSummary* obj = static_cast<EncounterMethodSummary*> (&method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *min_levelKey = "min_level";
	node = json_object_get_member(pJsonObject, min_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_level, node, "int", "");
		} else {
			
		}
	}
}

PokemonEncounterDetailResponse::PokemonEncounterDetailResponse(char* json)
{
	this->fromJson(json);
}

char*
PokemonEncounterDetailResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getChance();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *chanceKey = "chance";
	json_object_set_member(pJsonObject, chanceKey, node);
	if (isprimitive("EncounterConditionValueSummary")) {
		list<EncounterConditionValueSummary> new_list = static_cast<list <EncounterConditionValueSummary> > (getConditionValues());
		node = converttoJson(&new_list, "EncounterConditionValueSummary", "array");
	} else {
		node = json_node_alloc();
		list<EncounterConditionValueSummary> new_list = static_cast<list <EncounterConditionValueSummary> > (getConditionValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EncounterConditionValueSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EncounterConditionValueSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *condition_valuesKey = "condition_values";
	json_object_set_member(pJsonObject, condition_valuesKey, node);
	if (isprimitive("int")) {
		int obj = getMaxLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_levelKey = "max_level";
	json_object_set_member(pJsonObject, max_levelKey, node);
	if (isprimitive("EncounterMethodSummary")) {
		EncounterMethodSummary obj = getMethod();
		node = converttoJson(&obj, "EncounterMethodSummary", "");
	}
	else {
		
		EncounterMethodSummary obj = static_cast<EncounterMethodSummary> (getMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *methodKey = "method";
	json_object_set_member(pJsonObject, methodKey, node);
	if (isprimitive("int")) {
		int obj = getMinLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
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

int
PokemonEncounterDetailResponse::getChance()
{
	return chance;
}

void
PokemonEncounterDetailResponse::setChance(int  chance)
{
	this->chance = chance;
}

std::list<EncounterConditionValueSummary>
PokemonEncounterDetailResponse::getConditionValues()
{
	return condition_values;
}

void
PokemonEncounterDetailResponse::setConditionValues(std::list <EncounterConditionValueSummary> condition_values)
{
	this->condition_values = condition_values;
}

int
PokemonEncounterDetailResponse::getMaxLevel()
{
	return max_level;
}

void
PokemonEncounterDetailResponse::setMaxLevel(int  max_level)
{
	this->max_level = max_level;
}

EncounterMethodSummary
PokemonEncounterDetailResponse::getMethod()
{
	return method;
}

void
PokemonEncounterDetailResponse::setMethod(EncounterMethodSummary  method)
{
	this->method = method;
}

int
PokemonEncounterDetailResponse::getMinLevel()
{
	return min_level;
}

void
PokemonEncounterDetailResponse::setMinLevel(int  min_level)
{
	this->min_level = min_level;
}


