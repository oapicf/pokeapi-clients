#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonHeldItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonHeldItem::PokemonHeldItem()
{
	//__init();
}

PokemonHeldItem::~PokemonHeldItem()
{
	//__cleanup();
}

void
PokemonHeldItem::__init()
{
	//pokemon = null;
	//new std::list()std::list> version_details;
}

void
PokemonHeldItem::__cleanup()
{
	//if(pokemon != NULL) {
	//
	//delete pokemon;
	//pokemon = NULL;
	//}
	//if(version_details != NULL) {
	//version_details.RemoveAll(true);
	//delete version_details;
	//version_details = NULL;
	//}
	//
}

void
PokemonHeldItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pokemonKey = "pokemon";
	node = json_object_get_member(pJsonObject, pokemonKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSummary")) {
			jsonToValue(&pokemon, node, "PokemonSummary", "PokemonSummary");
		} else {
			
			PokemonSummary* obj = static_cast<PokemonSummary*> (&pokemon);
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

PokemonHeldItem::PokemonHeldItem(char* json)
{
	this->fromJson(json);
}

char*
PokemonHeldItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PokemonSummary")) {
		PokemonSummary obj = getPokemon();
		node = converttoJson(&obj, "PokemonSummary", "");
	}
	else {
		
		PokemonSummary obj = static_cast<PokemonSummary> (getPokemon());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pokemonKey = "pokemon";
	json_object_set_member(pJsonObject, pokemonKey, node);
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

PokemonSummary
PokemonHeldItem::getPokemon()
{
	return pokemon;
}

void
PokemonHeldItem::setPokemon(PokemonSummary  pokemon)
{
	this->pokemon = pokemon;
}

std::list<PokemonHeldItemVersion>
PokemonHeldItem::getVersionDetails()
{
	return version_details;
}

void
PokemonHeldItem::setVersionDetails(std::list <PokemonHeldItemVersion> version_details)
{
	this->version_details = version_details;
}


