#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BerryFlavorDetail_berries_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BerryFlavorDetail_berries_inner::BerryFlavorDetail_berries_inner()
{
	//__init();
}

BerryFlavorDetail_berries_inner::~BerryFlavorDetail_berries_inner()
{
	//__cleanup();
}

void
BerryFlavorDetail_berries_inner::__init()
{
	//potency = int(0);
	//berry = new BerryFlavorDetail_berries_inner_berry();
}

void
BerryFlavorDetail_berries_inner::__cleanup()
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
BerryFlavorDetail_berries_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("BerryFlavorDetail_berries_inner_berry")) {
			jsonToValue(&berry, node, "BerryFlavorDetail_berries_inner_berry", "BerryFlavorDetail_berries_inner_berry");
		} else {
			
			BerryFlavorDetail_berries_inner_berry* obj = static_cast<BerryFlavorDetail_berries_inner_berry*> (&berry);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BerryFlavorDetail_berries_inner::BerryFlavorDetail_berries_inner(char* json)
{
	this->fromJson(json);
}

char*
BerryFlavorDetail_berries_inner::toJson()
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
	if (isprimitive("BerryFlavorDetail_berries_inner_berry")) {
		BerryFlavorDetail_berries_inner_berry obj = getBerry();
		node = converttoJson(&obj, "BerryFlavorDetail_berries_inner_berry", "");
	}
	else {
		
		BerryFlavorDetail_berries_inner_berry obj = static_cast<BerryFlavorDetail_berries_inner_berry> (getBerry());
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
BerryFlavorDetail_berries_inner::getPotency()
{
	return potency;
}

void
BerryFlavorDetail_berries_inner::setPotency(int  potency)
{
	this->potency = potency;
}

BerryFlavorDetail_berries_inner_berry
BerryFlavorDetail_berries_inner::getBerry()
{
	return berry;
}

void
BerryFlavorDetail_berries_inner::setBerry(BerryFlavorDetail_berries_inner_berry  berry)
{
	this->berry = berry;
}


