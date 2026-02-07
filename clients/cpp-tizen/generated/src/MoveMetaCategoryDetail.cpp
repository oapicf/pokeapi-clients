#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveMetaCategoryDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveMetaCategoryDetail::MoveMetaCategoryDetail()
{
	//__init();
}

MoveMetaCategoryDetail::~MoveMetaCategoryDetail()
{
	//__cleanup();
}

void
MoveMetaCategoryDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> descriptions;
	//new std::list()std::list> moves;
}

void
MoveMetaCategoryDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(descriptions != NULL) {
	//descriptions.RemoveAll(true);
	//delete descriptions;
	//descriptions = NULL;
	//}
	//if(moves != NULL) {
	//moves.RemoveAll(true);
	//delete moves;
	//moves = NULL;
	//}
	//
}

void
MoveMetaCategoryDetail::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionsKey = "descriptions";
	node = json_object_get_member(pJsonObject, descriptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveMetaCategoryDescription> new_list;
			MoveMetaCategoryDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveMetaCategoryDescription")) {
					jsonToValue(&inst, temp_json, "MoveMetaCategoryDescription", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			descriptions = new_list;
		}
		
	}
	const gchar *movesKey = "moves";
	node = json_object_get_member(pJsonObject, movesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityDetail_pokemon_inner_pokemon> new_list;
			AbilityDetail_pokemon_inner_pokemon inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
					jsonToValue(&inst, temp_json, "AbilityDetail_pokemon_inner_pokemon", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			moves = new_list;
		}
		
	}
}

MoveMetaCategoryDetail::MoveMetaCategoryDetail(char* json)
{
	this->fromJson(json);
}

char*
MoveMetaCategoryDetail::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("MoveMetaCategoryDescription")) {
		list<MoveMetaCategoryDescription> new_list = static_cast<list <MoveMetaCategoryDescription> > (getDescriptions());
		node = converttoJson(&new_list, "MoveMetaCategoryDescription", "array");
	} else {
		node = json_node_alloc();
		list<MoveMetaCategoryDescription> new_list = static_cast<list <MoveMetaCategoryDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveMetaCategoryDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveMetaCategoryDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *descriptionsKey = "descriptions";
	json_object_set_member(pJsonObject, descriptionsKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getMoves());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getMoves());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityDetail_pokemon_inner_pokemon>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityDetail_pokemon_inner_pokemon obj = *it;
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
MoveMetaCategoryDetail::getId()
{
	return id;
}

void
MoveMetaCategoryDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveMetaCategoryDetail::getName()
{
	return name;
}

void
MoveMetaCategoryDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<MoveMetaCategoryDescription>
MoveMetaCategoryDetail::getDescriptions()
{
	return descriptions;
}

void
MoveMetaCategoryDetail::setDescriptions(std::list <MoveMetaCategoryDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveMetaCategoryDetail::getMoves()
{
	return moves;
}

void
MoveMetaCategoryDetail::setMoves(std::list <AbilityDetail_pokemon_inner_pokemon> moves)
{
	this->moves = moves;
}


