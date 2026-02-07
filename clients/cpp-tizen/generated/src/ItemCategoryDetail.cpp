#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemCategoryDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemCategoryDetail::ItemCategoryDetail()
{
	//__init();
}

ItemCategoryDetail::~ItemCategoryDetail()
{
	//__cleanup();
}

void
ItemCategoryDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> items;
	//new std::list()std::list> names;
	//pocket = new ItemPocketSummary();
}

void
ItemCategoryDetail::__cleanup()
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
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(pocket != NULL) {
	//
	//delete pocket;
	//pocket = NULL;
	//}
	//
}

void
ItemCategoryDetail::fromJson(char* jsonStr)
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
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemCategoryName> new_list;
			ItemCategoryName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemCategoryName")) {
					jsonToValue(&inst, temp_json, "ItemCategoryName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *pocketKey = "pocket";
	node = json_object_get_member(pJsonObject, pocketKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemPocketSummary")) {
			jsonToValue(&pocket, node, "ItemPocketSummary", "ItemPocketSummary");
		} else {
			
			ItemPocketSummary* obj = static_cast<ItemPocketSummary*> (&pocket);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ItemCategoryDetail::ItemCategoryDetail(char* json)
{
	this->fromJson(json);
}

char*
ItemCategoryDetail::toJson()
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
	if (isprimitive("ItemCategoryName")) {
		list<ItemCategoryName> new_list = static_cast<list <ItemCategoryName> > (getNames());
		node = converttoJson(&new_list, "ItemCategoryName", "array");
	} else {
		node = json_node_alloc();
		list<ItemCategoryName> new_list = static_cast<list <ItemCategoryName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemCategoryName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemCategoryName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("ItemPocketSummary")) {
		ItemPocketSummary obj = getPocket();
		node = converttoJson(&obj, "ItemPocketSummary", "");
	}
	else {
		
		ItemPocketSummary obj = static_cast<ItemPocketSummary> (getPocket());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pocketKey = "pocket";
	json_object_set_member(pJsonObject, pocketKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ItemCategoryDetail::getId()
{
	return id;
}

void
ItemCategoryDetail::setId(int  id)
{
	this->id = id;
}

std::string
ItemCategoryDetail::getName()
{
	return name;
}

void
ItemCategoryDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<ItemSummary>
ItemCategoryDetail::getItems()
{
	return items;
}

void
ItemCategoryDetail::setItems(std::list <ItemSummary> items)
{
	this->items = items;
}

std::list<ItemCategoryName>
ItemCategoryDetail::getNames()
{
	return names;
}

void
ItemCategoryDetail::setNames(std::list <ItemCategoryName> names)
{
	this->names = names;
}

ItemPocketSummary
ItemCategoryDetail::getPocket()
{
	return pocket;
}

void
ItemCategoryDetail::setPocket(ItemPocketSummary  pocket)
{
	this->pocket = pocket;
}


