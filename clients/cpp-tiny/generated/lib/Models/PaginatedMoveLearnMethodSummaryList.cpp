

#include "PaginatedMoveLearnMethodSummaryList.h"

using namespace Tiny;

PaginatedMoveLearnMethodSummaryList::PaginatedMoveLearnMethodSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<MoveLearnMethodSummary>();
}

PaginatedMoveLearnMethodSummaryList::PaginatedMoveLearnMethodSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedMoveLearnMethodSummaryList::~PaginatedMoveLearnMethodSummaryList()
{

}

void
PaginatedMoveLearnMethodSummaryList::fromJson(std::string jsonObj)
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


        std::list<MoveLearnMethodSummary> results_list;
        MoveLearnMethodSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedMoveLearnMethodSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<MoveLearnMethodSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MoveLearnMethodSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedMoveLearnMethodSummaryList::getCount()
{
	return count;
}

void
PaginatedMoveLearnMethodSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedMoveLearnMethodSummaryList::getNext()
{
	return next;
}

void
PaginatedMoveLearnMethodSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedMoveLearnMethodSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMoveLearnMethodSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<MoveLearnMethodSummary>
PaginatedMoveLearnMethodSummaryList::getResults()
{
	return results;
}

void
PaginatedMoveLearnMethodSummaryList::setResults(std::list <MoveLearnMethodSummary> results)
{
	this->results = results;
}



