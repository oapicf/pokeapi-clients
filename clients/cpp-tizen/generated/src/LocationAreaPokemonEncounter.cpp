#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaPokemonEncounter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaPokemonEncounter::LocationAreaPokemonEncounter()
{
	//__init();
}

LocationAreaPokemonEncounter::~LocationAreaPokemonEncounter()
{
	//__cleanup();
}

void
LocationAreaPokemonEncounter::__init()
{
	//pokemon = null;
	//new std::list()std::list> version_details;
}

void
LocationAreaPokemonEncounter::__cleanup()
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
LocationAreaPokemonEncounter::fromJson(char* jsonStr)
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
			list<LocationAreaPokemonEncounterVersion> new_list;
			LocationAreaPokemonEncounterVersion inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationAreaPokemonEncounterVersion")) {
					jsonToValue(&inst, temp_json, "LocationAreaPokemonEncounterVersion", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_details = new_list;
		}
		
	}
}

LocationAreaPokemonEncounter::LocationAreaPokemonEncounter(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaPokemonEncounter::toJson()
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
	if (isprimitive("LocationAreaPokemonEncounterVersion")) {
		list<LocationAreaPokemonEncounterVersion> new_list = static_cast<list <LocationAreaPokemonEncounterVersion> > (getVersionDetails());
		node = converttoJson(&new_list, "LocationAreaPokemonEncounterVersion", "array");
	} else {
		node = json_node_alloc();
		list<LocationAreaPokemonEncounterVersion> new_list = static_cast<list <LocationAreaPokemonEncounterVersion> > (getVersionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationAreaPokemonEncounterVersion>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationAreaPokemonEncounterVersion obj = *it;
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
LocationAreaPokemonEncounter::getPokemon()
{
	return pokemon;
}

void
LocationAreaPokemonEncounter::setPokemon(PokemonSummary  pokemon)
{
	this->pokemon = pokemon;
}

std::list<LocationAreaPokemonEncounterVersion>
LocationAreaPokemonEncounter::getVersionDetails()
{
	return version_details;
}

void
LocationAreaPokemonEncounter::setVersionDetails(std::list <LocationAreaPokemonEncounterVersion> version_details)
{
	this->version_details = version_details;
}


