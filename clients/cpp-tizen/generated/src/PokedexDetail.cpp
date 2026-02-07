#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokedexDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokedexDetail::PokedexDetail()
{
	//__init();
}

PokedexDetail::~PokedexDetail()
{
	//__cleanup();
}

void
PokedexDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//is_main_series = bool(false);
	//new std::list()std::list> descriptions;
	//new std::list()std::list> names;
	//new std::list()std::list> pokemon_entries;
	//region = new RegionSummary();
	//new std::list()std::list> version_groups;
}

void
PokedexDetail::__cleanup()
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
	//if(is_main_series != NULL) {
	//
	//delete is_main_series;
	//is_main_series = NULL;
	//}
	//if(descriptions != NULL) {
	//descriptions.RemoveAll(true);
	//delete descriptions;
	//descriptions = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(pokemon_entries != NULL) {
	//pokemon_entries.RemoveAll(true);
	//delete pokemon_entries;
	//pokemon_entries = NULL;
	//}
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//if(version_groups != NULL) {
	//version_groups.RemoveAll(true);
	//delete version_groups;
	//version_groups = NULL;
	//}
	//
}

void
PokedexDetail::fromJson(char* jsonStr)
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
	const gchar *is_main_seriesKey = "is_main_series";
	node = json_object_get_member(pJsonObject, is_main_seriesKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_main_series, node, "bool", "");
		} else {
			
		}
	}
	const gchar *descriptionsKey = "descriptions";
	node = json_object_get_member(pJsonObject, descriptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokedexDescription> new_list;
			PokedexDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokedexDescription")) {
					jsonToValue(&inst, temp_json, "PokedexDescription", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			descriptions = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokedexName> new_list;
			PokedexName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokedexName")) {
					jsonToValue(&inst, temp_json, "PokedexName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *pokemon_entriesKey = "pokemon_entries";
	node = json_object_get_member(pJsonObject, pokemon_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokedexDetail_pokemon_entries_inner> new_list;
			PokedexDetail_pokemon_entries_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokedexDetail_pokemon_entries_inner")) {
					jsonToValue(&inst, temp_json, "PokedexDetail_pokemon_entries_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokemon_entries = new_list;
		}
		
	}
	const gchar *regionKey = "region";
	node = json_object_get_member(pJsonObject, regionKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionSummary")) {
			jsonToValue(&region, node, "RegionSummary", "RegionSummary");
		} else {
			
			RegionSummary* obj = static_cast<RegionSummary*> (&region);
			obj->fromJson(json_to_string(node, false));
			
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

PokedexDetail::PokedexDetail(char* json)
{
	this->fromJson(json);
}

char*
PokedexDetail::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getIsMainSeries();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_main_seriesKey = "is_main_series";
	json_object_set_member(pJsonObject, is_main_seriesKey, node);
	if (isprimitive("PokedexDescription")) {
		list<PokedexDescription> new_list = static_cast<list <PokedexDescription> > (getDescriptions());
		node = converttoJson(&new_list, "PokedexDescription", "array");
	} else {
		node = json_node_alloc();
		list<PokedexDescription> new_list = static_cast<list <PokedexDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokedexDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokedexDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *descriptionsKey = "descriptions";
	json_object_set_member(pJsonObject, descriptionsKey, node);
	if (isprimitive("PokedexName")) {
		list<PokedexName> new_list = static_cast<list <PokedexName> > (getNames());
		node = converttoJson(&new_list, "PokedexName", "array");
	} else {
		node = json_node_alloc();
		list<PokedexName> new_list = static_cast<list <PokedexName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokedexName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokedexName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("PokedexDetail_pokemon_entries_inner")) {
		list<PokedexDetail_pokemon_entries_inner> new_list = static_cast<list <PokedexDetail_pokemon_entries_inner> > (getPokemonEntries());
		node = converttoJson(&new_list, "PokedexDetail_pokemon_entries_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokedexDetail_pokemon_entries_inner> new_list = static_cast<list <PokedexDetail_pokemon_entries_inner> > (getPokemonEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokedexDetail_pokemon_entries_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokedexDetail_pokemon_entries_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokemon_entriesKey = "pokemon_entries";
	json_object_set_member(pJsonObject, pokemon_entriesKey, node);
	if (isprimitive("RegionSummary")) {
		RegionSummary obj = getRegion();
		node = converttoJson(&obj, "RegionSummary", "");
	}
	else {
		
		RegionSummary obj = static_cast<RegionSummary> (getRegion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *regionKey = "region";
	json_object_set_member(pJsonObject, regionKey, node);
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
PokedexDetail::getId()
{
	return id;
}

void
PokedexDetail::setId(int  id)
{
	this->id = id;
}

std::string
PokedexDetail::getName()
{
	return name;
}

void
PokedexDetail::setName(std::string  name)
{
	this->name = name;
}

bool
PokedexDetail::getIsMainSeries()
{
	return is_main_series;
}

void
PokedexDetail::setIsMainSeries(bool  is_main_series)
{
	this->is_main_series = is_main_series;
}

std::list<PokedexDescription>
PokedexDetail::getDescriptions()
{
	return descriptions;
}

void
PokedexDetail::setDescriptions(std::list <PokedexDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<PokedexName>
PokedexDetail::getNames()
{
	return names;
}

void
PokedexDetail::setNames(std::list <PokedexName> names)
{
	this->names = names;
}

std::list<PokedexDetail_pokemon_entries_inner>
PokedexDetail::getPokemonEntries()
{
	return pokemon_entries;
}

void
PokedexDetail::setPokemonEntries(std::list <PokedexDetail_pokemon_entries_inner> pokemon_entries)
{
	this->pokemon_entries = pokemon_entries;
}

RegionSummary
PokedexDetail::getRegion()
{
	return region;
}

void
PokedexDetail::setRegion(RegionSummary  region)
{
	this->region = region;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
PokedexDetail::getVersionGroups()
{
	return version_groups;
}

void
PokedexDetail::setVersionGroups(std::list <AbilityDetail_pokemon_inner_pokemon> version_groups)
{
	this->version_groups = version_groups;
}


