#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaDetail_encounter_method_rates_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaDetail_encounter_method_rates_inner::LocationAreaDetail_encounter_method_rates_inner()
{
	//__init();
}

LocationAreaDetail_encounter_method_rates_inner::~LocationAreaDetail_encounter_method_rates_inner()
{
	//__cleanup();
}

void
LocationAreaDetail_encounter_method_rates_inner::__init()
{
	//encounter_method = new AbilityDetail_pokemon_inner_pokemon();
	//new std::list()std::list> version_details;
}

void
LocationAreaDetail_encounter_method_rates_inner::__cleanup()
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
LocationAreaDetail_encounter_method_rates_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *encounter_methodKey = "encounter_method";
	node = json_object_get_member(pJsonObject, encounter_methodKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&encounter_method, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&encounter_method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_detailsKey = "version_details";
	node = json_object_get_member(pJsonObject, version_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> new_list;
			LocationAreaDetail_encounter_method_rates_inner_version_details_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationAreaDetail_encounter_method_rates_inner_version_details_inner")) {
					jsonToValue(&inst, temp_json, "LocationAreaDetail_encounter_method_rates_inner_version_details_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_details = new_list;
		}
		
	}
}

LocationAreaDetail_encounter_method_rates_inner::LocationAreaDetail_encounter_method_rates_inner(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaDetail_encounter_method_rates_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getEncounterMethod();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getEncounterMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *encounter_methodKey = "encounter_method";
	json_object_set_member(pJsonObject, encounter_methodKey, node);
	if (isprimitive("LocationAreaDetail_encounter_method_rates_inner_version_details_inner")) {
		list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> new_list = static_cast<list <LocationAreaDetail_encounter_method_rates_inner_version_details_inner> > (getVersionDetails());
		node = converttoJson(&new_list, "LocationAreaDetail_encounter_method_rates_inner_version_details_inner", "array");
	} else {
		node = json_node_alloc();
		list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> new_list = static_cast<list <LocationAreaDetail_encounter_method_rates_inner_version_details_inner> > (getVersionDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationAreaDetail_encounter_method_rates_inner_version_details_inner obj = *it;
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

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_encounter_method_rates_inner::getEncounterMethod()
{
	return encounter_method;
}

void
LocationAreaDetail_encounter_method_rates_inner::setEncounterMethod(AbilityDetail_pokemon_inner_pokemon  encounter_method)
{
	this->encounter_method = encounter_method;
}

std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner>
LocationAreaDetail_encounter_method_rates_inner::getVersionDetails()
{
	return version_details;
}

void
LocationAreaDetail_encounter_method_rates_inner::setVersionDetails(std::list <LocationAreaDetail_encounter_method_rates_inner_version_details_inner> version_details)
{
	this->version_details = version_details;
}


