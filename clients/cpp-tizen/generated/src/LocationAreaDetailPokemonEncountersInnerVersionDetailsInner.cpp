#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaDetail_pokemon_encounters_inner_version_details_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaDetail_pokemon_encounters_inner_version_details_inner::LocationAreaDetail_pokemon_encounters_inner_version_details_inner()
{
	//__init();
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner::~LocationAreaDetail_pokemon_encounters_inner_version_details_inner()
{
	//__cleanup();
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::__init()
{
	//version = new AbilityDetail_pokemon_inner_pokemon();
	//max_chance = int(0);
	//encounter_details = new LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details();
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::__cleanup()
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
	//
	//delete encounter_details;
	//encounter_details = NULL;
	//}
	//
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *versionKey = "version";
	node = json_object_get_member(pJsonObject, versionKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&version, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&version);
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
	

		if (isprimitive("LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details")) {
			jsonToValue(&encounter_details, node, "LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details", "LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details");
		} else {
			
			LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details* obj = static_cast<LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details*> (&encounter_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner::LocationAreaDetail_pokemon_encounters_inner_version_details_inner(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getVersion();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getVersion());
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
	if (isprimitive("LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details")) {
		LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details obj = getEncounterDetails();
		node = converttoJson(&obj, "LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details", "");
	}
	else {
		
		LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details obj = static_cast<LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details> (getEncounterDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::getVersion()
{
	return version;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::setVersion(AbilityDetail_pokemon_inner_pokemon  version)
{
	this->version = version;
}

int
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::getMaxChance()
{
	return max_chance;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::setMaxChance(int  max_chance)
{
	this->max_chance = max_chance;
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::getEncounterDetails()
{
	return encounter_details;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::setEncounterDetails(LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details  encounter_details)
{
	this->encounter_details = encounter_details;
}


