#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pokemon_encounters_retrieve_200_response_inner_version_details_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pokemon_encounters_retrieve_200_response_inner_version_details_inner::Pokemon_encounters_retrieve_200_response_inner_version_details_inner()
{
	//__init();
}

Pokemon_encounters_retrieve_200_response_inner_version_details_inner::~Pokemon_encounters_retrieve_200_response_inner_version_details_inner()
{
	//__cleanup();
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::__init()
{
	//new std::list()std::list> encounter_details;
	//max_chance = double(0);
	//version = new Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version();
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::__cleanup()
{
	//if(encounter_details != NULL) {
	//encounter_details.RemoveAll(true);
	//delete encounter_details;
	//encounter_details = NULL;
	//}
	//if(max_chance != NULL) {
	//
	//delete max_chance;
	//max_chance = NULL;
	//}
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *encounter_detailsKey = "encounter_details";
	node = json_object_get_member(pJsonObject, encounter_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner> new_list;
			Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner")) {
					jsonToValue(&inst, temp_json, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			encounter_details = new_list;
		}
		
	}
	const gchar *max_chanceKey = "max_chance";
	node = json_object_get_member(pJsonObject, max_chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&max_chance, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&max_chance);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionKey = "version";
	node = json_object_get_member(pJsonObject, versionKey);
	if (node !=NULL) {
	

		if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version")) {
			jsonToValue(&version, node, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version", "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version");
		} else {
			
			Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version* obj = static_cast<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version*> (&version);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Pokemon_encounters_retrieve_200_response_inner_version_details_inner::Pokemon_encounters_retrieve_200_response_inner_version_details_inner(char* json)
{
	this->fromJson(json);
}

char*
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner")) {
		list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner> new_list = static_cast<list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner> > (getEncounterDetails());
		node = converttoJson(&new_list, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner", "array");
	} else {
		node = json_node_alloc();
		list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner> new_list = static_cast<list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner> > (getEncounterDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *encounter_detailsKey = "encounter_details";
	json_object_set_member(pJsonObject, encounter_detailsKey, node);
	if (isprimitive("long long")) {
		long long obj = getMaxChance();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMaxChance());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *max_chanceKey = "max_chance";
	json_object_set_member(pJsonObject, max_chanceKey, node);
	if (isprimitive("Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version")) {
		Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version obj = getVersion();
		node = converttoJson(&obj, "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version", "");
	}
	else {
		
		Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version obj = static_cast<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version> (getVersion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionKey = "version";
	json_object_set_member(pJsonObject, versionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner>
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::getEncounterDetails()
{
	return encounter_details;
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::setEncounterDetails(std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner> encounter_details)
{
	this->encounter_details = encounter_details;
}

long long
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::getMaxChance()
{
	return max_chance;
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::setMaxChance(long long  max_chance)
{
	this->max_chance = max_chance;
}

Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::getVersion()
{
	return version;
}

void
Pokemon_encounters_retrieve_200_response_inner_version_details_inner::setVersion(Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version  version)
{
	this->version = version;
}


