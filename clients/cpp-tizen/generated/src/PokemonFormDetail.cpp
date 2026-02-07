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
	//pokemon = new PokemonSummary();
	//sprites = new PokemonFormDetail_sprites();
	//version_group = new VersionGroupSummary();
	//new std::list()std::list> form_names;
	//new std::list()std::list> names;
	//new std::list()std::list> types;
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
	

		if (isprimitive("PokemonFormDetail_sprites")) {
			jsonToValue(&sprites, node, "PokemonFormDetail_sprites", "PokemonFormDetail_sprites");
		} else {
			
			PokemonFormDetail_sprites* obj = static_cast<PokemonFormDetail_sprites*> (&sprites);
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
			list<PokemonFormDetail_form_names_inner> new_list;
			PokemonFormDetail_form_names_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormDetail_form_names_inner")) {
					jsonToValue(&inst, temp_json, "PokemonFormDetail_form_names_inner", "");
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
			list<PokemonFormDetail_form_names_inner> new_list;
			PokemonFormDetail_form_names_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormDetail_form_names_inner")) {
					jsonToValue(&inst, temp_json, "PokemonFormDetail_form_names_inner", "");
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
	if (isprimitive("PokemonFormDetail_sprites")) {
		PokemonFormDetail_sprites obj = getSprites();
		node = converttoJson(&obj, "PokemonFormDetail_sprites", "");
	}
	else {
		
		PokemonFormDetail_sprites obj = static_cast<PokemonFormDetail_sprites> (getSprites());
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
	if (isprimitive("PokemonFormDetail_form_names_inner")) {
		list<PokemonFormDetail_form_names_inner> new_list = static_cast<list <PokemonFormDetail_form_names_inner> > (getFormNames());
		node = converttoJson(&new_list, "PokemonFormDetail_form_names_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormDetail_form_names_inner> new_list = static_cast<list <PokemonFormDetail_form_names_inner> > (getFormNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormDetail_form_names_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormDetail_form_names_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *form_namesKey = "form_names";
	json_object_set_member(pJsonObject, form_namesKey, node);
	if (isprimitive("PokemonFormDetail_form_names_inner")) {
		list<PokemonFormDetail_form_names_inner> new_list = static_cast<list <PokemonFormDetail_form_names_inner> > (getNames());
		node = converttoJson(&new_list, "PokemonFormDetail_form_names_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormDetail_form_names_inner> new_list = static_cast<list <PokemonFormDetail_form_names_inner> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormDetail_form_names_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormDetail_form_names_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
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

PokemonFormDetail_sprites
PokemonFormDetail::getSprites()
{
	return sprites;
}

void
PokemonFormDetail::setSprites(PokemonFormDetail_sprites  sprites)
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

std::list<PokemonFormDetail_form_names_inner>
PokemonFormDetail::getFormNames()
{
	return form_names;
}

void
PokemonFormDetail::setFormNames(std::list <PokemonFormDetail_form_names_inner> form_names)
{
	this->form_names = form_names;
}

std::list<PokemonFormDetail_form_names_inner>
PokemonFormDetail::getNames()
{
	return names;
}

void
PokemonFormDetail::setNames(std::list <PokemonFormDetail_form_names_inner> names)
{
	this->names = names;
}

std::list<PokemonDetail_types_inner>
PokemonFormDetail::getTypes()
{
	return types;
}

void
PokemonFormDetail::setTypes(std::list <PokemonDetail_types_inner> types)
{
	this->types = types;
}


