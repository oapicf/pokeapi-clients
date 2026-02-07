#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail_held_items.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail_held_items::PokemonDetail_held_items()
{
	//__init();
}

PokemonDetail_held_items::~PokemonDetail_held_items()
{
	//__cleanup();
}

void
PokemonDetail_held_items::__init()
{
	//item = new AbilityDetail_pokemon_inner_pokemon();
	//new std::list()std::list> version_details;
}

void
PokemonDetail_held_items::__cleanup()
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
PokemonDetail_held_items::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemKey = "item";
	node = json_object_get_member(pJsonObject, itemKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&item, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_detailsKey = "version_details";
	node = json_object_get_member(pJsonObject, version_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemDetail_held_by_pokemon_inner_version_details_inner> new_list;
			ItemDetail_held_by_pokemon_inner_version_details_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemDetail_held_by_pokemon_inner_version_details_inner")) {
					jsonToValue(&inst, temp_json, "ItemDetail_held_by_pokemon_inner_version_details_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_details = new_list;
		}
		
	}
}

PokemonDetail_held_items::PokemonDetail_held_items(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail_held_items::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getItem();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemKey = "item";
	json_object_set_member(pJsonObject, itemKey, node);
	if (isprimitive("ItemDetail_held_by_pokemon_inner_version_details_inner")) {
		list<ItemDetail_held_by_pokemon_inner_version_details_inner> new_list = static_cast<list <ItemDetail_held_by_pokemon_inner_version_details_inner> > (getVersionDetails());
		node = converttoJson(&new_list, "ItemDetail_held_by_pokemon_inner_version_details_inner", "array");
	} else {
		node = json_node_alloc();
		list<ItemDetail_held_by_pokemon_inner_version_details_inner> new_list = static_cast<list <ItemDetail_held_by_pokemon_inner_version_details_inner> > (getVersionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemDetail_held_by_pokemon_inner_version_details_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemDetail_held_by_pokemon_inner_version_details_inner obj = *it;
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

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_held_items::getItem()
{
	return item;
}

void
PokemonDetail_held_items::setItem(AbilityDetail_pokemon_inner_pokemon  item)
{
	this->item = item;
}

std::list<ItemDetail_held_by_pokemon_inner_version_details_inner>
PokemonDetail_held_items::getVersionDetails()
{
	return version_details;
}

void
PokemonDetail_held_items::setVersionDetails(std::list <ItemDetail_held_by_pokemon_inner_version_details_inner> version_details)
{
	this->version_details = version_details;
}


