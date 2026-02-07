#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerationDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerationDetail::GenerationDetail()
{
	//__init();
}

GenerationDetail::~GenerationDetail()
{
	//__cleanup();
}

void
GenerationDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> abilities;
	//main_region = new RegionSummary();
	//new std::list()std::list> moves;
	//new std::list()std::list> names;
	//new std::list()std::list> pokemon_species;
	//new std::list()std::list> types;
	//new std::list()std::list> version_groups;
}

void
GenerationDetail::__cleanup()
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
	//if(abilities != NULL) {
	//abilities.RemoveAll(true);
	//delete abilities;
	//abilities = NULL;
	//}
	//if(main_region != NULL) {
	//
	//delete main_region;
	//main_region = NULL;
	//}
	//if(moves != NULL) {
	//moves.RemoveAll(true);
	//delete moves;
	//moves = NULL;
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
	//if(types != NULL) {
	//types.RemoveAll(true);
	//delete types;
	//types = NULL;
	//}
	//if(version_groups != NULL) {
	//version_groups.RemoveAll(true);
	//delete version_groups;
	//version_groups = NULL;
	//}
	//
}

void
GenerationDetail::fromJson(char* jsonStr)
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
	const gchar *abilitiesKey = "abilities";
	node = json_object_get_member(pJsonObject, abilitiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilitySummary> new_list;
			AbilitySummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilitySummary")) {
					jsonToValue(&inst, temp_json, "AbilitySummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			abilities = new_list;
		}
		
	}
	const gchar *main_regionKey = "main_region";
	node = json_object_get_member(pJsonObject, main_regionKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionSummary")) {
			jsonToValue(&main_region, node, "RegionSummary", "RegionSummary");
		} else {
			
			RegionSummary* obj = static_cast<RegionSummary*> (&main_region);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *movesKey = "moves";
	node = json_object_get_member(pJsonObject, movesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveSummary> new_list;
			MoveSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveSummary")) {
					jsonToValue(&inst, temp_json, "MoveSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			moves = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GenerationName> new_list;
			GenerationName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GenerationName")) {
					jsonToValue(&inst, temp_json, "GenerationName", "");
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
	const gchar *typesKey = "types";
	node = json_object_get_member(pJsonObject, typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TypeSummary> new_list;
			TypeSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeSummary")) {
					jsonToValue(&inst, temp_json, "TypeSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			types = new_list;
		}
		
	}
	const gchar *version_groupsKey = "version_groups";
	node = json_object_get_member(pJsonObject, version_groupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<VersionGroupSummary> new_list;
			VersionGroupSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("VersionGroupSummary")) {
					jsonToValue(&inst, temp_json, "VersionGroupSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_groups = new_list;
		}
		
	}
}

GenerationDetail::GenerationDetail(char* json)
{
	this->fromJson(json);
}

char*
GenerationDetail::toJson()
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
	if (isprimitive("AbilitySummary")) {
		list<AbilitySummary> new_list = static_cast<list <AbilitySummary> > (getAbilities());
		node = converttoJson(&new_list, "AbilitySummary", "array");
	} else {
		node = json_node_alloc();
		list<AbilitySummary> new_list = static_cast<list <AbilitySummary> > (getAbilities());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilitySummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilitySummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *abilitiesKey = "abilities";
	json_object_set_member(pJsonObject, abilitiesKey, node);
	if (isprimitive("RegionSummary")) {
		RegionSummary obj = getMainRegion();
		node = converttoJson(&obj, "RegionSummary", "");
	}
	else {
		
		RegionSummary obj = static_cast<RegionSummary> (getMainRegion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *main_regionKey = "main_region";
	json_object_set_member(pJsonObject, main_regionKey, node);
	if (isprimitive("MoveSummary")) {
		list<MoveSummary> new_list = static_cast<list <MoveSummary> > (getMoves());
		node = converttoJson(&new_list, "MoveSummary", "array");
	} else {
		node = json_node_alloc();
		list<MoveSummary> new_list = static_cast<list <MoveSummary> > (getMoves());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *movesKey = "moves";
	json_object_set_member(pJsonObject, movesKey, node);
	if (isprimitive("GenerationName")) {
		list<GenerationName> new_list = static_cast<list <GenerationName> > (getNames());
		node = converttoJson(&new_list, "GenerationName", "array");
	} else {
		node = json_node_alloc();
		list<GenerationName> new_list = static_cast<list <GenerationName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GenerationName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GenerationName obj = *it;
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
	if (isprimitive("TypeSummary")) {
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getTypes());
		node = converttoJson(&new_list, "TypeSummary", "array");
	} else {
		node = json_node_alloc();
		list<TypeSummary> new_list = static_cast<list <TypeSummary> > (getTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *typesKey = "types";
	json_object_set_member(pJsonObject, typesKey, node);
	if (isprimitive("VersionGroupSummary")) {
		list<VersionGroupSummary> new_list = static_cast<list <VersionGroupSummary> > (getVersionGroups());
		node = converttoJson(&new_list, "VersionGroupSummary", "array");
	} else {
		node = json_node_alloc();
		list<VersionGroupSummary> new_list = static_cast<list <VersionGroupSummary> > (getVersionGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<VersionGroupSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			VersionGroupSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *version_groupsKey = "version_groups";
	json_object_set_member(pJsonObject, version_groupsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
GenerationDetail::getId()
{
	return id;
}

void
GenerationDetail::setId(int  id)
{
	this->id = id;
}

std::string
GenerationDetail::getName()
{
	return name;
}

void
GenerationDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<AbilitySummary>
GenerationDetail::getAbilities()
{
	return abilities;
}

void
GenerationDetail::setAbilities(std::list <AbilitySummary> abilities)
{
	this->abilities = abilities;
}

RegionSummary
GenerationDetail::getMainRegion()
{
	return main_region;
}

void
GenerationDetail::setMainRegion(RegionSummary  main_region)
{
	this->main_region = main_region;
}

std::list<MoveSummary>
GenerationDetail::getMoves()
{
	return moves;
}

void
GenerationDetail::setMoves(std::list <MoveSummary> moves)
{
	this->moves = moves;
}

std::list<GenerationName>
GenerationDetail::getNames()
{
	return names;
}

void
GenerationDetail::setNames(std::list <GenerationName> names)
{
	this->names = names;
}

std::list<PokemonSpeciesSummary>
GenerationDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
GenerationDetail::setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}

std::list<TypeSummary>
GenerationDetail::getTypes()
{
	return types;
}

void
GenerationDetail::setTypes(std::list <TypeSummary> types)
{
	this->types = types;
}

std::list<VersionGroupSummary>
GenerationDetail::getVersionGroups()
{
	return version_groups;
}

void
GenerationDetail::setVersionGroups(std::list <VersionGroupSummary> version_groups)
{
	this->version_groups = version_groups;
}


