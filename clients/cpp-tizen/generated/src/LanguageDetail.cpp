#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LanguageDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LanguageDetail::LanguageDetail()
{
	//__init();
}

LanguageDetail::~LanguageDetail()
{
	//__cleanup();
}

void
LanguageDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//official = bool(false);
	//iso639 = std::string();
	//iso3166 = std::string();
	//new std::list()std::list> names;
}

void
LanguageDetail::__cleanup()
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
	//if(official != NULL) {
	//
	//delete official;
	//official = NULL;
	//}
	//if(iso639 != NULL) {
	//
	//delete iso639;
	//iso639 = NULL;
	//}
	//if(iso3166 != NULL) {
	//
	//delete iso3166;
	//iso3166 = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
LanguageDetail::fromJson(char* jsonStr)
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
	const gchar *officialKey = "official";
	node = json_object_get_member(pJsonObject, officialKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&official, node, "bool", "");
		} else {
			
		}
	}
	const gchar *iso639Key = "iso639";
	node = json_object_get_member(pJsonObject, iso639Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&iso639, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *iso3166Key = "iso3166";
	node = json_object_get_member(pJsonObject, iso3166Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&iso3166, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LanguageName> new_list;
			LanguageName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LanguageName")) {
					jsonToValue(&inst, temp_json, "LanguageName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

LanguageDetail::LanguageDetail(char* json)
{
	this->fromJson(json);
}

char*
LanguageDetail::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getOfficial();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *officialKey = "official";
	json_object_set_member(pJsonObject, officialKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIso639();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *iso639Key = "iso639";
	json_object_set_member(pJsonObject, iso639Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getIso3166();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *iso3166Key = "iso3166";
	json_object_set_member(pJsonObject, iso3166Key, node);
	if (isprimitive("LanguageName")) {
		list<LanguageName> new_list = static_cast<list <LanguageName> > (getNames());
		node = converttoJson(&new_list, "LanguageName", "array");
	} else {
		node = json_node_alloc();
		list<LanguageName> new_list = static_cast<list <LanguageName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LanguageName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LanguageName obj = *it;
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
LanguageDetail::getId()
{
	return id;
}

void
LanguageDetail::setId(int  id)
{
	this->id = id;
}

std::string
LanguageDetail::getName()
{
	return name;
}

void
LanguageDetail::setName(std::string  name)
{
	this->name = name;
}

bool
LanguageDetail::getOfficial()
{
	return official;
}

void
LanguageDetail::setOfficial(bool  official)
{
	this->official = official;
}

std::string
LanguageDetail::getIso639()
{
	return iso639;
}

void
LanguageDetail::setIso639(std::string  iso639)
{
	this->iso639 = iso639;
}

std::string
LanguageDetail::getIso3166()
{
	return iso3166;
}

void
LanguageDetail::setIso3166(std::string  iso3166)
{
	this->iso3166 = iso3166;
}

std::list<LanguageName>
LanguageDetail::getNames()
{
	return names;
}

void
LanguageDetail::setNames(std::list <LanguageName> names)
{
	this->names = names;
}


