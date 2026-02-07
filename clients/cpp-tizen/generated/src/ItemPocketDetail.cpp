#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemPocketDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemPocketDetail::ItemPocketDetail()
{
	//__init();
}

ItemPocketDetail::~ItemPocketDetail()
{
	//__cleanup();
}

void
ItemPocketDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> categories;
	//new std::list()std::list> names;
}

void
ItemPocketDetail::__cleanup()
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
	//if(categories != NULL) {
	//categories.RemoveAll(true);
	//delete categories;
	//categories = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
ItemPocketDetail::fromJson(char* jsonStr)
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
	const gchar *categoriesKey = "categories";
	node = json_object_get_member(pJsonObject, categoriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemCategorySummary> new_list;
			ItemCategorySummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemCategorySummary")) {
					jsonToValue(&inst, temp_json, "ItemCategorySummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			categories = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemPocketName> new_list;
			ItemPocketName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemPocketName")) {
					jsonToValue(&inst, temp_json, "ItemPocketName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

ItemPocketDetail::ItemPocketDetail(char* json)
{
	this->fromJson(json);
}

char*
ItemPocketDetail::toJson()
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
	if (isprimitive("ItemCategorySummary")) {
		list<ItemCategorySummary> new_list = static_cast<list <ItemCategorySummary> > (getCategories());
		node = converttoJson(&new_list, "ItemCategorySummary", "array");
	} else {
		node = json_node_alloc();
		list<ItemCategorySummary> new_list = static_cast<list <ItemCategorySummary> > (getCategories());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemCategorySummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemCategorySummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *categoriesKey = "categories";
	json_object_set_member(pJsonObject, categoriesKey, node);
	if (isprimitive("ItemPocketName")) {
		list<ItemPocketName> new_list = static_cast<list <ItemPocketName> > (getNames());
		node = converttoJson(&new_list, "ItemPocketName", "array");
	} else {
		node = json_node_alloc();
		list<ItemPocketName> new_list = static_cast<list <ItemPocketName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemPocketName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemPocketName obj = *it;
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
ItemPocketDetail::getId()
{
	return id;
}

void
ItemPocketDetail::setId(int  id)
{
	this->id = id;
}

std::string
ItemPocketDetail::getName()
{
	return name;
}

void
ItemPocketDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<ItemCategorySummary>
ItemPocketDetail::getCategories()
{
	return categories;
}

void
ItemPocketDetail::setCategories(std::list <ItemCategorySummary> categories)
{
	this->categories = categories;
}

std::list<ItemPocketName>
ItemPocketDetail::getNames()
{
	return names;
}

void
ItemPocketDetail::setNames(std::list <ItemPocketName> names)
{
	this->names = names;
}


