#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender()
{
	//__init();
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::~EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender()
{
	//__cleanup();
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::__init()
{
	//name = std::string();
	//url = std::string();
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender(char* json)
{
	this->fromJson(json);
}

char*
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::getName()
{
	return name;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::setName(std::string  name)
{
	this->name = name;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::getUrl()
{
	return url;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::setUrl(std::string  url)
{
	this->url = url;
}


