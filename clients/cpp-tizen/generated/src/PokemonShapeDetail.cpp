#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonShapeDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonShapeDetail::PokemonShapeDetail()
{
	//__init();
}

PokemonShapeDetail::~PokemonShapeDetail()
{
	//__cleanup();
}

void
PokemonShapeDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> awesome_names;
	//new std::list()std::list> names;
	//new std::list()std::list> pokemon_species;
}

void
PokemonShapeDetail::__cleanup()
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
	//if(awesome_names != NULL) {
	//awesome_names.RemoveAll(true);
	//delete awesome_names;
	//awesome_names = NULL;
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
PokemonShapeDetail::fromJson(char* jsonStr)
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
	const gchar *awesome_namesKey = "awesome_names";
	node = json_object_get_member(pJsonObject, awesome_namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonShapeAwesomeName> new_list;
			PokemonShapeAwesomeName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonShapeAwesomeName")) {
					jsonToValue(&inst, temp_json, "PokemonShapeAwesomeName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			awesome_names = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonShapeName> new_list;
			PokemonShapeName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonShapeName")) {
					jsonToValue(&inst, temp_json, "PokemonShapeName", "");
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

PokemonShapeDetail::PokemonShapeDetail(char* json)
{
	this->fromJson(json);
}

char*
PokemonShapeDetail::toJson()
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
	if (isprimitive("PokemonShapeAwesomeName")) {
		list<PokemonShapeAwesomeName> new_list = static_cast<list <PokemonShapeAwesomeName> > (getAwesomeNames());
		node = converttoJson(&new_list, "PokemonShapeAwesomeName", "array");
	} else {
		node = json_node_alloc();
		list<PokemonShapeAwesomeName> new_list = static_cast<list <PokemonShapeAwesomeName> > (getAwesomeNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonShapeAwesomeName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonShapeAwesomeName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *awesome_namesKey = "awesome_names";
	json_object_set_member(pJsonObject, awesome_namesKey, node);
	if (isprimitive("PokemonShapeName")) {
		list<PokemonShapeName> new_list = static_cast<list <PokemonShapeName> > (getNames());
		node = converttoJson(&new_list, "PokemonShapeName", "array");
	} else {
		node = json_node_alloc();
		list<PokemonShapeName> new_list = static_cast<list <PokemonShapeName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonShapeName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonShapeName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
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
PokemonShapeDetail::getId()
{
	return id;
}

void
PokemonShapeDetail::setId(int  id)
{
	this->id = id;
}

std::string
PokemonShapeDetail::getName()
{
	return name;
}

void
PokemonShapeDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<PokemonShapeAwesomeName>
PokemonShapeDetail::getAwesomeNames()
{
	return awesome_names;
}

void
PokemonShapeDetail::setAwesomeNames(std::list <PokemonShapeAwesomeName> awesome_names)
{
	this->awesome_names = awesome_names;
}

std::list<PokemonShapeName>
PokemonShapeDetail::getNames()
{
	return names;
}

void
PokemonShapeDetail::setNames(std::list <PokemonShapeName> names)
{
	this->names = names;
}

std::list<PokemonSpeciesSummary>
PokemonShapeDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
PokemonShapeDetail::setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}


