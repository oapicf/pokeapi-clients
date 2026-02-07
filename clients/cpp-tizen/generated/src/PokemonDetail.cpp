#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail::PokemonDetail()
{
	//__init();
}

PokemonDetail::~PokemonDetail()
{
	//__cleanup();
}

void
PokemonDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//base_experience = int(0);
	//height = int(0);
	//is_default = bool(false);
	//order = int(0);
	//weight = int(0);
	//new std::list()std::list> abilities;
	//new std::list()std::list> past_abilities;
	//new std::list()std::list> forms;
	//new std::list()std::list> game_indices;
	//held_items = new PokemonDetail_held_items();
	//location_area_encounters = std::string();
	//new std::list()std::list> moves;
	//species = new PokemonSpeciesSummary();
	//sprites = new PokemonDetail_sprites();
	//cries = new PokemonDetail_cries();
	//new std::list()std::list> stats;
	//new std::list()std::list> types;
	//new std::list()std::list> past_types;
}

void
PokemonDetail::__cleanup()
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
	//if(base_experience != NULL) {
	//
	//delete base_experience;
	//base_experience = NULL;
	//}
	//if(height != NULL) {
	//
	//delete height;
	//height = NULL;
	//}
	//if(is_default != NULL) {
	//
	//delete is_default;
	//is_default = NULL;
	//}
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//if(weight != NULL) {
	//
	//delete weight;
	//weight = NULL;
	//}
	//if(abilities != NULL) {
	//abilities.RemoveAll(true);
	//delete abilities;
	//abilities = NULL;
	//}
	//if(past_abilities != NULL) {
	//past_abilities.RemoveAll(true);
	//delete past_abilities;
	//past_abilities = NULL;
	//}
	//if(forms != NULL) {
	//forms.RemoveAll(true);
	//delete forms;
	//forms = NULL;
	//}
	//if(game_indices != NULL) {
	//game_indices.RemoveAll(true);
	//delete game_indices;
	//game_indices = NULL;
	//}
	//if(held_items != NULL) {
	//
	//delete held_items;
	//held_items = NULL;
	//}
	//if(location_area_encounters != NULL) {
	//
	//delete location_area_encounters;
	//location_area_encounters = NULL;
	//}
	//if(moves != NULL) {
	//moves.RemoveAll(true);
	//delete moves;
	//moves = NULL;
	//}
	//if(species != NULL) {
	//
	//delete species;
	//species = NULL;
	//}
	//if(sprites != NULL) {
	//
	//delete sprites;
	//sprites = NULL;
	//}
	//if(cries != NULL) {
	//
	//delete cries;
	//cries = NULL;
	//}
	//if(stats != NULL) {
	//stats.RemoveAll(true);
	//delete stats;
	//stats = NULL;
	//}
	//if(types != NULL) {
	//types.RemoveAll(true);
	//delete types;
	//types = NULL;
	//}
	//if(past_types != NULL) {
	//past_types.RemoveAll(true);
	//delete past_types;
	//past_types = NULL;
	//}
	//
}

void
PokemonDetail::fromJson(char* jsonStr)
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
	const gchar *base_experienceKey = "base_experience";
	node = json_object_get_member(pJsonObject, base_experienceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&base_experience, node, "int", "");
		} else {
			
		}
	}
	const gchar *heightKey = "height";
	node = json_object_get_member(pJsonObject, heightKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&height, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_defaultKey = "is_default";
	node = json_object_get_member(pJsonObject, is_defaultKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_default, node, "bool", "");
		} else {
			
		}
	}
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&order, node, "int", "");
		} else {
			
		}
	}
	const gchar *weightKey = "weight";
	node = json_object_get_member(pJsonObject, weightKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&weight, node, "int", "");
		} else {
			
		}
	}
	const gchar *abilitiesKey = "abilities";
	node = json_object_get_member(pJsonObject, abilitiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonDetail_abilities_inner> new_list;
			PokemonDetail_abilities_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonDetail_abilities_inner")) {
					jsonToValue(&inst, temp_json, "PokemonDetail_abilities_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			abilities = new_list;
		}
		
	}
	const gchar *past_abilitiesKey = "past_abilities";
	node = json_object_get_member(pJsonObject, past_abilitiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonDetail_past_abilities_inner> new_list;
			PokemonDetail_past_abilities_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonDetail_past_abilities_inner")) {
					jsonToValue(&inst, temp_json, "PokemonDetail_past_abilities_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			past_abilities = new_list;
		}
		
	}
	const gchar *formsKey = "forms";
	node = json_object_get_member(pJsonObject, formsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonFormSummary> new_list;
			PokemonFormSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormSummary")) {
					jsonToValue(&inst, temp_json, "PokemonFormSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			forms = new_list;
		}
		
	}
	const gchar *game_indicesKey = "game_indices";
	node = json_object_get_member(pJsonObject, game_indicesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonGameIndex> new_list;
			PokemonGameIndex inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonGameIndex")) {
					jsonToValue(&inst, temp_json, "PokemonGameIndex", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			game_indices = new_list;
		}
		
	}
	const gchar *held_itemsKey = "held_items";
	node = json_object_get_member(pJsonObject, held_itemsKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonDetail_held_items")) {
			jsonToValue(&held_items, node, "PokemonDetail_held_items", "PokemonDetail_held_items");
		} else {
			
			PokemonDetail_held_items* obj = static_cast<PokemonDetail_held_items*> (&held_items);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *location_area_encountersKey = "location_area_encounters";
	node = json_object_get_member(pJsonObject, location_area_encountersKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&location_area_encounters, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *movesKey = "moves";
	node = json_object_get_member(pJsonObject, movesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonDetail_moves_inner> new_list;
			PokemonDetail_moves_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonDetail_moves_inner")) {
					jsonToValue(&inst, temp_json, "PokemonDetail_moves_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			moves = new_list;
		}
		
	}
	const gchar *speciesKey = "species";
	node = json_object_get_member(pJsonObject, speciesKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSpeciesSummary")) {
			jsonToValue(&species, node, "PokemonSpeciesSummary", "PokemonSpeciesSummary");
		} else {
			
			PokemonSpeciesSummary* obj = static_cast<PokemonSpeciesSummary*> (&species);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *spritesKey = "sprites";
	node = json_object_get_member(pJsonObject, spritesKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonDetail_sprites")) {
			jsonToValue(&sprites, node, "PokemonDetail_sprites", "PokemonDetail_sprites");
		} else {
			
			PokemonDetail_sprites* obj = static_cast<PokemonDetail_sprites*> (&sprites);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *criesKey = "cries";
	node = json_object_get_member(pJsonObject, criesKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonDetail_cries")) {
			jsonToValue(&cries, node, "PokemonDetail_cries", "PokemonDetail_cries");
		} else {
			
			PokemonDetail_cries* obj = static_cast<PokemonDetail_cries*> (&cries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statsKey = "stats";
	node = json_object_get_member(pJsonObject, statsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonStat> new_list;
			PokemonStat inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonStat")) {
					jsonToValue(&inst, temp_json, "PokemonStat", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			stats = new_list;
		}
		
	}
	const gchar *typesKey = "types";
	node = json_object_get_member(pJsonObject, typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonDetail_types_inner> new_list;
			PokemonDetail_types_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonDetail_types_inner")) {
					jsonToValue(&inst, temp_json, "PokemonDetail_types_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			types = new_list;
		}
		
	}
	const gchar *past_typesKey = "past_types";
	node = json_object_get_member(pJsonObject, past_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonDetail_past_types_inner> new_list;
			PokemonDetail_past_types_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonDetail_past_types_inner")) {
					jsonToValue(&inst, temp_json, "PokemonDetail_past_types_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			past_types = new_list;
		}
		
	}
}

PokemonDetail::PokemonDetail(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail::toJson()
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
		int obj = getBaseExperience();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *base_experienceKey = "base_experience";
	json_object_set_member(pJsonObject, base_experienceKey, node);
	if (isprimitive("int")) {
		int obj = getHeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *heightKey = "height";
	json_object_set_member(pJsonObject, heightKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDefault();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_defaultKey = "is_default";
	json_object_set_member(pJsonObject, is_defaultKey, node);
	if (isprimitive("int")) {
		int obj = getOrder();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *orderKey = "order";
	json_object_set_member(pJsonObject, orderKey, node);
	if (isprimitive("int")) {
		int obj = getWeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *weightKey = "weight";
	json_object_set_member(pJsonObject, weightKey, node);
	if (isprimitive("PokemonDetail_abilities_inner")) {
		list<PokemonDetail_abilities_inner> new_list = static_cast<list <PokemonDetail_abilities_inner> > (getAbilities());
		node = converttoJson(&new_list, "PokemonDetail_abilities_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonDetail_abilities_inner> new_list = static_cast<list <PokemonDetail_abilities_inner> > (getAbilities());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonDetail_abilities_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonDetail_abilities_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *abilitiesKey = "abilities";
	json_object_set_member(pJsonObject, abilitiesKey, node);
	if (isprimitive("PokemonDetail_past_abilities_inner")) {
		list<PokemonDetail_past_abilities_inner> new_list = static_cast<list <PokemonDetail_past_abilities_inner> > (getPastAbilities());
		node = converttoJson(&new_list, "PokemonDetail_past_abilities_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonDetail_past_abilities_inner> new_list = static_cast<list <PokemonDetail_past_abilities_inner> > (getPastAbilities());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonDetail_past_abilities_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonDetail_past_abilities_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *past_abilitiesKey = "past_abilities";
	json_object_set_member(pJsonObject, past_abilitiesKey, node);
	if (isprimitive("PokemonFormSummary")) {
		list<PokemonFormSummary> new_list = static_cast<list <PokemonFormSummary> > (getForms());
		node = converttoJson(&new_list, "PokemonFormSummary", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormSummary> new_list = static_cast<list <PokemonFormSummary> > (getForms());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *formsKey = "forms";
	json_object_set_member(pJsonObject, formsKey, node);
	if (isprimitive("PokemonGameIndex")) {
		list<PokemonGameIndex> new_list = static_cast<list <PokemonGameIndex> > (getGameIndices());
		node = converttoJson(&new_list, "PokemonGameIndex", "array");
	} else {
		node = json_node_alloc();
		list<PokemonGameIndex> new_list = static_cast<list <PokemonGameIndex> > (getGameIndices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonGameIndex>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonGameIndex obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *game_indicesKey = "game_indices";
	json_object_set_member(pJsonObject, game_indicesKey, node);
	if (isprimitive("PokemonDetail_held_items")) {
		PokemonDetail_held_items obj = getHeldItems();
		node = converttoJson(&obj, "PokemonDetail_held_items", "");
	}
	else {
		
		PokemonDetail_held_items obj = static_cast<PokemonDetail_held_items> (getHeldItems());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *held_itemsKey = "held_items";
	json_object_set_member(pJsonObject, held_itemsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocationAreaEncounters();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *location_area_encountersKey = "location_area_encounters";
	json_object_set_member(pJsonObject, location_area_encountersKey, node);
	if (isprimitive("PokemonDetail_moves_inner")) {
		list<PokemonDetail_moves_inner> new_list = static_cast<list <PokemonDetail_moves_inner> > (getMoves());
		node = converttoJson(&new_list, "PokemonDetail_moves_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonDetail_moves_inner> new_list = static_cast<list <PokemonDetail_moves_inner> > (getMoves());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonDetail_moves_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonDetail_moves_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *movesKey = "moves";
	json_object_set_member(pJsonObject, movesKey, node);
	if (isprimitive("PokemonSpeciesSummary")) {
		PokemonSpeciesSummary obj = getSpecies();
		node = converttoJson(&obj, "PokemonSpeciesSummary", "");
	}
	else {
		
		PokemonSpeciesSummary obj = static_cast<PokemonSpeciesSummary> (getSpecies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *speciesKey = "species";
	json_object_set_member(pJsonObject, speciesKey, node);
	if (isprimitive("PokemonDetail_sprites")) {
		PokemonDetail_sprites obj = getSprites();
		node = converttoJson(&obj, "PokemonDetail_sprites", "");
	}
	else {
		
		PokemonDetail_sprites obj = static_cast<PokemonDetail_sprites> (getSprites());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *spritesKey = "sprites";
	json_object_set_member(pJsonObject, spritesKey, node);
	if (isprimitive("PokemonDetail_cries")) {
		PokemonDetail_cries obj = getCries();
		node = converttoJson(&obj, "PokemonDetail_cries", "");
	}
	else {
		
		PokemonDetail_cries obj = static_cast<PokemonDetail_cries> (getCries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *criesKey = "cries";
	json_object_set_member(pJsonObject, criesKey, node);
	if (isprimitive("PokemonStat")) {
		list<PokemonStat> new_list = static_cast<list <PokemonStat> > (getStats());
		node = converttoJson(&new_list, "PokemonStat", "array");
	} else {
		node = json_node_alloc();
		list<PokemonStat> new_list = static_cast<list <PokemonStat> > (getStats());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonStat>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonStat obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *statsKey = "stats";
	json_object_set_member(pJsonObject, statsKey, node);
	if (isprimitive("PokemonDetail_types_inner")) {
		list<PokemonDetail_types_inner> new_list = static_cast<list <PokemonDetail_types_inner> > (getTypes());
		node = converttoJson(&new_list, "PokemonDetail_types_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonDetail_types_inner> new_list = static_cast<list <PokemonDetail_types_inner> > (getTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonDetail_types_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonDetail_types_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *typesKey = "types";
	json_object_set_member(pJsonObject, typesKey, node);
	if (isprimitive("PokemonDetail_past_types_inner")) {
		list<PokemonDetail_past_types_inner> new_list = static_cast<list <PokemonDetail_past_types_inner> > (getPastTypes());
		node = converttoJson(&new_list, "PokemonDetail_past_types_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonDetail_past_types_inner> new_list = static_cast<list <PokemonDetail_past_types_inner> > (getPastTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonDetail_past_types_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonDetail_past_types_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *past_typesKey = "past_types";
	json_object_set_member(pJsonObject, past_typesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonDetail::getId()
{
	return id;
}

void
PokemonDetail::setId(int  id)
{
	this->id = id;
}

std::string
PokemonDetail::getName()
{
	return name;
}

void
PokemonDetail::setName(std::string  name)
{
	this->name = name;
}

int
PokemonDetail::getBaseExperience()
{
	return base_experience;
}

void
PokemonDetail::setBaseExperience(int  base_experience)
{
	this->base_experience = base_experience;
}

int
PokemonDetail::getHeight()
{
	return height;
}

void
PokemonDetail::setHeight(int  height)
{
	this->height = height;
}

bool
PokemonDetail::getIsDefault()
{
	return is_default;
}

void
PokemonDetail::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

int
PokemonDetail::getOrder()
{
	return order;
}

void
PokemonDetail::setOrder(int  order)
{
	this->order = order;
}

int
PokemonDetail::getWeight()
{
	return weight;
}

void
PokemonDetail::setWeight(int  weight)
{
	this->weight = weight;
}

std::list<PokemonDetail_abilities_inner>
PokemonDetail::getAbilities()
{
	return abilities;
}

void
PokemonDetail::setAbilities(std::list <PokemonDetail_abilities_inner> abilities)
{
	this->abilities = abilities;
}

std::list<PokemonDetail_past_abilities_inner>
PokemonDetail::getPastAbilities()
{
	return past_abilities;
}

void
PokemonDetail::setPastAbilities(std::list <PokemonDetail_past_abilities_inner> past_abilities)
{
	this->past_abilities = past_abilities;
}

std::list<PokemonFormSummary>
PokemonDetail::getForms()
{
	return forms;
}

void
PokemonDetail::setForms(std::list <PokemonFormSummary> forms)
{
	this->forms = forms;
}

std::list<PokemonGameIndex>
PokemonDetail::getGameIndices()
{
	return game_indices;
}

void
PokemonDetail::setGameIndices(std::list <PokemonGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

PokemonDetail_held_items
PokemonDetail::getHeldItems()
{
	return held_items;
}

void
PokemonDetail::setHeldItems(PokemonDetail_held_items  held_items)
{
	this->held_items = held_items;
}

std::string
PokemonDetail::getLocationAreaEncounters()
{
	return location_area_encounters;
}

void
PokemonDetail::setLocationAreaEncounters(std::string  location_area_encounters)
{
	this->location_area_encounters = location_area_encounters;
}

std::list<PokemonDetail_moves_inner>
PokemonDetail::getMoves()
{
	return moves;
}

void
PokemonDetail::setMoves(std::list <PokemonDetail_moves_inner> moves)
{
	this->moves = moves;
}

PokemonSpeciesSummary
PokemonDetail::getSpecies()
{
	return species;
}

void
PokemonDetail::setSpecies(PokemonSpeciesSummary  species)
{
	this->species = species;
}

PokemonDetail_sprites
PokemonDetail::getSprites()
{
	return sprites;
}

void
PokemonDetail::setSprites(PokemonDetail_sprites  sprites)
{
	this->sprites = sprites;
}

PokemonDetail_cries
PokemonDetail::getCries()
{
	return cries;
}

void
PokemonDetail::setCries(PokemonDetail_cries  cries)
{
	this->cries = cries;
}

std::list<PokemonStat>
PokemonDetail::getStats()
{
	return stats;
}

void
PokemonDetail::setStats(std::list <PokemonStat> stats)
{
	this->stats = stats;
}

std::list<PokemonDetail_types_inner>
PokemonDetail::getTypes()
{
	return types;
}

void
PokemonDetail::setTypes(std::list <PokemonDetail_types_inner> types)
{
	this->types = types;
}

std::list<PokemonDetail_past_types_inner>
PokemonDetail::getPastTypes()
{
	return past_types;
}

void
PokemonDetail::setPastTypes(std::list <PokemonDetail_past_types_inner> past_types)
{
	this->past_types = past_types;
}


