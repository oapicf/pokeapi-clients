

#include "PaginatedMoveBattleStyleSummaryList.h"

using namespace Tiny;

PaginatedMoveBattleStyleSummaryList::PaginatedMoveBattleStyleSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<MoveBattleStyleSummary>();
}

PaginatedMoveBattleStyleSummaryList::PaginatedMoveBattleStyleSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedMoveBattleStyleSummaryList::~PaginatedMoveBattleStyleSummaryList()
{

}

void
PaginatedMoveBattleStyleSummaryList::fromJson(std::string jsonObj)
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


        std::list<MoveBattleStyleSummary> results_list;
        MoveBattleStyleSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedMoveBattleStyleSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<MoveBattleStyleSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MoveBattleStyleSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedMoveBattleStyleSummaryList::getCount()
{
	return count;
}

void
PaginatedMoveBattleStyleSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedMoveBattleStyleSummaryList::getNext()
{
	return next;
}

void
PaginatedMoveBattleStyleSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedMoveBattleStyleSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMoveBattleStyleSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<MoveBattleStyleSummary>
PaginatedMoveBattleStyleSummaryList::getResults()
{
	return results;
}

void
PaginatedMoveBattleStyleSummaryList::setResults(std::list<MoveBattleStyleSummary> results)
{
	this->results = results;
}



