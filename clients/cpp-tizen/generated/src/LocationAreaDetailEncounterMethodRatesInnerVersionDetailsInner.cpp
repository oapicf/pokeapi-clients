#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaDetail_encounter_method_rates_inner_version_details_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaDetail_encounter_method_rates_inner_version_details_inner::LocationAreaDetail_encounter_method_rates_inner_version_details_inner()
{
	//__init();
}

LocationAreaDetail_encounter_method_rates_inner_version_details_inner::~LocationAreaDetail_encounter_method_rates_inner_version_details_inner()
{
	//__cleanup();
}

void
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::__init()
{
	//rate = int(0);
	//version = new AbilityDetail_pokemon_inner_pokemon();
}

void
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::__cleanup()
{
	//if(rate != NULL) {
	//
	//delete rate;
	//rate = NULL;
	//}
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//
}

void
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rateKey = "rate";
	node = json_object_get_member(pJsonObject, rateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&rate, node, "int", "");
		} else {
			
		}
	}
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
}

LocationAreaDetail_encounter_method_rates_inner_version_details_inner::LocationAreaDetail_encounter_method_rates_inner_version_details_inner(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getRate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *rateKey = "rate";
	json_object_set_member(pJsonObject, rateKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::getRate()
{
	return rate;
}

void
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::setRate(int  rate)
{
	this->rate = rate;
}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::getVersion()
{
	return version;
}

void
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::setVersion(AbilityDetail_pokemon_inner_pokemon  version)
{
	this->version = version;
}


