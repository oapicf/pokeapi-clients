/*
 * MachineDetail.h
 *
 * 
 */

#ifndef _MachineDetail_H_
#define _MachineDetail_H_


#include <string>
#include "ItemSummary.h"
#include "MoveSummary.h"
#include "VersionGroupSummary.h"
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

class MachineDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MachineDetail();
	MachineDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MachineDetail();

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
	ItemSummary getItem();

	/*! \brief Set 
	 */
	void setItem(ItemSummary  item);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get 
	 */
	MoveSummary getMove();

	/*! \brief Set 
	 */
	void setMove(MoveSummary  move);

private:
	int id;
	ItemSummary item;
	VersionGroupSummary version_group;
	MoveSummary move;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MachineDetail_H_ */
