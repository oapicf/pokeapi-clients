/*
 * PaginatedMoveBattleStyleSummaryList.h
 *
 * 
 */

#ifndef _PaginatedMoveBattleStyleSummaryList_H_
#define _PaginatedMoveBattleStyleSummaryList_H_


#include <string>
#include "MoveBattleStyleSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PaginatedMoveBattleStyleSummaryList : public Object {
public:
	/*! \brief Constructor.
	 */
	PaginatedMoveBattleStyleSummaryList();
	PaginatedMoveBattleStyleSummaryList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PaginatedMoveBattleStyleSummaryList();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCount();

	/*! \brief Set 
	 */
	void setCount(int  count);
	/*! \brief Get 
	 */
	std::string getNext();

	/*! \brief Set 
	 */
	void setNext(std::string  next);
	/*! \brief Get 
	 */
	std::string getPrevious();

	/*! \brief Set 
	 */
	void setPrevious(std::string  previous);
	/*! \brief Get 
	 */
	std::list<MoveBattleStyleSummary> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <MoveBattleStyleSummary> results);

private:
	int count;
	std::string next;
	std::string previous;
	std::list <MoveBattleStyleSummary>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PaginatedMoveBattleStyleSummaryList_H_ */
