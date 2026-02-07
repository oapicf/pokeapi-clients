#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EvolutionTriggerDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EvolutionTriggerDetail::EvolutionTriggerDetail()
{
	//__init();
}

EvolutionTriggerDetail::~EvolutionTriggerDetail()
{
	//__cleanup();
}

void
EvolutionTriggerDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> names;
	//new std::list()std::list> pokemon_species;
}

void
EvolutionTriggerDetail::__cleanup()
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
EvolutionTriggerDetail::fromJson(char* jsonStr)
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
			list<EvolutionTriggerName> new_list;
			EvolutionTriggerName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EvolutionTriggerName")) {
					jsonToValue(&inst, temp_json, "EvolutionTriggerName", "");
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
			pokemon_species = new_list;
		}
		
	}
}

EvolutionTriggerDetail::EvolutionTriggerDetail(char* json)
{
	this->fromJson(json);
}

char*
EvolutionTriggerDetail::toJson()
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
	if (isprimitive("EvolutionTriggerName")) {
		list<EvolutionTriggerName> new_list = static_cast<list <EvolutionTriggerName> > (getNames());
		node = converttoJson(&new_list, "EvolutionTriggerName", "array");
	} else {
		node = json_node_alloc();
		list<EvolutionTriggerName> new_list = static_cast<list <EvolutionTriggerName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EvolutionTriggerName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EvolutionTriggerName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getPokemonSpecies());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getPokemonSpecies());
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
EvolutionTriggerDetail::getId()
{
	return id;
}

void
EvolutionTriggerDetail::setId(int  id)
{
	this->id = id;
}

std::string
EvolutionTriggerDetail::getName()
{
	return name;
}

void
EvolutionTriggerDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<EvolutionTriggerName>
EvolutionTriggerDetail::getNames()
{
	return names;
}

void
EvolutionTriggerDetail::setNames(std::list <EvolutionTriggerName> names)
{
	this->names = names;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
EvolutionTriggerDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
EvolutionTriggerDetail::setPokemonSpecies(std::list <AbilityDetail_pokemon_inner_pokemon> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}


