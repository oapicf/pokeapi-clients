#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonEncounterResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonEncounterResponse::PokemonEncounterResponse()
{
	//__init();
}

PokemonEncounterResponse::~PokemonEncounterResponse()
{
	//__cleanup();
}

void
PokemonEncounterResponse::__init()
{
	//location_area = null;
	//new std::list()std::list> version_details;
}

void
PokemonEncounterResponse::__cleanup()
{
	//if(location_area != NULL) {
	//
	//delete location_area;
	//location_area = NULL;
	//}
	//if(version_details != NULL) {
	//version_details.RemoveAll(true);
	//delete version_details;
	//version_details = NULL;
	//}
	//
}

void
PokemonEncounterResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *location_areaKey = "location_area";
	node = json_object_get_member(pJsonObject, location_areaKey);
	if (node !=NULL) {
	

		if (isprimitive("LocationAreaSummary")) {
			jsonToValue(&location_area, node, "LocationAreaSummary", "LocationAreaSummary");
		} else {
			
			LocationAreaSummary* obj = static_cast<LocationAreaSummary*> (&location_area);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_detailsKey = "version_details";
	node = json_object_get_member(pJsonObject, version_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonEncounterVersionDetailResponse> new_list;
			PokemonEncounterVersionDetailResponse inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonEncounterVersionDetailResponse")) {
					jsonToValue(&inst, temp_json, "PokemonEncounterVersionDetailResponse", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_details = new_list;
		}
		
	}
}

PokemonEncounterResponse::PokemonEncounterResponse(char* json)
{
	this->fromJson(json);
}

char*
PokemonEncounterResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LocationAreaSummary")) {
		LocationAreaSummary obj = getLocationArea();
		node = converttoJson(&obj, "LocationAreaSummary", "");
	}
	else {
		
		LocationAreaSummary obj = static_cast<LocationAreaSummary> (getLocationArea());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *location_areaKey = "location_area";
	json_object_set_member(pJsonObject, location_areaKey, node);
	if (isprimitive("PokemonEncounterVersionDetailResponse")) {
		list<PokemonEncounterVersionDetailResponse> new_list = static_cast<list <PokemonEncounterVersionDetailResponse> > (getVersionDetails());
		node = converttoJson(&new_list, "PokemonEncounterVersionDetailResponse", "array");
	} else {
		node = json_node_alloc();
		list<PokemonEncounterVersionDetailResponse> new_list = static_cast<list <PokemonEncounterVersionDetailResponse> > (getVersionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonEncounterVersionDetailResponse>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonEncounterVersionDetailResponse obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *version_detailsKey = "version_details";
	json_object_set_member(pJsonObject, version_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

LocationAreaSummary
PokemonEncounterResponse::getLocationArea()
{
	return location_area;
}

void
PokemonEncounterResponse::setLocationArea(LocationAreaSummary  location_area)
{
	this->location_area = location_area;
}

std::list<PokemonEncounterVersionDetailResponse>
PokemonEncounterResponse::getVersionDetails()
{
	return version_details;
}

void
PokemonEncounterResponse::setVersionDetails(std::list <PokemonEncounterVersionDetailResponse> version_details)
{
	this->version_details = version_details;
}


