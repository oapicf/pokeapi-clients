#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenderDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenderDetail::GenderDetail()
{
	//__init();
}

GenderDetail::~GenderDetail()
{
	//__cleanup();
}

void
GenderDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> pokemon_species_details;
	//new std::list()std::list> required_for_evolution;
}

void
GenderDetail::__cleanup()
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
	//if(pokemon_species_details != NULL) {
	//pokemon_species_details.RemoveAll(true);
	//delete pokemon_species_details;
	//pokemon_species_details = NULL;
	//}
	//if(required_for_evolution != NULL) {
	//required_for_evolution.RemoveAll(true);
	//delete required_for_evolution;
	//required_for_evolution = NULL;
	//}
	//
}

void
GenderDetail::fromJson(char* jsonStr)
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
	const gchar *pokemon_species_detailsKey = "pokemon_species_details";
	node = json_object_get_member(pJsonObject, pokemon_species_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GenderPokemonSpecies> new_list;
			GenderPokemonSpecies inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GenderPokemonSpecies")) {
					jsonToValue(&inst, temp_json, "GenderPokemonSpecies", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokemon_species_details = new_list;
		}
		
	}
	const gchar *required_for_evolutionKey = "required_for_evolution";
	node = json_object_get_member(pJsonObject, required_for_evolutionKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonSpeciesSummary> new_list;
			PokemonSpeciesSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonSpeciesSummary")) {
					jsonToValue(&inst, temp_json, "PokemonSpeciesSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			required_for_evolution = new_list;
		}
		
	}
}

GenderDetail::GenderDetail(char* json)
{
	this->fromJson(json);
}

char*
GenderDetail::toJson()
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
	if (isprimitive("GenderPokemonSpecies")) {
		list<GenderPokemonSpecies> new_list = static_cast<list <GenderPokemonSpecies> > (getPokemonSpeciesDetails());
		node = converttoJson(&new_list, "GenderPokemonSpecies", "array");
	} else {
		node = json_node_alloc();
		list<GenderPokemonSpecies> new_list = static_cast<list <GenderPokemonSpecies> > (getPokemonSpeciesDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GenderPokemonSpecies>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GenderPokemonSpecies obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokemon_species_detailsKey = "pokemon_species_details";
	json_object_set_member(pJsonObject, pokemon_species_detailsKey, node);
	if (isprimitive("PokemonSpeciesSummary")) {
		list<PokemonSpeciesSummary> new_list = static_cast<list <PokemonSpeciesSummary> > (getRequiredForEvolution());
		node = converttoJson(&new_list, "PokemonSpeciesSummary", "array");
	} else {
		node = json_node_alloc();
		list<PokemonSpeciesSummary> new_list = static_cast<list <PokemonSpeciesSummary> > (getRequiredForEvolution());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonSpeciesSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonSpeciesSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *required_for_evolutionKey = "required_for_evolution";
	json_object_set_member(pJsonObject, required_for_evolutionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
GenderDetail::getId()
{
	return id;
}

void
GenderDetail::setId(int  id)
{
	this->id = id;
}

std::string
GenderDetail::getName()
{
	return name;
}

void
GenderDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<GenderPokemonSpecies>
GenderDetail::getPokemonSpeciesDetails()
{
	return pokemon_species_details;
}

void
GenderDetail::setPokemonSpeciesDetails(std::list <GenderPokemonSpecies> pokemon_species_details)
{
	this->pokemon_species_details = pokemon_species_details;
}

std::list<PokemonSpeciesSummary>
GenderDetail::getRequiredForEvolution()
{
	return required_for_evolution;
}

void
GenderDetail::setRequiredForEvolution(std::list <PokemonSpeciesSummary> required_for_evolution)
{
	this->required_for_evolution = required_for_evolution;
}


