

#include "PaginatedPokemonSummaryList.h"

using namespace Tiny;

PaginatedPokemonSummaryList::PaginatedPokemonSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<PokemonSummary>();
}

PaginatedPokemonSummaryList::PaginatedPokemonSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedPokemonSummaryList::~PaginatedPokemonSummaryList()
{

}

void
PaginatedPokemonSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<PokemonSummary> results_list;
        PokemonSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedPokemonSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<PokemonSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        PokemonSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedPokemonSummaryList::getCount()
{
	return count;
}

void
PaginatedPokemonSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedPokemonSummaryList::getNext()
{
	return next;
}

void
PaginatedPokemonSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedPokemonSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedPokemonSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<PokemonSummary>
PaginatedPokemonSummaryList::getResults()
{
	return results;
}

void
PaginatedPokemonSummaryList::setResults(std::list<PokemonSummary> results)
{
	this->results = results;
}



