#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemAttributeDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemAttributeDetail::ItemAttributeDetail()
{
	//__init();
}

ItemAttributeDetail::~ItemAttributeDetail()
{
	//__cleanup();
}

void
ItemAttributeDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> descriptions;
	//new std::list()std::list> items;
	//new std::list()std::list> names;
}

void
ItemAttributeDetail::__cleanup()
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
	//if(descriptions != NULL) {
	//descriptions.RemoveAll(true);
	//delete descriptions;
	//descriptions = NULL;
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
	//
}

void
ItemAttributeDetail::fromJson(char* jsonStr)
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
	const gchar *descriptionsKey = "descriptions";
	node = json_object_get_member(pJsonObject, descriptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemAttributeDescription> new_list;
			ItemAttributeDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemAttributeDescription")) {
					jsonToValue(&inst, temp_json, "ItemAttributeDescription", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			descriptions = new_list;
		}
		
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
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
			items = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemAttributeName> new_list;
			ItemAttributeName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemAttributeName")) {
					jsonToValue(&inst, temp_json, "ItemAttributeName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

ItemAttributeDetail::ItemAttributeDetail(char* json)
{
	this->fromJson(json);
}

char*
ItemAttributeDetail::toJson()
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
	if (isprimitive("ItemAttributeDescription")) {
		list<ItemAttributeDescription> new_list = static_cast<list <ItemAttributeDescription> > (getDescriptions());
		node = converttoJson(&new_list, "ItemAttributeDescription", "array");
	} else {
		node = json_node_alloc();
		list<ItemAttributeDescription> new_list = static_cast<list <ItemAttributeDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemAttributeDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemAttributeDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *descriptionsKey = "descriptions";
	json_object_set_member(pJsonObject, descriptionsKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getItems());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getItems());
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


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("ItemAttributeName")) {
		list<ItemAttributeName> new_list = static_cast<list <ItemAttributeName> > (getNames());
		node = converttoJson(&new_list, "ItemAttributeName", "array");
	} else {
		node = json_node_alloc();
		list<ItemAttributeName> new_list = static_cast<list <ItemAttributeName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemAttributeName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemAttributeName obj = *it;
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
ItemAttributeDetail::getId()
{
	return id;
}

void
ItemAttributeDetail::setId(int  id)
{
	this->id = id;
}

std::string
ItemAttributeDetail::getName()
{
	return name;
}

void
ItemAttributeDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<ItemAttributeDescription>
ItemAttributeDetail::getDescriptions()
{
	return descriptions;
}

void
ItemAttributeDetail::setDescriptions(std::list <ItemAttributeDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
ItemAttributeDetail::getItems()
{
	return items;
}

void
ItemAttributeDetail::setItems(std::list <AbilityDetail_pokemon_inner_pokemon> items)
{
	this->items = items;
}

std::list<ItemAttributeName>
ItemAttributeDetail::getNames()
{
	return names;
}

void
ItemAttributeDetail::setNames(std::list <ItemAttributeName> names)
{
	this->names = names;
}


