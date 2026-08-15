

#include "PokemonDetail.h"

using namespace Tiny;

PokemonDetail::PokemonDetail()
{
	id = int(0);
	name = std::string();
	base_experience = int(0);
	height = int(0);
	is_default = bool(false);
	order = int(0);
	weight = int(0);
	abilities = std::list<PokemonDetail_abilities_inner>();
	past_abilities = std::list<PokemonDetail_past_abilities_inner>();
	forms = std::list<PokemonFormSummary>();
	game_indices = std::list<PokemonGameIndex>();
	held_items = PokemonDetail_held_items();
	location_area_encounters = std::string();
	moves = std::list<PokemonDetail_moves_inner>();
	species = PokemonSpeciesSummary();
	sprites = PokemonDetail_sprites();
	cries = PokemonDetail_cries();
	stats = std::list<PokemonStat>();
	types = std::list<PokemonDetail_types_inner>();
	past_types = std::list<PokemonDetail_past_types_inner>();
}

PokemonDetail::PokemonDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail::~PokemonDetail()
{

}

void
PokemonDetail::fromJson(std::string jsonObj)
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

    const char *base_experienceKey = "base_experience";

    if(object.has_key(base_experienceKey))
    {
        bourne::json value = object[base_experienceKey];



        jsonToValue(&base_experience, value, "int");


    }

    const char *heightKey = "height";

    if(object.has_key(heightKey))
    {
        bourne::json value = object[heightKey];



        jsonToValue(&height, value, "int");


    }

    const char *is_defaultKey = "is_default";

    if(object.has_key(is_defaultKey))
    {
        bourne::json value = object[is_defaultKey];



        jsonToValue(&is_default, value, "bool");


    }

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];



        jsonToValue(&order, value, "int");


    }

    const char *weightKey = "weight";

    if(object.has_key(weightKey))
    {
        bourne::json value = object[weightKey];



        jsonToValue(&weight, value, "int");


    }

    const char *abilitiesKey = "abilities";

    if(object.has_key(abilitiesKey))
    {
        bourne::json value = object[abilitiesKey];


        std::list<PokemonDetail_abilities_inner> abilities_list;
        PokemonDetail_abilities_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            abilities_list.push_back(element);
        }
        abilities = abilities_list;


    }

    const char *past_abilitiesKey = "past_abilities";

    if(object.has_key(past_abilitiesKey))
    {
        bourne::json value = object[past_abilitiesKey];


        std::list<PokemonDetail_past_abilities_inner> past_abilities_list;
        PokemonDetail_past_abilities_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            past_abilities_list.push_back(element);
        }
        past_abilities = past_abilities_list;


    }

    const char *formsKey = "forms";

    if(object.has_key(formsKey))
    {
        bourne::json value = object[formsKey];


        std::list<PokemonFormSummary> forms_list;
        PokemonFormSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            forms_list.push_back(element);
        }
        forms = forms_list;


    }

    const char *game_indicesKey = "game_indices";

    if(object.has_key(game_indicesKey))
    {
        bourne::json value = object[game_indicesKey];


        std::list<PokemonGameIndex> game_indices_list;
        PokemonGameIndex element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            game_indices_list.push_back(element);
        }
        game_indices = game_indices_list;


    }

    const char *held_itemsKey = "held_items";

    if(object.has_key(held_itemsKey))
    {
        bourne::json value = object[held_itemsKey];




        PokemonDetail_held_items* obj = &held_items;
		obj->fromJson(value.dump());

    }

    const char *location_area_encountersKey = "location_area_encounters";

    if(object.has_key(location_area_encountersKey))
    {
        bourne::json value = object[location_area_encountersKey];



        jsonToValue(&location_area_encounters, value, "std::string");


    }

    const char *movesKey = "moves";

    if(object.has_key(movesKey))
    {
        bourne::json value = object[movesKey];


        std::list<PokemonDetail_moves_inner> moves_list;
        PokemonDetail_moves_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            moves_list.push_back(element);
        }
        moves = moves_list;


    }

    const char *speciesKey = "species";

    if(object.has_key(speciesKey))
    {
        bourne::json value = object[speciesKey];




        PokemonSpeciesSummary* obj = &species;
		obj->fromJson(value.dump());

    }

    const char *spritesKey = "sprites";

    if(object.has_key(spritesKey))
    {
        bourne::json value = object[spritesKey];




        PokemonDetail_sprites* obj = &sprites;
		obj->fromJson(value.dump());

    }

    const char *criesKey = "cries";

    if(object.has_key(criesKey))
    {
        bourne::json value = object[criesKey];




        PokemonDetail_cries* obj = &cries;
		obj->fromJson(value.dump());

    }

    const char *statsKey = "stats";

    if(object.has_key(statsKey))
    {
        bourne::json value = object[statsKey];


        std::list<PokemonStat> stats_list;
        PokemonStat element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            stats_list.push_back(element);
        }
        stats = stats_list;


    }

    const char *typesKey = "types";

    if(object.has_key(typesKey))
    {
        bourne::json value = object[typesKey];


        std::list<PokemonDetail_types_inner> types_list;
        PokemonDetail_types_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            types_list.push_back(element);
        }
        types = types_list;


    }

    const char *past_typesKey = "past_types";

    if(object.has_key(past_typesKey))
    {
        bourne::json value = object[past_typesKey];


        std::list<PokemonDetail_past_types_inner> past_types_list;
        PokemonDetail_past_types_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            past_types_list.push_back(element);
        }
        past_types = past_types_list;


    }


}

bourne::json
PokemonDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["base_experience"] = getBaseExperience();






    object["height"] = getHeight();






    object["is_default"] = isIsDefault();






    object["order"] = getOrder();






    object["weight"] = getWeight();





    std::list<PokemonDetail_abilities_inner> abilities_list = getAbilities();
    bourne::json abilities_arr = bourne::json::array();

    for(auto& var : abilities_list)
    {
        PokemonDetail_abilities_inner obj = var;
        abilities_arr.append(obj.toJson());
    }
    object["abilities"] = abilities_arr;






    std::list<PokemonDetail_past_abilities_inner> past_abilities_list = getPastAbilities();
    bourne::json past_abilities_arr = bourne::json::array();

    for(auto& var : past_abilities_list)
    {
        PokemonDetail_past_abilities_inner obj = var;
        past_abilities_arr.append(obj.toJson());
    }
    object["past_abilities"] = past_abilities_arr;






    std::list<PokemonFormSummary> forms_list = getForms();
    bourne::json forms_arr = bourne::json::array();

    for(auto& var : forms_list)
    {
        PokemonFormSummary obj = var;
        forms_arr.append(obj.toJson());
    }
    object["forms"] = forms_arr;






    std::list<PokemonGameIndex> game_indices_list = getGameIndices();
    bourne::json game_indices_arr = bourne::json::array();

    for(auto& var : game_indices_list)
    {
        PokemonGameIndex obj = var;
        game_indices_arr.append(obj.toJson());
    }
    object["game_indices"] = game_indices_arr;








	object["held_items"] = getHeldItems().toJson();





    object["location_area_encounters"] = getLocationAreaEncounters();





    std::list<PokemonDetail_moves_inner> moves_list = getMoves();
    bourne::json moves_arr = bourne::json::array();

    for(auto& var : moves_list)
    {
        PokemonDetail_moves_inner obj = var;
        moves_arr.append(obj.toJson());
    }
    object["moves"] = moves_arr;








	object["species"] = getSpecies().toJson();






	object["sprites"] = getSprites().toJson();






	object["cries"] = getCries().toJson();




    std::list<PokemonStat> stats_list = getStats();
    bourne::json stats_arr = bourne::json::array();

    for(auto& var : stats_list)
    {
        PokemonStat obj = var;
        stats_arr.append(obj.toJson());
    }
    object["stats"] = stats_arr;






    std::list<PokemonDetail_types_inner> types_list = getTypes();
    bourne::json types_arr = bourne::json::array();

    for(auto& var : types_list)
    {
        PokemonDetail_types_inner obj = var;
        types_arr.append(obj.toJson());
    }
    object["types"] = types_arr;






    std::list<PokemonDetail_past_types_inner> past_types_list = getPastTypes();
    bourne::json past_types_arr = bourne::json::array();

    for(auto& var : past_types_list)
    {
        PokemonDetail_past_types_inner obj = var;
        past_types_arr.append(obj.toJson());
    }
    object["past_types"] = past_types_arr;




    return object;

}

int
PokemonDetail::getId()
{
	return id;
}

void
PokemonDetail::setId(int  id)
{
	this->id = id;
}

std::string
PokemonDetail::getName()
{
	return name;
}

void
PokemonDetail::setName(std::string  name)
{
	this->name = name;
}

int
PokemonDetail::getBaseExperience()
{
	return base_experience;
}

void
PokemonDetail::setBaseExperience(int  base_experience)
{
	this->base_experience = base_experience;
}

int
PokemonDetail::getHeight()
{
	return height;
}

void
PokemonDetail::setHeight(int  height)
{
	this->height = height;
}

bool
PokemonDetail::isIsDefault()
{
	return is_default;
}

void
PokemonDetail::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

int
PokemonDetail::getOrder()
{
	return order;
}

void
PokemonDetail::setOrder(int  order)
{
	this->order = order;
}

int
PokemonDetail::getWeight()
{
	return weight;
}

void
PokemonDetail::setWeight(int  weight)
{
	this->weight = weight;
}

std::list<PokemonDetail_abilities_inner>
PokemonDetail::getAbilities()
{
	return abilities;
}

void
PokemonDetail::setAbilities(std::list <PokemonDetail_abilities_inner> abilities)
{
	this->abilities = abilities;
}

std::list<PokemonDetail_past_abilities_inner>
PokemonDetail::getPastAbilities()
{
	return past_abilities;
}

void
PokemonDetail::setPastAbilities(std::list <PokemonDetail_past_abilities_inner> past_abilities)
{
	this->past_abilities = past_abilities;
}

std::list<PokemonFormSummary>
PokemonDetail::getForms()
{
	return forms;
}

void
PokemonDetail::setForms(std::list <PokemonFormSummary> forms)
{
	this->forms = forms;
}

std::list<PokemonGameIndex>
PokemonDetail::getGameIndices()
{
	return game_indices;
}

void
PokemonDetail::setGameIndices(std::list <PokemonGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

PokemonDetail_held_items
PokemonDetail::getHeldItems()
{
	return held_items;
}

void
PokemonDetail::setHeldItems(PokemonDetail_held_items  held_items)
{
	this->held_items = held_items;
}

std::string
PokemonDetail::getLocationAreaEncounters()
{
	return location_area_encounters;
}

void
PokemonDetail::setLocationAreaEncounters(std::string  location_area_encounters)
{
	this->location_area_encounters = location_area_encounters;
}

std::list<PokemonDetail_moves_inner>
PokemonDetail::getMoves()
{
	return moves;
}

void
PokemonDetail::setMoves(std::list <PokemonDetail_moves_inner> moves)
{
	this->moves = moves;
}

PokemonSpeciesSummary
PokemonDetail::getSpecies()
{
	return species;
}

void
PokemonDetail::setSpecies(PokemonSpeciesSummary  species)
{
	this->species = species;
}

PokemonDetail_sprites
PokemonDetail::getSprites()
{
	return sprites;
}

void
PokemonDetail::setSprites(PokemonDetail_sprites  sprites)
{
	this->sprites = sprites;
}

PokemonDetail_cries
PokemonDetail::getCries()
{
	return cries;
}

void
PokemonDetail::setCries(PokemonDetail_cries  cries)
{
	this->cries = cries;
}

std::list<PokemonStat>
PokemonDetail::getStats()
{
	return stats;
}

void
PokemonDetail::setStats(std::list <PokemonStat> stats)
{
	this->stats = stats;
}

std::list<PokemonDetail_types_inner>
PokemonDetail::getTypes()
{
	return types;
}

void
PokemonDetail::setTypes(std::list <PokemonDetail_types_inner> types)
{
	this->types = types;
}

std::list<PokemonDetail_past_types_inner>
PokemonDetail::getPastTypes()
{
	return past_types;
}

void
PokemonDetail::setPastTypes(std::list <PokemonDetail_past_types_inner> past_types)
{
	this->past_types = past_types;
}



