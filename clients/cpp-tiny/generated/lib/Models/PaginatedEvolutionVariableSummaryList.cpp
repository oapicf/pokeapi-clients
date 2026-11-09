

#include "PaginatedEvolutionVariableSummaryList.h"

using namespace Tiny;

PaginatedEvolutionVariableSummaryList::PaginatedEvolutionVariableSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<EvolutionVariableSummary>();
}

PaginatedEvolutionVariableSummaryList::PaginatedEvolutionVariableSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedEvolutionVariableSummaryList::~PaginatedEvolutionVariableSummaryList()
{

}

void
PaginatedEvolutionVariableSummaryList::fromJson(std::string jsonObj)
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


        std::list<EvolutionVariableSummary> results_list;
        EvolutionVariableSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedEvolutionVariableSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<EvolutionVariableSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        EvolutionVariableSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedEvolutionVariableSummaryList::getCount()
{
	return count;
}

void
PaginatedEvolutionVariableSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedEvolutionVariableSummaryList::getNext()
{
	return next;
}

void
PaginatedEvolutionVariableSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedEvolutionVariableSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedEvolutionVariableSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<EvolutionVariableSummary>
PaginatedEvolutionVariableSummaryList::getResults()
{
	return results;
}

void
PaginatedEvolutionVariableSummaryList::setResults(std::list<EvolutionVariableSummary> results)
{
	this->results = results;
}



