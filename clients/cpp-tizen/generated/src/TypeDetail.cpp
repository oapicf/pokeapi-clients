#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypeDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypeDetail::TypeDetail()
{
	//__init();
}

TypeDetail::~TypeDetail()
{
	//__cleanup();
}

void
TypeDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//damage_relations = new TypeDetail_damage_relations();
	//new std::list()std::list> past_damage_relations;
	//new std::list()std::list> game_indices;
	//generation = new GenerationSummary();
	//move_damage_class = new MoveDamageClassSummary();
	//new std::list()std::list> names;
	//new std::list()std::list> pokemon;
	//new std::list()std::list> moves;
	//new std::map()std::map> sprites;
}

void
TypeDetail::__cleanup()
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
	//if(damage_relations != NULL) {
	//
	//delete damage_relations;
	//damage_relations = NULL;
	//}
	//if(past_damage_relations != NULL) {
	//past_damage_relations.RemoveAll(true);
	//delete past_damage_relations;
	//past_damage_relations = NULL;
	//}
	//if(game_indices != NULL) {
	//game_indices.RemoveAll(true);
	//delete game_indices;
	//game_indices = NULL;
	//}
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
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
	//if(pokemon != NULL) {
	//pokemon.RemoveAll(true);
	//delete pokemon;
	//pokemon = NULL;
	//}
	//if(moves != NULL) {
	//moves.RemoveAll(true);
	//delete moves;
	//moves = NULL;
	//}
	//if(sprites != NULL) {
	//sprites.RemoveAll(true);
	//delete sprites;
	//sprites = NULL;
	//}
	//
}

void
TypeDetail::fromJson(char* jsonStr)
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
	const gchar *damage_relationsKey = "damage_relations";
	node = json_object_get_member(pJsonObject, damage_relationsKey);
	if (node !=NULL) {
	

		if (isprimitive("TypeDetail_damage_relations")) {
			jsonToValue(&damage_relations, node, "TypeDetail_damage_relations", "TypeDetail_damage_relations");
		} else {
			
			TypeDetail_damage_relations* obj = static_cast<TypeDetail_damage_relations*> (&damage_relations);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *past_damage_relationsKey = "past_damage_relations";
	node = json_object_get_member(pJsonObject, past_damage_relationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TypeDetail_past_damage_relations_inner> new_list;
			TypeDetail_past_damage_relations_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeDetail_past_damage_relations_inner")) {
					jsonToValue(&inst, temp_json, "TypeDetail_past_damage_relations_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			past_damage_relations = new_list;
		}
		
	}
	const gchar *game_indicesKey = "game_indices";
	node = json_object_get_member(pJsonObject, game_indicesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TypeGameIndex> new_list;
			TypeGameIndex inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeGameIndex")) {
					jsonToValue(&inst, temp_json, "TypeGameIndex", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			game_indices = new_list;
		}
		
	}
	const gchar *generationKey = "generation";
	node = json_object_get_member(pJsonObject, generationKey);
	if (node !=NULL) {
	

		if (isprimitive("GenerationSummary")) {
			jsonToValue(&generation, node, "GenerationSummary", "GenerationSummary");
		} else {
			
			GenerationSummary* obj = static_cast<GenerationSummary*> (&generation);
			obj->fromJson(json_to_string(node, false));
			
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
			list<AbilityName> new_list;
			AbilityName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityName")) {
					jsonToValue(&inst, temp_json, "AbilityName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *pokemonKey = "pokemon";
	node = json_object_get_member(pJsonObject, pokemonKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TypeDetail_pokemon_inner> new_list;
			TypeDetail_pokemon_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TypeDetail_pokemon_inner")) {
					jsonToValue(&inst, temp_json, "TypeDetail_pokemon_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokemon = new_list;
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
	const gchar *spritesKey = "sprites";
	node = json_object_get_member(pJsonObject, spritesKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			sprites = new_map;
		}
		
	}
}

TypeDetail::TypeDetail(char* json)
{
	this->fromJson(json);
}

char*
TypeDetail::toJson()
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
	if (isprimitive("TypeDetail_damage_relations")) {
		TypeDetail_damage_relations obj = getDamageRelations();
		node = converttoJson(&obj, "TypeDetail_damage_relations", "");
	}
	else {
		
		TypeDetail_damage_relations obj = static_cast<TypeDetail_damage_relations> (getDamageRelations());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damage_relationsKey = "damage_relations";
	json_object_set_member(pJsonObject, damage_relationsKey, node);
	if (isprimitive("TypeDetail_past_damage_relations_inner")) {
		list<TypeDetail_past_damage_relations_inner> new_list = static_cast<list <TypeDetail_past_damage_relations_inner> > (getPastDamageRelations());
		node = converttoJson(&new_list, "TypeDetail_past_damage_relations_inner", "array");
	} else {
		node = json_node_alloc();
		list<TypeDetail_past_damage_relations_inner> new_list = static_cast<list <TypeDetail_past_damage_relations_inner> > (getPastDamageRelations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeDetail_past_damage_relations_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeDetail_past_damage_relations_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *past_damage_relationsKey = "past_damage_relations";
	json_object_set_member(pJsonObject, past_damage_relationsKey, node);
	if (isprimitive("TypeGameIndex")) {
		list<TypeGameIndex> new_list = static_cast<list <TypeGameIndex> > (getGameIndices());
		node = converttoJson(&new_list, "TypeGameIndex", "array");
	} else {
		node = json_node_alloc();
		list<TypeGameIndex> new_list = static_cast<list <TypeGameIndex> > (getGameIndices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeGameIndex>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeGameIndex obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *game_indicesKey = "game_indices";
	json_object_set_member(pJsonObject, game_indicesKey, node);
	if (isprimitive("GenerationSummary")) {
		GenerationSummary obj = getGeneration();
		node = converttoJson(&obj, "GenerationSummary", "");
	}
	else {
		
		GenerationSummary obj = static_cast<GenerationSummary> (getGeneration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *generationKey = "generation";
	json_object_set_member(pJsonObject, generationKey, node);
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
	if (isprimitive("AbilityName")) {
		list<AbilityName> new_list = static_cast<list <AbilityName> > (getNames());
		node = converttoJson(&new_list, "AbilityName", "array");
	} else {
		node = json_node_alloc();
		list<AbilityName> new_list = static_cast<list <AbilityName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("TypeDetail_pokemon_inner")) {
		list<TypeDetail_pokemon_inner> new_list = static_cast<list <TypeDetail_pokemon_inner> > (getPokemon());
		node = converttoJson(&new_list, "TypeDetail_pokemon_inner", "array");
	} else {
		node = json_node_alloc();
		list<TypeDetail_pokemon_inner> new_list = static_cast<list <TypeDetail_pokemon_inner> > (getPokemon());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TypeDetail_pokemon_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TypeDetail_pokemon_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokemonKey = "pokemon";
	json_object_set_member(pJsonObject, pokemonKey, node);
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


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getSprites());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *spritesKey = "sprites";
	json_object_set_member(pJsonObject, spritesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
TypeDetail::getId()
{
	return id;
}

void
TypeDetail::setId(int  id)
{
	this->id = id;
}

std::string
TypeDetail::getName()
{
	return name;
}

void
TypeDetail::setName(std::string  name)
{
	this->name = name;
}

TypeDetail_damage_relations
TypeDetail::getDamageRelations()
{
	return damage_relations;
}

void
TypeDetail::setDamageRelations(TypeDetail_damage_relations  damage_relations)
{
	this->damage_relations = damage_relations;
}

std::list<TypeDetail_past_damage_relations_inner>
TypeDetail::getPastDamageRelations()
{
	return past_damage_relations;
}

void
TypeDetail::setPastDamageRelations(std::list <TypeDetail_past_damage_relations_inner> past_damage_relations)
{
	this->past_damage_relations = past_damage_relations;
}

std::list<TypeGameIndex>
TypeDetail::getGameIndices()
{
	return game_indices;
}

void
TypeDetail::setGameIndices(std::list <TypeGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

GenerationSummary
TypeDetail::getGeneration()
{
	return generation;
}

void
TypeDetail::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}

MoveDamageClassSummary
TypeDetail::getMoveDamageClass()
{
	return move_damage_class;
}

void
TypeDetail::setMoveDamageClass(MoveDamageClassSummary  move_damage_class)
{
	this->move_damage_class = move_damage_class;
}

std::list<AbilityName>
TypeDetail::getNames()
{
	return names;
}

void
TypeDetail::setNames(std::list <AbilityName> names)
{
	this->names = names;
}

std::list<TypeDetail_pokemon_inner>
TypeDetail::getPokemon()
{
	return pokemon;
}

void
TypeDetail::setPokemon(std::list <TypeDetail_pokemon_inner> pokemon)
{
	this->pokemon = pokemon;
}

std::list<MoveSummary>
TypeDetail::getMoves()
{
	return moves;
}

void
TypeDetail::setMoves(std::list <MoveSummary> moves)
{
	this->moves = moves;
}

std::map<string, string>
TypeDetail::getSprites()
{
	return sprites;
}

void
TypeDetail::setSprites(std::map <string, string> sprites)
{
	this->sprites = sprites;
}


