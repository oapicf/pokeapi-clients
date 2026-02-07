#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemFlingEffectDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemFlingEffectDetail::ItemFlingEffectDetail()
{
	//__init();
}

ItemFlingEffectDetail::~ItemFlingEffectDetail()
{
	//__cleanup();
}

void
ItemFlingEffectDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> effect_entries;
	//new std::list()std::list> items;
}

void
ItemFlingEffectDetail::__cleanup()
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
	//if(effect_entries != NULL) {
	//effect_entries.RemoveAll(true);
	//delete effect_entries;
	//effect_entries = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
ItemFlingEffectDetail::fromJson(char* jsonStr)
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
	const gchar *effect_entriesKey = "effect_entries";
	node = json_object_get_member(pJsonObject, effect_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemFlingEffectEffectText> new_list;
			ItemFlingEffectEffectText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemFlingEffectEffectText")) {
					jsonToValue(&inst, temp_json, "ItemFlingEffectEffectText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_entries = new_list;
		}
		
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemSummary> new_list;
			ItemSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemSummary")) {
					jsonToValue(&inst, temp_json, "ItemSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

ItemFlingEffectDetail::ItemFlingEffectDetail(char* json)
{
	this->fromJson(json);
}

char*
ItemFlingEffectDetail::toJson()
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
	if (isprimitive("ItemFlingEffectEffectText")) {
		list<ItemFlingEffectEffectText> new_list = static_cast<list <ItemFlingEffectEffectText> > (getEffectEntries());
		node = converttoJson(&new_list, "ItemFlingEffectEffectText", "array");
	} else {
		node = json_node_alloc();
		list<ItemFlingEffectEffectText> new_list = static_cast<list <ItemFlingEffectEffectText> > (getEffectEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemFlingEffectEffectText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemFlingEffectEffectText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_entriesKey = "effect_entries";
	json_object_set_member(pJsonObject, effect_entriesKey, node);
	if (isprimitive("ItemSummary")) {
		list<ItemSummary> new_list = static_cast<list <ItemSummary> > (getItems());
		node = converttoJson(&new_list, "ItemSummary", "array");
	} else {
		node = json_node_alloc();
		list<ItemSummary> new_list = static_cast<list <ItemSummary> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ItemFlingEffectDetail::getId()
{
	return id;
}

void
ItemFlingEffectDetail::setId(int  id)
{
	this->id = id;
}

std::string
ItemFlingEffectDetail::getName()
{
	return name;
}

void
ItemFlingEffectDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<ItemFlingEffectEffectText>
ItemFlingEffectDetail::getEffectEntries()
{
	return effect_entries;
}

void
ItemFlingEffectDetail::setEffectEntries(std::list <ItemFlingEffectEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<ItemSummary>
ItemFlingEffectDetail::getItems()
{
	return items;
}

void
ItemFlingEffectDetail::setItems(std::list <ItemSummary> items)
{
	this->items = items;
}


