DROP TABLE IF EXISTS `orderdetails`;
DROP TABLE IF EXISTS `items`;

CREATE TABLE IF NOT EXISTS `items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(40) DEFAULT NOT NULL,
	`price` FLOAT(20) DEFAULT NOT NULL,
	PRIMARY KEY (`id`)
);
