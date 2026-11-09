#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaDetail::LocationAreaDetail()
{
	//__init();
}

LocationAreaDetail::~LocationAreaDetail()
{
	//__cleanup();
}

void
LocationAreaDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//game_index = int(0);
	//new std::list()std::list> encounter_method_rates;
	//location = null;
	//new std::list()std::list> names;
	//new std::list()std::list> pokemon_encounters;
}

void
LocationAreaDetail::__cleanup()
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
	//if(game_index != NULL) {
	//
	//delete game_index;
	//game_index = NULL;
	//}
	//if(encounter_method_rates != NULL) {
	//encounter_method_rates.RemoveAll(true);
	//delete encounter_method_rates;
	//encounter_method_rates = NULL;
	//}
	//if(location != NULL) {
	//
	//delete location;
	//location = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(pokemon_encounters != NULL) {
	//pokemon_encounters.RemoveAll(true);
	//delete pokemon_encounters;
	//pokemon_encounters = NULL;
	//}
	//
}

void
LocationAreaDetail::fromJson(char* jsonStr)
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
	const gchar *game_indexKey = "game_index";
	node = json_object_get_member(pJsonObject, game_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&game_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *encounter_method_ratesKey = "encounter_method_rates";
	node = json_object_get_member(pJsonObject, encounter_method_ratesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationAreaEncounterRate> new_list;
			LocationAreaEncounterRate inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationAreaEncounterRate")) {
					jsonToValue(&inst, temp_json, "LocationAreaEncounterRate", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			encounter_method_rates = new_list;
		}
		
	}
	const gchar *locationKey = "location";
	node = json_object_get_member(pJsonObject, locationKey);
	if (node !=NULL) {
	

		if (isprimitive("LocationSummary")) {
			jsonToValue(&location, node, "LocationSummary", "LocationSummary");
		} else {
			
			LocationSummary* obj = static_cast<LocationSummary*> (&location);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationAreaName> new_list;
			LocationAreaName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationAreaName")) {
					jsonToValue(&inst, temp_json, "LocationAreaName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *pokemon_encountersKey = "pokemon_encounters";
	node = json_object_get_member(pJsonObject, pokemon_encountersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationAreaPokemonEncounter> new_list;
			LocationAreaPokemonEncounter inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationAreaPokemonEncounter")) {
					jsonToValue(&inst, temp_json, "LocationAreaPokemonEncounter", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokemon_encounters = new_list;
		}
		
	}
}

LocationAreaDetail::LocationAreaDetail(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaDetail::toJson()
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
	if (isprimitive("int")) {
		int obj = getGameIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *game_indexKey = "game_index";
	json_object_set_member(pJsonObject, game_indexKey, node);
	if (isprimitive("LocationAreaEncounterRate")) {
		list<LocationAreaEncounterRate> new_list = static_cast<list <LocationAreaEncounterRate> > (getEncounterMethodRates());
		node = converttoJson(&new_list, "LocationAreaEncounterRate", "array");
	} else {
		node = json_node_alloc();
		list<LocationAreaEncounterRate> new_list = static_cast<list <LocationAreaEncounterRate> > (getEncounterMethodRates());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationAreaEncounterRate>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationAreaEncounterRate obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *encounter_method_ratesKey = "encounter_method_rates";
	json_object_set_member(pJsonObject, encounter_method_ratesKey, node);
	if (isprimitive("LocationSummary")) {
		LocationSummary obj = getLocation();
		node = converttoJson(&obj, "LocationSummary", "");
	}
	else {
		
		LocationSummary obj = static_cast<LocationSummary> (getLocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *locationKey = "location";
	json_object_set_member(pJsonObject, locationKey, node);
	if (isprimitive("LocationAreaName")) {
		list<LocationAreaName> new_list = static_cast<list <LocationAreaName> > (getNames());
		node = converttoJson(&new_list, "LocationAreaName", "array");
	} else {
		node = json_node_alloc();
		list<LocationAreaName> new_list = static_cast<list <LocationAreaName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationAreaName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationAreaName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("LocationAreaPokemonEncounter")) {
		list<LocationAreaPokemonEncounter> new_list = static_cast<list <LocationAreaPokemonEncounter> > (getPokemonEncounters());
		node = converttoJson(&new_list, "LocationAreaPokemonEncounter", "array");
	} else {
		node = json_node_alloc();
		list<LocationAreaPokemonEncounter> new_list = static_cast<list <LocationAreaPokemonEncounter> > (getPokemonEncounters());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationAreaPokemonEncounter>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationAreaPokemonEncounter obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokemon_encountersKey = "pokemon_encounters";
	json_object_set_member(pJsonObject, pokemon_encountersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
LocationAreaDetail::getId()
{
	return id;
}

void
LocationAreaDetail::setId(int  id)
{
	this->id = id;
}

std::string
LocationAreaDetail::getName()
{
	return name;
}

void
LocationAreaDetail::setName(std::string  name)
{
	this->name = name;
}

int
LocationAreaDetail::getGameIndex()
{
	return game_index;
}

void
LocationAreaDetail::setGameIndex(int  game_index)
{
	this->game_index = game_index;
}

std::list<LocationAreaEncounterRate>
LocationAreaDetail::getEncounterMethodRates()
{
	return encounter_method_rates;
}

void
LocationAreaDetail::setEncounterMethodRates(std::list <LocationAreaEncounterRate> encounter_method_rates)
{
	this->encounter_method_rates = encounter_method_rates;
}

LocationSummary
LocationAreaDetail::getLocation()
{
	return location;
}

void
LocationAreaDetail::setLocation(LocationSummary  location)
{
	this->location = location;
}

std::list<LocationAreaName>
LocationAreaDetail::getNames()
{
	return names;
}

void
LocationAreaDetail::setNames(std::list <LocationAreaName> names)
{
	this->names = names;
}

std::list<LocationAreaPokemonEncounter>
LocationAreaDetail::getPokemonEncounters()
{
	return pokemon_encounters;
}

void
LocationAreaDetail::setPokemonEncounters(std::list <LocationAreaPokemonEncounter> pokemon_encounters)
{
	this->pokemon_encounters = pokemon_encounters;
}


