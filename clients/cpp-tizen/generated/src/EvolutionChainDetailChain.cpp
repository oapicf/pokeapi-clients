#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EvolutionChainDetail_chain.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EvolutionChainDetail_chain::EvolutionChainDetail_chain()
{
	//__init();
}

EvolutionChainDetail_chain::~EvolutionChainDetail_chain()
{
	//__cleanup();
}

void
EvolutionChainDetail_chain::__init()
{
	//new std::list()std::list> evolution_details;
	//new std::list()std::list> evolves_to;
	//is_baby = bool(false);
	//species = new AbilityDetail_pokemon_inner_pokemon();
}

void
EvolutionChainDetail_chain::__cleanup()
{
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
	//
}

void
EvolutionChainDetail_chain::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *evolution_detailsKey = "evolution_details";
	node = json_object_get_member(pJsonObject, evolution_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AnyType> new_list;
			AnyType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AnyType")) {
					jsonToValue(&inst, temp_json, "AnyType", "");
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
			list<EvolutionChainDetail_chain_evolves_to_inner> new_list;
			EvolutionChainDetail_chain_evolves_to_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner")) {
					jsonToValue(&inst, temp_json, "EvolutionChainDetail_chain_evolves_to_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			evolves_to = new_list;
		}
		
	}
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
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&species, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&species);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EvolutionChainDetail_chain::EvolutionChainDetail_chain(char* json)
{
	this->fromJson(json);
}

char*
EvolutionChainDetail_chain::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AnyType")) {
		list<AnyType> new_list = static_cast<list <AnyType> > (getEvolutionDetails());
		node = converttoJson(&new_list, "AnyType", "array");
	} else {
		node = json_node_alloc();
		list<AnyType> new_list = static_cast<list <AnyType> > (getEvolutionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AnyType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AnyType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *evolution_detailsKey = "evolution_details";
	json_object_set_member(pJsonObject, evolution_detailsKey, node);
	if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner")) {
		list<EvolutionChainDetail_chain_evolves_to_inner> new_list = static_cast<list <EvolutionChainDetail_chain_evolves_to_inner> > (getEvolvesTo());
		node = converttoJson(&new_list, "EvolutionChainDetail_chain_evolves_to_inner", "array");
	} else {
		node = json_node_alloc();
		list<EvolutionChainDetail_chain_evolves_to_inner> new_list = static_cast<list <EvolutionChainDetail_chain_evolves_to_inner> > (getEvolvesTo());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EvolutionChainDetail_chain_evolves_to_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EvolutionChainDetail_chain_evolves_to_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *evolves_toKey = "evolves_to";
	json_object_set_member(pJsonObject, evolves_toKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsBaby();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_babyKey = "is_baby";
	json_object_set_member(pJsonObject, is_babyKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getSpecies();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getSpecies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *speciesKey = "species";
	json_object_set_member(pJsonObject, speciesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AnyType>
EvolutionChainDetail_chain::getEvolutionDetails()
{
	return evolution_details;
}

void
EvolutionChainDetail_chain::setEvolutionDetails(std::list <AnyType> evolution_details)
{
	this->evolution_details = evolution_details;
}

std::list<EvolutionChainDetail_chain_evolves_to_inner>
EvolutionChainDetail_chain::getEvolvesTo()
{
	return evolves_to;
}

void
EvolutionChainDetail_chain::setEvolvesTo(std::list <EvolutionChainDetail_chain_evolves_to_inner> evolves_to)
{
	this->evolves_to = evolves_to;
}

bool
EvolutionChainDetail_chain::getIsBaby()
{
	return is_baby;
}

void
EvolutionChainDetail_chain::setIsBaby(bool  is_baby)
{
	this->is_baby = is_baby;
}

AbilityDetail_pokemon_inner_pokemon
EvolutionChainDetail_chain::getSpecies()
{
	return species;
}

void
EvolutionChainDetail_chain::setSpecies(AbilityDetail_pokemon_inner_pokemon  species)
{
	this->species = species;
}


