#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EncounterConditionDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EncounterConditionDetail::EncounterConditionDetail()
{
	//__init();
}

EncounterConditionDetail::~EncounterConditionDetail()
{
	//__cleanup();
}

void
EncounterConditionDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> values;
	//new std::list()std::list> names;
}

void
EncounterConditionDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
EncounterConditionDetail::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
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
			values = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EncounterConditionName> new_list;
			EncounterConditionName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EncounterConditionName")) {
					jsonToValue(&inst, temp_json, "EncounterConditionName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

EncounterConditionDetail::EncounterConditionDetail(char* json)
{
	this->fromJson(json);
}

char*
EncounterConditionDetail::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("EncounterConditionValueSummary")) {
		list<EncounterConditionValueSummary> new_list = static_cast<list <EncounterConditionValueSummary> > (getValues());
		node = converttoJson(&new_list, "EncounterConditionValueSummary", "array");
	} else {
		node = json_node_alloc();
		list<EncounterConditionValueSummary> new_list = static_cast<list <EncounterConditionValueSummary> > (getValues());
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


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	if (isprimitive("EncounterConditionName")) {
		list<EncounterConditionName> new_list = static_cast<list <EncounterConditionName> > (getNames());
		node = converttoJson(&new_list, "EncounterConditionName", "array");
	} else {
		node = json_node_alloc();
		list<EncounterConditionName> new_list = static_cast<list <EncounterConditionName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EncounterConditionName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EncounterConditionName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
EncounterConditionDetail::getId()
{
	return id;
}

void
EncounterConditionDetail::setId(int  id)
{
	this->id = id;
}

std::string
EncounterConditionDetail::getName()
{
	return name;
}

void
EncounterConditionDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<EncounterConditionValueSummary>
EncounterConditionDetail::getValues()
{
	return values;
}

void
EncounterConditionDetail::setValues(std::list <EncounterConditionValueSummary> values)
{
	this->values = values;
}

std::list<EncounterConditionName>
EncounterConditionDetail::getNames()
{
	return names;
}

void
EncounterConditionDetail::setNames(std::list <EncounterConditionName> names)
{
	this->names = names;
}


