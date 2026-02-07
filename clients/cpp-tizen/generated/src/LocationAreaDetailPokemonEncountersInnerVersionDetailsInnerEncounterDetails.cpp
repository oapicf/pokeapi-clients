#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details()
{
	//__init();
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::~LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details()
{
	//__cleanup();
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::__init()
{
	//min_level = int(0);
	//max_level = int(0);
	//condition_values = new AbilityDetail_pokemon_inner_pokemon();
	//chance = int(0);
	//method = new AbilityDetail_pokemon_inner_pokemon();
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::__cleanup()
{
	//if(min_level != NULL) {
	//
	//delete min_level;
	//min_level = NULL;
	//}
	//if(max_level != NULL) {
	//
	//delete max_level;
	//max_level = NULL;
	//}
	//if(condition_values != NULL) {
	//
	//delete condition_values;
	//condition_values = NULL;
	//}
	//if(chance != NULL) {
	//
	//delete chance;
	//chance = NULL;
	//}
	//if(method != NULL) {
	//
	//delete method;
	//method = NULL;
	//}
	//
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *min_levelKey = "min_level";
	node = json_object_get_member(pJsonObject, min_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_level, node, "int", "");
		} else {
			
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
	const gchar *condition_valuesKey = "condition_values";
	node = json_object_get_member(pJsonObject, condition_valuesKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&condition_values, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&condition_values);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *chanceKey = "chance";
	node = json_object_get_member(pJsonObject, chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&chance, node, "int", "");
		} else {
			
		}
	}
	const gchar *methodKey = "method";
	node = json_object_get_member(pJsonObject, methodKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&method, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getMinLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_levelKey = "min_level";
	json_object_set_member(pJsonObject, min_levelKey, node);
	if (isprimitive("int")) {
		int obj = getMaxLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_levelKey = "max_level";
	json_object_set_member(pJsonObject, max_levelKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getConditionValues();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getConditionValues());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *condition_valuesKey = "condition_values";
	json_object_set_member(pJsonObject, condition_valuesKey, node);
	if (isprimitive("int")) {
		int obj = getChance();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *chanceKey = "chance";
	json_object_set_member(pJsonObject, chanceKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getMethod();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *methodKey = "method";
	json_object_set_member(pJsonObject, methodKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getMinLevel()
{
	return min_level;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setMinLevel(int  min_level)
{
	this->min_level = min_level;
}

int
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getMaxLevel()
{
	return max_level;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setMaxLevel(int  max_level)
{
	this->max_level = max_level;
}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getConditionValues()
{
	return condition_values;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setConditionValues(AbilityDetail_pokemon_inner_pokemon  condition_values)
{
	this->condition_values = condition_values;
}

int
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getChance()
{
	return chance;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setChance(int  chance)
{
	this->chance = chance;
}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::getMethod()
{
	return method;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details::setMethod(AbilityDetail_pokemon_inner_pokemon  method)
{
	this->method = method;
}


