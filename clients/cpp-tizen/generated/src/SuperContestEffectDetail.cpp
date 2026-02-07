#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SuperContestEffectDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SuperContestEffectDetail::SuperContestEffectDetail()
{
	//__init();
}

SuperContestEffectDetail::~SuperContestEffectDetail()
{
	//__cleanup();
}

void
SuperContestEffectDetail::__init()
{
	//id = int(0);
	//appeal = int(0);
	//new std::list()std::list> flavor_text_entries;
	//new std::list()std::list> moves;
}

void
SuperContestEffectDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(appeal != NULL) {
	//
	//delete appeal;
	//appeal = NULL;
	//}
	//if(flavor_text_entries != NULL) {
	//flavor_text_entries.RemoveAll(true);
	//delete flavor_text_entries;
	//flavor_text_entries = NULL;
	//}
	//if(moves != NULL) {
	//moves.RemoveAll(true);
	//delete moves;
	//moves = NULL;
	//}
	//
}

void
SuperContestEffectDetail::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *appealKey = "appeal";
	node = json_object_get_member(pJsonObject, appealKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&appeal, node, "int", "");
		} else {
			
		}
	}
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	node = json_object_get_member(pJsonObject, flavor_text_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SuperContestEffectFlavorText> new_list;
			SuperContestEffectFlavorText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SuperContestEffectFlavorText")) {
					jsonToValue(&inst, temp_json, "SuperContestEffectFlavorText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			flavor_text_entries = new_list;
		}
		
	}
	const gchar *movesKey = "moves";
	node = json_object_get_member(pJsonObject, movesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveSummary> new_list;
			MoveSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveSummary")) {
					jsonToValue(&inst, temp_json, "MoveSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			moves = new_list;
		}
		
	}
}

SuperContestEffectDetail::SuperContestEffectDetail(char* json)
{
	this->fromJson(json);
}

char*
SuperContestEffectDetail::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("int")) {
		int obj = getAppeal();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *appealKey = "appeal";
	json_object_set_member(pJsonObject, appealKey, node);
	if (isprimitive("SuperContestEffectFlavorText")) {
		list<SuperContestEffectFlavorText> new_list = static_cast<list <SuperContestEffectFlavorText> > (getFlavorTextEntries());
		node = converttoJson(&new_list, "SuperContestEffectFlavorText", "array");
	} else {
		node = json_node_alloc();
		list<SuperContestEffectFlavorText> new_list = static_cast<list <SuperContestEffectFlavorText> > (getFlavorTextEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SuperContestEffectFlavorText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SuperContestEffectFlavorText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	json_object_set_member(pJsonObject, flavor_text_entriesKey, node);
	if (isprimitive("MoveSummary")) {
		list<MoveSummary> new_list = static_cast<list <MoveSummary> > (getMoves());
		node = converttoJson(&new_list, "MoveSummary", "array");
	} else {
		node = json_node_alloc();
		list<MoveSummary> new_list = static_cast<list <MoveSummary> > (getMoves());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *movesKey = "moves";
	json_object_set_member(pJsonObject, movesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
SuperContestEffectDetail::getId()
{
	return id;
}

void
SuperContestEffectDetail::setId(int  id)
{
	this->id = id;
}

int
SuperContestEffectDetail::getAppeal()
{
	return appeal;
}

void
SuperContestEffectDetail::setAppeal(int  appeal)
{
	this->appeal = appeal;
}

std::list<SuperContestEffectFlavorText>
SuperContestEffectDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
SuperContestEffectDetail::setFlavorTextEntries(std::list <SuperContestEffectFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<MoveSummary>
SuperContestEffectDetail::getMoves()
{
	return moves;
}

void
SuperContestEffectDetail::setMoves(std::list <MoveSummary> moves)
{
	this->moves = moves;
}


