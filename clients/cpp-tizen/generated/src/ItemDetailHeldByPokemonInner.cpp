#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemDetail_held_by_pokemon_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemDetail_held_by_pokemon_inner::ItemDetail_held_by_pokemon_inner()
{
	//__init();
}

ItemDetail_held_by_pokemon_inner::~ItemDetail_held_by_pokemon_inner()
{
	//__cleanup();
}

void
ItemDetail_held_by_pokemon_inner::__init()
{
	//pokemon = new AbilityDetail_pokemon_inner_pokemon();
	//new std::list()std::list> versiondetails;
}

void
ItemDetail_held_by_pokemon_inner::__cleanup()
{
	//if(pokemon != NULL) {
	//
	//delete pokemon;
	//pokemon = NULL;
	//}
	//if(versiondetails != NULL) {
	//versiondetails.RemoveAll(true);
	//delete versiondetails;
	//versiondetails = NULL;
	//}
	//
}

void
ItemDetail_held_by_pokemon_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pokemonKey = "pokemon";
	node = json_object_get_member(pJsonObject, pokemonKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&pokemon, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&pokemon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versiondetailsKey = "version-details";
	node = json_object_get_member(pJsonObject, versiondetailsKey);
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
			versiondetails = new_list;
		}
		
	}
}

ItemDetail_held_by_pokemon_inner::ItemDetail_held_by_pokemon_inner(char* json)
{
	this->fromJson(json);
}

char*
ItemDetail_held_by_pokemon_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getPokemon();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getPokemon());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pokemonKey = "pokemon";
	json_object_set_member(pJsonObject, pokemonKey, node);
	if (isprimitive("ItemDetail_held_by_pokemon_inner_version_details_inner")) {
		list<ItemDetail_held_by_pokemon_inner_version_details_inner> new_list = static_cast<list <ItemDetail_held_by_pokemon_inner_version_details_inner> > (getVersiondetails());
		node = converttoJson(&new_list, "ItemDetail_held_by_pokemon_inner_version_details_inner", "array");
	} else {
		node = json_node_alloc();
		list<ItemDetail_held_by_pokemon_inner_version_details_inner> new_list = static_cast<list <ItemDetail_held_by_pokemon_inner_version_details_inner> > (getVersiondetails());
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


	
	const gchar *versiondetailsKey = "version-details";
	json_object_set_member(pJsonObject, versiondetailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AbilityDetail_pokemon_inner_pokemon
ItemDetail_held_by_pokemon_inner::getPokemon()
{
	return pokemon;
}

void
ItemDetail_held_by_pokemon_inner::setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon)
{
	this->pokemon = pokemon;
}

std::list<ItemDetail_held_by_pokemon_inner_version_details_inner>
ItemDetail_held_by_pokemon_inner::getVersiondetails()
{
	return versiondetails;
}

void
ItemDetail_held_by_pokemon_inner::setVersiondetails(std::list <ItemDetail_held_by_pokemon_inner_version_details_inner> versiondetails)
{
	this->versiondetails = versiondetails;
}


