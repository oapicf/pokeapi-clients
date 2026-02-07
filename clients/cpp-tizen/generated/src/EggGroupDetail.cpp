#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EggGroupDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EggGroupDetail::EggGroupDetail()
{
	//__init();
}

EggGroupDetail::~EggGroupDetail()
{
	//__cleanup();
}

void
EggGroupDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> names;
	//new std::list()std::list> pokemon_species;
}

void
EggGroupDetail::__cleanup()
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
	//if(pokemon_species != NULL) {
	//pokemon_species.RemoveAll(true);
	//delete pokemon_species;
	//pokemon_species = NULL;
	//}
	//
}

void
EggGroupDetail::fromJson(char* jsonStr)
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
			list<EggGroupName> new_list;
			EggGroupName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EggGroupName")) {
					jsonToValue(&inst, temp_json, "EggGroupName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *pokemon_speciesKey = "pokemon_species";
	node = json_object_get_member(pJsonObject, pokemon_speciesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EggGroupDetail_pokemon_species_inner> new_list;
			EggGroupDetail_pokemon_species_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EggGroupDetail_pokemon_species_inner")) {
					jsonToValue(&inst, temp_json, "EggGroupDetail_pokemon_species_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokemon_species = new_list;
		}
		
	}
}

EggGroupDetail::EggGroupDetail(char* json)
{
	this->fromJson(json);
}

char*
EggGroupDetail::toJson()
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
	if (isprimitive("EggGroupName")) {
		list<EggGroupName> new_list = static_cast<list <EggGroupName> > (getNames());
		node = converttoJson(&new_list, "EggGroupName", "array");
	} else {
		node = json_node_alloc();
		list<EggGroupName> new_list = static_cast<list <EggGroupName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EggGroupName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EggGroupName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("EggGroupDetail_pokemon_species_inner")) {
		list<EggGroupDetail_pokemon_species_inner> new_list = static_cast<list <EggGroupDetail_pokemon_species_inner> > (getPokemonSpecies());
		node = converttoJson(&new_list, "EggGroupDetail_pokemon_species_inner", "array");
	} else {
		node = json_node_alloc();
		list<EggGroupDetail_pokemon_species_inner> new_list = static_cast<list <EggGroupDetail_pokemon_species_inner> > (getPokemonSpecies());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EggGroupDetail_pokemon_species_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EggGroupDetail_pokemon_species_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokemon_speciesKey = "pokemon_species";
	json_object_set_member(pJsonObject, pokemon_speciesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
EggGroupDetail::getId()
{
	return id;
}

void
EggGroupDetail::setId(int  id)
{
	this->id = id;
}

std::string
EggGroupDetail::getName()
{
	return name;
}

void
EggGroupDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<EggGroupName>
EggGroupDetail::getNames()
{
	return names;
}

void
EggGroupDetail::setNames(std::list <EggGroupName> names)
{
	this->names = names;
}

std::list<EggGroupDetail_pokemon_species_inner>
EggGroupDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
EggGroupDetail::setPokemonSpecies(std::list <EggGroupDetail_pokemon_species_inner> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}


