
/*
 * MachineDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MachineDetail_H_
#define TINY_CPP_CLIENT_MachineDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemSummary.h"
#include "MoveSummary.h"
#include "VersionGroupSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MachineDetail{
public:

    /*! \brief Constructor.
	 */
    MachineDetail();
    MachineDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MachineDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int id{};
    ItemSummary item;
    VersionGroupSummary version_group;
    MoveSummary move;
};
}

#endif /* TINY_CPP_CLIENT_MachineDetail_H_ */
