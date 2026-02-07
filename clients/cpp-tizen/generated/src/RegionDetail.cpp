#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RegionDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RegionDetail::RegionDetail()
{
	//__init();
}

RegionDetail::~RegionDetail()
{
	//__cleanup();
}

void
RegionDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> locations;
	//main_generation = null;
	//new std::list()std::list> names;
	//new std::list()std::list> pokedexes;
	//new std::list()std::list> version_groups;
}

void
RegionDetail::__cleanup()
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
	//if(locations != NULL) {
	//locations.RemoveAll(true);
	//delete locations;
	//locations = NULL;
	//}
	//if(main_generation != NULL) {
	//
	//delete main_generation;
	//main_generation = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(pokedexes != NULL) {
	//pokedexes.RemoveAll(true);
	//delete pokedexes;
	//pokedexes = NULL;
	//}
	//if(version_groups != NULL) {
	//version_groups.RemoveAll(true);
	//delete version_groups;
	//version_groups = NULL;
	//}
	//
}

void
RegionDetail::fromJson(char* jsonStr)
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
	const gchar *locationsKey = "locations";
	node = json_object_get_member(pJsonObject, locationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationSummary> new_list;
			LocationSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationSummary")) {
					jsonToValue(&inst, temp_json, "LocationSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			locations = new_list;
		}
		
	}
	const gchar *main_generationKey = "main_generation";
	node = json_object_get_member(pJsonObject, main_generationKey);
	if (node !=NULL) {
	

		if (isprimitive("GenerationSummary")) {
			jsonToValue(&main_generation, node, "GenerationSummary", "GenerationSummary");
		} else {
			
			GenerationSummary* obj = static_cast<GenerationSummary*> (&main_generation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RegionName> new_list;
			RegionName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RegionName")) {
					jsonToValue(&inst, temp_json, "RegionName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *pokedexesKey = "pokedexes";
	node = json_object_get_member(pJsonObject, pokedexesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokedexSummary> new_list;
			PokedexSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokedexSummary")) {
					jsonToValue(&inst, temp_json, "PokedexSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokedexes = new_list;
		}
		
	}
	const gchar *version_groupsKey = "version_groups";
	node = json_object_get_member(pJsonObject, version_groupsKey);
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
			version_groups = new_list;
		}
		
	}
}

RegionDetail::RegionDetail(char* json)
{
	this->fromJson(json);
}

char*
RegionDetail::toJson()
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
	if (isprimitive("LocationSummary")) {
		list<LocationSummary> new_list = static_cast<list <LocationSummary> > (getLocations());
		node = converttoJson(&new_list, "LocationSummary", "array");
	} else {
		node = json_node_alloc();
		list<LocationSummary> new_list = static_cast<list <LocationSummary> > (getLocations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *locationsKey = "locations";
	json_object_set_member(pJsonObject, locationsKey, node);
	if (isprimitive("GenerationSummary")) {
		GenerationSummary obj = getMainGeneration();
		node = converttoJson(&obj, "GenerationSummary", "");
	}
	else {
		
		GenerationSummary obj = static_cast<GenerationSummary> (getMainGeneration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *main_generationKey = "main_generation";
	json_object_set_member(pJsonObject, main_generationKey, node);
	if (isprimitive("RegionName")) {
		list<RegionName> new_list = static_cast<list <RegionName> > (getNames());
		node = converttoJson(&new_list, "RegionName", "array");
	} else {
		node = json_node_alloc();
		list<RegionName> new_list = static_cast<list <RegionName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RegionName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RegionName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("PokedexSummary")) {
		list<PokedexSummary> new_list = static_cast<list <PokedexSummary> > (getPokedexes());
		node = converttoJson(&new_list, "PokedexSummary", "array");
	} else {
		node = json_node_alloc();
		list<PokedexSummary> new_list = static_cast<list <PokedexSummary> > (getPokedexes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokedexSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokedexSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokedexesKey = "pokedexes";
	json_object_set_member(pJsonObject, pokedexesKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getVersionGroups());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getVersionGroups());
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
RegionDetail::getId()
{
	return id;
}

void
RegionDetail::setId(int  id)
{
	this->id = id;
}

std::string
RegionDetail::getName()
{
	return name;
}

void
RegionDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<LocationSummary>
RegionDetail::getLocations()
{
	return locations;
}

void
RegionDetail::setLocations(std::list <LocationSummary> locations)
{
	this->locations = locations;
}

GenerationSummary
RegionDetail::getMainGeneration()
{
	return main_generation;
}

void
RegionDetail::setMainGeneration(GenerationSummary  main_generation)
{
	this->main_generation = main_generation;
}

std::list<RegionName>
RegionDetail::getNames()
{
	return names;
}

void
RegionDetail::setNames(std::list <RegionName> names)
{
	this->names = names;
}

std::list<PokedexSummary>
RegionDetail::getPokedexes()
{
	return pokedexes;
}

void
RegionDetail::setPokedexes(std::list <PokedexSummary> pokedexes)
{
	this->pokedexes = pokedexes;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
RegionDetail::getVersionGroups()
{
	return version_groups;
}

void
RegionDetail::setVersionGroups(std::list <AbilityDetail_pokemon_inner_pokemon> version_groups)
{
	this->version_groups = version_groups;
}


