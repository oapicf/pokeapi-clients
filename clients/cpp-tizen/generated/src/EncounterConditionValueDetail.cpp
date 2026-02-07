#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EncounterConditionValueDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EncounterConditionValueDetail::EncounterConditionValueDetail()
{
	//__init();
}

EncounterConditionValueDetail::~EncounterConditionValueDetail()
{
	//__cleanup();
}

void
EncounterConditionValueDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//condition = new EncounterConditionSummary();
	//new std::list()std::list> names;
}

void
EncounterConditionValueDetail::__cleanup()
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
	//if(condition != NULL) {
	//
	//delete condition;
	//condition = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
EncounterConditionValueDetail::fromJson(char* jsonStr)
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
	const gchar *conditionKey = "condition";
	node = json_object_get_member(pJsonObject, conditionKey);
	if (node !=NULL) {
	

		if (isprimitive("EncounterConditionSummary")) {
			jsonToValue(&condition, node, "EncounterConditionSummary", "EncounterConditionSummary");
		} else {
			
			EncounterConditionSummary* obj = static_cast<EncounterConditionSummary*> (&condition);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EncounterConditionValueName> new_list;
			EncounterConditionValueName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EncounterConditionValueName")) {
					jsonToValue(&inst, temp_json, "EncounterConditionValueName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

EncounterConditionValueDetail::EncounterConditionValueDetail(char* json)
{
	this->fromJson(json);
}

char*
EncounterConditionValueDetail::toJson()
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
	if (isprimitive("EncounterConditionSummary")) {
		EncounterConditionSummary obj = getCondition();
		node = converttoJson(&obj, "EncounterConditionSummary", "");
	}
	else {
		
		EncounterConditionSummary obj = static_cast<EncounterConditionSummary> (getCondition());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conditionKey = "condition";
	json_object_set_member(pJsonObject, conditionKey, node);
	if (isprimitive("EncounterConditionValueName")) {
		list<EncounterConditionValueName> new_list = static_cast<list <EncounterConditionValueName> > (getNames());
		node = converttoJson(&new_list, "EncounterConditionValueName", "array");
	} else {
		node = json_node_alloc();
		list<EncounterConditionValueName> new_list = static_cast<list <EncounterConditionValueName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EncounterConditionValueName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EncounterConditionValueName obj = *it;
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
EncounterConditionValueDetail::getId()
{
	return id;
}

void
EncounterConditionValueDetail::setId(int  id)
{
	this->id = id;
}

std::string
EncounterConditionValueDetail::getName()
{
	return name;
}

void
EncounterConditionValueDetail::setName(std::string  name)
{
	this->name = name;
}

EncounterConditionSummary
EncounterConditionValueDetail::getCondition()
{
	return condition;
}

void
EncounterConditionValueDetail::setCondition(EncounterConditionSummary  condition)
{
	this->condition = condition;
}

std::list<EncounterConditionValueName>
EncounterConditionValueDetail::getNames()
{
	return names;
}

void
EncounterConditionValueDetail::setNames(std::list <EncounterConditionValueName> names)
{
	this->names = names;
}


