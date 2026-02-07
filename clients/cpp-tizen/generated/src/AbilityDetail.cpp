#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AbilityDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AbilityDetail::AbilityDetail()
{
	//__init();
}

AbilityDetail::~AbilityDetail()
{
	//__cleanup();
}

void
AbilityDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//is_main_series = bool(false);
	//generation = new GenerationSummary();
	//new std::list()std::list> names;
	//new std::list()std::list> effect_entries;
	//new std::list()std::list> effect_changes;
	//new std::list()std::list> flavor_text_entries;
	//new std::list()std::list> pokemon;
}

void
AbilityDetail::__cleanup()
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
	//if(is_main_series != NULL) {
	//
	//delete is_main_series;
	//is_main_series = NULL;
	//}
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(effect_entries != NULL) {
	//effect_entries.RemoveAll(true);
	//delete effect_entries;
	//effect_entries = NULL;
	//}
	//if(effect_changes != NULL) {
	//effect_changes.RemoveAll(true);
	//delete effect_changes;
	//effect_changes = NULL;
	//}
	//if(flavor_text_entries != NULL) {
	//flavor_text_entries.RemoveAll(true);
	//delete flavor_text_entries;
	//flavor_text_entries = NULL;
	//}
	//if(pokemon != NULL) {
	//pokemon.RemoveAll(true);
	//delete pokemon;
	//pokemon = NULL;
	//}
	//
}

void
AbilityDetail::fromJson(char* jsonStr)
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
	const gchar *is_main_seriesKey = "is_main_series";
	node = json_object_get_member(pJsonObject, is_main_seriesKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_main_series, node, "bool", "");
		} else {
			
		}
	}
	const gchar *generationKey = "generation";
	node = json_object_get_member(pJsonObject, generationKey);
	if (node !=NULL) {
	

		if (isprimitive("GenerationSummary")) {
			jsonToValue(&generation, node, "GenerationSummary", "GenerationSummary");
		} else {
			
			GenerationSummary* obj = static_cast<GenerationSummary*> (&generation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityName> new_list;
			AbilityName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityName")) {
					jsonToValue(&inst, temp_json, "AbilityName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *effect_entriesKey = "effect_entries";
	node = json_object_get_member(pJsonObject, effect_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityEffectText> new_list;
			AbilityEffectText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityEffectText")) {
					jsonToValue(&inst, temp_json, "AbilityEffectText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_entries = new_list;
		}
		
	}
	const gchar *effect_changesKey = "effect_changes";
	node = json_object_get_member(pJsonObject, effect_changesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityChange> new_list;
			AbilityChange inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityChange")) {
					jsonToValue(&inst, temp_json, "AbilityChange", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_changes = new_list;
		}
		
	}
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	node = json_object_get_member(pJsonObject, flavor_text_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityFlavorText> new_list;
			AbilityFlavorText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityFlavorText")) {
					jsonToValue(&inst, temp_json, "AbilityFlavorText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			flavor_text_entries = new_list;
		}
		
	}
	const gchar *pokemonKey = "pokemon";
	node = json_object_get_member(pJsonObject, pokemonKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityDetail_pokemon_inner> new_list;
			AbilityDetail_pokemon_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityDetail_pokemon_inner")) {
					jsonToValue(&inst, temp_json, "AbilityDetail_pokemon_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokemon = new_list;
		}
		
	}
}

AbilityDetail::AbilityDetail(char* json)
{
	this->fromJson(json);
}

char*
AbilityDetail::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getIsMainSeries();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_main_seriesKey = "is_main_series";
	json_object_set_member(pJsonObject, is_main_seriesKey, node);
	if (isprimitive("GenerationSummary")) {
		GenerationSummary obj = getGeneration();
		node = converttoJson(&obj, "GenerationSummary", "");
	}
	else {
		
		GenerationSummary obj = static_cast<GenerationSummary> (getGeneration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *generationKey = "generation";
	json_object_set_member(pJsonObject, generationKey, node);
	if (isprimitive("AbilityName")) {
		list<AbilityName> new_list = static_cast<list <AbilityName> > (getNames());
		node = converttoJson(&new_list, "AbilityName", "array");
	} else {
		node = json_node_alloc();
		list<AbilityName> new_list = static_cast<list <AbilityName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("AbilityEffectText")) {
		list<AbilityEffectText> new_list = static_cast<list <AbilityEffectText> > (getEffectEntries());
		node = converttoJson(&new_list, "AbilityEffectText", "array");
	} else {
		node = json_node_alloc();
		list<AbilityEffectText> new_list = static_cast<list <AbilityEffectText> > (getEffectEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityEffectText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityEffectText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_entriesKey = "effect_entries";
	json_object_set_member(pJsonObject, effect_entriesKey, node);
	if (isprimitive("AbilityChange")) {
		list<AbilityChange> new_list = static_cast<list <AbilityChange> > (getEffectChanges());
		node = converttoJson(&new_list, "AbilityChange", "array");
	} else {
		node = json_node_alloc();
		list<AbilityChange> new_list = static_cast<list <AbilityChange> > (getEffectChanges());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityChange>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityChange obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_changesKey = "effect_changes";
	json_object_set_member(pJsonObject, effect_changesKey, node);
	if (isprimitive("AbilityFlavorText")) {
		list<AbilityFlavorText> new_list = static_cast<list <AbilityFlavorText> > (getFlavorTextEntries());
		node = converttoJson(&new_list, "AbilityFlavorText", "array");
	} else {
		node = json_node_alloc();
		list<AbilityFlavorText> new_list = static_cast<list <AbilityFlavorText> > (getFlavorTextEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityFlavorText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityFlavorText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	json_object_set_member(pJsonObject, flavor_text_entriesKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner")) {
		list<AbilityDetail_pokemon_inner> new_list = static_cast<list <AbilityDetail_pokemon_inner> > (getPokemon());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner> new_list = static_cast<list <AbilityDetail_pokemon_inner> > (getPokemon());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityDetail_pokemon_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityDetail_pokemon_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokemonKey = "pokemon";
	json_object_set_member(pJsonObject, pokemonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
AbilityDetail::getId()
{
	return id;
}

void
AbilityDetail::setId(int  id)
{
	this->id = id;
}

std::string
AbilityDetail::getName()
{
	return name;
}

void
AbilityDetail::setName(std::string  name)
{
	this->name = name;
}

bool
AbilityDetail::getIsMainSeries()
{
	return is_main_series;
}

void
AbilityDetail::setIsMainSeries(bool  is_main_series)
{
	this->is_main_series = is_main_series;
}

GenerationSummary
AbilityDetail::getGeneration()
{
	return generation;
}

void
AbilityDetail::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}

std::list<AbilityName>
AbilityDetail::getNames()
{
	return names;
}

void
AbilityDetail::setNames(std::list <AbilityName> names)
{
	this->names = names;
}

std::list<AbilityEffectText>
AbilityDetail::getEffectEntries()
{
	return effect_entries;
}

void
AbilityDetail::setEffectEntries(std::list <AbilityEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<AbilityChange>
AbilityDetail::getEffectChanges()
{
	return effect_changes;
}

void
AbilityDetail::setEffectChanges(std::list <AbilityChange> effect_changes)
{
	this->effect_changes = effect_changes;
}

std::list<AbilityFlavorText>
AbilityDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
AbilityDetail::setFlavorTextEntries(std::list <AbilityFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<AbilityDetail_pokemon_inner>
AbilityDetail::getPokemon()
{
	return pokemon;
}

void
AbilityDetail::setPokemon(std::list <AbilityDetail_pokemon_inner> pokemon)
{
	this->pokemon = pokemon;
}


