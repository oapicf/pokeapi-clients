#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypeDetail_past_damage_relations_inner_damage_relations.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypeDetail_past_damage_relations_inner_damage_relations::TypeDetail_past_damage_relations_inner_damage_relations()
{
	//__init();
}

TypeDetail_past_damage_relations_inner_damage_relations::~TypeDetail_past_damage_relations_inner_damage_relations()
{
	//__cleanup();
}

void
TypeDetail_past_damage_relations_inner_damage_relations::__init()
{
	//new std::list()std::list> no_damage_to;
	//new std::list()std::list> half_damage_to;
	//new std::list()std::list> double_damage_to;
	//new std::list()std::list> no_damage_from;
	//new std::list()std::list> half_damage_from;
	//new std::list()std::list> double_damage_from;
}

void
TypeDetail_past_damage_relations_inner_damage_relations::__cleanup()
{
	//if(no_damage_to != NULL) {
	//no_damage_to.RemoveAll(true);
	//delete no_damage_to;
	//no_damage_to = NULL;
	//}
	//if(half_damage_to != NULL) {
	//half_damage_to.RemoveAll(true);
	//delete half_damage_to;
	//half_damage_to = NULL;
	//}
	//if(double_damage_to != NULL) {
	//double_damage_to.RemoveAll(true);
	//delete double_damage_to;
	//double_damage_to = NULL;
	//}
	//if(no_damage_from != NULL) {
	//no_damage_from.RemoveAll(true);
	//delete no_damage_from;
	//no_damage_from = NULL;
	//}
	//if(half_damage_from != NULL) {
	//half_damage_from.RemoveAll(true);
	//delete half_damage_from;
	//half_damage_from = NULL;
	//}
	//if(double_damage_from != NULL) {
	//double_damage_from.RemoveAll(true);
	//delete double_damage_from;
	//double_damage_from = NULL;
	//}
	//
}

void
TypeDetail_past_damage_relations_inner_damage_relations::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *no_damage_toKey = "no_damage_to";
	node = json_object_get_member(pJsonObject, no_damage_toKey);
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
			no_damage_to = new_list;
		}
		
	}
	const gchar *half_damage_toKey = "half_damage_to";
	node = json_object_get_member(pJsonObject, half_damage_toKey);
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
			half_damage_to = new_list;
		}
		
	}
	const gchar *double_damage_toKey = "double_damage_to";
	node = json_object_get_member(pJsonObject, double_damage_toKey);
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
			double_damage_to = new_list;
		}
		
	}
	const gchar *no_damage_fromKey = "no_damage_from";
	node = json_object_get_member(pJsonObject, no_damage_fromKey);
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
			no_damage_from = new_list;
		}
		
	}
	const gchar *half_damage_fromKey = "half_damage_from";
	node = json_object_get_member(pJsonObject, half_damage_fromKey);
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
			half_damage_from = new_list;
		}
		
	}
	const gchar *double_damage_fromKey = "double_damage_from";
	node = json_object_get_member(pJsonObject, double_damage_fromKey);
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
			double_damage_from = new_list;
		}
		
	}
}

TypeDetail_past_damage_relations_inner_damage_relations::TypeDetail_past_damage_relations_inner_damage_relations(char* json)
{
	this->fromJson(json);
}

char*
TypeDetail_past_damage_relations_inner_damage_relations::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getNoDamageTo());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getNoDamageTo());
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


	
	const gchar *no_damage_toKey = "no_damage_to";
	json_object_set_member(pJsonObject, no_damage_toKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getHalfDamageTo());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getHalfDamageTo());
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


	
	const gchar *half_damage_toKey = "half_damage_to";
	json_object_set_member(pJsonObject, half_damage_toKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getDoubleDamageTo());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getDoubleDamageTo());
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


	
	const gchar *double_damage_toKey = "double_damage_to";
	json_object_set_member(pJsonObject, double_damage_toKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getNoDamageFrom());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getNoDamageFrom());
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


	
	const gchar *no_damage_fromKey = "no_damage_from";
	json_object_set_member(pJsonObject, no_damage_fromKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getHalfDamageFrom());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getHalfDamageFrom());
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


	
	const gchar *half_damage_fromKey = "half_damage_from";
	json_object_set_member(pJsonObject, half_damage_fromKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getDoubleDamageFrom());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getDoubleDamageFrom());
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


	
	const gchar *double_damage_fromKey = "double_damage_from";
	json_object_set_member(pJsonObject, double_damage_fromKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_past_damage_relations_inner_damage_relations::getNoDamageTo()
{
	return no_damage_to;
}

void
TypeDetail_past_damage_relations_inner_damage_relations::setNoDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> no_damage_to)
{
	this->no_damage_to = no_damage_to;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_past_damage_relations_inner_damage_relations::getHalfDamageTo()
{
	return half_damage_to;
}

void
TypeDetail_past_damage_relations_inner_damage_relations::setHalfDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> half_damage_to)
{
	this->half_damage_to = half_damage_to;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_past_damage_relations_inner_damage_relations::getDoubleDamageTo()
{
	return double_damage_to;
}

void
TypeDetail_past_damage_relations_inner_damage_relations::setDoubleDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> double_damage_to)
{
	this->double_damage_to = double_damage_to;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_past_damage_relations_inner_damage_relations::getNoDamageFrom()
{
	return no_damage_from;
}

void
TypeDetail_past_damage_relations_inner_damage_relations::setNoDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> no_damage_from)
{
	this->no_damage_from = no_damage_from;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_past_damage_relations_inner_damage_relations::getHalfDamageFrom()
{
	return half_damage_from;
}

void
TypeDetail_past_damage_relations_inner_damage_relations::setHalfDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> half_damage_from)
{
	this->half_damage_from = half_damage_from;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
TypeDetail_past_damage_relations_inner_damage_relations::getDoubleDamageFrom()
{
	return double_damage_from;
}

void
TypeDetail_past_damage_relations_inner_damage_relations::setDoubleDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> double_damage_from)
{
	this->double_damage_from = double_damage_from;
}


