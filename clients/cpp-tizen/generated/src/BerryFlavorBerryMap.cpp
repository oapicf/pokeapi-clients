#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BerryFlavorBerryMap.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BerryFlavorBerryMap::BerryFlavorBerryMap()
{
	//__init();
}

BerryFlavorBerryMap::~BerryFlavorBerryMap()
{
	//__cleanup();
}

void
BerryFlavorBerryMap::__init()
{
	//potency = int(0);
	//berry = null;
}

void
BerryFlavorBerryMap::__cleanup()
{
	//if(potency != NULL) {
	//
	//delete potency;
	//potency = NULL;
	//}
	//if(berry != NULL) {
	//
	//delete berry;
	//berry = NULL;
	//}
	//
}

void
BerryFlavorBerryMap::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *potencyKey = "potency";
	node = json_object_get_member(pJsonObject, potencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&potency, node, "int", "");
		} else {
			
		}
	}
	const gchar *berryKey = "berry";
	node = json_object_get_member(pJsonObject, berryKey);
	if (node !=NULL) {
	

		if (isprimitive("BerrySummary")) {
			jsonToValue(&berry, node, "BerrySummary", "BerrySummary");
		} else {
			
			BerrySummary* obj = static_cast<BerrySummary*> (&berry);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BerryFlavorBerryMap::BerryFlavorBerryMap(char* json)
{
	this->fromJson(json);
}

char*
BerryFlavorBerryMap::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getPotency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *potencyKey = "potency";
	json_object_set_member(pJsonObject, potencyKey, node);
	if (isprimitive("BerrySummary")) {
		BerrySummary obj = getBerry();
		node = converttoJson(&obj, "BerrySummary", "");
	}
	else {
		
		BerrySummary obj = static_cast<BerrySummary> (getBerry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *berryKey = "berry";
	json_object_set_member(pJsonObject, berryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BerryFlavorBerryMap::getPotency()
{
	return potency;
}

void
BerryFlavorBerryMap::setPotency(int  potency)
{
	this->potency = potency;
}

BerrySummary
BerryFlavorBerryMap::getBerry()
{
	return berry;
}

void
BerryFlavorBerryMap::setBerry(BerrySummary  berry)
{
	this->berry = berry;
}


