// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
 export function timeToMixJuice(name) {
  if (name === 'Pure Strawberry Joy') return 0.5;
  if (name === 'Energizer' || name === 'Green Garden') return 1.5;
  if (name === 'Tropical Island') return 3;
  if (name === 'All or Nothing') return 5;
  return 2.5;
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {
  let ans = 0;
  for (let i = 0; wedgesNeeded > 0 && i < limes.length; i++) {
    if (limes[i] === 'small') {
      wedgesNeeded -= 6;
      ans += 1;
    } else if (limes[i] === 'medium') {
      wedgesNeeded -= 8;
      ans += 1;
    } else {
      wedgesNeeded -= 10;
      ans += 1;
    }
  }
  return ans;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {
  let ans = [];
  for (let i = 0; i < orders.length; i++) {
    if (timeLeft > 0) {
      timeLeft -= timeToMixJuice(orders[i]);
    } else {
      return orders.slice(i, orders.length + 1);
    }
  }
  return [];
}
