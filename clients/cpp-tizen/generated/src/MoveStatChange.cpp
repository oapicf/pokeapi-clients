#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveStatChange.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveStatChange::MoveStatChange()
{
	//__init();
}

MoveStatChange::~MoveStatChange()
{
	//__cleanup();
}

void
MoveStatChange::__init()
{
	//change = int(0);
	//move = null;
}

void
MoveStatChange::__cleanup()
{
	//if(change != NULL) {
	//
	//delete change;
	//change = NULL;
	//}
	//if(move != NULL) {
	//
	//delete move;
	//move = NULL;
	//}
	//
}

void
MoveStatChange::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *changeKey = "change";
	node = json_object_get_member(pJsonObject, changeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&change, node, "int", "");
		} else {
			
		}
	}
	const gchar *moveKey = "move";
	node = json_object_get_member(pJsonObject, moveKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveSummary")) {
			jsonToValue(&move, node, "MoveSummary", "MoveSummary");
		} else {
			
			MoveSummary* obj = static_cast<MoveSummary*> (&move);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MoveStatChange::MoveStatChange(char* json)
{
	this->fromJson(json);
}

char*
MoveStatChange::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getChange();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *changeKey = "change";
	json_object_set_member(pJsonObject, changeKey, node);
	if (isprimitive("MoveSummary")) {
		MoveSummary obj = getMove();
		node = converttoJson(&obj, "MoveSummary", "");
	}
	else {
		
		MoveSummary obj = static_cast<MoveSummary> (getMove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *moveKey = "move";
	json_object_set_member(pJsonObject, moveKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
MoveStatChange::getChange()
{
	return change;
}

void
MoveStatChange::setChange(int  change)
{
	this->change = change;
}

MoveSummary
MoveStatChange::getMove()
{
	return move;
}

void
MoveStatChange::setMove(MoveSummary  move)
{
	this->move = move;
}


