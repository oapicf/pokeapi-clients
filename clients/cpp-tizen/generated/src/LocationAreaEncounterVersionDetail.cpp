#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocationAreaEncounterVersionDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocationAreaEncounterVersionDetail::LocationAreaEncounterVersionDetail()
{
	//__init();
}

LocationAreaEncounterVersionDetail::~LocationAreaEncounterVersionDetail()
{
	//__cleanup();
}

void
LocationAreaEncounterVersionDetail::__init()
{
	//rate = int(0);
	//version = null;
}

void
LocationAreaEncounterVersionDetail::__cleanup()
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
LocationAreaEncounterVersionDetail::fromJson(char* jsonStr)
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
	

		if (isprimitive("VersionSummary")) {
			jsonToValue(&version, node, "VersionSummary", "VersionSummary");
		} else {
			
			VersionSummary* obj = static_cast<VersionSummary*> (&version);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

LocationAreaEncounterVersionDetail::LocationAreaEncounterVersionDetail(char* json)
{
	this->fromJson(json);
}

char*
LocationAreaEncounterVersionDetail::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
LocationAreaEncounterVersionDetail::getRate()
{
	return rate;
}

void
LocationAreaEncounterVersionDetail::setRate(int  rate)
{
	this->rate = rate;
}

VersionSummary
LocationAreaEncounterVersionDetail::getVersion()
{
	return version;
}

void
LocationAreaEncounterVersionDetail::setVersion(VersionSummary  version)
{
	this->version = version;
}


