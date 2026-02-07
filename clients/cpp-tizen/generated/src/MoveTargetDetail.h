/*
 * MoveTargetDetail.h
 *
 * 
 */

#ifndef _MoveTargetDetail_H_
#define _MoveTargetDetail_H_


#include <string>
#include "MoveSummary.h"
#include "MoveTargetDescription.h"
#include "MoveTargetName.h"
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

class MoveTargetDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveTargetDetail();
	MoveTargetDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveTargetDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<MoveTargetDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <MoveTargetDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list <MoveSummary> moves);
	/*! \brief Get 
	 */
	std::list<MoveTargetName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <MoveTargetName> names);

private:
	int id;
	std::string name;
	std::list <MoveTargetDescription>descriptions;
	std::list <MoveSummary>moves;
	std::list <MoveTargetName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveTargetDetail_H_ */
