#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaEncounterRate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaEncounterRate::LocationAreaEncounterRate()
{
	//__init();
}

LocationAreaEncounterRate::~LocationAreaEncounterRate()
{
	//__cleanup();
}

void
LocationAreaEncounterRate::__init()
{
	//encounter_method = null;
	//new std::list()std::list> version_details;
}

void
LocationAreaEncounterRate::__cleanup()
{
	//if(encounter_method != NULL) {
	//
	//delete encounter_method;
	//encounter_method = NULL;
	//}
	//if(version_details != NULL) {
	//version_details.RemoveAll(true);
	//delete version_details;
	//version_details = NULL;
	//}
	//
}

void
LocationAreaEncounterRate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *encounter_methodKey = "encounter_method";
	node = json_object_get_member(pJsonObject, encounter_methodKey);
	if (node !=NULL) {
	

		if (isprimitive("EncounterMethodSummary")) {
			jsonToValue(&encounter_method, node, "EncounterMethodSummary", "EncounterMethodSummary");
		} else {
			
			EncounterMethodSummary* obj = static_cast<EncounterMethodSummary*> (&encounter_method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_detailsKey = "version_details";
	node = json_object_get_member(pJsonObject, version_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationAreaEncounterVersionDetail> new_list;
			LocationAreaEncounterVersionDetail inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationAreaEncounterVersionDetail")) {
					jsonToValue(&inst, temp_json, "LocationAreaEncounterVersionDetail", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_details = new_list;
		}
		
	}
}

LocationAreaEncounterRate::LocationAreaEncounterRate(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaEncounterRate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EncounterMethodSummary")) {
		EncounterMethodSummary obj = getEncounterMethod();
		node = converttoJson(&obj, "EncounterMethodSummary", "");
	}
	else {
		
		EncounterMethodSummary obj = static_cast<EncounterMethodSummary> (getEncounterMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *encounter_methodKey = "encounter_method";
	json_object_set_member(pJsonObject, encounter_methodKey, node);
	if (isprimitive("LocationAreaEncounterVersionDetail")) {
		list<LocationAreaEncounterVersionDetail> new_list = static_cast<list <LocationAreaEncounterVersionDetail> > (getVersionDetails());
		node = converttoJson(&new_list, "LocationAreaEncounterVersionDetail", "array");
	} else {
		node = json_node_alloc();
		list<LocationAreaEncounterVersionDetail> new_list = static_cast<list <LocationAreaEncounterVersionDetail> > (getVersionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationAreaEncounterVersionDetail>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationAreaEncounterVersionDetail obj = *it;
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

EncounterMethodSummary
LocationAreaEncounterRate::getEncounterMethod()
{
	return encounter_method;
}

void
LocationAreaEncounterRate::setEncounterMethod(EncounterMethodSummary  encounter_method)
{
	this->encounter_method = encounter_method;
}

std::list<LocationAreaEncounterVersionDetail>
LocationAreaEncounterRate::getVersionDetails()
{
	return version_details;
}

void
LocationAreaEncounterRate::setVersionDetails(std::list <LocationAreaEncounterVersionDetail> version_details)
{
	this->version_details = version_details;
}


