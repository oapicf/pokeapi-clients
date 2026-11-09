#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonMove.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonMove::PokemonMove()
{
	//__init();
}

PokemonMove::~PokemonMove()
{
	//__cleanup();
}

void
PokemonMove::__init()
{
	//move = null;
	//new std::list()std::list> version_group_details;
}

void
PokemonMove::__cleanup()
{
	//if(move != NULL) {
	//
	//delete move;
	//move = NULL;
	//}
	//if(version_group_details != NULL) {
	//version_group_details.RemoveAll(true);
	//delete version_group_details;
	//version_group_details = NULL;
	//}
	//
}

void
PokemonMove::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *version_group_detailsKey = "version_group_details";
	node = json_object_get_member(pJsonObject, version_group_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonMoveVersionGroup> new_list;
			PokemonMoveVersionGroup inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonMoveVersionGroup")) {
					jsonToValue(&inst, temp_json, "PokemonMoveVersionGroup", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_group_details = new_list;
		}
		
	}
}

PokemonMove::PokemonMove(char* json)
{
	this->fromJson(json);
}

char*
PokemonMove::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("PokemonMoveVersionGroup")) {
		list<PokemonMoveVersionGroup> new_list = static_cast<list <PokemonMoveVersionGroup> > (getVersionGroupDetails());
		node = converttoJson(&new_list, "PokemonMoveVersionGroup", "array");
	} else {
		node = json_node_alloc();
		list<PokemonMoveVersionGroup> new_list = static_cast<list <PokemonMoveVersionGroup> > (getVersionGroupDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonMoveVersionGroup>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonMoveVersionGroup obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *version_group_detailsKey = "version_group_details";
	json_object_set_member(pJsonObject, version_group_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MoveSummary
PokemonMove::getMove()
{
	return move;
}

void
PokemonMove::setMove(MoveSummary  move)
{
	this->move = move;
}

std::list<PokemonMoveVersionGroup>
PokemonMove::getVersionGroupDetails()
{
	return version_group_details;
}

void
PokemonMove::setVersionGroupDetails(std::list <PokemonMoveVersionGroup> version_group_details)
{
	this->version_group_details = version_group_details;
}


