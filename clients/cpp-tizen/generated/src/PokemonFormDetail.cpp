#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonFormDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonFormDetail::PokemonFormDetail()
{
	//__init();
}

PokemonFormDetail::~PokemonFormDetail()
{
	//__cleanup();
}

void
PokemonFormDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//order = int(0);
	//form_order = int(0);
	//is_default = bool(false);
	//is_battle_only = bool(false);
	//is_mega = bool(false);
	//form_name = std::string();
	//pokemon = null;
	//sprites = null;
	//version_group = null;
	//new std::list()std::list> form_names;
	//new std::list()std::list> names;
	//new std::list()std::list> types;
	//new std::list()std::list> trigger_conditions;
	//new std::list()std::list> flavor_text_entries;
}

void
PokemonFormDetail::__cleanup()
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
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//if(form_order != NULL) {
	//
	//delete form_order;
	//form_order = NULL;
	//}
	//if(is_default != NULL) {
	//
	//delete is_default;
	//is_default = NULL;
	//}
	//if(is_battle_only != NULL) {
	//
	//delete is_battle_only;
	//is_battle_only = NULL;
	//}
	//if(is_mega != NULL) {
	//
	//delete is_mega;
	//is_mega = NULL;
	//}
	//if(form_name != NULL) {
	//
	//delete form_name;
	//form_name = NULL;
	//}
	//if(pokemon != NULL) {
	//
	//delete pokemon;
	//pokemon = NULL;
	//}
	//if(sprites != NULL) {
	//
	//delete sprites;
	//sprites = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//if(form_names != NULL) {
	//form_names.RemoveAll(true);
	//delete form_names;
	//form_names = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(types != NULL) {
	//types.RemoveAll(true);
	//delete types;
	//types = NULL;
	//}
	//if(trigger_conditions != NULL) {
	//trigger_conditions.RemoveAll(true);
	//delete trigger_conditions;
	//trigger_conditions = NULL;
	//}
	//if(flavor_text_entries != NULL) {
	//flavor_text_entries.RemoveAll(true);
	//delete flavor_text_entries;
	//flavor_text_entries = NULL;
	//}
	//
}

void
PokemonFormDetail::fromJson(char* jsonStr)
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
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&order, node, "int", "");
		} else {
			
		}
	}
	const gchar *form_orderKey = "form_order";
	node = json_object_get_member(pJsonObject, form_orderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&form_order, node, "int", "");
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
	const gchar *is_battle_onlyKey = "is_battle_only";
	node = json_object_get_member(pJsonObject, is_battle_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_battle_only, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_megaKey = "is_mega";
	node = json_object_get_member(pJsonObject, is_megaKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_mega, node, "bool", "");
		} else {
			
		}
	}
	const gchar *form_nameKey = "form_name";
	node = json_object_get_member(pJsonObject, form_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&form_name, node, "std::string", "");
		} else {
			
		}
	}
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
	const gchar *spritesKey = "sprites";
	node = json_object_get_member(pJsonObject, spritesKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonFormSprites")) {
			jsonToValue(&sprites, node, "PokemonFormSprites", "PokemonFormSprites");
		} else {
			
			PokemonFormSprites* obj = static_cast<PokemonFormSprites*> (&sprites);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionGroupSummary")) {
			jsonToValue(&version_group, node, "VersionGroupSummary", "VersionGroupSummary");
		} else {
			
			VersionGroupSummary* obj = static_cast<VersionGroupSummary*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *form_namesKey = "form_names";
	node = json_object_get_member(pJsonObject, form_namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonFormName> new_list;
			PokemonFormName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormName")) {
					jsonToValue(&inst, temp_json, "PokemonFormName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			form_names = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonFormName> new_list;
			PokemonFormName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormName")) {
					jsonToValue(&inst, temp_json, "PokemonFormName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *typesKey = "types";
	node = json_object_get_member(pJsonObject, typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonFormType> new_list;
			PokemonFormType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormType")) {
					jsonToValue(&inst, temp_json, "PokemonFormType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			types = new_list;
		}
		
	}
	const gchar *trigger_conditionsKey = "trigger_conditions";
	node = json_object_get_member(pJsonObject, trigger_conditionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonFormTriggerCondition> new_list;
			PokemonFormTriggerCondition inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormTriggerCondition")) {
					jsonToValue(&inst, temp_json, "PokemonFormTriggerCondition", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			trigger_conditions = new_list;
		}
		
	}
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	node = json_object_get_member(pJsonObject, flavor_text_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonFormFlavorText> new_list;
			PokemonFormFlavorText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormFlavorText")) {
					jsonToValue(&inst, temp_json, "PokemonFormFlavorText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			flavor_text_entries = new_list;
		}
		
	}
}

PokemonFormDetail::PokemonFormDetail(char* json)
{
	this->fromJson(json);
}

char*
PokemonFormDetail::toJson()
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
		int obj = getOrder();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *orderKey = "order";
	json_object_set_member(pJsonObject, orderKey, node);
	if (isprimitive("int")) {
		int obj = getFormOrder();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *form_orderKey = "form_order";
	json_object_set_member(pJsonObject, form_orderKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDefault();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_defaultKey = "is_default";
	json_object_set_member(pJsonObject, is_defaultKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsBattleOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_battle_onlyKey = "is_battle_only";
	json_object_set_member(pJsonObject, is_battle_onlyKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsMega();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_megaKey = "is_mega";
	json_object_set_member(pJsonObject, is_megaKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFormName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *form_nameKey = "form_name";
	json_object_set_member(pJsonObject, form_nameKey, node);
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
	if (isprimitive("PokemonFormSprites")) {
		PokemonFormSprites obj = getSprites();
		node = converttoJson(&obj, "PokemonFormSprites", "");
	}
	else {
		
		PokemonFormSprites obj = static_cast<PokemonFormSprites> (getSprites());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *spritesKey = "sprites";
	json_object_set_member(pJsonObject, spritesKey, node);
	if (isprimitive("VersionGroupSummary")) {
		VersionGroupSummary obj = getVersionGroup();
		node = converttoJson(&obj, "VersionGroupSummary", "");
	}
	else {
		
		VersionGroupSummary obj = static_cast<VersionGroupSummary> (getVersionGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *version_groupKey = "version_group";
	json_object_set_member(pJsonObject, version_groupKey, node);
	if (isprimitive("PokemonFormName")) {
		list<PokemonFormName> new_list = static_cast<list <PokemonFormName> > (getFormNames());
		node = converttoJson(&new_list, "PokemonFormName", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormName> new_list = static_cast<list <PokemonFormName> > (getFormNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *form_namesKey = "form_names";
	json_object_set_member(pJsonObject, form_namesKey, node);
	if (isprimitive("PokemonFormName")) {
		list<PokemonFormName> new_list = static_cast<list <PokemonFormName> > (getNames());
		node = converttoJson(&new_list, "PokemonFormName", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormName> new_list = static_cast<list <PokemonFormName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("PokemonFormType")) {
		list<PokemonFormType> new_list = static_cast<list <PokemonFormType> > (getTypes());
		node = converttoJson(&new_list, "PokemonFormType", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormType> new_list = static_cast<list <PokemonFormType> > (getTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *typesKey = "types";
	json_object_set_member(pJsonObject, typesKey, node);
	if (isprimitive("PokemonFormTriggerCondition")) {
		list<PokemonFormTriggerCondition> new_list = static_cast<list <PokemonFormTriggerCondition> > (getTriggerConditions());
		node = converttoJson(&new_list, "PokemonFormTriggerCondition", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormTriggerCondition> new_list = static_cast<list <PokemonFormTriggerCondition> > (getTriggerConditions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormTriggerCondition>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormTriggerCondition obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *trigger_conditionsKey = "trigger_conditions";
	json_object_set_member(pJsonObject, trigger_conditionsKey, node);
	if (isprimitive("PokemonFormFlavorText")) {
		list<PokemonFormFlavorText> new_list = static_cast<list <PokemonFormFlavorText> > (getFlavorTextEntries());
		node = converttoJson(&new_list, "PokemonFormFlavorText", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormFlavorText> new_list = static_cast<list <PokemonFormFlavorText> > (getFlavorTextEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormFlavorText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormFlavorText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	json_object_set_member(pJsonObject, flavor_text_entriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonFormDetail::getId()
{
	return id;
}

void
PokemonFormDetail::setId(int  id)
{
	this->id = id;
}

std::string
PokemonFormDetail::getName()
{
	return name;
}

void
PokemonFormDetail::setName(std::string  name)
{
	this->name = name;
}

int
PokemonFormDetail::getOrder()
{
	return order;
}

void
PokemonFormDetail::setOrder(int  order)
{
	this->order = order;
}

int
PokemonFormDetail::getFormOrder()
{
	return form_order;
}

void
PokemonFormDetail::setFormOrder(int  form_order)
{
	this->form_order = form_order;
}

bool
PokemonFormDetail::getIsDefault()
{
	return is_default;
}

void
PokemonFormDetail::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

bool
PokemonFormDetail::getIsBattleOnly()
{
	return is_battle_only;
}

void
PokemonFormDetail::setIsBattleOnly(bool  is_battle_only)
{
	this->is_battle_only = is_battle_only;
}

bool
PokemonFormDetail::getIsMega()
{
	return is_mega;
}

void
PokemonFormDetail::setIsMega(bool  is_mega)
{
	this->is_mega = is_mega;
}

std::string
PokemonFormDetail::getFormName()
{
	return form_name;
}

void
PokemonFormDetail::setFormName(std::string  form_name)
{
	this->form_name = form_name;
}

PokemonSummary
PokemonFormDetail::getPokemon()
{
	return pokemon;
}

void
PokemonFormDetail::setPokemon(PokemonSummary  pokemon)
{
	this->pokemon = pokemon;
}

PokemonFormSprites
PokemonFormDetail::getSprites()
{
	return sprites;
}

void
PokemonFormDetail::setSprites(PokemonFormSprites  sprites)
{
	this->sprites = sprites;
}

VersionGroupSummary
PokemonFormDetail::getVersionGroup()
{
	return version_group;
}

void
PokemonFormDetail::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

std::list<PokemonFormName>
PokemonFormDetail::getFormNames()
{
	return form_names;
}

void
PokemonFormDetail::setFormNames(std::list <PokemonFormName> form_names)
{
	this->form_names = form_names;
}

std::list<PokemonFormName>
PokemonFormDetail::getNames()
{
	return names;
}

void
PokemonFormDetail::setNames(std::list <PokemonFormName> names)
{
	this->names = names;
}

std::list<PokemonFormType>
PokemonFormDetail::getTypes()
{
	return types;
}

void
PokemonFormDetail::setTypes(std::list <PokemonFormType> types)
{
	this->types = types;
}

std::list<PokemonFormTriggerCondition>
PokemonFormDetail::getTriggerConditions()
{
	return trigger_conditions;
}

void
PokemonFormDetail::setTriggerConditions(std::list <PokemonFormTriggerCondition> trigger_conditions)
{
	this->trigger_conditions = trigger_conditions;
}

std::list<PokemonFormFlavorText>
PokemonFormDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
PokemonFormDetail::setFlavorTextEntries(std::list <PokemonFormFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}


