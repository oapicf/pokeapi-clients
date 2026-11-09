

#include "ItemDetail.h"

using namespace Tiny;

ItemDetail::ItemDetail()
{
	id = int(0);
	name = std::string();
	fling_power = int(0);
	fling_effect = null;
	attributes = std::list<ItemAttributeSummary>();
	category = null;
	effect_entries = std::list<ItemEffectText>();
	flavor_text_entries = std::list<ItemFlavorText>();
	game_indices = std::list<ItemGameIndex>();
	prices = std::list<ItemPrice>();
	names = std::list<ItemName>();
	held_by_pokemon = std::list<PokemonHeldItem>();
	sprites = null;
	baby_trigger_for = null;
	machines = std::list<ItemMachine>();
}

ItemDetail::ItemDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDetail::~ItemDetail()
{

}

void
ItemDetail::fromJson(std::string jsonObj)
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

    const char *fling_powerKey = "fling_power";

    if(object.has_key(fling_powerKey))
    {
        bourne::json value = object[fling_powerKey];



        jsonToValue(&fling_power, value, "int");


    }

    const char *fling_effectKey = "fling_effect";

    if(object.has_key(fling_effectKey))
    {
        bourne::json value = object[fling_effectKey];




        ItemFlingEffectSummary* obj = &fling_effect;
		obj->fromJson(value.dump());

    }

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];


        std::list<ItemAttributeSummary> attributes_list;
        ItemAttributeSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            attributes_list.push_back(element);
        }
        attributes = attributes_list;


    }

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];




        ItemCategorySummary* obj = &category;
		obj->fromJson(value.dump());

    }

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<ItemEffectText> effect_entries_list;
        ItemEffectText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }

    const char *flavor_text_entriesKey = "flavor_text_entries";

    if(object.has_key(flavor_text_entriesKey))
    {
        bourne::json value = object[flavor_text_entriesKey];


        std::list<ItemFlavorText> flavor_text_entries_list;
        ItemFlavorText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            flavor_text_entries_list.push_back(element);
        }
        flavor_text_entries = flavor_text_entries_list;


    }

    const char *game_indicesKey = "game_indices";

    if(object.has_key(game_indicesKey))
    {
        bourne::json value = object[game_indicesKey];


        std::list<ItemGameIndex> game_indices_list;
        ItemGameIndex element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            game_indices_list.push_back(element);
        }
        game_indices = game_indices_list;


    }

    const char *pricesKey = "prices";

    if(object.has_key(pricesKey))
    {
        bourne::json value = object[pricesKey];


        std::list<ItemPrice> prices_list;
        ItemPrice element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            prices_list.push_back(element);
        }
        prices = prices_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<ItemName> names_list;
        ItemName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *held_by_pokemonKey = "held_by_pokemon";

    if(object.has_key(held_by_pokemonKey))
    {
        bourne::json value = object[held_by_pokemonKey];


        std::list<PokemonHeldItem> held_by_pokemon_list;
        PokemonHeldItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            held_by_pokemon_list.push_back(element);
        }
        held_by_pokemon = held_by_pokemon_list;


    }

    const char *spritesKey = "sprites";

    if(object.has_key(spritesKey))
    {
        bourne::json value = object[spritesKey];




        ItemSprites* obj = &sprites;
		obj->fromJson(value.dump());

    }

    const char *baby_trigger_forKey = "baby_trigger_for";

    if(object.has_key(baby_trigger_forKey))
    {
        bourne::json value = object[baby_trigger_forKey];




        EvolutionChainSummary* obj = &baby_trigger_for;
		obj->fromJson(value.dump());

    }

    const char *machinesKey = "machines";

    if(object.has_key(machinesKey))
    {
        bourne::json value = object[machinesKey];


        std::list<ItemMachine> machines_list;
        ItemMachine element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            machines_list.push_back(element);
        }
        machines = machines_list;


    }


}

bourne::json
ItemDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["fling_power"] = getFlingPower();







	object["fling_effect"] = getFlingEffect().toJson();




    std::list<ItemAttributeSummary> attributes_list = getAttributes();
    bourne::json attributes_arr = bourne::json::array();

    for(auto& var : attributes_list)
    {
        ItemAttributeSummary obj = var;
        attributes_arr.append(obj.toJson());
    }
    object["attributes"] = attributes_arr;








	object["category"] = getCategory().toJson();




    std::list<ItemEffectText> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        ItemEffectText obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;






    std::list<ItemFlavorText> flavor_text_entries_list = getFlavorTextEntries();
    bourne::json flavor_text_entries_arr = bourne::json::array();

    for(auto& var : flavor_text_entries_list)
    {
        ItemFlavorText obj = var;
        flavor_text_entries_arr.append(obj.toJson());
    }
    object["flavor_text_entries"] = flavor_text_entries_arr;






    std::list<ItemGameIndex> game_indices_list = getGameIndices();
    bourne::json game_indices_arr = bourne::json::array();

    for(auto& var : game_indices_list)
    {
        ItemGameIndex obj = var;
        game_indices_arr.append(obj.toJson());
    }
    object["game_indices"] = game_indices_arr;






    std::list<ItemPrice> prices_list = getPrices();
    bourne::json prices_arr = bourne::json::array();

    for(auto& var : prices_list)
    {
        ItemPrice obj = var;
        prices_arr.append(obj.toJson());
    }
    object["prices"] = prices_arr;






    std::list<ItemName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        ItemName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<PokemonHeldItem> held_by_pokemon_list = getHeldByPokemon();
    bourne::json held_by_pokemon_arr = bourne::json::array();

    for(auto& var : held_by_pokemon_list)
    {
        PokemonHeldItem obj = var;
        held_by_pokemon_arr.append(obj.toJson());
    }
    object["held_by_pokemon"] = held_by_pokemon_arr;








	object["sprites"] = getSprites().toJson();






	object["baby_trigger_for"] = getBabyTriggerFor().toJson();




    std::list<ItemMachine> machines_list = getMachines();
    bourne::json machines_arr = bourne::json::array();

    for(auto& var : machines_list)
    {
        ItemMachine obj = var;
        machines_arr.append(obj.toJson());
    }
    object["machines"] = machines_arr;




    return object;

}

int
ItemDetail::getId()
{
	return id;
}

void
ItemDetail::setId(int id)
{
	this->id = id;
}

std::string
ItemDetail::getName()
{
	return name;
}

void
ItemDetail::setName(std::string name)
{
	this->name = name;
}

int
ItemDetail::getFlingPower()
{
	return fling_power;
}

void
ItemDetail::setFlingPower(int fling_power)
{
	this->fling_power = fling_power;
}

ItemFlingEffectSummary
ItemDetail::getFlingEffect()
{
	return fling_effect;
}

void
ItemDetail::setFlingEffect(ItemFlingEffectSummary fling_effect)
{
	this->fling_effect = fling_effect;
}

std::list<ItemAttributeSummary>
ItemDetail::getAttributes()
{
	return attributes;
}

void
ItemDetail::setAttributes(std::list<ItemAttributeSummary> attributes)
{
	this->attributes = attributes;
}

ItemCategorySummary
ItemDetail::getCategory()
{
	return category;
}

void
ItemDetail::setCategory(ItemCategorySummary category)
{
	this->category = category;
}

std::list<ItemEffectText>
ItemDetail::getEffectEntries()
{
	return effect_entries;
}

void
ItemDetail::setEffectEntries(std::list<ItemEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<ItemFlavorText>
ItemDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
ItemDetail::setFlavorTextEntries(std::list<ItemFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<ItemGameIndex>
ItemDetail::getGameIndices()
{
	return game_indices;
}

void
ItemDetail::setGameIndices(std::list<ItemGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

std::list<ItemPrice>
ItemDetail::getPrices()
{
	return prices;
}

void
ItemDetail::setPrices(std::list<ItemPrice> prices)
{
	this->prices = prices;
}

std::list<ItemName>
ItemDetail::getNames()
{
	return names;
}

void
ItemDetail::setNames(std::list<ItemName> names)
{
	this->names = names;
}

std::list<PokemonHeldItem>
ItemDetail::getHeldByPokemon()
{
	return held_by_pokemon;
}

void
ItemDetail::setHeldByPokemon(std::list<PokemonHeldItem> held_by_pokemon)
{
	this->held_by_pokemon = held_by_pokemon;
}

ItemSprites
ItemDetail::getSprites()
{
	return sprites;
}

void
ItemDetail::setSprites(ItemSprites sprites)
{
	this->sprites = sprites;
}

EvolutionChainSummary
ItemDetail::getBabyTriggerFor()
{
	return baby_trigger_for;
}

void
ItemDetail::setBabyTriggerFor(EvolutionChainSummary baby_trigger_for)
{
	this->baby_trigger_for = baby_trigger_for;
}

std::list<ItemMachine>
ItemDetail::getMachines()
{
	return machines;
}

void
ItemDetail::setMachines(std::list<ItemMachine> machines)
{
	this->machines = machines;
}



