/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* limit Integer  (optional)
* offset Integer  (optional)
* returns String
* */
const growthRate_list = ({ limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id Integer 
* returns String
* */
const growthRate_read = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  growthRate_list,
  growthRate_read,
};
