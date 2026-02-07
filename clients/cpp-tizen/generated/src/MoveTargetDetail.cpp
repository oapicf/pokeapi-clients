#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveTargetDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveTargetDetail::MoveTargetDetail()
{
	//__init();
}

MoveTargetDetail::~MoveTargetDetail()
{
	//__cleanup();
}

void
MoveTargetDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> descriptions;
	//new std::list()std::list> moves;
	//new std::list()std::list> names;
}

void
MoveTargetDetail::__cleanup()
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
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
MoveTargetDetail::fromJson(char* jsonStr)
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
			list<MoveTargetDescription> new_list;
			MoveTargetDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveTargetDescription")) {
					jsonToValue(&inst, temp_json, "MoveTargetDescription", "");
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
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveTargetName> new_list;
			MoveTargetName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveTargetName")) {
					jsonToValue(&inst, temp_json, "MoveTargetName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

MoveTargetDetail::MoveTargetDetail(char* json)
{
	this->fromJson(json);
}

char*
MoveTargetDetail::toJson()
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
	if (isprimitive("MoveTargetDescription")) {
		list<MoveTargetDescription> new_list = static_cast<list <MoveTargetDescription> > (getDescriptions());
		node = converttoJson(&new_list, "MoveTargetDescription", "array");
	} else {
		node = json_node_alloc();
		list<MoveTargetDescription> new_list = static_cast<list <MoveTargetDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveTargetDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveTargetDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *descriptionsKey = "descriptions";
	json_object_set_member(pJsonObject, descriptionsKey, node);
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
	if (isprimitive("MoveTargetName")) {
		list<MoveTargetName> new_list = static_cast<list <MoveTargetName> > (getNames());
		node = converttoJson(&new_list, "MoveTargetName", "array");
	} else {
		node = json_node_alloc();
		list<MoveTargetName> new_list = static_cast<list <MoveTargetName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveTargetName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveTargetName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
MoveTargetDetail::getId()
{
	return id;
}

void
MoveTargetDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveTargetDetail::getName()
{
	return name;
}

void
MoveTargetDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<MoveTargetDescription>
MoveTargetDetail::getDescriptions()
{
	return descriptions;
}

void
MoveTargetDetail::setDescriptions(std::list <MoveTargetDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<MoveSummary>
MoveTargetDetail::getMoves()
{
	return moves;
}

void
MoveTargetDetail::setMoves(std::list <MoveSummary> moves)
{
	this->moves = moves;
}

std::list<MoveTargetName>
MoveTargetDetail::getNames()
{
	return names;
}

void
MoveTargetDetail::setNames(std::list <MoveTargetName> names)
{
	this->names = names;
}


