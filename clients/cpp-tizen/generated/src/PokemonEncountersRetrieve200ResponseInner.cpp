#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pokemon_encounters_retrieve_200_response_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pokemon_encounters_retrieve_200_response_inner::Pokemon_encounters_retrieve_200_response_inner()
{
	//__init();
}

Pokemon_encounters_retrieve_200_response_inner::~Pokemon_encounters_retrieve_200_response_inner()
{
	//__cleanup();
}

void
Pokemon_encounters_retrieve_200_response_inner::__init()
{
	//location_area = new Pokemon_encounters_retrieve_200_response_inner_location_area();
	//new std::list()std::list> version_details;
}

void
Pokemon_encounters_retrieve_200_response_inner::__cleanup()
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
Pokemon_encounters_retrieve_200_response_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *location_areaKey = "location_area";
	node = json_object_get_member(pJsonObject, location_areaKey);
	if (node !=NULL) {
	

		if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_location_area")) {
			jsonToValue(&location_area, node, "Pokemon_encounters_retrieve_200_response_inner_location_area", "Pokemon_encounters_retrieve_200_response_inner_location_area");
		} else {
			
			Pokemon_encounters_retrieve_200_response_inner_location_area* obj = static_cast<Pokemon_encounters_retrieve_200_response_inner_location_area*> (&location_area);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_detailsKey = "version_details";
	node = json_object_get_member(pJsonObject, version_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner> new_list;
			Pokemon_encounters_retrieve_200_response_inner_version_details_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner")) {
					jsonToValue(&inst, temp_json, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_details = new_list;
		}
		
	}
}

Pokemon_encounters_retrieve_200_response_inner::Pokemon_encounters_retrieve_200_response_inner(char* json)
{
	this->fromJson(json);
}

char*
Pokemon_encounters_retrieve_200_response_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_location_area")) {
		Pokemon_encounters_retrieve_200_response_inner_location_area obj = getLocationArea();
		node = converttoJson(&obj, "Pokemon_encounters_retrieve_200_response_inner_location_area", "");
	}
	else {
		
		Pokemon_encounters_retrieve_200_response_inner_location_area obj = static_cast<Pokemon_encounters_retrieve_200_response_inner_location_area> (getLocationArea());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *location_areaKey = "location_area";
	json_object_set_member(pJsonObject, location_areaKey, node);
	if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner")) {
		list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner> new_list = static_cast<list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner> > (getVersionDetails());
		node = converttoJson(&new_list, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner", "array");
	} else {
		node = json_node_alloc();
		list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner> new_list = static_cast<list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner> > (getVersionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Pokemon_encounters_retrieve_200_response_inner_version_details_inner obj = *it;
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

Pokemon_encounters_retrieve_200_response_inner_location_area
Pokemon_encounters_retrieve_200_response_inner::getLocationArea()
{
	return location_area;
}

void
Pokemon_encounters_retrieve_200_response_inner::setLocationArea(Pokemon_encounters_retrieve_200_response_inner_location_area  location_area)
{
	this->location_area = location_area;
}

std::list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner>
Pokemon_encounters_retrieve_200_response_inner::getVersionDetails()
{
	return version_details;
}

void
Pokemon_encounters_retrieve_200_response_inner::setVersionDetails(std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner> version_details)
{
	this->version_details = version_details;
}


