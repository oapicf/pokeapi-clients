#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonHeldItemSummary.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonHeldItemSummary::PokemonHeldItemSummary()
{
	//__init();
}

PokemonHeldItemSummary::~PokemonHeldItemSummary()
{
	//__cleanup();
}

void
PokemonHeldItemSummary::__init()
{
	//item = null;
	//new std::list()std::list> version_details;
}

void
PokemonHeldItemSummary::__cleanup()
{
	//if(item != NULL) {
	//
	//delete item;
	//item = NULL;
	//}
	//if(version_details != NULL) {
	//version_details.RemoveAll(true);
	//delete version_details;
	//version_details = NULL;
	//}
	//
}

void
PokemonHeldItemSummary::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemKey = "item";
	node = json_object_get_member(pJsonObject, itemKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemSummary")) {
			jsonToValue(&item, node, "ItemSummary", "ItemSummary");
		} else {
			
			ItemSummary* obj = static_cast<ItemSummary*> (&item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_detailsKey = "version_details";
	node = json_object_get_member(pJsonObject, version_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonHeldItemVersion> new_list;
			PokemonHeldItemVersion inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonHeldItemVersion")) {
					jsonToValue(&inst, temp_json, "PokemonHeldItemVersion", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_details = new_list;
		}
		
	}
}

PokemonHeldItemSummary::PokemonHeldItemSummary(char* json)
{
	this->fromJson(json);
}

char*
PokemonHeldItemSummary::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ItemSummary")) {
		ItemSummary obj = getItem();
		node = converttoJson(&obj, "ItemSummary", "");
	}
	else {
		
		ItemSummary obj = static_cast<ItemSummary> (getItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemKey = "item";
	json_object_set_member(pJsonObject, itemKey, node);
	if (isprimitive("PokemonHeldItemVersion")) {
		list<PokemonHeldItemVersion> new_list = static_cast<list <PokemonHeldItemVersion> > (getVersionDetails());
		node = converttoJson(&new_list, "PokemonHeldItemVersion", "array");
	} else {
		node = json_node_alloc();
		list<PokemonHeldItemVersion> new_list = static_cast<list <PokemonHeldItemVersion> > (getVersionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonHeldItemVersion>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonHeldItemVersion obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *version_detailsKey = "version_details";
	json_object_set_member(pJsonObject, version_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ItemSummary
PokemonHeldItemSummary::getItem()
{
	return item;
}

void
PokemonHeldItemSummary::setItem(ItemSummary  item)
{
	this->item = item;
}

std::list<PokemonHeldItemVersion>
PokemonHeldItemSummary::getVersionDetails()
{
	return version_details;
}

void
PokemonHeldItemSummary::setVersionDetails(std::list <PokemonHeldItemVersion> version_details)
{
	this->version_details = version_details;
}


