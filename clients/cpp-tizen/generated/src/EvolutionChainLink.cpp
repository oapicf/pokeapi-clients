#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EvolutionChainLink.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EvolutionChainLink::EvolutionChainLink()
{
	//__init();
}

EvolutionChainLink::~EvolutionChainLink()
{
	//__cleanup();
}

void
EvolutionChainLink::__init()
{
	//is_baby = bool(false);
	//species = null;
	//new std::list()std::list> evolution_details;
	//new std::list()std::list> evolves_to;
}

void
EvolutionChainLink::__cleanup()
{
	//if(is_baby != NULL) {
	//
	//delete is_baby;
	//is_baby = NULL;
	//}
	//if(species != NULL) {
	//
	//delete species;
	//species = NULL;
	//}
	//if(evolution_details != NULL) {
	//evolution_details.RemoveAll(true);
	//delete evolution_details;
	//evolution_details = NULL;
	//}
	//if(evolves_to != NULL) {
	//evolves_to.RemoveAll(true);
	//delete evolves_to;
	//evolves_to = NULL;
	//}
	//
}

void
EvolutionChainLink::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *is_babyKey = "is_baby";
	node = json_object_get_member(pJsonObject, is_babyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_baby, node, "bool", "");
		} else {
			
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
	const gchar *evolution_detailsKey = "evolution_details";
	node = json_object_get_member(pJsonObject, evolution_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonEvolution> new_list;
			PokemonEvolution inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonEvolution")) {
					jsonToValue(&inst, temp_json, "PokemonEvolution", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			evolution_details = new_list;
		}
		
	}
	const gchar *evolves_toKey = "evolves_to";
	node = json_object_get_member(pJsonObject, evolves_toKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EvolutionChainLink> new_list;
			EvolutionChainLink inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EvolutionChainLink")) {
					jsonToValue(&inst, temp_json, "EvolutionChainLink", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			evolves_to = new_list;
		}
		
	}
}

EvolutionChainLink::EvolutionChainLink(char* json)
{
	this->fromJson(json);
}

char*
EvolutionChainLink::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getIsBaby();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_babyKey = "is_baby";
	json_object_set_member(pJsonObject, is_babyKey, node);
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
	if (isprimitive("PokemonEvolution")) {
		list<PokemonEvolution> new_list = static_cast<list <PokemonEvolution> > (getEvolutionDetails());
		node = converttoJson(&new_list, "PokemonEvolution", "array");
	} else {
		node = json_node_alloc();
		list<PokemonEvolution> new_list = static_cast<list <PokemonEvolution> > (getEvolutionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonEvolution>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonEvolution obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *evolution_detailsKey = "evolution_details";
	json_object_set_member(pJsonObject, evolution_detailsKey, node);
	if (isprimitive("EvolutionChainLink")) {
		list<EvolutionChainLink> new_list = static_cast<list <EvolutionChainLink> > (getEvolvesTo());
		node = converttoJson(&new_list, "EvolutionChainLink", "array");
	} else {
		node = json_node_alloc();
		list<EvolutionChainLink> new_list = static_cast<list <EvolutionChainLink> > (getEvolvesTo());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EvolutionChainLink>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EvolutionChainLink obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *evolves_toKey = "evolves_to";
	json_object_set_member(pJsonObject, evolves_toKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
EvolutionChainLink::getIsBaby()
{
	return is_baby;
}

void
EvolutionChainLink::setIsBaby(bool  is_baby)
{
	this->is_baby = is_baby;
}

PokemonSpeciesSummary
EvolutionChainLink::getSpecies()
{
	return species;
}

void
EvolutionChainLink::setSpecies(PokemonSpeciesSummary  species)
{
	this->species = species;
}

std::list<PokemonEvolution>
EvolutionChainLink::getEvolutionDetails()
{
	return evolution_details;
}

void
EvolutionChainLink::setEvolutionDetails(std::list <PokemonEvolution> evolution_details)
{
	this->evolution_details = evolution_details;
}

std::list<EvolutionChainLink>
EvolutionChainLink::getEvolvesTo()
{
	return evolves_to;
}

void
EvolutionChainLink::setEvolvesTo(std::list <EvolutionChainLink> evolves_to)
{
	this->evolves_to = evolves_to;
}


