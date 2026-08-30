

#include "TypeDetail.h"

using namespace Tiny;

TypeDetail::TypeDetail()
{
	id = int(0);
	name = std::string();
	damage_relations = TypeDetail_damage_relations();
	past_damage_relations = std::list<TypeDetail_past_damage_relations_inner>();
	game_indices = std::list<TypeGameIndex>();
	generation = GenerationSummary();
	move_damage_class = MoveDamageClassSummary();
	names = std::list<AbilityName>();
	pokemon = std::list<TypeDetail_pokemon_inner>();
	moves = std::list<MoveSummary>();
	sprites = null<std::map>();
}

TypeDetail::TypeDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeDetail::~TypeDetail()
{

}

void
TypeDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *damage_relationsKey = "damage_relations";

    if(object.has_key(damage_relationsKey))
    {
        bourne::json value = object[damage_relationsKey];




        TypeDetail_damage_relations* obj = &damage_relations;
		obj->fromJson(value.dump());

    }

    const char *past_damage_relationsKey = "past_damage_relations";

    if(object.has_key(past_damage_relationsKey))
    {
        bourne::json value = object[past_damage_relationsKey];


        std::list<TypeDetail_past_damage_relations_inner> past_damage_relations_list;
        TypeDetail_past_damage_relations_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            past_damage_relations_list.push_back(element);
        }
        past_damage_relations = past_damage_relations_list;


    }

    const char *game_indicesKey = "game_indices";

    if(object.has_key(game_indicesKey))
    {
        bourne::json value = object[game_indicesKey];


        std::list<TypeGameIndex> game_indices_list;
        TypeGameIndex element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            game_indices_list.push_back(element);
        }
        game_indices = game_indices_list;


    }

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *move_damage_classKey = "move_damage_class";

    if(object.has_key(move_damage_classKey))
    {
        bourne::json value = object[move_damage_classKey];




        MoveDamageClassSummary* obj = &move_damage_class;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<AbilityName> names_list;
        AbilityName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *pokemonKey = "pokemon";

    if(object.has_key(pokemonKey))
    {
        bourne::json value = object[pokemonKey];


        std::list<TypeDetail_pokemon_inner> pokemon_list;
        TypeDetail_pokemon_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_list.push_back(element);
        }
        pokemon = pokemon_list;


    }

    const char *movesKey = "moves";

    if(object.has_key(movesKey))
    {
        bourne::json value = object[movesKey];


        std::list<MoveSummary> moves_list;
        MoveSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            moves_list.push_back(element);
        }
        moves = moves_list;


    }

    const char *spritesKey = "sprites";

    if(object.has_key(spritesKey))
    {
        bourne::json value = object[spritesKey];


    }


}

bourne::json
TypeDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["damage_relations"] = getDamageRelations().toJson();




    std::list<TypeDetail_past_damage_relations_inner> past_damage_relations_list = getPastDamageRelations();
    bourne::json past_damage_relations_arr = bourne::json::array();

    for(auto& var : past_damage_relations_list)
    {
        TypeDetail_past_damage_relations_inner obj = var;
        past_damage_relations_arr.append(obj.toJson());
    }
    object["past_damage_relations"] = past_damage_relations_arr;






    std::list<TypeGameIndex> game_indices_list = getGameIndices();
    bourne::json game_indices_arr = bourne::json::array();

    for(auto& var : game_indices_list)
    {
        TypeGameIndex obj = var;
        game_indices_arr.append(obj.toJson());
    }
    object["game_indices"] = game_indices_arr;








	object["generation"] = getGeneration().toJson();






	object["move_damage_class"] = getMoveDamageClass().toJson();




    std::list<AbilityName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        AbilityName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<TypeDetail_pokemon_inner> pokemon_list = getPokemon();
    bourne::json pokemon_arr = bourne::json::array();

    for(auto& var : pokemon_list)
    {
        TypeDetail_pokemon_inner obj = var;
        pokemon_arr.append(obj.toJson());
    }
    object["pokemon"] = pokemon_arr;






    std::list<MoveSummary> moves_list = getMoves();
    bourne::json moves_arr = bourne::json::array();

    for(auto& var : moves_list)
    {
        MoveSummary obj = var;
        moves_arr.append(obj.toJson());
    }
    object["moves"] = moves_arr;







    return object;

}

int
TypeDetail::getId()
{
	return id;
}

void
TypeDetail::setId(int id)
{
	this->id = id;
}

std::string
TypeDetail::getName()
{
	return name;
}

void
TypeDetail::setName(std::string name)
{
	this->name = name;
}

TypeDetail_damage_relations
TypeDetail::getDamageRelations()
{
	return damage_relations;
}

void
TypeDetail::setDamageRelations(TypeDetail_damage_relations damage_relations)
{
	this->damage_relations = damage_relations;
}

std::list<TypeDetail_past_damage_relations_inner>
TypeDetail::getPastDamageRelations()
{
	return past_damage_relations;
}

void
TypeDetail::setPastDamageRelations(std::list<TypeDetail_past_damage_relations_inner> past_damage_relations)
{
	this->past_damage_relations = past_damage_relations;
}

std::list<TypeGameIndex>
TypeDetail::getGameIndices()
{
	return game_indices;
}

void
TypeDetail::setGameIndices(std::list<TypeGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

GenerationSummary
TypeDetail::getGeneration()
{
	return generation;
}

void
TypeDetail::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}

MoveDamageClassSummary
TypeDetail::getMoveDamageClass()
{
	return move_damage_class;
}

void
TypeDetail::setMoveDamageClass(MoveDamageClassSummary move_damage_class)
{
	this->move_damage_class = move_damage_class;
}

std::list<AbilityName>
TypeDetail::getNames()
{
	return names;
}

void
TypeDetail::setNames(std::list<AbilityName> names)
{
	this->names = names;
}

std::list<TypeDetail_pokemon_inner>
TypeDetail::getPokemon()
{
	return pokemon;
}

void
TypeDetail::setPokemon(std::list<TypeDetail_pokemon_inner> pokemon)
{
	this->pokemon = pokemon;
}

std::list<MoveSummary>
TypeDetail::getMoves()
{
	return moves;
}

void
TypeDetail::setMoves(std::list<MoveSummary> moves)
{
	this->moves = moves;
}

std::map<std::string, std::map<std::string, TypeDetail_sprites_value_value>>
TypeDetail::getSprites()
{
	return sprites;
}

void
TypeDetail::setSprites(std::map<std::string, std::map<std::string, TypeDetail_sprites_value_value>> sprites)
{
	this->sprites = sprites;
}



