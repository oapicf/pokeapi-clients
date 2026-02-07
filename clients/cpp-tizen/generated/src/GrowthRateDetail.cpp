#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GrowthRateDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GrowthRateDetail::GrowthRateDetail()
{
	//__init();
}

GrowthRateDetail::~GrowthRateDetail()
{
	//__cleanup();
}

void
GrowthRateDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//formula = std::string();
	//new std::list()std::list> descriptions;
	//new std::list()std::list> levels;
	//new std::list()std::list> pokemon_species;
}

void
GrowthRateDetail::__cleanup()
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
	//if(formula != NULL) {
	//
	//delete formula;
	//formula = NULL;
	//}
	//if(descriptions != NULL) {
	//descriptions.RemoveAll(true);
	//delete descriptions;
	//descriptions = NULL;
	//}
	//if(levels != NULL) {
	//levels.RemoveAll(true);
	//delete levels;
	//levels = NULL;
	//}
	//if(pokemon_species != NULL) {
	//pokemon_species.RemoveAll(true);
	//delete pokemon_species;
	//pokemon_species = NULL;
	//}
	//
}

void
GrowthRateDetail::fromJson(char* jsonStr)
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
	const gchar *formulaKey = "formula";
	node = json_object_get_member(pJsonObject, formulaKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&formula, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionsKey = "descriptions";
	node = json_object_get_member(pJsonObject, descriptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GrowthRateDescription> new_list;
			GrowthRateDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GrowthRateDescription")) {
					jsonToValue(&inst, temp_json, "GrowthRateDescription", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			descriptions = new_list;
		}
		
	}
	const gchar *levelsKey = "levels";
	node = json_object_get_member(pJsonObject, levelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Experience> new_list;
			Experience inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Experience")) {
					jsonToValue(&inst, temp_json, "Experience", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			levels = new_list;
		}
		
	}
	const gchar *pokemon_speciesKey = "pokemon_species";
	node = json_object_get_member(pJsonObject, pokemon_speciesKey);
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
			pokemon_species = new_list;
		}
		
	}
}

GrowthRateDetail::GrowthRateDetail(char* json)
{
	this->fromJson(json);
}

char*
GrowthRateDetail::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getFormula();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *formulaKey = "formula";
	json_object_set_member(pJsonObject, formulaKey, node);
	if (isprimitive("GrowthRateDescription")) {
		list<GrowthRateDescription> new_list = static_cast<list <GrowthRateDescription> > (getDescriptions());
		node = converttoJson(&new_list, "GrowthRateDescription", "array");
	} else {
		node = json_node_alloc();
		list<GrowthRateDescription> new_list = static_cast<list <GrowthRateDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GrowthRateDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GrowthRateDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *descriptionsKey = "descriptions";
	json_object_set_member(pJsonObject, descriptionsKey, node);
	if (isprimitive("Experience")) {
		list<Experience> new_list = static_cast<list <Experience> > (getLevels());
		node = converttoJson(&new_list, "Experience", "array");
	} else {
		node = json_node_alloc();
		list<Experience> new_list = static_cast<list <Experience> > (getLevels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Experience>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Experience obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *levelsKey = "levels";
	json_object_set_member(pJsonObject, levelsKey, node);
	if (isprimitive("PokemonSpeciesSummary")) {
		list<PokemonSpeciesSummary> new_list = static_cast<list <PokemonSpeciesSummary> > (getPokemonSpecies());
		node = converttoJson(&new_list, "PokemonSpeciesSummary", "array");
	} else {
		node = json_node_alloc();
		list<PokemonSpeciesSummary> new_list = static_cast<list <PokemonSpeciesSummary> > (getPokemonSpecies());
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
GrowthRateDetail::getId()
{
	return id;
}

void
GrowthRateDetail::setId(int  id)
{
	this->id = id;
}

std::string
GrowthRateDetail::getName()
{
	return name;
}

void
GrowthRateDetail::setName(std::string  name)
{
	this->name = name;
}

std::string
GrowthRateDetail::getFormula()
{
	return formula;
}

void
GrowthRateDetail::setFormula(std::string  formula)
{
	this->formula = formula;
}

std::list<GrowthRateDescription>
GrowthRateDetail::getDescriptions()
{
	return descriptions;
}

void
GrowthRateDetail::setDescriptions(std::list <GrowthRateDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<Experience>
GrowthRateDetail::getLevels()
{
	return levels;
}

void
GrowthRateDetail::setLevels(std::list <Experience> levels)
{
	this->levels = levels;
}

std::list<PokemonSpeciesSummary>
GrowthRateDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
GrowthRateDetail::setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}


