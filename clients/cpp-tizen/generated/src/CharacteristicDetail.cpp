#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CharacteristicDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CharacteristicDetail::CharacteristicDetail()
{
	//__init();
}

CharacteristicDetail::~CharacteristicDetail()
{
	//__cleanup();
}

void
CharacteristicDetail::__init()
{
	//id = int(0);
	//gene_modulo = int(0);
	//new std::list()std::list> possible_values;
	//highest_stat = new StatSummary();
	//new std::list()std::list> descriptions;
}

void
CharacteristicDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(gene_modulo != NULL) {
	//
	//delete gene_modulo;
	//gene_modulo = NULL;
	//}
	//if(possible_values != NULL) {
	//possible_values.RemoveAll(true);
	//delete possible_values;
	//possible_values = NULL;
	//}
	//if(highest_stat != NULL) {
	//
	//delete highest_stat;
	//highest_stat = NULL;
	//}
	//if(descriptions != NULL) {
	//descriptions.RemoveAll(true);
	//delete descriptions;
	//descriptions = NULL;
	//}
	//
}

void
CharacteristicDetail::fromJson(char* jsonStr)
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
	const gchar *gene_moduloKey = "gene_modulo";
	node = json_object_get_member(pJsonObject, gene_moduloKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gene_modulo, node, "int", "");
		} else {
			
		}
	}
	const gchar *possible_valuesKey = "possible_values";
	node = json_object_get_member(pJsonObject, possible_valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			possible_values = new_list;
		}
		
	}
	const gchar *highest_statKey = "highest_stat";
	node = json_object_get_member(pJsonObject, highest_statKey);
	if (node !=NULL) {
	

		if (isprimitive("StatSummary")) {
			jsonToValue(&highest_stat, node, "StatSummary", "StatSummary");
		} else {
			
			StatSummary* obj = static_cast<StatSummary*> (&highest_stat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *descriptionsKey = "descriptions";
	node = json_object_get_member(pJsonObject, descriptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CharacteristicDescription> new_list;
			CharacteristicDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CharacteristicDescription")) {
					jsonToValue(&inst, temp_json, "CharacteristicDescription", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			descriptions = new_list;
		}
		
	}
}

CharacteristicDetail::CharacteristicDetail(char* json)
{
	this->fromJson(json);
}

char*
CharacteristicDetail::toJson()
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
		int obj = getGeneModulo();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *gene_moduloKey = "gene_modulo";
	json_object_set_member(pJsonObject, gene_moduloKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getPossibleValues());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getPossibleValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *possible_valuesKey = "possible_values";
	json_object_set_member(pJsonObject, possible_valuesKey, node);
	if (isprimitive("StatSummary")) {
		StatSummary obj = getHighestStat();
		node = converttoJson(&obj, "StatSummary", "");
	}
	else {
		
		StatSummary obj = static_cast<StatSummary> (getHighestStat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *highest_statKey = "highest_stat";
	json_object_set_member(pJsonObject, highest_statKey, node);
	if (isprimitive("CharacteristicDescription")) {
		list<CharacteristicDescription> new_list = static_cast<list <CharacteristicDescription> > (getDescriptions());
		node = converttoJson(&new_list, "CharacteristicDescription", "array");
	} else {
		node = json_node_alloc();
		list<CharacteristicDescription> new_list = static_cast<list <CharacteristicDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CharacteristicDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CharacteristicDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *descriptionsKey = "descriptions";
	json_object_set_member(pJsonObject, descriptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CharacteristicDetail::getId()
{
	return id;
}

void
CharacteristicDetail::setId(int  id)
{
	this->id = id;
}

int
CharacteristicDetail::getGeneModulo()
{
	return gene_modulo;
}

void
CharacteristicDetail::setGeneModulo(int  gene_modulo)
{
	this->gene_modulo = gene_modulo;
}

std::list<int>
CharacteristicDetail::getPossibleValues()
{
	return possible_values;
}

void
CharacteristicDetail::setPossibleValues(std::list <int> possible_values)
{
	this->possible_values = possible_values;
}

StatSummary
CharacteristicDetail::getHighestStat()
{
	return highest_stat;
}

void
CharacteristicDetail::setHighestStat(StatSummary  highest_stat)
{
	this->highest_stat = highest_stat;
}

std::list<CharacteristicDescription>
CharacteristicDetail::getDescriptions()
{
	return descriptions;
}

void
CharacteristicDetail::setDescriptions(std::list <CharacteristicDescription> descriptions)
{
	this->descriptions = descriptions;
}


