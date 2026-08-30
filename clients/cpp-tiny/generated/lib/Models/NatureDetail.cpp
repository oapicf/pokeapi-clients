

#include "NatureDetail.h"

using namespace Tiny;

NatureDetail::NatureDetail()
{
	id = int(0);
	name = std::string();
	decreased_stat = StatSummary();
	increased_stat = StatSummary();
	likes_flavor = BerryFlavorSummary();
	hates_flavor = BerryFlavorSummary();
	berries = std::list<BerrySummary>();
	pokeathlon_stat_changes = std::list<NatureDetail_pokeathlon_stat_changes_inner>();
	move_battle_style_preferences = std::list<NatureBattleStylePreference>();
	names = std::list<NatureName>();
}

NatureDetail::NatureDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

NatureDetail::~NatureDetail()
{

}

void
NatureDetail::fromJson(std::string jsonObj)
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

    const char *decreased_statKey = "decreased_stat";

    if(object.has_key(decreased_statKey))
    {
        bourne::json value = object[decreased_statKey];




        StatSummary* obj = &decreased_stat;
		obj->fromJson(value.dump());

    }

    const char *increased_statKey = "increased_stat";

    if(object.has_key(increased_statKey))
    {
        bourne::json value = object[increased_statKey];




        StatSummary* obj = &increased_stat;
		obj->fromJson(value.dump());

    }

    const char *likes_flavorKey = "likes_flavor";

    if(object.has_key(likes_flavorKey))
    {
        bourne::json value = object[likes_flavorKey];




        BerryFlavorSummary* obj = &likes_flavor;
		obj->fromJson(value.dump());

    }

    const char *hates_flavorKey = "hates_flavor";

    if(object.has_key(hates_flavorKey))
    {
        bourne::json value = object[hates_flavorKey];




        BerryFlavorSummary* obj = &hates_flavor;
		obj->fromJson(value.dump());

    }

    const char *berriesKey = "berries";

    if(object.has_key(berriesKey))
    {
        bourne::json value = object[berriesKey];


        std::list<BerrySummary> berries_list;
        BerrySummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            berries_list.push_back(element);
        }
        berries = berries_list;


    }

    const char *pokeathlon_stat_changesKey = "pokeathlon_stat_changes";

    if(object.has_key(pokeathlon_stat_changesKey))
    {
        bourne::json value = object[pokeathlon_stat_changesKey];


        std::list<NatureDetail_pokeathlon_stat_changes_inner> pokeathlon_stat_changes_list;
        NatureDetail_pokeathlon_stat_changes_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokeathlon_stat_changes_list.push_back(element);
        }
        pokeathlon_stat_changes = pokeathlon_stat_changes_list;


    }

    const char *move_battle_style_preferencesKey = "move_battle_style_preferences";

    if(object.has_key(move_battle_style_preferencesKey))
    {
        bourne::json value = object[move_battle_style_preferencesKey];


        std::list<NatureBattleStylePreference> move_battle_style_preferences_list;
        NatureBattleStylePreference element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            move_battle_style_preferences_list.push_back(element);
        }
        move_battle_style_preferences = move_battle_style_preferences_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<NatureName> names_list;
        NatureName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
NatureDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["decreased_stat"] = getDecreasedStat().toJson();






	object["increased_stat"] = getIncreasedStat().toJson();






	object["likes_flavor"] = getLikesFlavor().toJson();






	object["hates_flavor"] = getHatesFlavor().toJson();




    std::list<BerrySummary> berries_list = getBerries();
    bourne::json berries_arr = bourne::json::array();

    for(auto& var : berries_list)
    {
        BerrySummary obj = var;
        berries_arr.append(obj.toJson());
    }
    object["berries"] = berries_arr;






    std::list<NatureDetail_pokeathlon_stat_changes_inner> pokeathlon_stat_changes_list = getPokeathlonStatChanges();
    bourne::json pokeathlon_stat_changes_arr = bourne::json::array();

    for(auto& var : pokeathlon_stat_changes_list)
    {
        NatureDetail_pokeathlon_stat_changes_inner obj = var;
        pokeathlon_stat_changes_arr.append(obj.toJson());
    }
    object["pokeathlon_stat_changes"] = pokeathlon_stat_changes_arr;






    std::list<NatureBattleStylePreference> move_battle_style_preferences_list = getMoveBattleStylePreferences();
    bourne::json move_battle_style_preferences_arr = bourne::json::array();

    for(auto& var : move_battle_style_preferences_list)
    {
        NatureBattleStylePreference obj = var;
        move_battle_style_preferences_arr.append(obj.toJson());
    }
    object["move_battle_style_preferences"] = move_battle_style_preferences_arr;






    std::list<NatureName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        NatureName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
NatureDetail::getId()
{
	return id;
}

void
NatureDetail::setId(int id)
{
	this->id = id;
}

std::string
NatureDetail::getName()
{
	return name;
}

void
NatureDetail::setName(std::string name)
{
	this->name = name;
}

StatSummary
NatureDetail::getDecreasedStat()
{
	return decreased_stat;
}

void
NatureDetail::setDecreasedStat(StatSummary decreased_stat)
{
	this->decreased_stat = decreased_stat;
}

StatSummary
NatureDetail::getIncreasedStat()
{
	return increased_stat;
}

void
NatureDetail::setIncreasedStat(StatSummary increased_stat)
{
	this->increased_stat = increased_stat;
}

BerryFlavorSummary
NatureDetail::getLikesFlavor()
{
	return likes_flavor;
}

void
NatureDetail::setLikesFlavor(BerryFlavorSummary likes_flavor)
{
	this->likes_flavor = likes_flavor;
}

BerryFlavorSummary
NatureDetail::getHatesFlavor()
{
	return hates_flavor;
}

void
NatureDetail::setHatesFlavor(BerryFlavorSummary hates_flavor)
{
	this->hates_flavor = hates_flavor;
}

std::list<BerrySummary>
NatureDetail::getBerries()
{
	return berries;
}

void
NatureDetail::setBerries(std::list<BerrySummary> berries)
{
	this->berries = berries;
}

std::list<NatureDetail_pokeathlon_stat_changes_inner>
NatureDetail::getPokeathlonStatChanges()
{
	return pokeathlon_stat_changes;
}

void
NatureDetail::setPokeathlonStatChanges(std::list<NatureDetail_pokeathlon_stat_changes_inner> pokeathlon_stat_changes)
{
	this->pokeathlon_stat_changes = pokeathlon_stat_changes;
}

std::list<NatureBattleStylePreference>
NatureDetail::getMoveBattleStylePreferences()
{
	return move_battle_style_preferences;
}

void
NatureDetail::setMoveBattleStylePreferences(std::list<NatureBattleStylePreference> move_battle_style_preferences)
{
	this->move_battle_style_preferences = move_battle_style_preferences;
}

std::list<NatureName>
NatureDetail::getNames()
{
	return names;
}

void
NatureDetail::setNames(std::list<NatureName> names)
{
	this->names = names;
}



