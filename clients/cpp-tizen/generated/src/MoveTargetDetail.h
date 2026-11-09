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

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The description of this resource listed in different languages.
	 */
	std::list<MoveTargetDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list <MoveTargetDescription> descriptions);
	/*! \brief Get A list of moves that that are directed at this target.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that that are directed at this target.
	 */
	void setMoves(std::list <MoveSummary> moves);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<MoveTargetName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
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
