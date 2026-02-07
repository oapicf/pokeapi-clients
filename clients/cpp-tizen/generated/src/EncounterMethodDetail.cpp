#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EncounterMethodDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EncounterMethodDetail::EncounterMethodDetail()
{
	//__init();
}

EncounterMethodDetail::~EncounterMethodDetail()
{
	//__cleanup();
}

void
EncounterMethodDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//order = int(0);
	//new std::list()std::list> names;
}

void
EncounterMethodDetail::__cleanup()
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
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
EncounterMethodDetail::fromJson(char* jsonStr)
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
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&order, node, "int", "");
		} else {
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EncounterMethodName> new_list;
			EncounterMethodName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EncounterMethodName")) {
					jsonToValue(&inst, temp_json, "EncounterMethodName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

EncounterMethodDetail::EncounterMethodDetail(char* json)
{
	this->fromJson(json);
}

char*
EncounterMethodDetail::toJson()
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
	if (isprimitive("int")) {
		int obj = getOrder();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *orderKey = "order";
	json_object_set_member(pJsonObject, orderKey, node);
	if (isprimitive("EncounterMethodName")) {
		list<EncounterMethodName> new_list = static_cast<list <EncounterMethodName> > (getNames());
		node = converttoJson(&new_list, "EncounterMethodName", "array");
	} else {
		node = json_node_alloc();
		list<EncounterMethodName> new_list = static_cast<list <EncounterMethodName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EncounterMethodName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EncounterMethodName obj = *it;
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
EncounterMethodDetail::getId()
{
	return id;
}

void
EncounterMethodDetail::setId(int  id)
{
	this->id = id;
}

std::string
EncounterMethodDetail::getName()
{
	return name;
}

void
EncounterMethodDetail::setName(std::string  name)
{
	this->name = name;
}

int
EncounterMethodDetail::getOrder()
{
	return order;
}

void
EncounterMethodDetail::setOrder(int  order)
{
	this->order = order;
}

std::list<EncounterMethodName>
EncounterMethodDetail::getNames()
{
	return names;
}

void
EncounterMethodDetail::setNames(std::list <EncounterMethodName> names)
{
	this->names = names;
}


