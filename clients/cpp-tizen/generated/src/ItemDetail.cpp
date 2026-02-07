#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemDetail::ItemDetail()
{
	//__init();
}

ItemDetail::~ItemDetail()
{
	//__cleanup();
}

void
ItemDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//cost = int(0);
	//fling_power = int(0);
	//fling_effect = new ItemFlingEffectSummary();
	//new std::list()std::list> attributes;
	//category = new ItemCategorySummary();
	//new std::list()std::list> effect_entries;
	//new std::list()std::list> flavor_text_entries;
	//new std::list()std::list> game_indices;
	//new std::list()std::list> names;
	//new std::list()std::list> held_by_pokemon;
	//sprites = new ItemDetail_sprites();
	//baby_trigger_for = new ItemDetail_baby_trigger_for();
	//new std::list()std::list> machines;
}

void
ItemDetail::__cleanup()
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
	//if(cost != NULL) {
	//
	//delete cost;
	//cost = NULL;
	//}
	//if(fling_power != NULL) {
	//
	//delete fling_power;
	//fling_power = NULL;
	//}
	//if(fling_effect != NULL) {
	//
	//delete fling_effect;
	//fling_effect = NULL;
	//}
	//if(attributes != NULL) {
	//attributes.RemoveAll(true);
	//delete attributes;
	//attributes = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(effect_entries != NULL) {
	//effect_entries.RemoveAll(true);
	//delete effect_entries;
	//effect_entries = NULL;
	//}
	//if(flavor_text_entries != NULL) {
	//flavor_text_entries.RemoveAll(true);
	//delete flavor_text_entries;
	//flavor_text_entries = NULL;
	//}
	//if(game_indices != NULL) {
	//game_indices.RemoveAll(true);
	//delete game_indices;
	//game_indices = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(held_by_pokemon != NULL) {
	//held_by_pokemon.RemoveAll(true);
	//delete held_by_pokemon;
	//held_by_pokemon = NULL;
	//}
	//if(sprites != NULL) {
	//
	//delete sprites;
	//sprites = NULL;
	//}
	//if(baby_trigger_for != NULL) {
	//
	//delete baby_trigger_for;
	//baby_trigger_for = NULL;
	//}
	//if(machines != NULL) {
	//machines.RemoveAll(true);
	//delete machines;
	//machines = NULL;
	//}
	//
}

void
ItemDetail::fromJson(char* jsonStr)
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
	const gchar *costKey = "cost";
	node = json_object_get_member(pJsonObject, costKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cost, node, "int", "");
		} else {
			
		}
	}
	const gchar *fling_powerKey = "fling_power";
	node = json_object_get_member(pJsonObject, fling_powerKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fling_power, node, "int", "");
		} else {
			
		}
	}
	const gchar *fling_effectKey = "fling_effect";
	node = json_object_get_member(pJsonObject, fling_effectKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemFlingEffectSummary")) {
			jsonToValue(&fling_effect, node, "ItemFlingEffectSummary", "ItemFlingEffectSummary");
		} else {
			
			ItemFlingEffectSummary* obj = static_cast<ItemFlingEffectSummary*> (&fling_effect);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *attributesKey = "attributes";
	node = json_object_get_member(pJsonObject, attributesKey);
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
			attributes = new_list;
		}
		
	}
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemCategorySummary")) {
			jsonToValue(&category, node, "ItemCategorySummary", "ItemCategorySummary");
		} else {
			
			ItemCategorySummary* obj = static_cast<ItemCategorySummary*> (&category);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *effect_entriesKey = "effect_entries";
	node = json_object_get_member(pJsonObject, effect_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemEffectText> new_list;
			ItemEffectText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemEffectText")) {
					jsonToValue(&inst, temp_json, "ItemEffectText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_entries = new_list;
		}
		
	}
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	node = json_object_get_member(pJsonObject, flavor_text_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemFlavorText> new_list;
			ItemFlavorText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemFlavorText")) {
					jsonToValue(&inst, temp_json, "ItemFlavorText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			flavor_text_entries = new_list;
		}
		
	}
	const gchar *game_indicesKey = "game_indices";
	node = json_object_get_member(pJsonObject, game_indicesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemGameIndex> new_list;
			ItemGameIndex inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemGameIndex")) {
					jsonToValue(&inst, temp_json, "ItemGameIndex", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			game_indices = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemName> new_list;
			ItemName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemName")) {
					jsonToValue(&inst, temp_json, "ItemName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *held_by_pokemonKey = "held_by_pokemon";
	node = json_object_get_member(pJsonObject, held_by_pokemonKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemDetail_held_by_pokemon_inner> new_list;
			ItemDetail_held_by_pokemon_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemDetail_held_by_pokemon_inner")) {
					jsonToValue(&inst, temp_json, "ItemDetail_held_by_pokemon_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			held_by_pokemon = new_list;
		}
		
	}
	const gchar *spritesKey = "sprites";
	node = json_object_get_member(pJsonObject, spritesKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemDetail_sprites")) {
			jsonToValue(&sprites, node, "ItemDetail_sprites", "ItemDetail_sprites");
		} else {
			
			ItemDetail_sprites* obj = static_cast<ItemDetail_sprites*> (&sprites);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *baby_trigger_forKey = "baby_trigger_for";
	node = json_object_get_member(pJsonObject, baby_trigger_forKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemDetail_baby_trigger_for")) {
			jsonToValue(&baby_trigger_for, node, "ItemDetail_baby_trigger_for", "ItemDetail_baby_trigger_for");
		} else {
			
			ItemDetail_baby_trigger_for* obj = static_cast<ItemDetail_baby_trigger_for*> (&baby_trigger_for);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *machinesKey = "machines";
	node = json_object_get_member(pJsonObject, machinesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemDetail_machines_inner> new_list;
			ItemDetail_machines_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemDetail_machines_inner")) {
					jsonToValue(&inst, temp_json, "ItemDetail_machines_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			machines = new_list;
		}
		
	}
}

ItemDetail::ItemDetail(char* json)
{
	this->fromJson(json);
}

char*
ItemDetail::toJson()
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
		int obj = getCost();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *costKey = "cost";
	json_object_set_member(pJsonObject, costKey, node);
	if (isprimitive("int")) {
		int obj = getFlingPower();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fling_powerKey = "fling_power";
	json_object_set_member(pJsonObject, fling_powerKey, node);
	if (isprimitive("ItemFlingEffectSummary")) {
		ItemFlingEffectSummary obj = getFlingEffect();
		node = converttoJson(&obj, "ItemFlingEffectSummary", "");
	}
	else {
		
		ItemFlingEffectSummary obj = static_cast<ItemFlingEffectSummary> (getFlingEffect());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fling_effectKey = "fling_effect";
	json_object_set_member(pJsonObject, fling_effectKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getAttributes());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getAttributes());
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


	
	const gchar *attributesKey = "attributes";
	json_object_set_member(pJsonObject, attributesKey, node);
	if (isprimitive("ItemCategorySummary")) {
		ItemCategorySummary obj = getCategory();
		node = converttoJson(&obj, "ItemCategorySummary", "");
	}
	else {
		
		ItemCategorySummary obj = static_cast<ItemCategorySummary> (getCategory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	if (isprimitive("ItemEffectText")) {
		list<ItemEffectText> new_list = static_cast<list <ItemEffectText> > (getEffectEntries());
		node = converttoJson(&new_list, "ItemEffectText", "array");
	} else {
		node = json_node_alloc();
		list<ItemEffectText> new_list = static_cast<list <ItemEffectText> > (getEffectEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemEffectText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemEffectText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_entriesKey = "effect_entries";
	json_object_set_member(pJsonObject, effect_entriesKey, node);
	if (isprimitive("ItemFlavorText")) {
		list<ItemFlavorText> new_list = static_cast<list <ItemFlavorText> > (getFlavorTextEntries());
		node = converttoJson(&new_list, "ItemFlavorText", "array");
	} else {
		node = json_node_alloc();
		list<ItemFlavorText> new_list = static_cast<list <ItemFlavorText> > (getFlavorTextEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemFlavorText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemFlavorText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	json_object_set_member(pJsonObject, flavor_text_entriesKey, node);
	if (isprimitive("ItemGameIndex")) {
		list<ItemGameIndex> new_list = static_cast<list <ItemGameIndex> > (getGameIndices());
		node = converttoJson(&new_list, "ItemGameIndex", "array");
	} else {
		node = json_node_alloc();
		list<ItemGameIndex> new_list = static_cast<list <ItemGameIndex> > (getGameIndices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemGameIndex>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemGameIndex obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *game_indicesKey = "game_indices";
	json_object_set_member(pJsonObject, game_indicesKey, node);
	if (isprimitive("ItemName")) {
		list<ItemName> new_list = static_cast<list <ItemName> > (getNames());
		node = converttoJson(&new_list, "ItemName", "array");
	} else {
		node = json_node_alloc();
		list<ItemName> new_list = static_cast<list <ItemName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("ItemDetail_held_by_pokemon_inner")) {
		list<ItemDetail_held_by_pokemon_inner> new_list = static_cast<list <ItemDetail_held_by_pokemon_inner> > (getHeldByPokemon());
		node = converttoJson(&new_list, "ItemDetail_held_by_pokemon_inner", "array");
	} else {
		node = json_node_alloc();
		list<ItemDetail_held_by_pokemon_inner> new_list = static_cast<list <ItemDetail_held_by_pokemon_inner> > (getHeldByPokemon());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemDetail_held_by_pokemon_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemDetail_held_by_pokemon_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *held_by_pokemonKey = "held_by_pokemon";
	json_object_set_member(pJsonObject, held_by_pokemonKey, node);
	if (isprimitive("ItemDetail_sprites")) {
		ItemDetail_sprites obj = getSprites();
		node = converttoJson(&obj, "ItemDetail_sprites", "");
	}
	else {
		
		ItemDetail_sprites obj = static_cast<ItemDetail_sprites> (getSprites());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *spritesKey = "sprites";
	json_object_set_member(pJsonObject, spritesKey, node);
	if (isprimitive("ItemDetail_baby_trigger_for")) {
		ItemDetail_baby_trigger_for obj = getBabyTriggerFor();
		node = converttoJson(&obj, "ItemDetail_baby_trigger_for", "");
	}
	else {
		
		ItemDetail_baby_trigger_for obj = static_cast<ItemDetail_baby_trigger_for> (getBabyTriggerFor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *baby_trigger_forKey = "baby_trigger_for";
	json_object_set_member(pJsonObject, baby_trigger_forKey, node);
	if (isprimitive("ItemDetail_machines_inner")) {
		list<ItemDetail_machines_inner> new_list = static_cast<list <ItemDetail_machines_inner> > (getMachines());
		node = converttoJson(&new_list, "ItemDetail_machines_inner", "array");
	} else {
		node = json_node_alloc();
		list<ItemDetail_machines_inner> new_list = static_cast<list <ItemDetail_machines_inner> > (getMachines());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemDetail_machines_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemDetail_machines_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *machinesKey = "machines";
	json_object_set_member(pJsonObject, machinesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ItemDetail::getId()
{
	return id;
}

void
ItemDetail::setId(int  id)
{
	this->id = id;
}

std::string
ItemDetail::getName()
{
	return name;
}

void
ItemDetail::setName(std::string  name)
{
	this->name = name;
}

int
ItemDetail::getCost()
{
	return cost;
}

void
ItemDetail::setCost(int  cost)
{
	this->cost = cost;
}

int
ItemDetail::getFlingPower()
{
	return fling_power;
}

void
ItemDetail::setFlingPower(int  fling_power)
{
	this->fling_power = fling_power;
}

ItemFlingEffectSummary
ItemDetail::getFlingEffect()
{
	return fling_effect;
}

void
ItemDetail::setFlingEffect(ItemFlingEffectSummary  fling_effect)
{
	this->fling_effect = fling_effect;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
ItemDetail::getAttributes()
{
	return attributes;
}

void
ItemDetail::setAttributes(std::list <AbilityDetail_pokemon_inner_pokemon> attributes)
{
	this->attributes = attributes;
}

ItemCategorySummary
ItemDetail::getCategory()
{
	return category;
}

void
ItemDetail::setCategory(ItemCategorySummary  category)
{
	this->category = category;
}

std::list<ItemEffectText>
ItemDetail::getEffectEntries()
{
	return effect_entries;
}

void
ItemDetail::setEffectEntries(std::list <ItemEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<ItemFlavorText>
ItemDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
ItemDetail::setFlavorTextEntries(std::list <ItemFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<ItemGameIndex>
ItemDetail::getGameIndices()
{
	return game_indices;
}

void
ItemDetail::setGameIndices(std::list <ItemGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

std::list<ItemName>
ItemDetail::getNames()
{
	return names;
}

void
ItemDetail::setNames(std::list <ItemName> names)
{
	this->names = names;
}

std::list<ItemDetail_held_by_pokemon_inner>
ItemDetail::getHeldByPokemon()
{
	return held_by_pokemon;
}

void
ItemDetail::setHeldByPokemon(std::list <ItemDetail_held_by_pokemon_inner> held_by_pokemon)
{
	this->held_by_pokemon = held_by_pokemon;
}

ItemDetail_sprites
ItemDetail::getSprites()
{
	return sprites;
}

void
ItemDetail::setSprites(ItemDetail_sprites  sprites)
{
	this->sprites = sprites;
}

ItemDetail_baby_trigger_for
ItemDetail::getBabyTriggerFor()
{
	return baby_trigger_for;
}

void
ItemDetail::setBabyTriggerFor(ItemDetail_baby_trigger_for  baby_trigger_for)
{
	this->baby_trigger_for = baby_trigger_for;
}

std::list<ItemDetail_machines_inner>
ItemDetail::getMachines()
{
	return machines;
}

void
ItemDetail::setMachines(std::list <ItemDetail_machines_inner> machines)
{
	this->machines = machines;
}


