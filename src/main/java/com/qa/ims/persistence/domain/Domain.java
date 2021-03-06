package com.qa.ims.persistence.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.utils.Utils;

public enum Domain {

	CUSTOMER("Information about customers"), ITEM("Individual Items"), ORDER("Purchases of items"),
	STOP("To close the application");

	public static final Logger LOGGER = LogManager.getLogger();

	private String description;

	private Domain(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.name() + ": " + this.description;
	}

	public static void printDomains() {
		for (Domain domain : Domain.values()) {
			LOGGER.info(domain.getDescription());
		}
	}

	public static Domain getDomain(Utils utils) {
		Domain domain;
		while (true) {
			try {
				String input = utils.getString().strip().toUpperCase();
				domain = Domain.valueOf((input.endsWith("S")) ? input.substring(0, input.length() - 1) : input);
				break;
			} catch (IllegalArgumentException e) {
				LOGGER.error("You entered an invalid selection, please try again\n");
			}
		}
		return domain;
	}

}
