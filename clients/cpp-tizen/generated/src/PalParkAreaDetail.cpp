#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PalParkAreaDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PalParkAreaDetail::PalParkAreaDetail()
{
	//__init();
}

PalParkAreaDetail::~PalParkAreaDetail()
{
	//__cleanup();
}

void
PalParkAreaDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> names;
	//new std::list()std::list> pokemon_encounters;
}

void
PalParkAreaDetail::__cleanup()
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
PalParkAreaDetail::fromJson(char* jsonStr)
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
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PalParkAreaName> new_list;
			PalParkAreaName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PalParkAreaName")) {
					jsonToValue(&inst, temp_json, "PalParkAreaName", "");
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
			list<PalParkAreaDetail_pokemon_encounters_inner> new_list;
			PalParkAreaDetail_pokemon_encounters_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PalParkAreaDetail_pokemon_encounters_inner")) {
					jsonToValue(&inst, temp_json, "PalParkAreaDetail_pokemon_encounters_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokemon_encounters = new_list;
		}
		
	}
}

PalParkAreaDetail::PalParkAreaDetail(char* json)
{
	this->fromJson(json);
}

char*
PalParkAreaDetail::toJson()
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
	if (isprimitive("PalParkAreaName")) {
		list<PalParkAreaName> new_list = static_cast<list <PalParkAreaName> > (getNames());
		node = converttoJson(&new_list, "PalParkAreaName", "array");
	} else {
		node = json_node_alloc();
		list<PalParkAreaName> new_list = static_cast<list <PalParkAreaName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PalParkAreaName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PalParkAreaName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("PalParkAreaDetail_pokemon_encounters_inner")) {
		list<PalParkAreaDetail_pokemon_encounters_inner> new_list = static_cast<list <PalParkAreaDetail_pokemon_encounters_inner> > (getPokemonEncounters());
		node = converttoJson(&new_list, "PalParkAreaDetail_pokemon_encounters_inner", "array");
	} else {
		node = json_node_alloc();
		list<PalParkAreaDetail_pokemon_encounters_inner> new_list = static_cast<list <PalParkAreaDetail_pokemon_encounters_inner> > (getPokemonEncounters());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PalParkAreaDetail_pokemon_encounters_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PalParkAreaDetail_pokemon_encounters_inner obj = *it;
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
PalParkAreaDetail::getId()
{
	return id;
}

void
PalParkAreaDetail::setId(int  id)
{
	this->id = id;
}

std::string
PalParkAreaDetail::getName()
{
	return name;
}

void
PalParkAreaDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<PalParkAreaName>
PalParkAreaDetail::getNames()
{
	return names;
}

void
PalParkAreaDetail::setNames(std::list <PalParkAreaName> names)
{
	this->names = names;
}

std::list<PalParkAreaDetail_pokemon_encounters_inner>
PalParkAreaDetail::getPokemonEncounters()
{
	return pokemon_encounters;
}

void
PalParkAreaDetail::setPokemonEncounters(std::list <PalParkAreaDetail_pokemon_encounters_inner> pokemon_encounters)
{
	this->pokemon_encounters = pokemon_encounters;
}


