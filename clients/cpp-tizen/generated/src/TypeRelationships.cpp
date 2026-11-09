#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypeRelationships.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypeRelationships::TypeRelationships()
{
	//__init();
}

TypeRelationships::~TypeRelationships()
{
	//__cleanup();
}

void
TypeRelationships::__init()
{
	//new std::list()std::list> no_damage_to;
	//new std::list()std::list> half_damage_to;
	//new std::list()std::list> double_damage_to;
	//new std::list()std::list> no_damage_from;
	//new std::list()std::list> half_damage_from;
	//new std::list()std::list> double_damage_from;
}

void
TypeRelationships::__cleanup()
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
TypeRelationships::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *no_damage_toKey = "no_damage_to";
	node = json_object_get_member(pJsonObject, no_damage_toKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TypeSummary> new_list;
			TypeSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeSummary")) {
					jsonToValue(&inst, temp_json, "TypeSummary", "");
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
			list<TypeSummary> new_list;
			TypeSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeSummary")) {
					jsonToValue(&inst, temp_json, "TypeSummary", "");
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
			list<TypeSummary> new_list;
			TypeSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeSummary")) {
					jsonToValue(&inst, temp_json, "TypeSummary", "");
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
			list<TypeSummary> new_list;
			TypeSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeSummary")) {
					jsonToValue(&inst, temp_json, "TypeSummary", "");
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
			list<TypeSummary> new_list;
			TypeSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeSummary")) {
					jsonToValue(&inst, temp_json, "TypeSummary", "");
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
			list<TypeSummary> new_list;
			TypeSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeSummary")) {
					jsonToValue(&inst, temp_json, "TypeSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			double_damage_from = new_list;
		}
		
	}
}

TypeRelationships::TypeRelationships(char* json)
{
	this->fromJson(json);
}

char*
TypeRelationships::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TypeSummary")) {
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getNoDamageTo());
		node = converttoJson(&new_list, "TypeSummary", "array");
	} else {
		node = json_node_alloc();
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getNoDamageTo());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *no_damage_toKey = "no_damage_to";
	json_object_set_member(pJsonObject, no_damage_toKey, node);
	if (isprimitive("TypeSummary")) {
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getHalfDamageTo());
		node = converttoJson(&new_list, "TypeSummary", "array");
	} else {
		node = json_node_alloc();
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getHalfDamageTo());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *half_damage_toKey = "half_damage_to";
	json_object_set_member(pJsonObject, half_damage_toKey, node);
	if (isprimitive("TypeSummary")) {
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getDoubleDamageTo());
		node = converttoJson(&new_list, "TypeSummary", "array");
	} else {
		node = json_node_alloc();
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getDoubleDamageTo());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *double_damage_toKey = "double_damage_to";
	json_object_set_member(pJsonObject, double_damage_toKey, node);
	if (isprimitive("TypeSummary")) {
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getNoDamageFrom());
		node = converttoJson(&new_list, "TypeSummary", "array");
	} else {
		node = json_node_alloc();
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getNoDamageFrom());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *no_damage_fromKey = "no_damage_from";
	json_object_set_member(pJsonObject, no_damage_fromKey, node);
	if (isprimitive("TypeSummary")) {
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getHalfDamageFrom());
		node = converttoJson(&new_list, "TypeSummary", "array");
	} else {
		node = json_node_alloc();
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getHalfDamageFrom());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *half_damage_fromKey = "half_damage_from";
	json_object_set_member(pJsonObject, half_damage_fromKey, node);
	if (isprimitive("TypeSummary")) {
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getDoubleDamageFrom());
		node = converttoJson(&new_list, "TypeSummary", "array");
	} else {
		node = json_node_alloc();
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getDoubleDamageFrom());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeSummary obj = *it;
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

std::list<TypeSummary>
TypeRelationships::getNoDamageTo()
{
	return no_damage_to;
}

void
TypeRelationships::setNoDamageTo(std::list <TypeSummary> no_damage_to)
{
	this->no_damage_to = no_damage_to;
}

std::list<TypeSummary>
TypeRelationships::getHalfDamageTo()
{
	return half_damage_to;
}

void
TypeRelationships::setHalfDamageTo(std::list <TypeSummary> half_damage_to)
{
	this->half_damage_to = half_damage_to;
}

std::list<TypeSummary>
TypeRelationships::getDoubleDamageTo()
{
	return double_damage_to;
}

void
TypeRelationships::setDoubleDamageTo(std::list <TypeSummary> double_damage_to)
{
	this->double_damage_to = double_damage_to;
}

std::list<TypeSummary>
TypeRelationships::getNoDamageFrom()
{
	return no_damage_from;
}

void
TypeRelationships::setNoDamageFrom(std::list <TypeSummary> no_damage_from)
{
	this->no_damage_from = no_damage_from;
}

std::list<TypeSummary>
TypeRelationships::getHalfDamageFrom()
{
	return half_damage_from;
}

void
TypeRelationships::setHalfDamageFrom(std::list <TypeSummary> half_damage_from)
{
	this->half_damage_from = half_damage_from;
}

std::list<TypeSummary>
TypeRelationships::getDoubleDamageFrom()
{
	return double_damage_from;
}

void
TypeRelationships::setDoubleDamageFrom(std::list <TypeSummary> double_damage_from)
{
	this->double_damage_from = double_damage_from;
}


