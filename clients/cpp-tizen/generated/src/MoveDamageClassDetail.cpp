#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveDamageClassDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveDamageClassDetail::MoveDamageClassDetail()
{
	//__init();
}

MoveDamageClassDetail::~MoveDamageClassDetail()
{
	//__cleanup();
}

void
MoveDamageClassDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> descriptions;
	//new std::list()std::list> moves;
	//new std::list()std::list> names;
}

void
MoveDamageClassDetail::__cleanup()
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
MoveDamageClassDetail::fromJson(char* jsonStr)
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
			list<MoveDamageClassDescription> new_list;
			MoveDamageClassDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveDamageClassDescription")) {
					jsonToValue(&inst, temp_json, "MoveDamageClassDescription", "");
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
			list<MoveDamageClassName> new_list;
			MoveDamageClassName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveDamageClassName")) {
					jsonToValue(&inst, temp_json, "MoveDamageClassName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

MoveDamageClassDetail::MoveDamageClassDetail(char* json)
{
	this->fromJson(json);
}

char*
MoveDamageClassDetail::toJson()
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
	if (isprimitive("MoveDamageClassDescription")) {
		list<MoveDamageClassDescription> new_list = static_cast<list <MoveDamageClassDescription> > (getDescriptions());
		node = converttoJson(&new_list, "MoveDamageClassDescription", "array");
	} else {
		node = json_node_alloc();
		list<MoveDamageClassDescription> new_list = static_cast<list <MoveDamageClassDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveDamageClassDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveDamageClassDescription obj = *it;
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
	if (isprimitive("MoveDamageClassName")) {
		list<MoveDamageClassName> new_list = static_cast<list <MoveDamageClassName> > (getNames());
		node = converttoJson(&new_list, "MoveDamageClassName", "array");
	} else {
		node = json_node_alloc();
		list<MoveDamageClassName> new_list = static_cast<list <MoveDamageClassName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveDamageClassName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveDamageClassName obj = *it;
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
MoveDamageClassDetail::getId()
{
	return id;
}

void
MoveDamageClassDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveDamageClassDetail::getName()
{
	return name;
}

void
MoveDamageClassDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<MoveDamageClassDescription>
MoveDamageClassDetail::getDescriptions()
{
	return descriptions;
}

void
MoveDamageClassDetail::setDescriptions(std::list <MoveDamageClassDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<MoveSummary>
MoveDamageClassDetail::getMoves()
{
	return moves;
}

void
MoveDamageClassDetail::setMoves(std::list <MoveSummary> moves)
{
	this->moves = moves;
}

std::list<MoveDamageClassName>
MoveDamageClassDetail::getNames()
{
	return names;
}

void
MoveDamageClassDetail::setNames(std::list <MoveDamageClassName> names)
{
	this->names = names;
}


