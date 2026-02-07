#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveDetail_contest_combos.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveDetail_contest_combos::MoveDetail_contest_combos()
{
	//__init();
}

MoveDetail_contest_combos::~MoveDetail_contest_combos()
{
	//__cleanup();
}

void
MoveDetail_contest_combos::__init()
{
	//normal = new MoveDetail_contest_combos_normal();
	//super = new MoveDetail_contest_combos_normal();
}

void
MoveDetail_contest_combos::__cleanup()
{
	//if(normal != NULL) {
	//
	//delete normal;
	//normal = NULL;
	//}
	//if(super != NULL) {
	//
	//delete super;
	//super = NULL;
	//}
	//
}

void
MoveDetail_contest_combos::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *normalKey = "normal";
	node = json_object_get_member(pJsonObject, normalKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveDetail_contest_combos_normal")) {
			jsonToValue(&normal, node, "MoveDetail_contest_combos_normal", "MoveDetail_contest_combos_normal");
		} else {
			
			MoveDetail_contest_combos_normal* obj = static_cast<MoveDetail_contest_combos_normal*> (&normal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *superKey = "super";
	node = json_object_get_member(pJsonObject, superKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveDetail_contest_combos_normal")) {
			jsonToValue(&super, node, "MoveDetail_contest_combos_normal", "MoveDetail_contest_combos_normal");
		} else {
			
			MoveDetail_contest_combos_normal* obj = static_cast<MoveDetail_contest_combos_normal*> (&super);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MoveDetail_contest_combos::MoveDetail_contest_combos(char* json)
{
	this->fromJson(json);
}

char*
MoveDetail_contest_combos::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MoveDetail_contest_combos_normal")) {
		MoveDetail_contest_combos_normal obj = getNormal();
		node = converttoJson(&obj, "MoveDetail_contest_combos_normal", "");
	}
	else {
		
		MoveDetail_contest_combos_normal obj = static_cast<MoveDetail_contest_combos_normal> (getNormal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *normalKey = "normal";
	json_object_set_member(pJsonObject, normalKey, node);
	if (isprimitive("MoveDetail_contest_combos_normal")) {
		MoveDetail_contest_combos_normal obj = getSuper();
		node = converttoJson(&obj, "MoveDetail_contest_combos_normal", "");
	}
	else {
		
		MoveDetail_contest_combos_normal obj = static_cast<MoveDetail_contest_combos_normal> (getSuper());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *superKey = "super";
	json_object_set_member(pJsonObject, superKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MoveDetail_contest_combos_normal
MoveDetail_contest_combos::getNormal()
{
	return normal;
}

void
MoveDetail_contest_combos::setNormal(MoveDetail_contest_combos_normal  normal)
{
	this->normal = normal;
}

MoveDetail_contest_combos_normal
MoveDetail_contest_combos::getSuper()
{
	return super;
}

void
MoveDetail_contest_combos::setSuper(MoveDetail_contest_combos_normal  super)
{
	this->super = super;
}


