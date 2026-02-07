#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PaginatedMoveTargetSummaryList.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PaginatedMoveTargetSummaryList::PaginatedMoveTargetSummaryList()
{
	//__init();
}

PaginatedMoveTargetSummaryList::~PaginatedMoveTargetSummaryList()
{
	//__cleanup();
}

void
PaginatedMoveTargetSummaryList::__init()
{
	//count = int(0);
	//next = std::string();
	//previous = std::string();
	//new std::list()std::list> results;
}

void
PaginatedMoveTargetSummaryList::__cleanup()
{
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(next != NULL) {
	//
	//delete next;
	//next = NULL;
	//}
	//if(previous != NULL) {
	//
	//delete previous;
	//previous = NULL;
	//}
	//if(results != NULL) {
	//results.RemoveAll(true);
	//delete results;
	//results = NULL;
	//}
	//
}

void
PaginatedMoveTargetSummaryList::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&count, node, "int", "");
		} else {
			
		}
	}
	const gchar *nextKey = "next";
	node = json_object_get_member(pJsonObject, nextKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&next, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *previousKey = "previous";
	node = json_object_get_member(pJsonObject, previousKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&previous, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *resultsKey = "results";
	node = json_object_get_member(pJsonObject, resultsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveTargetSummary> new_list;
			MoveTargetSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveTargetSummary")) {
					jsonToValue(&inst, temp_json, "MoveTargetSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			results = new_list;
		}
		
	}
}

PaginatedMoveTargetSummaryList::PaginatedMoveTargetSummaryList(char* json)
{
	this->fromJson(json);
}

char*
PaginatedMoveTargetSummaryList::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNext();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nextKey = "next";
	json_object_set_member(pJsonObject, nextKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPrevious();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *previousKey = "previous";
	json_object_set_member(pJsonObject, previousKey, node);
	if (isprimitive("MoveTargetSummary")) {
		list<MoveTargetSummary> new_list = static_cast<list <MoveTargetSummary> > (getResults());
		node = converttoJson(&new_list, "MoveTargetSummary", "array");
	} else {
		node = json_node_alloc();
		list<MoveTargetSummary> new_list = static_cast<list <MoveTargetSummary> > (getResults());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveTargetSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveTargetSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *resultsKey = "results";
	json_object_set_member(pJsonObject, resultsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PaginatedMoveTargetSummaryList::getCount()
{
	return count;
}

void
PaginatedMoveTargetSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedMoveTargetSummaryList::getNext()
{
	return next;
}

void
PaginatedMoveTargetSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedMoveTargetSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMoveTargetSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<MoveTargetSummary>
PaginatedMoveTargetSummaryList::getResults()
{
	return results;
}

void
PaginatedMoveTargetSummaryList::setResults(std::list <MoveTargetSummary> results)
{
	this->results = results;
}


