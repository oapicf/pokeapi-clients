#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaPokemonEncounterVersion.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaPokemonEncounterVersion::LocationAreaPokemonEncounterVersion()
{
	//__init();
}

LocationAreaPokemonEncounterVersion::~LocationAreaPokemonEncounterVersion()
{
	//__cleanup();
}

void
LocationAreaPokemonEncounterVersion::__init()
{
	//version = null;
	//max_chance = int(0);
	//new std::list()std::list> encounter_details;
}

void
LocationAreaPokemonEncounterVersion::__cleanup()
{
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//if(max_chance != NULL) {
	//
	//delete max_chance;
	//max_chance = NULL;
	//}
	//if(encounter_details != NULL) {
	//encounter_details.RemoveAll(true);
	//delete encounter_details;
	//encounter_details = NULL;
	//}
	//
}

void
LocationAreaPokemonEncounterVersion::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *versionKey = "version";
	node = json_object_get_member(pJsonObject, versionKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionSummary")) {
			jsonToValue(&version, node, "VersionSummary", "VersionSummary");
		} else {
			
			VersionSummary* obj = static_cast<VersionSummary*> (&version);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *max_chanceKey = "max_chance";
	node = json_object_get_member(pJsonObject, max_chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_chance, node, "int", "");
		} else {
			
		}
	}
	const gchar *encounter_detailsKey = "encounter_details";
	node = json_object_get_member(pJsonObject, encounter_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocationAreaEncounterDetail> new_list;
			LocationAreaEncounterDetail inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocationAreaEncounterDetail")) {
					jsonToValue(&inst, temp_json, "LocationAreaEncounterDetail", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			encounter_details = new_list;
		}
		
	}
}

LocationAreaPokemonEncounterVersion::LocationAreaPokemonEncounterVersion(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaPokemonEncounterVersion::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("VersionSummary")) {
		VersionSummary obj = getVersion();
		node = converttoJson(&obj, "VersionSummary", "");
	}
	else {
		
		VersionSummary obj = static_cast<VersionSummary> (getVersion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionKey = "version";
	json_object_set_member(pJsonObject, versionKey, node);
	if (isprimitive("int")) {
		int obj = getMaxChance();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_chanceKey = "max_chance";
	json_object_set_member(pJsonObject, max_chanceKey, node);
	if (isprimitive("LocationAreaEncounterDetail")) {
		list<LocationAreaEncounterDetail> new_list = static_cast<list <LocationAreaEncounterDetail> > (getEncounterDetails());
		node = converttoJson(&new_list, "LocationAreaEncounterDetail", "array");
	} else {
		node = json_node_alloc();
		list<LocationAreaEncounterDetail> new_list = static_cast<list <LocationAreaEncounterDetail> > (getEncounterDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocationAreaEncounterDetail>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocationAreaEncounterDetail obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *encounter_detailsKey = "encounter_details";
	json_object_set_member(pJsonObject, encounter_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

VersionSummary
LocationAreaPokemonEncounterVersion::getVersion()
{
	return version;
}

void
LocationAreaPokemonEncounterVersion::setVersion(VersionSummary  version)
{
	this->version = version;
}

int
LocationAreaPokemonEncounterVersion::getMaxChance()
{
	return max_chance;
}

void
LocationAreaPokemonEncounterVersion::setMaxChance(int  max_chance)
{
	this->max_chance = max_chance;
}

std::list<LocationAreaEncounterDetail>
LocationAreaPokemonEncounterVersion::getEncounterDetails()
{
	return encounter_details;
}

void
LocationAreaPokemonEncounterVersion::setEncounterDetails(std::list <LocationAreaEncounterDetail> encounter_details)
{
	this->encounter_details = encounter_details;
}


