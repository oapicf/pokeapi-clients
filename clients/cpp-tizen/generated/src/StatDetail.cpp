#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "StatDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

StatDetail::StatDetail()
{
	//__init();
}

StatDetail::~StatDetail()
{
	//__cleanup();
}

void
StatDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//game_index = int(0);
	//is_battle_only = bool(false);
	//affecting_moves = new StatDetail_affecting_moves();
	//affecting_natures = new StatDetail_affecting_natures();
	//new std::list()std::list> characteristics;
	//move_damage_class = new MoveDamageClassSummary();
	//new std::list()std::list> names;
}

void
StatDetail::__cleanup()
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
	//if(game_index != NULL) {
	//
	//delete game_index;
	//game_index = NULL;
	//}
	//if(is_battle_only != NULL) {
	//
	//delete is_battle_only;
	//is_battle_only = NULL;
	//}
	//if(affecting_moves != NULL) {
	//
	//delete affecting_moves;
	//affecting_moves = NULL;
	//}
	//if(affecting_natures != NULL) {
	//
	//delete affecting_natures;
	//affecting_natures = NULL;
	//}
	//if(characteristics != NULL) {
	//characteristics.RemoveAll(true);
	//delete characteristics;
	//characteristics = NULL;
	//}
	//if(move_damage_class != NULL) {
	//
	//delete move_damage_class;
	//move_damage_class = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
StatDetail::fromJson(char* jsonStr)
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
	const gchar *game_indexKey = "game_index";
	node = json_object_get_member(pJsonObject, game_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&game_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_battle_onlyKey = "is_battle_only";
	node = json_object_get_member(pJsonObject, is_battle_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_battle_only, node, "bool", "");
		} else {
			
		}
	}
	const gchar *affecting_movesKey = "affecting_moves";
	node = json_object_get_member(pJsonObject, affecting_movesKey);
	if (node !=NULL) {
	

		if (isprimitive("StatDetail_affecting_moves")) {
			jsonToValue(&affecting_moves, node, "StatDetail_affecting_moves", "StatDetail_affecting_moves");
		} else {
			
			StatDetail_affecting_moves* obj = static_cast<StatDetail_affecting_moves*> (&affecting_moves);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *affecting_naturesKey = "affecting_natures";
	node = json_object_get_member(pJsonObject, affecting_naturesKey);
	if (node !=NULL) {
	

		if (isprimitive("StatDetail_affecting_natures")) {
			jsonToValue(&affecting_natures, node, "StatDetail_affecting_natures", "StatDetail_affecting_natures");
		} else {
			
			StatDetail_affecting_natures* obj = static_cast<StatDetail_affecting_natures*> (&affecting_natures);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *characteristicsKey = "characteristics";
	node = json_object_get_member(pJsonObject, characteristicsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CharacteristicSummary> new_list;
			CharacteristicSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CharacteristicSummary")) {
					jsonToValue(&inst, temp_json, "CharacteristicSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			characteristics = new_list;
		}
		
	}
	const gchar *move_damage_classKey = "move_damage_class";
	node = json_object_get_member(pJsonObject, move_damage_classKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveDamageClassSummary")) {
			jsonToValue(&move_damage_class, node, "MoveDamageClassSummary", "MoveDamageClassSummary");
		} else {
			
			MoveDamageClassSummary* obj = static_cast<MoveDamageClassSummary*> (&move_damage_class);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<StatName> new_list;
			StatName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("StatName")) {
					jsonToValue(&inst, temp_json, "StatName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

StatDetail::StatDetail(char* json)
{
	this->fromJson(json);
}

char*
StatDetail::toJson()
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
	if (isprimitive("int")) {
		int obj = getGameIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *game_indexKey = "game_index";
	json_object_set_member(pJsonObject, game_indexKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsBattleOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_battle_onlyKey = "is_battle_only";
	json_object_set_member(pJsonObject, is_battle_onlyKey, node);
	if (isprimitive("StatDetail_affecting_moves")) {
		StatDetail_affecting_moves obj = getAffectingMoves();
		node = converttoJson(&obj, "StatDetail_affecting_moves", "");
	}
	else {
		
		StatDetail_affecting_moves obj = static_cast<StatDetail_affecting_moves> (getAffectingMoves());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *affecting_movesKey = "affecting_moves";
	json_object_set_member(pJsonObject, affecting_movesKey, node);
	if (isprimitive("StatDetail_affecting_natures")) {
		StatDetail_affecting_natures obj = getAffectingNatures();
		node = converttoJson(&obj, "StatDetail_affecting_natures", "");
	}
	else {
		
		StatDetail_affecting_natures obj = static_cast<StatDetail_affecting_natures> (getAffectingNatures());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *affecting_naturesKey = "affecting_natures";
	json_object_set_member(pJsonObject, affecting_naturesKey, node);
	if (isprimitive("CharacteristicSummary")) {
		list<CharacteristicSummary> new_list = static_cast<list <CharacteristicSummary> > (getCharacteristics());
		node = converttoJson(&new_list, "CharacteristicSummary", "array");
	} else {
		node = json_node_alloc();
		list<CharacteristicSummary> new_list = static_cast<list <CharacteristicSummary> > (getCharacteristics());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CharacteristicSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CharacteristicSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *characteristicsKey = "characteristics";
	json_object_set_member(pJsonObject, characteristicsKey, node);
	if (isprimitive("MoveDamageClassSummary")) {
		MoveDamageClassSummary obj = getMoveDamageClass();
		node = converttoJson(&obj, "MoveDamageClassSummary", "");
	}
	else {
		
		MoveDamageClassSummary obj = static_cast<MoveDamageClassSummary> (getMoveDamageClass());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *move_damage_classKey = "move_damage_class";
	json_object_set_member(pJsonObject, move_damage_classKey, node);
	if (isprimitive("StatName")) {
		list<StatName> new_list = static_cast<list <StatName> > (getNames());
		node = converttoJson(&new_list, "StatName", "array");
	} else {
		node = json_node_alloc();
		list<StatName> new_list = static_cast<list <StatName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<StatName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			StatName obj = *it;
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
StatDetail::getId()
{
	return id;
}

void
StatDetail::setId(int  id)
{
	this->id = id;
}

std::string
StatDetail::getName()
{
	return name;
}

void
StatDetail::setName(std::string  name)
{
	this->name = name;
}

int
StatDetail::getGameIndex()
{
	return game_index;
}

void
StatDetail::setGameIndex(int  game_index)
{
	this->game_index = game_index;
}

bool
StatDetail::getIsBattleOnly()
{
	return is_battle_only;
}

void
StatDetail::setIsBattleOnly(bool  is_battle_only)
{
	this->is_battle_only = is_battle_only;
}

StatDetail_affecting_moves
StatDetail::getAffectingMoves()
{
	return affecting_moves;
}

void
StatDetail::setAffectingMoves(StatDetail_affecting_moves  affecting_moves)
{
	this->affecting_moves = affecting_moves;
}

StatDetail_affecting_natures
StatDetail::getAffectingNatures()
{
	return affecting_natures;
}

void
StatDetail::setAffectingNatures(StatDetail_affecting_natures  affecting_natures)
{
	this->affecting_natures = affecting_natures;
}

std::list<CharacteristicSummary>
StatDetail::getCharacteristics()
{
	return characteristics;
}

void
StatDetail::setCharacteristics(std::list <CharacteristicSummary> characteristics)
{
	this->characteristics = characteristics;
}

MoveDamageClassSummary
StatDetail::getMoveDamageClass()
{
	return move_damage_class;
}

void
StatDetail::setMoveDamageClass(MoveDamageClassSummary  move_damage_class)
{
	this->move_damage_class = move_damage_class;
}

std::list<StatName>
StatDetail::getNames()
{
	return names;
}

void
StatDetail::setNames(std::list <StatName> names)
{
	this->names = names;
}


