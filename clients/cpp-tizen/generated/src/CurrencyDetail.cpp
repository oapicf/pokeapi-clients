#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CurrencyDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CurrencyDetail::CurrencyDetail()
{
	//__init();
}

CurrencyDetail::~CurrencyDetail()
{
	//__cleanup();
}

void
CurrencyDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> names;
}

void
CurrencyDetail::__cleanup()
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
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
CurrencyDetail::fromJson(char* jsonStr)
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
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CurrencyName> new_list;
			CurrencyName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CurrencyName")) {
					jsonToValue(&inst, temp_json, "CurrencyName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

CurrencyDetail::CurrencyDetail(char* json)
{
	this->fromJson(json);
}

char*
CurrencyDetail::toJson()
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
	if (isprimitive("CurrencyName")) {
		list<CurrencyName> new_list = static_cast<list <CurrencyName> > (getNames());
		node = converttoJson(&new_list, "CurrencyName", "array");
	} else {
		node = json_node_alloc();
		list<CurrencyName> new_list = static_cast<list <CurrencyName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CurrencyName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CurrencyName obj = *it;
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
CurrencyDetail::getId()
{
	return id;
}

void
CurrencyDetail::setId(int  id)
{
	this->id = id;
}

std::string
CurrencyDetail::getName()
{
	return name;
}

void
CurrencyDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<CurrencyName>
CurrencyDetail::getNames()
{
	return names;
}

void
CurrencyDetail::setNames(std::list <CurrencyName> names)
{
	this->names = names;
}


