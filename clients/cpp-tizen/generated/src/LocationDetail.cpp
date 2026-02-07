#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationDetail::LocationDetail()
{
	//__init();
}

LocationDetail::~LocationDetail()
{
	//__cleanup();
}

void
LocationDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//region = new RegionSummary();
	//new std::list()std::list> names;
	//new std::list()std::list> game_indices;
	//new std::list()std::list> areas;
}

void
LocationDetail::__cleanup()
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
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(game_indices != NULL) {
	//game_indices.RemoveAll(true);
	//delete game_indices;
	//game_indices = NULL;
	//}
	//if(areas != NULL) {
	//areas.RemoveAll(true);
	//delete areas;
	//areas = NULL;
	//}
	//
}

void
LocationDetail::fromJson(char* jsonStr)
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
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationName> new_list;
			LocationName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationName")) {
					jsonToValue(&inst, temp_json, "LocationName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *game_indicesKey = "game_indices";
	node = json_object_get_member(pJsonObject, game_indicesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationGameIndex> new_list;
			LocationGameIndex inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationGameIndex")) {
					jsonToValue(&inst, temp_json, "LocationGameIndex", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			game_indices = new_list;
		}
		
	}
	const gchar *areasKey = "areas";
	node = json_object_get_member(pJsonObject, areasKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationAreaSummary> new_list;
			LocationAreaSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationAreaSummary")) {
					jsonToValue(&inst, temp_json, "LocationAreaSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			areas = new_list;
		}
		
	}
}

LocationDetail::LocationDetail(char* json)
{
	this->fromJson(json);
}

char*
LocationDetail::toJson()
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
	if (isprimitive("LocationName")) {
		list<LocationName> new_list = static_cast<list <LocationName> > (getNames());
		node = converttoJson(&new_list, "LocationName", "array");
	} else {
		node = json_node_alloc();
		list<LocationName> new_list = static_cast<list <LocationName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("LocationGameIndex")) {
		list<LocationGameIndex> new_list = static_cast<list <LocationGameIndex> > (getGameIndices());
		node = converttoJson(&new_list, "LocationGameIndex", "array");
	} else {
		node = json_node_alloc();
		list<LocationGameIndex> new_list = static_cast<list <LocationGameIndex> > (getGameIndices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationGameIndex>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationGameIndex obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *game_indicesKey = "game_indices";
	json_object_set_member(pJsonObject, game_indicesKey, node);
	if (isprimitive("LocationAreaSummary")) {
		list<LocationAreaSummary> new_list = static_cast<list <LocationAreaSummary> > (getAreas());
		node = converttoJson(&new_list, "LocationAreaSummary", "array");
	} else {
		node = json_node_alloc();
		list<LocationAreaSummary> new_list = static_cast<list <LocationAreaSummary> > (getAreas());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationAreaSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationAreaSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *areasKey = "areas";
	json_object_set_member(pJsonObject, areasKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
LocationDetail::getId()
{
	return id;
}

void
LocationDetail::setId(int  id)
{
	this->id = id;
}

std::string
LocationDetail::getName()
{
	return name;
}

void
LocationDetail::setName(std::string  name)
{
	this->name = name;
}

RegionSummary
LocationDetail::getRegion()
{
	return region;
}

void
LocationDetail::setRegion(RegionSummary  region)
{
	this->region = region;
}

std::list<LocationName>
LocationDetail::getNames()
{
	return names;
}

void
LocationDetail::setNames(std::list <LocationName> names)
{
	this->names = names;
}

std::list<LocationGameIndex>
LocationDetail::getGameIndices()
{
	return game_indices;
}

void
LocationDetail::setGameIndices(std::list <LocationGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

std::list<LocationAreaSummary>
LocationDetail::getAreas()
{
	return areas;
}

void
LocationDetail::setAreas(std::list <LocationAreaSummary> areas)
{
	this->areas = areas;
}


