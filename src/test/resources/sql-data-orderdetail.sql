INSERT INTO `customers` (`first_name`, `surname`) VALUES ('spongebob', 'squarepants');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('patrick', 'star');
INSERT INTO `items` (`name`, `price`) VALUES ('banana', 2.75);
INSERT INTO `items` (`name`, `price`) VALUES ('orange', 1.55);
INSERT INTO `orders`(`customerid`) VALUES (1);
INSERT INTO `orders`(`customerid`) VALUES (2);
INSERT INTO `orderdetails`(`orderid`, `itemid`, `quantity`) VALUES (1, 1, 2);